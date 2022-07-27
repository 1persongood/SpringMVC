package SpringMVC.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dao.BillDetailDao;
import SpringMVC.Entity.ChiTietDDH;


@Service
public class BillDetailServiceImpl implements IBillDetailService{
	@Autowired
	BillDetailDao billDetailDao = new BillDetailDao();
	
	
	public List<ChiTietDDH> GetDetailBills(int MaDDH) {
		return billDetailDao.GetDetailBills(MaDDH);
	}
}
