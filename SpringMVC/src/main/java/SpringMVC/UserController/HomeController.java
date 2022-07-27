package SpringMVC.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringMVC.Dao.TheLoaiDao;
import SpringMVC.Service.User.HomeServiceImpl;

@Controller
public class HomeController extends BaseController{
	
	@RequestMapping(value = {"/","/trang-chu"})
	public ModelAndView Index() {
		_myShare.addObject("theloai",_homeService.GetDataTheLoai());
		_myShare.addObject("sachmoicn",_homeService.GetDataSachMoiCN());
		_myShare.addObject("sachbanchay",_homeService.GetDataSachBanChay());
		_myShare.setViewName("user/index");
		return _myShare;
	}
	
	@RequestMapping(value= {"product"})
	public ModelAndView Product() {
		_myShare.setViewName("user/product");
		return _myShare;
	}
	
	@RequestMapping(value= {"lienhe"})
	public ModelAndView LienHe() {
		_myShare.setViewName("user/lienhe");
		return _myShare;
	}
	@RequestMapping(value = {"/tim-kiem/{name}"})
	public ModelAndView search() {
		_myShare.setViewName("user/searchproduct");
		return _myShare;
	}
}
