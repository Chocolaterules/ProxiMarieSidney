package fr.formation.proxibanquemariesidney.metier;

/**
 * @author marie La classe "CurrentAccount" est la classe correspondant au
 *         compte courant. Cette classe hérite de la classe mère "BankAccount".
 */
public class CurrentAccount extends BankAccount {

	/**
	 * Cette méthode permet d'instancier un compte courant en précisant ses
	 * attributs introduits dans la classe mère.
	 * 
	 * @param accountNum  correspond au numéro de compte.
	 * @param balance     correspond au solde.
	 * @param openingDate correspond à la date d'ouverture.
	 */
	public CurrentAccount(int accountNum, int balance, String openingDate) {
		super(accountNum, balance, openingDate);
	}

	/**
	 * Cette méthode permet d'instancier un compte courant sans préciser ses
	 * attributs.
	 */
	public CurrentAccount() {
	}

}
