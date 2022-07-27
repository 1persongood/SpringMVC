package SpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperKhachHang implements RowMapper<KhachHang>{

	public KhachHang mapRow(ResultSet rs, int rowNum) throws SQLException {
		KhachHang kh=new KhachHang();
		kh.setMaKH(rs.getInt("MaKH"));
		kh.setTenKH(rs.getString("TenKH"));
		kh.setDiaChi(rs.getString("DiaChi"));
		kh.setEmail(rs.getString("Email"));
		kh.setDienThoai(rs.getString("DienThoai"));
		kh.setNgaySinh(rs.getString("NgaySinh"));
		kh.setTaiKhoan(rs.getString("TaiKhoan"));
		kh.setMatKhau(rs.getString("MatKhau"));
		kh.setNgayTao(rs.getString("NgayTao"));
		kh.setTrangThai(rs.getBoolean("TrangThai"));
		return kh;
	}
	
}
