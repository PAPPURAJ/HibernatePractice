package io.github.pappuraj.manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	private int id;
	private String studentName;
	@ManyToMany
	private List<Course> courseList;
	public Student() {
		super();
	}
	public Student(int id, String studentName, List<Course> courseList) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.courseList = courseList;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", courseList=" + courseList + "]";
	}
	
	

}
