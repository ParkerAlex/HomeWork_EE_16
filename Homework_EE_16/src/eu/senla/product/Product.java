package eu.senla.product;

import java.time.LocalDate;

public class Product {
	
	private int id;
	private String name;
	private LocalDate date;
	

	public Product(int id, String name, LocalDate date) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		
	}

	 

	

	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public LocalDate getDate() {
		return date;
	}





	public void setDate(LocalDate date) {
		this.date = date;
	}





	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", date=" + date + "]";
	}

	 
	
	
}
