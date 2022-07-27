package SpringMVC.UserController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import SpringMVC.Dto.PaginatesDto;
import SpringMVC.Service.User.BookServiceImpl;
import SpringMVC.Service.User.CategoryServiceImpl;
import SpringMVC.Service.User.PaginateServiceImpl;

@Controller
public class BookController extends BaseController{

	@Autowired
	private CategoryServiceImpl categoryService;
	@Autowired
	private BookServiceImpl bookService;
	@Autowired
	private PaginateServiceImpl paginateService;;
	@RequestMapping(value= {"user/allbook"})
	public ModelAndView Allbook() {
		_myShare.addObject("theloai",_homeService.GetDataTheLoai());
		_myShare.addObject("allbook",_homeService.GetDataAllBook());
		//_myShare.addObject("chitiet",_homeService.GetDataChiTietSach());
		_myShare.setViewName("user/AllBook");
		return _myShare;
	}
	
	@RequestMapping(value= {"user/san-pham/{id}"})
	public ModelAndView Allbook(@PathVariable String id) {
		int totalBookPage =9;
		int totalData = categoryService.GetDataAllBookByID(Integer.parseInt(id)).size();
		PaginatesDto paginateInfo=paginateService.getInfoPaginates(totalData, totalBookPage, 1);
		_myShare.addObject("tentheloai",bookService.GetTheLoaiById(Integer.parseInt(id)));
		_myShare.addObject("tentg",bookService.GetTacGiaById(Integer.parseInt(id)));
		_myShare.addObject("tennxb",bookService.GetNXB(Integer.parseInt(id)));
		_myShare.addObject("sach",bookService.GetDetailBook(Integer.parseInt(id)));
		_myShare.addObject("idcategory",id);
		_myShare.addObject("paginateInfo",paginateInfo);
		//_myShare.addObject("chitiet",_homeService.GetDataChiTietSach());
		_myShare.addObject("BookPaginate",categoryService.GetDataBooksPaginate(paginateInfo.getStart(), paginateInfo.getEnd()));
		
		_myShare.setViewName("user/product");
		return _myShare;
	}
	@RequestMapping(value = {"/search"})
	public ModelAndView search(@RequestParam(value="search", required = false) String search/*, @RequestParam(value="page", required = false) String currentPage*/) {
		_myShare.setViewName("user/searchproduct");
		//int totalData = categoryService.SqlProductByName(s).size();
		/*if(currentPage==null) {
			currentPage = "1";
		}*/
		//PaginatesDto paginatesDto = paginateService.GetInfoPanigates(totalData, totalProductsPage, (Integer.parseInt(currentPage)));
		_myShare.addObject("search", bookService.GetSearchBookByName(search));
		_myShare.addObject("theloai", bookService.GetDataTheLoai());
		//_myShare.addObject("tongso", totalData);
		//_myShare.addObject("totalProductsPage", totalProductsPage);
		_myShare.addObject("namesearch",search);
		
		//_myShare.addObject("ProductsPaginate",categoryService.GetProductPaginateByName(s,paginatesDto.getStart(),totalProductsPage));
		return _myShare;
	}
}
