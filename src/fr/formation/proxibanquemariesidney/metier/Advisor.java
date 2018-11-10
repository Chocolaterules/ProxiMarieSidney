package fr.formation.proxibanquemariesidney.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adminl La classe « Advisor » correspond aux conseillers de l’agence.
 *         Elle a pour import List et ArrayList. Elle a pour attributs :
 *         - « id » correspondant à leur identifiant.
 *         - « clientList » correspondant à leur liste de client.
 */
public class Advisor {

	public String id;
	public List<Client> clientList;

	/**
	 * Cette méthode permet d'instancier un conseiller en précisant ses attributs.
	 * 
	 * @param id
	 */
	public Advisor(String id) {
		this.id = id;
		this.clientList = new ArrayList<>();
	}

	/**
	 * Cette méthode permet d'instancier un conseiller sans préciser ses attributs.
	 */
	public Advisor() {
	}
}
