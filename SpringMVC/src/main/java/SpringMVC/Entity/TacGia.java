package SpringMVC.Entity;

import java.util.HashSet;
import java.util.Set;

public class TacGia {
	private int MaTG;
	private String TenTG;
	private String QueQuan;
	private String NgaySinh;
	private String NgayMat;
	private String TieuSu;
	private Set<Sach> sachs = new HashSet<Sach>(0);
	public TacGia() {
		super();
	}
	public TacGia(int maTG, String tenTG, String queQuan, String ngaySinh, String ngayMat, String tieuSu) {
		super();
		MaTG = maTG;
		TenTG = tenTG;
		QueQuan = queQuan;
		NgaySinh = ngaySinh;
		NgayMat = ngayMat;
		TieuSu = tieuSu;
	}
	
	public Set<Sach> getSachs() {
		return sachs;
	}
	public void setSachs(Set<Sach> sachs) {
		this.sachs = sachs;
	}
	public int getMaTG() {
		return MaTG;
	}
	public void setMaTG(int maTG) {
		MaTG = maTG;
	}
	public String getTenTG() {
		return TenTG;
	}
	public void setTenTG(String tenTG) {
		TenTG = tenTG;
	}
	public String getQueQuan() {
		return QueQuan;
	}
	public void setQueQuan(String queQuan) {
		QueQuan = queQuan;
	}
	public String getNgaySinh() {
		return NgaySinh;
	}
	public void setNgaySinh(String ngaySinh) {
		NgaySinh = ngaySinh;
	}
	public String getNgayMat() {
		return NgayMat;
	}
	public void setNgayMat(String ngayMat) {
		NgayMat = ngayMat;
	}
	public String getTieuSu() {
		return TieuSu;
	}
	public void setTieuSu(String tieuSu) {
		TieuSu = tieuSu;
	}
	
}
