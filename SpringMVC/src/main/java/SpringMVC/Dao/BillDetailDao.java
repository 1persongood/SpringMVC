package SpringMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import SpringMVC.Entity.ChiTietDDH;
import SpringMVC.Entity.MapperChiTietDDH;



@Repository
public class BillDetailDao extends BaseDao{
	public List<ChiTietDDH> GetDetailBills(int MaDDH) {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT  ");
		sql.append(" ct.MaSach, ");
		sql.append(" ct.MaDDH, ");
		sql.append(" ct.SoLuong, ");
		sql.append(" ct.DonGia, ");
		sql.append(" s.TenSach as name_product, ");
		sql.append(" s.AnhBia as img_product");
		sql.append(" FROM ChiTietDDH as ct INNER JOIN Sach as s ON ct.MaSach = s.MaSach ");
		sql.append(" WHERE MaDDH = '"+MaDDH+"' ");
		List<ChiTietDDH> list = new ArrayList<ChiTietDDH>();
		list = _jdbcTemplate.query(sql.toString(), new MapperChiTietDDH());
		return list;
	}
}
