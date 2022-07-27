package SpringMVC.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import SpringMVC.Service.User.HomeServiceImpl;

@Controller
public class BaseController {
	@Autowired
	HomeServiceImpl _homeService;
	public ModelAndView _myShare = new ModelAndView();
	public ModelAndView Init() {
		
		return _myShare;
	}
}
