package fr.formation.proxibanquemariesidney.business;

public class Client {
	public String lastname;
	public String firstname;
	public String address;
	public int zipCode;
	public String city;
	public int telephone;
	public SavingsAccount savingsAccount;
	public CreditCard creditCard;
	public CurrentAccount currentAccount;
	
	public Client(String lastname, String firstname, String address, int zipCode, String city, int telephone) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
		this.telephone = telephone;
		this.savingsAccount = new SavingsAccount();
		this.creditCard = new CreditCard();
		this.currentAccount = new CurrentAccount();
	}
	

}
