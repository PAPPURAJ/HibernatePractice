package io.github.pappuraj.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Question {
	@Id
	private int id;
	private String question;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Answer> list;
	public Question() {
		super();
	}
	public Question(int id, String question, List<Answer> list) {
		super();
		this.id = id;
		this.question = question;
		this.list = list;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer> getList() {
		return list;
	}
	public void setList(List<Answer> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", list=" + list + "]";
	}
	
	
	
	
}