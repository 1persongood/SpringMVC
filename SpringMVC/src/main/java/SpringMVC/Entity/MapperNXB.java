package SpringMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperNXB implements RowMapper<NhaXuatBan>{

	public NhaXuatBan mapRow(ResultSet rs, int rowNum) throws SQLException {
		NhaXuatBan nxb=new NhaXuatBan();
		nxb.setMaNXB(rs.getInt("MaNXB"));
		nxb.setTenNXB(rs.getString("TenNXB"));
		nxb.setDiaChi(rs.getString("DiaChi"));
		nxb.setDienThoai(rs.getString("DienThoai"));

		return nxb;
	}
	
}
