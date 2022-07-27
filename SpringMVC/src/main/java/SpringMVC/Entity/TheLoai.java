package SpringMVC.Entity;

import java.util.HashSet;
import java.util.Set;

public class TheLoai {
	private int MaLoai;
	private String TenLoai;
	private Set<Sach> sachs = new HashSet<Sach>(0);
	public TheLoai() {
		
	}
	public TheLoai(int maLoai, String tenLoai) {
		
		MaLoai = maLoai;
		TenLoai = tenLoai;
	}
	
	public Set<Sach> getSachs() {
		return sachs;
	}
	public void setSachs(Set<Sach> sachs) {
		this.sachs = sachs;
	}
	public int getMaLoai() {
		return MaLoai;
	}
	public void setMaLoai(int maLoai) {
		MaLoai = maLoai;
	}
	public String getTenLoai() {
		return TenLoai;
	}
	public void setTenLoai(String tenLoai) {
		TenLoai = tenLoai;
	}
	
}
