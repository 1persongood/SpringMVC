package SpringMVC.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;


import SpringMVC.Dto.SachDto;
import SpringMVC.Dto.SachDtoMapper;
@Repository
public class SachMoiCNDao extends BaseDao{
	
	private String SqlString() {
		StringBuffer sql=new StringBuffer();
		sql.append("SELECT TOP 6 * FROM Sach ORDER BY NgayCapNhat desc");
		return sql.toString();
	}
	public List<SachDto> GetDataSachMoiCN(){
		String sql=SqlString();
		List<SachDto> list=_jdbcTemplate.query(sql, new SachDtoMapper());
		return list;
	}
}
