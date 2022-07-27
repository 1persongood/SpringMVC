package SpringMVC.Dto;

import SpringMVC.Entity.Sach;

public class CartDto {
	private int quanty;
	private double totalPrice;
	private SachDto sachdto;
	
	public CartDto() {
		super();
	}
	public CartDto(int quanty, double totalPrice, SachDto sachdto) {
		super();
		this.quanty = quanty;
		this.totalPrice = totalPrice;
		this.sachdto = sachdto;
	}
	public int getQuanty() {
		return quanty;
	}
	public void setQuanty(int quanty) {
		this.quanty = quanty;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public SachDto getSachdto() {
		return sachdto;
	}
	public void setSachdto(SachDto sachdto) {
		this.sachdto = sachdto;
	}
}
