package fr.formation.proxibanquemariesidney.data;

import java.util.ArrayList;
import java.util.List;

import fr.formation.proxibanquemariesidney.business.Branch;

public class Database {
	
	public List<Branch> branchList;
	
	public Database () {
		this.branchList = new ArrayList<>();
	}

}
