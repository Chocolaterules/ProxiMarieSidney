package fr.formation.proxibanquemariesidney.business;

import java.util.List;

public class Branch {
	public String idNum;
	public String creationDate;
	public List<Advisor> advisorList;
	public Manager manager;
	
	public Branch(String idNum, String creationDate) {
		this.idNum = idNum;
		this.creationDate = creationDate;
	}
	
}
