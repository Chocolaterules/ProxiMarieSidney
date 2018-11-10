package fr.formation.proxibanquemariesidney.metier;

/**
 * @author marie La classe "CreditCard" correspond aux cartes de cr�dit, elle a
 *         comme attribut "cardID" repr�sentant le num�ro de la carte.
 */
public class CreditCard {

	public int cardID;

	/**
	 * Cette m�thode permet d'instancier une carte bancaire en pr�cisant ses
	 * attributs.
	 * 
	 * @param cardID
	 */
	public CreditCard(int cardID) {
		this.cardID = cardID;
	}

	/**
	 * Cette m�thode permet d'instancier une carte bancaire sans pr�ciser ses
	 * attributs.
	 */
	public CreditCard() {
	}

}
