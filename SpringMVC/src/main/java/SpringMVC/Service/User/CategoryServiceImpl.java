package SpringMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dao.AllBookDao;
import SpringMVC.Dto.SachDto;
import SpringMVC.Entity.TheLoai;
@Service
public class CategoryServiceImpl implements ICategoryService{

	@Autowired
	private AllBookDao allbookdao;
	
	public List<SachDto> GetDataBooksPaginate(int start, int end) {
		
		return allbookdao.GetDataAllBookPaginate(start, end);
	}

	public List<SachDto> GetDataAllBookByID(int id) {
		return allbookdao.GetDataAllBookByID(id);
	}
	public List<TheLoai> GetTheLoai(int id){
		return allbookdao.GetTheLoai(id);
	}
	
}
