package fr.formation.proxibanquemariesidney.metier;

/**
 * @author marie La classe � Client � correspond aux clients de ProxiBanque.
 *         Elle a pour attribut :
 *         - � lastname � correspondant au nom de famille du client.
 *         - � firstname � correspondant � son pr�nom.
 *         - � address � correspondant � son adresse.
 *         - � zipCode � correspondant � son code postal.
 *         - � city � correspondant � sa ville.
 *         - � telephone � correspondant � son num�ro de t�l�phone.
 *         - � savingsAccount � correspondant � son �ventuel compte �pargne.
 *         - � currentAccount � correspondant � son �ventuel compte courant.
 *         - � creditCard � correspondant � son �ventuelle carte de cr�dit.
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
	 * Cette m�thode permet d'instancier un client en pr�cisant ses attibuts.
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
