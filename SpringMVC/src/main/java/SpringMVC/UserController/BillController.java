package SpringMVC.UserController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringMVC.Service.User.BillDetailServiceImpl;
import SpringMVC.Service.User.BillServiceImpl;
import SpringMVC.Service.User.UserServiceImpl;


@Controller
public class BillController extends BaseController{
	
	@Autowired
	UserServiceImpl userServiceImpl = new UserServiceImpl();
	
	@Autowired
	BillDetailServiceImpl billDetailServiceImpl = new BillDetailServiceImpl();
	
	@Autowired
	BillServiceImpl billsServiceImpl = new BillServiceImpl();
	
	@RequestMapping(value={"/thong-tin-don-hang"})
	public ModelAndView donhang(HttpSession session) {
		if(session.getAttribute("InfoUser") == null ) {
			_myShare.setViewName("user/index");
		}else {
			_myShare.setViewName("user/account/userbills");
			int id = (Integer)session.getAttribute("id_user");
			_myShare.addObject("bills", userServiceImpl.bills(id));
			_myShare.addObject("status", "");
		}
		return _myShare;
	}
	
	@RequestMapping(value={"/chi-tiet-don-hang/{id}"})
	public ModelAndView chitietdonhang(HttpSession session,@PathVariable int id) {
		try {
			if(session.getAttribute("InfoUser") == null ) {
				_myShare.setViewName("user/index");
			}else {
				_myShare.addObject("billdetail", billDetailServiceImpl.GetDetailBills(id));
				session.setAttribute("userbilldetail",billsServiceImpl.GetBillsById(id));
				_myShare.setViewName("user/account/detailuserbill");
			}
		} catch (Exception e) {
			_myShare.setViewName("user/index");
		}
		return _myShare;
	}
	
	@RequestMapping(value={"/cap-nhat-don-hang/{id}/{statusbill}"})
	public String suadonhang(HttpServletRequest request ,HttpSession session, @PathVariable int id, @PathVariable int TinhTrang) {
		try {
			if(session.getAttribute("InfoUser") == null ) {
				return "redirect:trang-chu";
			}else {
				billsServiceImpl.UpdateStatusById(id,TinhTrang);
			}
		} catch (Exception e) {
			return "redirect:"+ request.getHeader("Referer");
		}
		
		return "redirect:"+ request.getHeader("Referer");
	}
}
