package fr.formation.proxibanquemariesidney.metier;

public class Client {
	
	/*
	 * 
	 */
	
	public String lastname;
	public String firstname;
	public String address;
	public int zipCode;
	public String city;
	public String telephone;
	public SavingsAccount savingsAccount;
	public CreditCard creditCard;
	public CurrentAccount currentAccount;
	
	public Client(String lastname, String firstname, String address, int zipCode, String city, String telephone) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
		this.telephone = telephone;
		this.creditCard = new CreditCard();

	}
	
	/*
	 * 
	 */
}
