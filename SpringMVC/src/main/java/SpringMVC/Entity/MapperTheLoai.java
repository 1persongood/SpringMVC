package SpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperTheLoai implements RowMapper<TheLoai>{

	public TheLoai mapRow(ResultSet rs, int rowNum) throws SQLException {
		TheLoai theloai=new TheLoai();
		theloai.setMaLoai(rs.getInt("MaLoai"));
		theloai.setTenLoai(rs.getString("TenLoai"));
		return theloai;
	}
	
}
