package SpringMVC.Entity;

public class LienHe {
	private int MaLH;
	private String Ho;
	private String Ten;
	private String Email;
	private String DienThoai;
	private String NoiDung;
	private String NgayCapNhat;
	public LienHe() {
		super();
	}
	public LienHe(int maLH, String ho, String ten, String email, String dienThoai, String noiDung, String ngayCapNhat) {
		super();
		MaLH = maLH;
		Ho = ho;
		Ten = ten;
		Email = email;
		DienThoai = dienThoai;
		NoiDung = noiDung;
		NgayCapNhat = ngayCapNhat;
	}
	public int getMaLH() {
		return MaLH;
	}
	public void setMaLH(int maLH) {
		MaLH = maLH;
	}
	public String getHo() {
		return Ho;
	}
	public void setHo(String ho) {
		Ho = ho;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getDienThoai() {
		return DienThoai;
	}
	public void setDienThoai(String dienThoai) {
		DienThoai = dienThoai;
	}
	public String getNoiDung() {
		return NoiDung;
	}
	public void setNoiDung(String noiDung) {
		NoiDung = noiDung;
	}
	public String getNgayCapNhat() {
		return NgayCapNhat;
	}
	public void setNgayCapNhat(String ngayCapNhat) {
		NgayCapNhat = ngayCapNhat;
	}
	
}
