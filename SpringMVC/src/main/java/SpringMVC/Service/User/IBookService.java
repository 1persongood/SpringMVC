package SpringMVC.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import SpringMVC.Dto.SachDto;
import SpringMVC.Entity.NhaXuatBan;
import SpringMVC.Entity.TacGia;
import SpringMVC.Entity.TheLoai;

@Service
public interface IBookService {

	public List<SachDto> GetDetailBook(int id);
	public List<TheLoai> GetTheLoaiById(int id);
	public List<TacGia> GetTacGiaById(int id);
	public List<NhaXuatBan> GetNXB(int id);
	public List<TheLoai> GetDataTheLoai();
	public List<SachDto> GetSearchBookByName(String name);
}
