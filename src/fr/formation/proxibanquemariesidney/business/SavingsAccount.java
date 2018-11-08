package fr.formation.proxibanquemariesidney.business;

public class SavingsAccount extends BankAccount {
	public int interestRate = 3;
	
	public SavingsAccount(int interestRate) {
		this.interestRate = interestRate;
	}
	 public SavingsAccount() {
	 }

}
