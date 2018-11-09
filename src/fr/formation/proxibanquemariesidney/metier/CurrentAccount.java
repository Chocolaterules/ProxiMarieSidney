package fr.formation.proxibanquemariesidney.metier;

public class CurrentAccount extends BankAccount {
	
	public int authorizedOverdraft = 1000;
	
	public CurrentAccount(int authorizedOverdraft) {
		this.authorizedOverdraft = authorizedOverdraft;
	}
	
	public CurrentAccount() {
	}
	
	

}
