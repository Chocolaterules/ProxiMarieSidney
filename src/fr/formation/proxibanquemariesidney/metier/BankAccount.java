package fr.formation.proxibanquemariesidney.metier;

/**
 * @author marie La classe "BankAccount" représente les différents comptes en
 *         banque que peuvent posseder les clients. Elle possède comme
 *         attributs:
 *         - "accountNum" représentant le numéro de compte.
 *         - "balance" représentant le solde disponible sur le compte.
 *         - "openingDate" représentant la date d'ouverture du compte.
 */
public class BankAccount {

	public int accountNum;
	public int balance;
	public String openingDate;

	/**
	 * Cette méthode permet d'instancier un compte bancaire en précisant ses
	 * attributs.
	 * 
	 * @param accountNum
	 * @param balance
	 * @param openingDate
	 */
	public BankAccount(int accountNum, int balance, String openingDate) {
		this.accountNum = accountNum;
		this.balance = balance;
		this.openingDate = openingDate;
	}

	/**
	 * Cette méthode permet d'instancier un compte bancaire sans préciser ses
	 * attributs.
	 */
	public BankAccount() {
	}

}
