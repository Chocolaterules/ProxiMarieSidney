package fr.formation.proxibanquemariesidney.metier;

import java.util.ArrayList;
import java.util.List;

public class Advisor {
	
	public String id;
	public List<Client> clientList;
	
	public Advisor(String id) {
		this.id = id;
		this.clientList = new ArrayList<>();
	}
	
	public Advisor() {
	}

}