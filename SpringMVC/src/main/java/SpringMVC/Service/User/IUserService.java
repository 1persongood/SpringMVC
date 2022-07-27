package SpringMVC.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import SpringMVC.Entity.ChangePassword;
import SpringMVC.Entity.DonDatHang;
import SpringMVC.Entity.KhachHang;

@Service
public interface IUserService {

	public int AddUser(KhachHang khachhang);
	public KhachHang CheckUser(KhachHang khachhang);
	public boolean CheckAddUser(KhachHang khachhang);
	public String checkvalid(KhachHang khachhang);
	public String checkvalidlogin(KhachHang khachhang);
	public int EditUser(KhachHang khachhang);
	public String ChangePass(ChangePassword pass);
	public List<DonDatHang> bills(int MaKH);
}
