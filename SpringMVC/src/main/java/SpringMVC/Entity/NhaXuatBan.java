package SpringMVC.Entity;

import java.util.HashSet;
import java.util.Set;

public class NhaXuatBan {
	private int MaNXB;
	private String TenNXB;
	private String DiaChi;
	private String DienThoai;
	private Set<Sach> sachs = new HashSet<Sach>(0);
	public NhaXuatBan() {
		super();
	}
	public NhaXuatBan(int maNXB, String tenNXB, String diaChi, String dienThoai) {
		super();
		MaNXB = maNXB;
		TenNXB = tenNXB;
		DiaChi = diaChi;
		DienThoai = dienThoai;
	}
	
	public Set<Sach> getSachs() {
		return sachs;
	}
	public void setSachs(Set<Sach> sachs) {
		this.sachs = sachs;
	}
	public int getMaNXB() {
		return MaNXB;
	}
	public void setMaNXB(int maNXB) {
		MaNXB = maNXB;
	}
	public String getTenNXB() {
		return TenNXB;
	}
	public void setTenNXB(String tenNXB) {
		TenNXB = tenNXB;
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
	
}
