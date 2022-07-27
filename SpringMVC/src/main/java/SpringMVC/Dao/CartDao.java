package SpringMVC.Dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import SpringMVC.Dto.CartDto;
import SpringMVC.Dto.SachDto;


@Repository
public class CartDao extends BaseDao{

	@Autowired
	BookDao bookDao = new BookDao();
	
	public HashMap<Integer, CartDto> AddCart(int id, HashMap<Integer, CartDto> cart) {
		CartDto itemCart = new CartDto();
		SachDto sach = bookDao.FindSachById(id);
		if(sach != null && cart.containsKey(id)){
			itemCart = cart.get(id);
			itemCart.setQuanty(itemCart.getQuanty() + 1);
			itemCart.setTotalPrice(itemCart.getQuanty() * sach.getGiaBan());
		}
		else {
			itemCart.setSachdto(sach);
			itemCart.setQuanty(1);
			itemCart.setTotalPrice(sach.getGiaBan());
		}
		cart.put(id, itemCart);
		return cart;
	} 
	
	public HashMap<Integer, CartDto> EditCart(int id,int quanty, HashMap<Integer, CartDto> cart) {
		if(cart == null) {
			return cart;
		}
		CartDto itemCart = new CartDto();
		if(cart.containsKey(id)){
			itemCart = cart.get(id);
			itemCart.setQuanty(quanty);
			double totalPrice = quanty * (itemCart.getSachdto().getGiaBan());
			itemCart.setTotalPrice(totalPrice);
		}
		cart.put(id, itemCart);
		return cart;
	} 
	
	public HashMap<Integer, CartDto> DeleteCart(int id, HashMap<Integer, CartDto> cart) {
		if(cart == null) {
			return cart;
		}
		if(cart.containsKey(id)){
			cart.remove(id);
		}
		return cart;
	} 
	
	public int TotalQuanty(HashMap<Integer, CartDto> cart) {
		int totalQuanty = 0;
		for(Map.Entry<Integer, CartDto> itemCart : cart.entrySet()) {
			totalQuanty += itemCart.getValue().getQuanty();
		}
		return totalQuanty;
	}
	
	public double TotalPrice(HashMap<Integer, CartDto> cart) {
		int totalPrice = 0;
		for(Map.Entry<Integer, CartDto> itemCart : cart.entrySet()) {
			totalPrice += itemCart.getValue().getTotalPrice();
		}
		return totalPrice;
	} 
}
