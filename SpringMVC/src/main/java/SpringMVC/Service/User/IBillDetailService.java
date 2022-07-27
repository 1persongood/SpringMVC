package SpringMVC.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import SpringMVC.Entity.ChiTietDDH;

@Service
public interface IBillDetailService {
	public List<ChiTietDDH> GetDetailBills(int MaDDH);
}
