package SpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperChiTietDDH implements RowMapper<ChiTietDDH>{

	public ChiTietDDH mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		ChiTietDDH ct=new ChiTietDDH();
		ct.setMaSach(rs.getInt("MaSach"));
		ct.setMaDDH(rs.getInt("MaDDH"));
		
		
		ct.setSoLuong(rs.getInt("SoLuong"));
		ct.setDonGia(rs.getDouble("DonGia"));
		
		
		return ct;
	}
	
}
