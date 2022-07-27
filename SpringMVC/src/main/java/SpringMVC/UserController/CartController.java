package SpringMVC.UserController;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SpringMVC.Dto.CartDto;
import SpringMVC.Entity.DonDatHang;
import SpringMVC.Entity.KhachHang;
import SpringMVC.Service.User.BillServiceImpl;
import SpringMVC.Service.User.BookServiceImpl;
import SpringMVC.Service.User.CartServiceImpl;



@Controller
public class CartController extends BaseController{
	@Autowired
	private CartServiceImpl cartService = new CartServiceImpl();
	
	@Autowired
	private BillServiceImpl billsServiceImpl = new BillServiceImpl();
	
	@RequestMapping(value = "/gio-hang")
	public ModelAndView Index(HttpSession session) {
		_myShare.addObject("status",null);
		HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>)session.getAttribute("Cart");
		_myShare.addObject("Cart",cart);
		_myShare.setViewName("user/list_Cart");
		return _myShare;
	}
	
	public ModelAndView cartHeader(HttpSession session) {
		
		HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>)session.getAttribute("Cart");
		_myShare.addObject("Cart",cart);
		_myShare.setViewName("user/cart_header");
		return _myShare;
	}
	
	
	@RequestMapping(value = "/AddCart/{id}")
	public String AddCart(HttpServletRequest request ,HttpSession session, @PathVariable int id) {
		try {
			HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>)session.getAttribute("Cart");
			if(cart == null) {
				cart = new HashMap<Integer, CartDto>();
			}
			cartService.AddCart(id, cart);
			session.setAttribute("Cart", cart);
			session.setAttribute("totalPrice", cartService.TotalPrice(cart));
			session.setAttribute("totalQuanty", cartService.TotalQuanty(cart));
		} catch (Exception e) {
		}
		
		return "redirect:"+ request.getHeader("Referer");
	}
	
	@RequestMapping(value = "/EditCart/{id}/{quanty}")
	public String EditCart(HttpServletRequest request ,HttpSession session, @PathVariable int id, @PathVariable int quanty) {
		try {
			HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>)session.getAttribute("Cart");
			if(cart == null) {
				cart = new HashMap<Integer, CartDto>();
			}
			cart = cartService.EditCart(id, quanty, cart);
			session.setAttribute("Cart", cart);
			session.setAttribute("totalPrice", cartService.TotalPrice(cart));
			session.setAttribute("totalQuanty", cartService.TotalQuanty(cart));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "redirect:"+ request.getHeader("Referer");
	}
	
	@RequestMapping(value = "/DeleteCart/{id}")
	public String DeleteCart(HttpServletRequest request ,HttpSession session, @PathVariable int id) {
		try {
			HashMap<Integer, CartDto> cart = (HashMap<Integer, CartDto>)session.getAttribute("Cart");
			if(cart == null) {
				cart = new HashMap<Integer, CartDto>();
			}
			cart = cartService.DeleteCart(id, cart);
			session.setAttribute("Cart", cart);
			session.setAttribute("totalPrice", cartService.TotalPrice(cart));
			session.setAttribute("totalQuanty", cartService.TotalQuanty(cart));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return "redirect:"+ request.getHeader("Referer");
	}
	
	@RequestMapping(value={"/checkout"},method = RequestMethod.GET)
	public ModelAndView Checkout(HttpServletRequest request ,HttpSession session) {
		try {
			_myShare.addObject("status",null);
			DonDatHang bills = new DonDatHang();
			KhachHang loginInfo = (KhachHang)session.getAttribute("InfoUser");
			if(loginInfo != null) {
				_myShare.setViewName("user/checkout");
				/*bills.setAddress(loginInfo.getDiaChi());
				bills.setId_user(loginInfo.getMaKH());
				bills.setPhone(loginInfo.getDienThoai());
				bills.setUser(loginInfo.getTenKH() );*/
			}else if(loginInfo == null) {
				_myShare.addObject("status","Bạn cần đăng nhập trước khi thanh toán");
			}
			_myShare.addObject("bills",bills);
		} catch (Exception e) {
			_myShare.setViewName("user/index");
		}
		return _myShare;
	}

	@RequestMapping(value="checkout", method = RequestMethod.POST)
	public String CheckOutBill(HttpServletRequest request ,HttpSession session, @ModelAttribute DonDatHang bills) {
		try {
			if(billsServiceImpl.AddBills(bills) > 0) {
			HashMap<Integer, CartDto> carts = (HashMap<Integer, CartDto>)session.getAttribute("Cart");
			billsServiceImpl.AddBillsDetail(carts);
			}
			session.removeAttribute("Cart");
			session.removeAttribute("totalPrice");
			session.removeAttribute("totalQuanty");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:gio-hang";
	}
}
