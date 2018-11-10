package fr.formation.proxibanquemariesidney.metier;

/**
 * @author marie La classe �Manager� correspond au directeur d�agence (g�rant).
 *         Son attribut �id� correspond � son num�ro d�identification.
 */
public class Manager {

	public String id;

	/**
	 * Cette m�thode permet d'instancier un g�rant en pr�cisant ses attributs.
	 * 
	 * @param id
	 */
	public Manager(String id) {
		this.id = id;
	}

	/**
	 * Cette m�thode permet d'instancier un g�rant sans pr�ciser ses attributs.
	 */
	public Manager() {
	}

}
