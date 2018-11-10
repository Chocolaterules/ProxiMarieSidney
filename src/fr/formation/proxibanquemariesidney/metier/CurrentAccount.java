package fr.formation.proxibanquemariesidney.metier;

/**
 * @author marie La classe "CurrentAccount" est la classe correspondant au
 *         compte courant. Cette classe h�rite de la classe m�re "BankAccount".
 */
public class CurrentAccount extends BankAccount {

	/**
	 * Cette m�thode permet d'instancier un compte courant en pr�cisant ses
	 * attributs introduits dans la classe m�re.
	 * 
	 * @param accountNum  correspond au num�ro de compte.
	 * @param balance     correspond au solde.
	 * @param openingDate correspond � la date d'ouverture.
	 */
	public CurrentAccount(int accountNum, int balance, String openingDate) {
		super(accountNum, balance, openingDate);
	}

	/**
	 * Cette m�thode permet d'instancier un compte courant sans pr�ciser ses
	 * attributs.
	 */
	public CurrentAccount() {
	}

}
