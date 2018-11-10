package fr.formation.proxibanquemariesidney.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marie La classe « Branch » correspond aux agences ProxiBanques. Elle
 *         a pour import List et ArrayList. Elle a pour attributs :
 *         - « idNum » correspond au numéro d’identification de l’agence.
 *         - « creationDate » correspond à sa date de création.
 *         - « advisorList » correspond à la liste de conseillers de cette agence.
 *         - « manager » correspond à son gérant.
 */
public class Branch {

	public String idNum;
	public String creationDate;
	public List<Advisor> advisorList;
	public Manager manager;

	/**
	 * Cette méthode permet d'instancier une agence en précisant ses attributs.
	 * 
	 * @param idNum
	 * @param creationDate
	 */
	public Branch(String idNum, String creationDate) {
		this.idNum = idNum;
		this.creationDate = creationDate;
		this.manager = new Manager();
		this.advisorList = new ArrayList<>();
	}

}
