package SpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSach implements RowMapper<Sach>{

	public Sach mapRow(ResultSet rs, int rowNum) throws SQLException {
		Sach sach=new Sach();
		sach.setMaSach(rs.getInt("MaSach"));
		TheLoai theloai = new TheLoai();
		theloai.setMaLoai(rs.getInt("MaLoai"));
		theloai.setTenLoai(rs.getString("TenLoai"));
		sach.setTheloai(theloai);
		NhaXuatBan nxb=new NhaXuatBan();
		nxb.setMaNXB(rs.getInt("MaNXB"));
		nxb.setTenNXB(rs.getString("MaNXB"));
		nxb.setDiaChi(rs.getString("DiaChi"));
		nxb.setDienThoai(rs.getString("DienThoai"));
		sach.setNhaxuatban(nxb);
		TacGia tacgia = new TacGia();
		tacgia.setMaTG(rs.getInt("MaTG"));
		tacgia.setTenTG(rs.getString("TenTG"));
		tacgia.setNgaySinh(rs.getString("NgaySinh"));
		tacgia.setNgayMat(rs.getString("NgayMat"));
		tacgia.setQueQuan(rs.getString("QueQuan"));
		tacgia.setTieuSu(rs.getString("TieuSu"));
		sach.setTacgia(tacgia);
		sach.setTenSach(rs.getString("TenSach"));
		sach.setGiaBan(rs.getLong("GiaBan"));
		sach.setMota(rs.getString("Mota"));
		sach.setNguoiDich(rs.getString("NguoiDich"));
		sach.setAnhBia(rs.getString("AnhBia"));
		sach.setNgayCapNhat(rs.getString("NgayCapNhat"));
		sach.setSoLuongTon(rs.getInt("SoLuongTon"));
		
		return sach;
	}
	
}