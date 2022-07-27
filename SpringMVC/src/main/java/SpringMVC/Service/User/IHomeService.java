package SpringMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dto.SachDto;
import SpringMVC.Entity.TheLoai;
@Service
public interface IHomeService {
	@Autowired
	public List<TheLoai> GetDataTheLoai();
	public List<SachDto> GetDataSachMoiCN();
	public List<SachDto> GetDataSachBanChay();
	public List<SachDto> GetDataAllBook();
	//public List<SachDto> GetDataChiTietSach();
	
}

