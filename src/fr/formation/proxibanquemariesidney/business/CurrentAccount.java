package fr.formation.proxibanquemariesidney.business;

public class CurrentAccount extends BankAccount {
	public int authorizedOverdraft = 1000;
	
	public CurrentAccount(int authorizedOverdraft) {
		this.authorizedOverdraft = authorizedOverdraft;
	}
	
	public CurrentAccount() {
	}
	
	

}
