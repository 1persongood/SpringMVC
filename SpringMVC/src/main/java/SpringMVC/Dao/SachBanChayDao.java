package SpringMVC.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import SpringMVC.Dto.SachDto;
import SpringMVC.Dto.SachDtoMapper;

@Repository
public class SachBanChayDao extends BaseDao{
	
	private String SqlString() {
		StringBuffer sql=new StringBuffer();
		sql.append("SELECT TOP 3 s.MaSach, s.TenSach,s.GiaBan, s.AnhBia, ct.SoLuong, s.MaTG, s.MaNXB, s.MaLoai, s.Mota, s.NguoiDich, s.NgayCapNhat, s.SoLuongTon ");
		sql.append("from sach as s join ChiTietDDH as ct on s.MaSach=ct.MaSach ");
		sql.append("order by ct.SoLuong desc");
		return sql.toString();
	}
	public List<SachDto> GetDataSachBanChay(){
		String sql=SqlString();
		List<SachDto> list=_jdbcTemplate.query(sql, new SachDtoMapper());
		return list;
	}
}
