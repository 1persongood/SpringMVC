package SpringMVC.Entity;

public class Admin {
	private int IDAdmin;
	private String TaiKhoan;
	private String MatKhau;
	private String HoTen;
	private boolean TrangThai;
	public Admin() {
		super();
	}
	public Admin(int iDAdmin, String taiKhoan, String matKhau, String hoTen, boolean trangThai) {
		super();
		IDAdmin = iDAdmin;
		TaiKhoan = taiKhoan;
		MatKhau = matKhau;
		HoTen = hoTen;
		TrangThai = trangThai;
	}
	public int getIDAdmin() {
		return IDAdmin;
	}
	public void setIDAdmin(int iDAdmin) {
		IDAdmin = iDAdmin;
	}
	public String getTaiKhoan() {
		return TaiKhoan;
	}
	public void setTaiKhoan(String taiKhoan) {
		TaiKhoan = taiKhoan;
	}
	public String getMatKhau() {
		return MatKhau;
	}
	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public boolean isTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(boolean trangThai) {
		TrangThai = trangThai;
	}
	
}
