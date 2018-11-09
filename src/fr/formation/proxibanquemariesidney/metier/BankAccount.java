package fr.formation.proxibanquemariesidney.metier;

public class BankAccount {

	/*
	 * Cette classe "BankAccount" représente les différents comptes en banque que
	 * peuvent posseder les clients. Elle possède comme attributs:
	 * 		- "accountNum" représentant le numéro de compte.
	 * 		- "balance" représentant le solde disponible sur le compte.
	 * 		- "openingDate" représentant la date d'ouverture du compte.
	 */

	public int accountNum;
	public int balance;
	public String openingDate;

	public BankAccount(int accountNum, int balance, String openingDate) {
		this.accountNum = accountNum;
		this.balance = balance;
		this.openingDate = openingDate;
	}
	
	/*
	 * Cette méthode permet d'instancier un compte en banque en précisant ses attributs.
	 */

	public BankAccount() {
	}
	
	/*
	 * Cette méthode permet d'instancier un compte en banque sans préciser ses attributs.
	 */

}
