package SpringMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dao.AllBookDao;
import SpringMVC.Dao.BookDao;
import SpringMVC.Dao.TheLoaiDao;
import SpringMVC.Dto.SachDto;
import SpringMVC.Entity.NhaXuatBan;
import SpringMVC.Entity.TacGia;
import SpringMVC.Entity.TheLoai;

@Service
public class BookServiceImpl implements IBookService{

	@Autowired
	private BookDao bookdao;
	@Autowired
	private TheLoaiDao theloaidao;
	public List<SachDto> GetDetailBook(int id) {
		return bookdao.GetDetailBook(id);
	}

	public List<TheLoai> GetTheLoaiById(int id) {
		return bookdao.GetTheLoaiById(id);
	}

	public List<TacGia> GetTacGiaById(int id) {
		return bookdao.GetTacGiaById(id);
	}

	public List<NhaXuatBan> GetNXB(int id) {
		return bookdao.GetNXB(id);
	}
	public List<SachDto> GetSearchBookByName(String name){
		List<SachDto> listSachdto=bookdao.GetSearchBookByName(name);
		return listSachdto;
		
	}
	public List<TheLoai> GetDataTheLoai(){
		return theloaidao.GetDataTheLoai();
	}
}
