package fr.formation.proxibanquemariesidney.metier;

public class CurrentAccount extends BankAccount {
	
	public int AUTHORIZED_OVERDRAFT = 1000;
	
	public CurrentAccount(int accountNum, int balance, String openingDate) {
		super(accountNum, balance, openingDate);
	}
	
	public CurrentAccount() {
	}
	
	

}
