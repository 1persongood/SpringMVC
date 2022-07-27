package SpringMVC.UserController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import SpringMVC.Entity.KhachHang;
import SpringMVC.Service.User.UserServiceImpl;



@Controller
public class UserController extends BaseController{

	@Autowired
	UserServiceImpl userServiceImpl = new UserServiceImpl();
	
	
	@RequestMapping(value={"/dang-ky"},method = RequestMethod.GET)
	public ModelAndView Dangky() {
		_myShare.setViewName("user/register");
		_myShare.addObject("kh", new KhachHang());
		_myShare.addObject("status",null);
		return _myShare;
	}
	
	@RequestMapping(value={"/dang-ky"},method = RequestMethod.POST)
	public ModelAndView CreateUser(@ModelAttribute KhachHang kh) {
		KhachHang adduser =  kh;
		if(userServiceImpl.CheckAddUser(kh)) {
			 
			_myShare.addObject("status","Đăng kí không thành công, tài khoản đã tồn tại");
			  _myShare.setViewName("user/register"); 	
		}else { 
			if(userServiceImpl.checkvalid(adduser) == null) {
				int count = userServiceImpl.AddUser(adduser); 
				if(count > 0) {
				  _myShare.addObject("status",null);
				  _myShare.setViewName("redirect:dang-nhap"); 
				  }
				else {
				  _myShare.addObject("status", "Đăng kí không thành công");
				  _myShare.setViewName("user/register"); 
				  } 
			}else {
				_myShare.addObject("status",userServiceImpl.checkvalid(adduser) );
				_myShare.setViewName("user/register"); 
			}
			
		  }
				 
		return _myShare;
	}
	
	@RequestMapping(value={"/dang-nhap"},method = RequestMethod.GET)
	public ModelAndView Dangnhap() {
		_myShare.setViewName("user/login");
		_myShare.addObject("statuslogin",null);
		_myShare.addObject("kh", new KhachHang());
		return _myShare;
	}
	
	@RequestMapping(value={"/dang-nhap"},method = RequestMethod.POST)
	public ModelAndView Dangnhap(HttpSession session,@ModelAttribute KhachHang kh) {
		
		if(userServiceImpl.checkvalidlogin(kh)==null) {
			kh = userServiceImpl.CheckUser(kh);
			
			if(kh != null) {
				
					_myShare.setViewName("redirect:trang-chu");
					session.setAttribute("InfoUser", kh);
					session.setAttribute("id_user", kh.getMaKH());
				
			
			}else {
				_myShare.addObject("statuslogin","Đăng nhập thất bại, tài khoản hoặc mật khẩu không đúng");
			}
		}else {
			_myShare.addObject("statuslogin",userServiceImpl.checkvalidlogin(kh) );
		}
		
		return _myShare;
	}
	
	@RequestMapping(value={"/dang-xuat"},method = RequestMethod.GET)
	public String Dangxuat(HttpServletRequest request ,HttpSession session) {
		session.removeAttribute("InfoUser");
		return "redirect:trang-chu";
	}
}
