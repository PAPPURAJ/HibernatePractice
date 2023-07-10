package io.github.pappuraj.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Question {
	@Id
	private int id;
	private String question;
	@OneToOne
	private Answer answer;
	public Question() {
		super();
	}
	public Question(int id, String question, Answer ans) {
		super();
		this.id=id;
		this.question = question;
		this.answer = ans;
	}

	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answer getAns() {
		return answer;
	}
	public void setAns(Answer ans) {
		this.answer = ans;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", question=" + question + ", ansid=" + answer+ "]";
	}
	
	
	
}
