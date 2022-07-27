package SpringMVC.Entity;
import java.sql.Date;
public class DonDatHang {
	private int MaDDH;
	private Date NgayDat;
	private Date NgayGiao;
	private boolean TinhTrang;
	private int MaKH;
	private int ThanhToan;
	private int Tracking;
	public DonDatHang() {
		super();
	}
	public DonDatHang(int maDDH, Date ngayDat, Date ngayGiao, boolean tinhTrang, int maKH, int thanhToan,
			int tracking) {
		super();
		MaDDH = maDDH;
		NgayDat = ngayDat;
		NgayGiao = ngayGiao;
		TinhTrang = tinhTrang;
		maKH = MaKH;
		ThanhToan = thanhToan;
		Tracking = tracking;
	}
	public int getMaDDH() {
		return MaDDH;
	}
	public void setMaDDH(int maDDH) {
		MaDDH = maDDH;
	}
	public Date getNgayDat() {
		return NgayDat;
	}
	public void setNgayDat(Date ngayDat) {
		NgayDat = ngayDat;
	}
	public Date getNgayGiao() {
		return NgayGiao;
	}
	public void setNgayGiao(Date ngayGiao) {
		NgayGiao = ngayGiao;
	}
	public boolean isTinhTrang() {
		return TinhTrang;
	}
	public void setTinhTrang(boolean tinhTrang) {
		TinhTrang = tinhTrang;
	}
	
	public int getMaKH() {
		return MaKH;
	}
	public void setMaKH(int maKH) {
		MaKH = maKH;
	}
	public int getThanhToan() {
		return ThanhToan;
	}
	public void setThanhToan(int thanhToan) {
		ThanhToan = thanhToan;
	}
	public int getTracking() {
		return Tracking;
	}
	public void setTracking(int tracking) {
		Tracking = tracking;
	}
	
}
