package entities;

public class OrderItem {

	public Integer quantity;
	public Double price;
	
	
	public Double subTotal() {
		return 0.0;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}
	
}
