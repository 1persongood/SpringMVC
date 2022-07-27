package SpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperTacGia implements RowMapper<TacGia>{

	public TacGia mapRow(ResultSet rs, int rowNum) throws SQLException {
		TacGia tacgia=new TacGia();
		tacgia.setMaTG(rs.getInt("MaTG"));
		tacgia.setTenTG(rs.getString("TenTG"));
		tacgia.setQueQuan(rs.getString("QueQuan"));
		tacgia.setNgaySinh(rs.getString("NgaySinh"));
		tacgia.setNgayMat(rs.getString("NgayMat"));
		tacgia.setTieuSu(rs.getString("TieuSu"));
		return tacgia;
	}
	
}
