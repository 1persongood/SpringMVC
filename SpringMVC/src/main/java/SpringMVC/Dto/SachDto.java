package SpringMVC.Dto;

import java.util.HashSet;
import java.util.Set;

import SpringMVC.Entity.ChiTietDDH;
import SpringMVC.Entity.NhaXuatBan;
import SpringMVC.Entity.TacGia;
import SpringMVC.Entity.TheLoai;

public class SachDto {
	private int MaSach;
	private int MaTG;
	private int MaNXB;
	private int MaLoai;
	private String TenSach;
	private Long GiaBan;
	private String Mota;
	private String NguoiDich;
	private String AnhBia;
	private String NgayCapNhat;
	private int SoLuongTon;
	public SachDto() {
	}
	public SachDto(int maSach, int maTG, int maNXB, int maLoai, String tenSach, Long giaBan, String mota,
			String nguoiDich, String anhBia, String ngayCapNhat, int soLuongTon) {
		MaSach = maSach;
		MaTG = maTG;
		MaNXB = maNXB;
		MaLoai = maLoai;
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
	public int getMaTG() {
		return MaTG;
	}
	public void setMaTG(int maTG) {
		MaTG = maTG;
	}
	public int getMaNXB() {
		return MaNXB;
	}
	public void setMaNXB(int maNXB) {
		MaNXB = maNXB;
	}
	public int getMaLoai() {
		return MaLoai;
	}
	public void setMaLoai(int maLoai) {
		MaLoai = maLoai;
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
	
	
	
}

