package fr.formation.proxibanquemariesidney.metier;

/**
 * @author marie La classe «Manager» correspond au directeur d’agence (gérant).
 *         Son attribut «id» correspond à son numéro d’identification.
 */
public class Manager {

	public String id;

	/**
	 * Cette méthode permet d'instancier un gérant en précisant ses attributs.
	 * 
	 * @param id
	 */
	public Manager(String id) {
		this.id = id;
	}

	/**
	 * Cette méthode permet d'instancier un gérant sans préciser ses attributs.
	 */
	public Manager() {
	}

}
