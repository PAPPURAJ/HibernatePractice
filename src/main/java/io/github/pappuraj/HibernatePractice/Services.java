package io.github.pappuraj.HibernatePractice;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Embeddable
public class Services {
//	@Id
//	@GeneratedValue
//	private int id;
	@Column(name = "service_name")
	private String name;
	private String price;
	public Services() {
		super();
	}
	public Services( String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
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
		return "Services [ name=" + name + ", price=" + price + "]";
	}
	

	
	
	
}
