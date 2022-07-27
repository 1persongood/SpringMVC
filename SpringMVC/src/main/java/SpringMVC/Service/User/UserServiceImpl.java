package SpringMVC.Service.User;

import java.util.List;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SpringMVC.Dao.UserDao;
import SpringMVC.Entity.ChangePassword;
import SpringMVC.Entity.DonDatHang;
import SpringMVC.Entity.KhachHang;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	UserDao userDao = new UserDao();
	
	
	public int AddUser(KhachHang khachhang) {
		khachhang.setMatKhau(BCrypt.hashpw(khachhang.getMatKhau(), BCrypt.gensalt(15)) );
		
		return userDao.AddUser(khachhang);
	}
	
	public KhachHang CheckUser(KhachHang khachhang) {
		try {
			String pass = khachhang.getMatKhau();
			khachhang = userDao.CheckAddAcc(khachhang);
			if(khachhang != null) {
				if(BCrypt.checkpw(pass,khachhang.getMatKhau())) {
					return khachhang;
				}else {
					return null;
				}
			}
			return null;
		} catch (Exception e) {
			return null;
		}
		
	}

	public boolean CheckAddUser(KhachHang khachhang) {
		List<KhachHang> usercheck = userDao.GetUserByAcc(khachhang);
		if(usercheck.size() > 0) {
			return true;
		}
		return false;
	}
	public boolean AdminCheckAddUser(KhachHang khachhang) {
		List<KhachHang> usercheck = userDao.GetUserByAcc(khachhang);
		if(usercheck.size() > 1) {
			return true;
		}
		return false;
	}

	public String checkvalid(KhachHang khachhang) {
		if("".equals(khachhang.getTenKH())) {
			return "Khách hàng không được để trống tên khách hàng";
		}else if("".equals(khachhang.getEmail())) {
			return "Khách hàng không được để trống email";
		}else if("".equals(khachhang.getDiaChi())) {
			return "Khách hàng không được để trống địa chỉ";
		}else if("".equals(khachhang.getDienThoai())) {
			return "Khách hàng không được để trống Số điện thoại";
		}else if("".equals(khachhang.getNgaySinh())) {
			return "Khách hàng không được để trống ngày sinh";
		}else if("".equals(khachhang.getTaiKhoan())) {
			return "Khách hàng không được để trống tài khoản";
		}else if("".equals(khachhang.getMatKhau())) {
			return "Khách hàng không được để trống mật khẩu";
		}
		
		return null;
	}

	public String checkvalidlogin(KhachHang khachhang) {
		if("".equals(khachhang.getTaiKhoan())) {
			return "Khách hàng không được để trống tài khoản";
		}else if("".equals(khachhang.getMatKhau())) {
			return "Khách hàng không được để trống mật khẩu";
		}
		return null;
	}

	public int EditUser(KhachHang khachhang) {
		return userDao.EditUser(khachhang);
	}

	public String ChangePass(ChangePassword pass) {
		if(BCrypt.checkpw(pass.getOldpass(), pass.getConfirmoldpass())) {
			if(pass.getNewppass().equals(pass.getConfirmpass())) {
				if(pass.getOldpass().equals(pass.getNewppass())) {
					return "Mật khẩu mới không được trùng mật khẩu cũ";
				}else {
					pass.setNewppass(BCrypt.hashpw(pass.getNewppass(), BCrypt.gensalt(15)));
					 int x = userDao.ChangePass(pass);
					 if(x > 0) {
						 return null;
					 }else {
						 return "Đổi mật khẩu thất bại";
					 }
				}
				
			}else {
				return "Mật khẩu xác nhận không đúng";
			}
		}else {
			return "Nhập sai mật khẩu cũ";
		}
	}

	public List<DonDatHang> bills(int MaKH) {
			return userDao.bills(MaKH);
		
	}
}
