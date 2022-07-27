package SpringMVC.Dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import SpringMVC.Entity.ChangePassword;
import SpringMVC.Entity.DonDatHang;
import SpringMVC.Entity.KhachHang;
import SpringMVC.Entity.MapperDonDatHang;
import SpringMVC.Entity.MapperKhachHang;

@Repository
public class UserDao extends BaseDao{

	public int AddUser(KhachHang khachhang) {
		StringBuffer  sql = new StringBuffer();
		sql.append("INSERT INTO KhachHang ");
		sql.append("(TenKH,Email,DiaChi, DienThoai, NgaySinh, TaiKhoan, MatKhau) ");
		sql.append("VALUES ( ");
		sql.append(" '"+ khachhang.getTenKH() +"', ");
		sql.append(" '"+ khachhang.getEmail() +"', ");
		sql.append(" '"+ khachhang.getDiaChi() +"', ");
		sql.append(" '"+ khachhang.getDienThoai() +"', ");
		sql.append(" '"+ khachhang.getNgaySinh() +"', ");
		sql.append(" '"+ khachhang.getTaiKhoan() +"', ");
		sql.append(" '"+ khachhang.getMatKhau()+"' ");
		sql.append(" ) ");
		
		int insert = _jdbcTemplate.update(sql.toString()) ;
		return insert;
	}
	
	public List<KhachHang> GetUserByAcc(KhachHang khachhang) {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT * FROM KhachHang WHERE ");
		sql.append("TaiKhoan = '"+khachhang.getTaiKhoan()+"' ");
		List<KhachHang> checkuser = _jdbcTemplate.query(sql.toString(), new MapperKhachHang());
		return checkuser;
	}
	
	public KhachHang CheckAddAcc(KhachHang khachhang) {
		StringBuffer  sql = new StringBuffer();
		sql.append("SELECT * FROM KhachHang WHERE ");
		sql.append("TaiKhoan = '"+khachhang.getTaiKhoan()+"' ");
		KhachHang checkuser = _jdbcTemplate.queryForObject(sql.toString(), new MapperKhachHang());
		return checkuser;
	}
	public int EditUser(KhachHang khachhang) {
		StringBuffer  sql = new StringBuffer();
		sql.append("UPDATE KhachHang SET  ");
		sql.append("TenKH ='"+ khachhang.getTenKH() +"', ");
		sql.append("DiaChi ='"+ khachhang.getDiaChi() +"', ");
		sql.append("DienThoai ='"+ khachhang.getDienThoai() +"', ");
		sql.append("NgaySinh ='"+ khachhang.getNgaySinh()+"' ");
		sql.append("Emai` ='"+ khachhang.getEmail()+"' ");
		sql.append("WHERE MaKH = '"+ khachhang.getMaKH()+"'");
		int insert = _jdbcTemplate.update(sql.toString()) ;
		return insert;
	}
	
	public int ChangePass(ChangePassword pass) {
		StringBuffer  sql = new StringBuffer();
		sql.append("UPDATE KhachHang SET  ");
		sql.append("MatKhau ='"+ pass.getNewppass()+"' ");
		sql.append("WHERE MaKH = '"+ pass.getId() +"'");
		int insert = _jdbcTemplate.update(sql.toString()) ;
		return insert;
	}
	//don-hang
		public List<DonDatHang> bills(int MaKH) {
			StringBuffer  sql = new StringBuffer();
			sql.append("SELECT * FROM DonDatHang WHERE ");
			sql.append("MaKH = '"+MaKH+"' ");
			sql.append("ORDER BY NgayDat DESC ");
			List<DonDatHang> list = _jdbcTemplate.query(sql.toString(), new MapperDonDatHang()) ;
			return list;
		}
}
