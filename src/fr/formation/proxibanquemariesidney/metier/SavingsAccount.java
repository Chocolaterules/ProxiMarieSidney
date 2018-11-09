package fr.formation.proxibanquemariesidney.metier;

public class SavingsAccount extends BankAccount {
	
	public int INTEREST_RATE = 3;
	
	public SavingsAccount(int accountNum, int balance, String openingDate) {
		super(accountNum, balance, openingDate);
	}
	
	public SavingsAccount() {
	}
	
}
