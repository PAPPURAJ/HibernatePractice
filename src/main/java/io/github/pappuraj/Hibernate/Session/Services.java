package io.github.pappuraj.Hibernate.Session;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Services {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String price;
	public Services() {
		super();
	}
	public Services(String name, String price) {
		super();
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
