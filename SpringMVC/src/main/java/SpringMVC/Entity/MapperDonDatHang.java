package SpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperDonDatHang implements RowMapper<DonDatHang>{

	public DonDatHang mapRow(ResultSet rs, int rowNum) throws SQLException {
		DonDatHang ddh=new DonDatHang();
		ddh.setMaDDH(rs.getInt("MaDDH"));
		ddh.setNgayDat(rs.getDate("NgayDat"));
		ddh.setNgayGiao(rs.getDate("NgayGiao"));
		ddh.setMaKH(rs.getInt("MaKH"));
		ddh.setTinhTrang(rs.getBoolean("TinhTrang"));
		ddh.setThanhToan(rs.getInt("ThanhToan"));
		ddh.setTracking(rs.getInt("Tracking"));
		
		return ddh;
	}
	
}
