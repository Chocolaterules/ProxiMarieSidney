package fr.formation.proxibanquemariesidney.persitance;

import java.util.ArrayList;
import java.util.List;

import fr.formation.proxibanquemariesidney.metier.Branch;

public class Database {
	
	public List<Branch> branchList;
	
	public Database () {
		this.branchList = new ArrayList<>();
	}

}
