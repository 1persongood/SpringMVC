package SpringMVC.Entity;

import java.util.HashSet;
import java.util.Set;

public class KhachHang {
	private int MaKH;
	private String TenKH;
	private String Email;
	private String DiaChi;
	private String DienThoai;
	private String NgaySinh;
	private String TaiKhoan;
	private String MatKhau;
	private String NgayTao;
	private boolean TrangThai;
	private Set<DonDatHang> dondathangs=new HashSet<DonDatHang>(0);
	public KhachHang() {
		super();
	}
	public KhachHang(int maKH, String tenKH, String email, String diaChi, String dienThoai, String ngaySinh,
			String taiKhoan, String matKhau, String ngayTao, boolean trangThai) {
		super();
		MaKH = maKH;
		TenKH = tenKH;
		Email = email;
		DiaChi = diaChi;
		DienThoai = dienThoai;
		NgaySinh = ngaySinh;
		TaiKhoan = taiKhoan;
		MatKhau = matKhau;
		NgayTao = ngayTao;
		TrangThai = trangThai;
	}
	public int getMaKH() {
		return MaKH;
	}
	public void setMaKH(int maKH) {
		MaKH = maKH;
	}
	public String getTenKH() {
		return TenKH;
	}
	public void setTenKH(String tenKH) {
		TenKH = tenKH;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getDienThoai() {
		return DienThoai;
	}
	public void setDienThoai(String dienThoai) {
		DienThoai = dienThoai;
	}
	public String getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
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
	public String getNgayTao() {
		return NgayTao;
	}
	public void setNgayTao(String ngayTao) {
		NgayTao = ngayTao;
	}
	public boolean isTrangThai() {
		return TrangThai;
	}
	public void setTrangThai(boolean trangThai) {
		TrangThai = trangThai;
	}
	public Set<DonDatHang> getDondathangs() {
		return dondathangs;
	}
	public void setDondathangs(Set<DonDatHang> dondathangs) {
		this.dondathangs = dondathangs;
	}
	
}
