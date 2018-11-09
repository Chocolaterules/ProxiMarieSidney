package fr.formation.proxibanquemariesidney.metier;

public class BankAccount {
	
	public int accountNum;
	public int balance;
	public String openingDate;
	
	public BankAccount(int accountNum, int balance, String openingDate) {
		this.accountNum = accountNum;
		this.balance = balance;
		this.openingDate = openingDate;
	}
	
	public BankAccount() {
	}

}
