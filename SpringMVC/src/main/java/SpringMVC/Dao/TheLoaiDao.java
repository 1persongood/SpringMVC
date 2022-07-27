package SpringMVC.Dao;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import SpringMVC.Entity.MapperTheLoai;
import SpringMVC.Entity.TheLoai;
@Repository
public class TheLoaiDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	public List<TheLoai> GetDataTheLoai(){
		List<TheLoai> list=new ArrayList<TheLoai>();
		String sql="SELECT * FROM TheLoai";
		list=_jdbcTemplate.query(sql, new MapperTheLoai());
		return list;
	}
}
