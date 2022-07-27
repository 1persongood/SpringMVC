package SpringMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;


import SpringMVC.Dto.SachDto;
import SpringMVC.Dto.SachDtoMapper;
import SpringMVC.Entity.MapperNXB;
import SpringMVC.Entity.MapperTacGia;
import SpringMVC.Entity.MapperTheLoai;
import SpringMVC.Entity.NhaXuatBan;
import SpringMVC.Entity.TacGia;
import SpringMVC.Entity.TheLoai;
@Repository
public class BookDao extends BaseDao{

	private String SqlGetDetailBook(int id) {
		StringBuffer sql=new StringBuffer();
		sql.append("SELECT DISTINCT(s.MaSach), s.MaLoai, s.MaNXB, s.MaTG, s.TenSach, s.GiaBan, s.Mota, s.NguoiDich, s.AnhBia, s.NgayCapNhat, s.SoLuongTon FROM Sach as s " +" ");
		
		sql.append(" WHERE s.MaSach = " + id + " ");
		return sql.toString();
	}
	public List<SachDto> GetDetailBook(int id){
		String sql=SqlGetDetailBook(id);
		List<SachDto> list=_jdbcTemplate.query(sql, new SachDtoMapper());
		return list;
	}
	public SachDto FindSachById(int id) {
		String sql = SqlGetDetailBook(id);
		SachDto sach = _jdbcTemplate.queryForObject(sql, new SachDtoMapper());
		return sach;
	}
	private String SqlGetTheLoaiById(int id) {
		StringBuffer sql=new StringBuffer();
		sql.append("SELECT t.MaLoai,t.TenLoai FROM TheLoai as t join Sach as s on t.MaLoai=s.MaLoai" +" ");
		
		sql.append(" WHERE s.MaSach = " + id + " ");
		return sql.toString();
	}
	public List<TheLoai> GetTheLoaiById(int id){
		String sql=SqlGetTheLoaiById(id);
		List<TheLoai> list=_jdbcTemplate.query(sql, new MapperTheLoai());
		return list;
	}
	private String SqlGetTacGiaById(int id) {
		StringBuffer sql=new StringBuffer();
		sql.append("SELECT t.MaTG,t.TenTG,t.QueQuan,t.NgaySinh,t.NgayMat,t.TieuSu FROM TacGia as t join Sach as s on t.MaTG=s.MaTG" +" ");
		
		sql.append(" WHERE s.MaSach = " + id + " ");
		return sql.toString();
	}
	public List<TacGia> GetTacGiaById(int id){
		String sql=SqlGetTacGiaById(id);
		List<TacGia> list=_jdbcTemplate.query(sql, new MapperTacGia());
		return list;
	}
	private String SqlGetNXBById(int id) {
		StringBuffer sql=new StringBuffer();
		sql.append("SELECT n.MaNXB,n.TenNXB,n.DiaChi,n.DienThoai FROM NhaXuatBan as n join Sach as s on n.MaNXB=s.MaNXB" +" ");
		
		sql.append(" WHERE s.MaSach = " + id + " ");
		return sql.toString();
	}
	public List<NhaXuatBan> GetNXB(int id){
		String sql=SqlGetNXBById(id);
		List<NhaXuatBan> list=_jdbcTemplate.query(sql, new MapperNXB());
		return list;
	}
	private StringBuffer SqlSearchBookByName(String name) {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT DISTINCT(s.MaSach), s.MaLoai, s.MaNXB, s.MaTG, s.TenSach, s.GiaBan, s.Mota, s.NguoiDich, s.AnhBia, s.NgayCapNhat, s.SoLuongTon FROM Sach as s " +" ");
		
		sql.append("WHERE  s.TenSach LIKE '%" + name + "%' ");
		
		return sql;
	}
	public List<SachDto> GetSearchBookByName(String name){
		List<SachDto> list=new ArrayList<SachDto>();
		String sql=SqlSearchBookByName(name).toString();
		list=_jdbcTemplate.query(sql, new SachDtoMapper());
		return list;
	}
}
