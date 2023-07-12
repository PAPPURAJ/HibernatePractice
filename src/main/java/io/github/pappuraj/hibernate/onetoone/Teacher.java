package io.github.pappuraj.hibernate.onetoone;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Teacher {
	@Id
	private int id;
	private String name;
	@OneToOne(cascade = CascadeType.ALL)
	private Student student;
	public Teacher() {
		super();
	}
	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", student=" + student + "]";
	}
	
	
	

}
