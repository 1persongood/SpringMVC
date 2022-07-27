package SpringMVC.Entity;

public class ChiTietDDH {
	private int MaSach;
	private int MaDDH;
	private int SoLuong;
	private double DonGia;
	public ChiTietDDH() {
		super();
	}
	public ChiTietDDH(int maSach, int maDDH, int soLuong, double donGia) {
		super();
		MaSach = maSach;
		MaDDH = maDDH;
		SoLuong = soLuong;
		DonGia = donGia;
	}
	public int getMaSach() {
		return MaSach;
	}
	public void setMaSach(int maSach) {
		MaSach = maSach;
	}
	public int getMaDDH() {
		return MaDDH;
	}
	public void setMaDDH(int maDDH) {
		MaDDH = maDDH;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public double getDonGia() {
		return DonGia;
	}
	public void setDonGia(Double donGia) {
		DonGia = donGia;
	}
}