package io.github.pappuraj.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	@Id
	private int id;
	private String course;
	@ManyToMany
	private List<Student> studentList;
	
	
	
	public Course() {
		super();
	}



	public Course(int id, String course, List<Student> studentList) {
		super();
		this.id = id;
		this.course = course;
		this.studentList = studentList;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getCourse() {
		return course;
	}



	public void setCourse(String course) {
		this.course = course;
	}



	public List<Student> getStudentList() {
		return studentList;
	}



	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}



	@Override
	public String toString() {
		return "Course [id=" + id + ", course=" + course + ", studentList=" + studentList + "]";
	}
	
	
	
	
	
	

}
