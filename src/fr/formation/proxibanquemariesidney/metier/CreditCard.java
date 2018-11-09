package fr.formation.proxibanquemariesidney.metier;

public class CreditCard {

	/*
	 * Cette classe "CreditCard" correspond aux cartes de cr�dit, elle a comme
	 * attribut "cardID" repr�sentant le num�ro de la carte.
	 * 
	 */

	public int cardID;

	public CreditCard(int cardID) {
		this.cardID = cardID;
	}
	
	/*
	 * Cette m�thode permet d'instancier une carte de cr�dit en pr�cisant ses attributs.
	 */

	public CreditCard() {
	}
	
	/*
	 * Cette m�thode permet d'instancier une carte de cr�dit sans pr�ciser ses attributs.
	 */
}
