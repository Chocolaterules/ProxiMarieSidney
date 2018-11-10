package fr.formation.proxibanquemariesidney.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * @author marie La classe � Branch � correspond aux agences ProxiBanques. Elle
 *         a pour import List et ArrayList. Elle a pour attributs :
 *         - � idNum � correspond au num�ro d�identification de l�agence.
 *         - � creationDate � correspond � sa date de cr�ation.
 *         - � advisorList � correspond � la liste de conseillers de cette agence.
 *         - � manager � correspond � son g�rant.
 */
public class Branch {

	public String idNum;
	public String creationDate;
	public List<Advisor> advisorList;
	public Manager manager;

	/**
	 * Cette m�thode permet d'instancier une agence en pr�cisant ses attributs.
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
