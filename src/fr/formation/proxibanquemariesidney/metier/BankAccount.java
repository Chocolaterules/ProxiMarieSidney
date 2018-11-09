package fr.formation.proxibanquemariesidney.metier;

public class BankAccount {

	/*
	 * Cette classe "BankAccount" repr�sente les diff�rents comptes en banque que
	 * peuvent posseder les clients. Elle poss�de comme attributs:
	 * 		- "accountNum" repr�sentant le num�ro de compte.
	 * 		- "balance" repr�sentant le solde disponible sur le compte.
	 * 		- "openingDate" repr�sentant la date d'ouverture du compte.
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
	 * Cette m�thode permet d'instancier un compte en banque en pr�cisant ses attributs.
	 */

	public BankAccount() {
	}
	
	/*
	 * Cette m�thode permet d'instancier un compte en banque sans pr�ciser ses attributs.
	 */

}
