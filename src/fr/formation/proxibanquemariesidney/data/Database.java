package fr.formation.proxibanquemariesidney.data;

import java.util.ArrayList;
import java.util.List;

import fr.formation.proxibanquemariesidney.business.Advisor;
import fr.formation.proxibanquemariesidney.business.Branch;

public class Database {
	
	public List<Branch> branchList;
	
	public Database () {
		this.branchList = new ArrayList<>();
	}
	
	public Advisor getAdvisor1() {
		return this.branchList.get(0).advisorList.get(0);
	}
	
	public Advisor getAdvisor2() {
		return this.branchList.get(0).advisorList.get(1);
	}

}
