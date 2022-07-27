package SpringMVC.Service.User;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import SpringMVC.Dto.CartDto;
import SpringMVC.Entity.DonDatHang;

@Service
public interface IBillService {
	public int AddBills(DonDatHang ddh);
	
	public void AddBillsDetail(HashMap<Integer, CartDto> carts);
	
	public DonDatHang GetBillsById(int MaDDH);
	
	public int UpdateStatusById(int MaDDH, int TinhTrang);
	
	public List<DonDatHang> GetAllBills();
}
