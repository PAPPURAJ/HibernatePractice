package io.github.pappuraj.statemanagement;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Project2Morrow {
	@Id
	private int id;
	private String name;
	private String homeTown;
	public Project2Morrow() {
		super();
	}
	public Project2Morrow(String name, String homeTown) {
		super();
		id=100;
		this.name = name;
		this.homeTown = homeTown;
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
	public String getHomeTown() {
		return homeTown;
	}
	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}
	@Override
	public String toString() {
		return "Project2Morrow [id=" + id + ", name=" + name + ", homeTown=" + homeTown + "]";
	}
	
	
}
