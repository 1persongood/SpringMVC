package SpringMVC.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import SpringMVC.Dto.PaginatesDto;
import SpringMVC.Service.User.CategoryServiceImpl;
import SpringMVC.Service.User.HomeServiceImpl;
import SpringMVC.Service.User.PaginateServiceImpl;

@Controller
public class CategoryController extends BaseController{
	@Autowired
	private CategoryServiceImpl categoryService;
	
	@Autowired
	private PaginateServiceImpl paginateService;
	@RequestMapping(value= {"user/san-pham-the-loai/{id}"})
	public ModelAndView Allbook(@PathVariable String id) {
		int totalBookPage =9;
		int totalData = categoryService.GetDataAllBookByID(Integer.parseInt(id)).size();
		PaginatesDto paginateInfo=paginateService.getInfoPaginates(totalData, totalBookPage, 1);
		_myShare.addObject("theloai",_homeService.GetDataTheLoai());
		_myShare.addObject("tentheloai",categoryService.GetTheLoai(Integer.parseInt(id)));
		_myShare.addObject("idcategory",id);
		_myShare.addObject("paginateInfo",paginateInfo);
		//_myShare.addObject("chitiet",_homeService.GetDataChiTietSach());
		_myShare.addObject("BookPaginate",categoryService.GetDataBooksPaginate(paginateInfo.getStart(), paginateInfo.getEnd()));
		
		_myShare.setViewName("user/theloai");
		return _myShare;
	}
}
