package fr.formation.proxibanquemariesidney.metier;

public class SavingsAccount extends BankAccount {
	
	public int interestRate = 3;
	
	public SavingsAccount(int interestRate) {
		this.interestRate = interestRate;
	}
	
	public SavingsAccount() {
	}

}
