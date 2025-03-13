package com.java.hib;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Question")
public class Question {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int qid;
	private String qname;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="quid")
	
	private List<Answer> answers;
	
	public List<Answer> getAnswers(){
		return answers;
		
	}

	public Question(int qid, String qname, List<Answer> answers) {
		super();
		this.qid = qid;
		this.qname = qname;
		this.answers = answers;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", qname=" + qname + ", answers=" + answers + "]";
	}
	
	


}
