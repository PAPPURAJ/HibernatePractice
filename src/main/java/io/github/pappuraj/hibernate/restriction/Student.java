package io.github.pappuraj.hibernate.restriction;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
 * This is demo class, from which we are going to build our XML model
 * 				Created by PAPPURAJ BHOTTACHARJEE
 */


@Entity
public class Student {
		@Id
		private int id;
		private String name;
		private String department;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(int id, String name, String department) {
			super();
			this.id = id;
			this.name = name;
			this.department = department;
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
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", department=" + department + "]";
		}
		
		 
}
