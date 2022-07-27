package SpringMVC.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class SachDtoMapper implements RowMapper<SachDto>{

	public SachDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		SachDto sachdto=new SachDto();
		sachdto.setMaSach(rs.getInt("MaSach"));
		sachdto.setMaTG(rs.getInt("MaTG"));
		sachdto.setMaNXB(rs.getInt("MaNXB"));
		sachdto.setMaLoai(rs.getInt("MaLoai"));
		sachdto.setTenSach(rs.getString("TenSach"));
		sachdto.setGiaBan(rs.getLong("GiaBan"));
		sachdto.setMota(rs.getString("Mota"));
		sachdto.setNguoiDich(rs.getString("NguoiDich"));
		sachdto.setAnhBia(rs.getString("AnhBia"));
		sachdto.setNgayCapNhat(rs.getString("NgayCapNhat"));
		sachdto.setSoLuongTon(rs.getInt("SoLuongTon"));
		
		return sachdto;
	}
	
}