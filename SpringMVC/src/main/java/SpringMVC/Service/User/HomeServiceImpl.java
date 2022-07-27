package SpringMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dao.AllBookDao;
import SpringMVC.Dao.ChiTietSachDao;
import SpringMVC.Dao.SachBanChayDao;
import SpringMVC.Dao.SachMoiCNDao;
import SpringMVC.Dao.TheLoaiDao;
import SpringMVC.Dto.SachDto;
import SpringMVC.Entity.Sach;
import SpringMVC.Entity.TheLoai;
@Service
public class HomeServiceImpl implements IHomeService{
	@Autowired
	private TheLoaiDao theloaidao;
	@Autowired
	private SachMoiCNDao sachmoicndao;
	@Autowired
	private SachBanChayDao sachbanchaysao;
	@Autowired
	private AllBookDao allbook;
	@Autowired
	//private ChiTietSachDao chitietsachdao;
	public List<TheLoai> GetDataTheLoai() {
		
		return theloaidao.GetDataTheLoai();
	}

	public List<SachDto> GetDataSachMoiCN() {
		List<SachDto> listSachdto=sachmoicndao.GetDataSachMoiCN();
		return listSachdto;
	}
	public List<SachDto> GetDataSachBanChay() {
		List<SachDto> listSachdto=sachbanchaysao.GetDataSachBanChay();
		return listSachdto;
	}
	public List<SachDto> GetDataAllBook() {
		List<SachDto> listSachdto=allbook.GetDataAllBook();
		return listSachdto;
	}
	/*public List<SachDto> GetDataChiTietSach() {
		List<SachDto> listSachdto=chitietsachdao.GetDataChiTietSach();
		return listSachdto;
	}*/
	
}
