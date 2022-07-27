package SpringMVC.Entity;

import java.util.HashSet;
import java.util.Set;

public class Sach {
	private int MaSach;
	private TacGia tacgia;
	private NhaXuatBan nhaxuatban;
	private TheLoai theloai;
	private String TenSach;
	private Long GiaBan;
	private String Mota;
	private String NguoiDich;
	private String AnhBia;
	private String NgayCapNhat;
	private int SoLuongTon;
	private Set<ChiTietDDH> chitietddhs = new HashSet<ChiTietDDH>(0);
	
	public Sach() {
		
	}
	

	public Sach(int maSach, TacGia tacgia, NhaXuatBan nhaxuatban, TheLoai theloai, String tenSach, Long giaBan,
			String mota, String nguoiDich, String anhBia, String ngayCapNhat, int soLuongTon) {
		super();
		MaSach = maSach;
		this.tacgia = tacgia;
		this.nhaxuatban = nhaxuatban;
		this.theloai = theloai;
		TenSach = tenSach;
		GiaBan = giaBan;
		Mota = mota;
		NguoiDich = nguoiDich;
		AnhBia = anhBia;
		NgayCapNhat = ngayCapNhat;
		SoLuongTon = soLuongTon;
	}


	public int getMaSach() {
		return MaSach;
	}
	public void setMaSach(int maSach) {
		MaSach = maSach;
	}
	
	public String getTenSach() {
		return TenSach;
	}
	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}
	public Long getGiaBan() {
		return GiaBan;
	}
	public void setGiaBan(Long giaBan) {
		GiaBan = giaBan;
	}
	public String getMota() {
		return Mota;
	}
	public void setMota(String mota) {
		Mota = mota;
	}
	public String getNguoiDich() {
		return NguoiDich;
	}
	public void setNguoiDich(String nguoiDich) {
		NguoiDich = nguoiDich;
	}
	public String getAnhBia() {
		return AnhBia;
	}
	public void setAnhBia(String anhBia) {
		AnhBia = anhBia;
	}
	public String getNgayCapNhat() {
		return NgayCapNhat;
	}
	public void setNgayCapNhat(String ngayCapNhat) {
		NgayCapNhat = ngayCapNhat;
	}
	public int getSoLuongTon() {
		return SoLuongTon;
	}
	public void setSoLuongTon(int soLuongTon) {
		SoLuongTon = soLuongTon;
	}

	public Set<ChiTietDDH> getChitietddhs() {
		return chitietddhs;
	}

	public void setChitietddhs(Set<ChiTietDDH> chitietddhs) {
		this.chitietddhs = chitietddhs;
	}

	public TacGia getTacgia() {
		return tacgia;
	}

	public void setTacgia(TacGia tacgia) {
		this.tacgia = tacgia;
	}

	public NhaXuatBan getNhaxuatban() {
		return nhaxuatban;
	}

	public void setNhaxuatban(NhaXuatBan nhaxuatban) {
		this.nhaxuatban = nhaxuatban;
	}

	public TheLoai getTheloai() {
		return theloai;
	}

	public void setTheloai(TheLoai theloai) {
		this.theloai = theloai;
	}
	
	
}
