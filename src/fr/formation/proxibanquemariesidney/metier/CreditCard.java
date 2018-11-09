package fr.formation.proxibanquemariesidney.metier;

public class CreditCard {

	/*
	 * Cette classe "CreditCard" correspond aux crates de crédit, elle a comme
	 * attribut "cardID" représentant le numéro de la carte.
	 * 
	 */

	public int cardID;

	public CreditCard(int cardID) {
		this.cardID = cardID;
	}
	
	/*
	 * Cette méthode permet d'instancier une carte de crédit en précisant ses attributs.
	 */

	public CreditCard() {
	}
	
	/*
	 * Cette méthode permet d'instancier une carte de crédit sans préciser ses attributs.
	 */

}
