package SpringMVC.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import SpringMVC.Entity.ChiTietDDH;
import SpringMVC.Entity.DonDatHang;
import SpringMVC.Entity.MapperDonDatHang;



@Repository
public class BillDao extends BaseDao{

	public int AddBills(DonDatHang ddh) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT INTO DonDatHang( MaDDH, NgayDat, NgayGiao, MaKH, TinhTrang, ThanhToan) VALUES  ");
		sql.append("( ");
		sql.append(" '"+ ddh.getMaDDH() +"', ");
		sql.append(" '"+ ddh.getNgayDat() +"', ");
		sql.append(" '"+ ddh.getNgayGiao() +"', ");
		sql.append(" '"+ ddh.getMaKH() +"', ");
		sql.append(" 'Dang giao', ");
		sql.append(" '"+ ddh.getThanhToan() +"', ");
		sql.append("); ");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	
	public int GetIDLastBills() {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT MAX(id) FROM DonDatHang ");
		int id = _jdbcTemplate.queryForObject(sql.toString(), new Object[] {}, Integer.class);
		return id;
	}
	
	public int AddBillsDetail(ChiTietDDH ct) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT INTO ChiTietDDH(MaSach, MaDDH, SoLuong, DonGia) VALUES  ");
		sql.append("( ");
		sql.append(" '"+ ct.getMaSach() +"', ");
		sql.append(" '"+ ct.getMaDDH() +"', ");
		sql.append(" '"+ ct.getSoLuong() +"', ");
		sql.append(" '"+ ct.getDonGia() +"' ");
		sql.append("); ");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	
	public DonDatHang GetBillsById(int MaDDH) {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT * ");
		sql.append(" FROM DonDatHang ");
		sql.append(" WHERE MaDDH = '"+MaDDH+"' ");
		sql.append(" ORDER BY NgayDat DESC ");
		DonDatHang list = _jdbcTemplate.queryForObject(sql.toString(), new MapperDonDatHang());
		return list;
	}
	
	public int UpdateStatusById(int MaDDH,int TinhTrang) {
		StringBuffer  sql = new StringBuffer();
		sql.append("UPDATE DonDatHang SET  ");
		if(TinhTrang == 0) {
			sql.append("TinhTrang =0 ");
		}else if(TinhTrang == 1) {
			sql.append("`status` =1 ");
		}
		sql.append("WHERE MaDDH = '"+ MaDDH +"'");
		int insert = _jdbcTemplate.update(sql.toString()) ;
		return insert;
	}
	
	public int UpdateProduct(int MaSach, int soluong) {
		StringBuffer  sql = new StringBuffer();
		sql.append("UPDATE Sach SET   ");
		sql.append(" SoLuongTon= SoLuongTon - '"+soluong+"' , ");
		sql.append("WHERE MaSach = '"+MaSach+"' ");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
	public List<DonDatHang> GetAllBills() {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT * ");
		sql.append(" FROM DonDatHang ");
		List<DonDatHang> list = _jdbcTemplate.query(sql.toString(), new MapperDonDatHang());
		return list;
	}
	
	/*//admin
	public List<Bills> SearchBills(String name) {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT * ");
		sql.append(" FROM `Bills` ");
		sql.append("WHERE id LIKE '%"+name+"%' OR user LIKE '%"+name+"%'  OR phone LIKE '%"+name+"%' OR status LIKE '%"+name+"%' ");
		List<Bills> list = jdbcTemplate.query(sql.toString(), new MapperBills());
		return list;
	}
	
	public List<Bills> SearchBillsPaginate(String name,int start, int totalProductsPage) {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT * ");
		sql.append(" FROM `Bills` ");
		sql.append("WHERE id LIKE '%"+name+"%' OR user LIKE '%"+name+"%'  OR phone LIKE '%"+name+"%' OR status LIKE '%"+name+"%' ");
		if(start < 0) {
			start = 0;
		}else {
			start = start -1;
		}
		sql.append(" ORDER BY create_date DESC ");
		sql.append("LIMIT "+start+", "+totalProductsPage+" ");
		
		List<Bills> list = jdbcTemplate.query(sql.toString(), new MapperBills());
		return list;
	}
	
	public int AdminUpdateStatusById(int id,int status) {
		StringBuffer  sql = new StringBuffer();
		sql.append("UPDATE `Bills` SET  ");
		if(status == 1) {
			sql.append("`status` ='Dang chuan bi hang' ");
		}else if(status == 2) {
			sql.append("`status` ='Dang giao hang' ");
		}else if(status == 3) {
			sql.append("`status` ='Giao hang thanh cong' ");
		}else if(status == 4) {
			sql.append("`status` ='Giao hang that bai' ");
		}
		sql.append("WHERE id = '"+ id +"'");
		int insert = jdbcTemplate.update(sql.toString()) ;
		return insert;
	}*/
}
