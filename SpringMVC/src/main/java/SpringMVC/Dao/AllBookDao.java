package SpringMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringMVC.Dto.SachDto;
import SpringMVC.Dto.SachDtoMapper;
import SpringMVC.Entity.MapperTheLoai;
import SpringMVC.Entity.TheLoai;

@Repository
public class AllBookDao extends BaseDao{
	
	private StringBuffer SqlString() {
		StringBuffer sql=new StringBuffer();
		sql.append("SELECT s.MaSach, s.MaLoai, s.MaNXB, s.MaTG, s.TenSach, s.GiaBan, s.Mota, s.NguoiDich, s.AnhBia, s.NgayCapNhat, s.SoLuongTon FROM Sach as s join TheLoai as t on s.MaLoai=t.MaLoai" +" ");
		return sql;
	}
	private String SachSQL() {
		StringBuffer  sql = SqlString();
		
		return sql.toString();
	}
	private StringBuffer SqlBookByID(int id) {
		StringBuffer  sql = SqlString();
		sql.append("WHERE s.MaLoai = " + id + " ");
		
		return sql;
	}
	
	private String SqlBookPaginate(int start, int end) {
		StringBuffer sql=new StringBuffer();
		sql.append("SELECT DISTINCT(s.MaSach),t.TenLoai, s.MaLoai, s.MaNXB, s.MaTG, s.TenSach, s.GiaBan, s.Mota, s.NguoiDich, s.AnhBia, s.NgayCapNhat, s.SoLuongTon FROM Sach as s join TheLoai as t on s.MaLoai=t.MaLoai" +" ");
		
		sql.append(" ORDER BY s.MaSach offset "+start+" rows fetch next "+end+" rows only");
		return sql.toString();
	}
	public List<SachDto> GetDataAllBook(){
		String sql=SachSQL();
		List<SachDto> list=_jdbcTemplate.query(sql, new SachDtoMapper());
		return list;
	}
	public List<SachDto> GetDataAllBookByID(int id){
		String sql=SqlBookByID(id).toString();
		List<SachDto> list=_jdbcTemplate.query(sql, new SachDtoMapper());
		return list;
	}
	public List<SachDto> GetDataAllBookPaginate(int start, int end){
		String sql=SqlBookPaginate(start, end);
		List<SachDto> list=_jdbcTemplate.query(sql, new SachDtoMapper());
		return list;
	}
	
	
	
	private String SqlGetTheLoai(int id) {
		StringBuffer sql=new StringBuffer();
		sql.append("SELECT t.MaLoai, t.TenLoai FROM TheLoai as t join Sach as s on t.MaLoai=s.MaLoai" +" ");
		
		sql.append(" WHERE t.MaLoai = " + id + " ");
		return sql.toString();
	}
	public List<TheLoai> GetTheLoai(int id){
		String sql=SqlGetTheLoai(id);
		List<TheLoai> list=_jdbcTemplate.query(sql, new MapperTheLoai());
		return list;
	}
	
}
