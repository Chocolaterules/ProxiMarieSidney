package fr.formation.proxibanquemariesidney.metier;

/**
 * @author marie La classe « Client » correspond aux clients de ProxiBanque.
 *         Elle a pour attribut :
 *         - « lastname » correspondant au nom de famille du client.
 *         - « firstname » correspondant à son prénom.
 *         - « address » correspondant à son adresse.
 *         - « zipCode » correspondant à son code postal.
 *         - « city » correspondant à sa ville.
 *         - « telephone » correspondant à son numéro de téléphone.
 *         - « savingsAccount » correspondant à son éventuel compte épargne.
 *         - « currentAccount » correspondant à son éventuel compte courant.
 *         - « creditCard » correspondant à son éventuelle carte de crédit.
 */
public class Client {

	public String lastname;
	public String firstname;
	public String address;
	public int zipCode;
	public String city;
	public String telephone;
	public SavingsAccount savingsAccount;
	public CreditCard creditCard;
	public CurrentAccount currentAccount;

	/**
	 * Cette méthode permet d'instancier un client en précisant ses attibuts.
	 * 
	 * @param lastname
	 * @param firstname
	 * @param address
	 * @param zipCode
	 * @param city
	 * @param telephone
	 */
	public Client(String lastname, String firstname, String address, int zipCode, String city, String telephone) {
		this.lastname = lastname;
		this.firstname = firstname;
		this.address = address;
		this.zipCode = zipCode;
		this.city = city;
		this.telephone = telephone;
		this.creditCard = new CreditCard();

	}

}
