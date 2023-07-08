package io.github.pappuraj.HibernatePractice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Services {
	@Id
	private int id;
	private String name;
	private String price;
	public Services() {
		super();
	}
	public Services(int id, String name, String price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Services [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	

	
	
	
}
