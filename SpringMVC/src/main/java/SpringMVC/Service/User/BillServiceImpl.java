package SpringMVC.Service.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import SpringMVC.Dao.BillDao;
import SpringMVC.Dto.CartDto;
import SpringMVC.Entity.ChiTietDDH;
import SpringMVC.Entity.DonDatHang;

@Service
public class BillServiceImpl implements IBillService{
	@Autowired
	private BillDao billsDao;
	public int AddBills(DonDatHang ddh) {
		return billsDao.AddBills(ddh);
	}

	public void AddBillsDetail(HashMap<Integer, CartDto> carts) {
		int ma = billsDao.GetIDLastBills();
		
		for (Map.Entry<Integer, CartDto> itemCart : carts.entrySet()) {
			ChiTietDDH ct = new ChiTietDDH();
			ct.setMaDDH(ma);
			ct.setMaSach(itemCart.getValue().getSachdto().getMaSach());
			ct.setSoLuong(itemCart.getValue().getQuanty());
			ct.setDonGia(itemCart.getValue().getTotalPrice());
			billsDao.UpdateProduct(ct.getMaSach(), ct.getSoLuong());
			billsDao.AddBillsDetail(ct);
		}
		
	}

	public DonDatHang GetBillsById(int MaDDH) {
		return billsDao.GetBillsById(MaDDH);
	}

	public int UpdateStatusById(int MaDDH, int TinhTrang) {
		return billsDao.UpdateStatusById(MaDDH, TinhTrang);
	}

	public List<DonDatHang> GetAllBills() {
		return billsDao.GetAllBills();
	}

}
