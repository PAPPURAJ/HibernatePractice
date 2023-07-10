package io.github.pappuraj.onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	@Id
	private int ansid;
	private String answer;

	public Answer() {
		super();
	}
	public Answer(int id,String answer) {
		super();
		this.ansid=id;
		this.answer = answer;
	}
	public int getAnsid() {
		return ansid;
	}
	public void setAnsid(int ansid) {
		this.ansid = ansid;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Answer [ansid=" + ansid + ", answer=" + answer + "]";
	}
	
	
	
}
