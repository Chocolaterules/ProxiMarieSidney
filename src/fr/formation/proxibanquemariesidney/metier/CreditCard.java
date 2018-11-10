package fr.formation.proxibanquemariesidney.metier;

/**
 * @author marie La classe "CreditCard" correspond aux cartes de crédit, elle a
 *         comme attribut "cardID" représentant le numéro de la carte.
 */
public class CreditCard {

	public int cardID;

	/**
	 * Cette méthode permet d'instancier une carte bancaire en précisant ses
	 * attributs.
	 * 
	 * @param cardID
	 */
	public CreditCard(int cardID) {
		this.cardID = cardID;
	}

	/**
	 * Cette méthode permet d'instancier une carte bancaire sans préciser ses
	 * attributs.
	 */
	public CreditCard() {
	}

}
