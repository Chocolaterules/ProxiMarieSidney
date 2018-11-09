package fr.formation.proxibanquemariesidney.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adminl
 *
 */
public class Advisor {
	
	public String id;
	public List<Client> clientList;
	
	/**
	 * @param id
	 */
	public Advisor(String id) {
		this.id = id;
		this.clientList = new ArrayList<>();
	}
	
	/**
	 * 
	 */
	public Advisor() {
	}
}
