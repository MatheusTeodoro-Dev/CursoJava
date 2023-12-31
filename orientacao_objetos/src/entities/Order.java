package entities;

import java.sql.Date;

public class Order {

	private Date date; 
	private Produto product;
	
	public Order(Date date, Produto product) {
		super();
		this.date = date;
		this.product = product;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Produto getProduct() {
		return product;
	}

	public void setProduct(Produto product) {
		this.product = product;
	}
	
}
