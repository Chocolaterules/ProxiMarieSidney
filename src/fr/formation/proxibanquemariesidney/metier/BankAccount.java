package fr.formation.proxibanquemariesidney.metier;

/**
 * @author marie La classe "BankAccount" repr�sente les diff�rents comptes en
 *         banque que peuvent posseder les clients. Elle poss�de comme
 *         attributs:
 *         - "accountNum" repr�sentant le num�ro de compte.
 *         - "balance" repr�sentant le solde disponible sur le compte.
 *         - "openingDate" repr�sentant la date d'ouverture du compte.
 */
public class BankAccount {

	public int accountNum;
	public int balance;
	public String openingDate;

	/**
	 * Cette m�thode permet d'instancier un compte bancaire en pr�cisant ses
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
	 * Cette m�thode permet d'instancier un compte bancaire sans pr�ciser ses
	 * attributs.
	 */
	public BankAccount() {
	}

}
