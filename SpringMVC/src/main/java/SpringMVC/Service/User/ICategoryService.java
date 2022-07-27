package SpringMVC.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import SpringMVC.Dto.SachDto;
import SpringMVC.Entity.TheLoai;
@Service
public interface ICategoryService {
	
	public List<SachDto> GetDataAllBookByID(int id);
	public List<SachDto> GetDataBooksPaginate(int start, int end);
	public List<TheLoai> GetTheLoai(int id);
}
