package fr.formation.proxibanquemariesidney.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adminl La classe � Advisor � correspond aux conseillers de l�agence.
 *         Elle a pour import List et ArrayList. Elle a pour attributs :
 *         - � id � correspondant � leur identifiant.
 *         - � clientList � correspondant � leur liste de client.
 */
public class Advisor {

	public String id;
	public List<Client> clientList;

	/**
	 * Cette m�thode permet d'instancier un conseiller en pr�cisant ses attributs.
	 * 
	 * @param id
	 */
	public Advisor(String id) {
		this.id = id;
		this.clientList = new ArrayList<>();
	}

	/**
	 * Cette m�thode permet d'instancier un conseiller sans pr�ciser ses attributs.
	 */
	public Advisor() {
	}
}
