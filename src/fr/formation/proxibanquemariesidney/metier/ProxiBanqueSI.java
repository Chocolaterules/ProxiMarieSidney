package fr.formation.proxibanquemariesidney.metier;

import java.util.HashMap;
import java.util.Map;

import fr.formation.proxibanquemariesidney.persistance.Database;
import fr.formation.proxibanquemariesidney.presentation.Interaction;

public class ProxiBanqueSI {

	public Map<String, String> modifyMenu;
	public Map<String, String> optionMenu;
	public Map<String, String> chooseAccount;
	public int advisorNum;
	public int clientNum;
	public Database data;
	public Interaction interaction;
	public boolean running;
	public boolean errorNC;
	public boolean errorCA;
	public boolean errorSA;
	public boolean errorDel;
	public boolean errorFC;
	public boolean errorCC;
	public boolean errorOM;
	public boolean errorCB;
	public boolean errorTypeCB;
	public int AUTHORIZED_OVERDRAFT = 1000;
	public int INTEREST_RATE = 3;

	public ProxiBanqueSI() {
		this.data = new Database();
		this.interaction = new Interaction();
		this.modifyMenu = new HashMap<>();
		this.optionMenu = new HashMap<>();
		this.chooseAccount = new HashMap<>();
		this.advisorNum = 0;
		this.clientNum = 0;
		this.running = true;
		this.errorNC = true;
		this.errorCA = true;
		this.errorSA = true;
		this.errorDel = true;
		this.errorFC = true;
		this.errorCC = true;
		this.errorOM = true;
		this.errorCB = true;
		this.errorTypeCB = true;
	}

	public void start() {

		this.loadTestData();
		this.homepage();
		while (this.running) {
			this.manageFirstChoice();
			interaction.display("\nAppuyez sur 'Entrer' pour continuer.");
			interaction.readData();
			this.errorNC = true;
			this.errorCA = true;
			this.errorSA = true;
			this.errorDel = true;
			this.errorFC = true;
			this.errorCC = true;
			this.errorOM = true;
			this.errorCB = true;
			this.errorTypeCB = true;
		}
	}

	public void create() {

		interaction.display("\n\nNom de famille ?");
		String lastname = interaction.readData();
		interaction.display("Prénom ?");
		String firstname = interaction.readData();
		interaction.display("Adresse ?");
		String address = interaction.readData();
		interaction.display("Code postal ?");
		int zipCode = Integer.parseInt(interaction.readData());
		interaction.display("Ville ?");
		String city = interaction.readData();
		interaction.display("Numéro de téléphone ?");
		String telephone = interaction.readData();
		this.getAdvisor().clientList.add(new Client(lastname, firstname, address, zipCode, city, telephone));
		this.clientNum = this.getAdvisor().clientList.size();
		int j = 0;
		while (j == 0) {
			while (errorCA) {
				interaction.display("\nVoulez-vous créer un compte courant pour ce client ?\n\n1. Oui.\n2. Non.");
				String rep1 = interaction.readData();
				if (rep1.equals("1")) {
					interaction.display("Numéro de compte ?");
					int accountNum = Integer.parseInt(interaction.readData());
					interaction.display("Solde ?");
					int balance = Integer.parseInt(interaction.readData());
					interaction.display("Date d'ouverture ?");
					String openingDate = interaction.readData();
					this.getClient().currentAccount = new CurrentAccount(accountNum, balance, openingDate);
					while (errorCB) {
						interaction.display("Voulez-vous une carte bleue pour ce compte courant ?\n1. Oui.\n2. Non.");
						String repCB = interaction.readData();
						if (repCB.equals("1")) {
							while (errorTypeCB) {
								interaction.display(
										"Quelle type de carte voulez-vous ?\1. Carte Visa Electron.\n2. Carte Visa Premier.");
								String repType = interaction.readData();
								if (repType.equals("1")) {
									this.getClient().creditCard = new VisaElectron();
									errorTypeCB = false;
								} else if (repType.equals("2")) {
									this.getClient().creditCard = new VisaPremier();
									errorTypeCB = false;
								} else {
									interaction.display("Ce n'est pas une réponse valide");
								}
							}
							errorCB = false;
						} else if (repCB.equals("2")) {
							interaction.display("Très bien.");
							errorCB = false;
						} else {
							interaction.display("Ce n'est pas une réponse valide");
						}
					}
					errorCA = false;
					j++;
				} else if (rep1.equals("2")) {
					interaction.display("Très bien.");
					errorCA = false;
				} else {
					interaction.display("Ce n'est pas une réponse valable.");
				}
			}
			while (errorSA) {
				interaction.display("\nVoulez-vous créer un compte épargne pour ce client ?\n\n1. Oui.\n2. Non.");
				String rep2 = interaction.readData();
				if (rep2.equals("1")) {
					interaction.display("Numéro de compte ?");
					int accountNum = Integer.parseInt(interaction.readData());
					interaction.display("Solde ?");
					int balance = Integer.parseInt(interaction.readData());
					interaction.display("Date d'ouverture ?");
					String openingDate = interaction.readData();
					this.getClient().savingsAccount = new SavingsAccount(accountNum, balance, openingDate);
					j++;
					errorSA = false;
				} else if (rep2.equals("2")) {
					interaction.display("Très bien.");
					errorSA = false;
				} else {
					interaction.display("Ce n'est pas une réponse valable.");
				}
			}
			if (j == 0) {
				interaction.display("\nVous devez créer au moins un compte pour valider la création du client.");
				errorCA = true;
				errorSA = true;
			}
		}

		interaction.display("Client enregistré.");
		while (errorNC) {
			interaction.display(
					"\n\nQue voulez-vous faire ?\n\n1. Accéder à ce nouveau client.\n2. Revenir au menu principal.\n3. Exit.\n\nVotre choix ?");
			String ans = interaction.readData();
			if (ans.equals("1")) {
				errorNC = false;
				this.optionMenu();
			} else if (ans.equals("2")) {
				errorNC = false;
				this.manageFirstChoice();
			} else if (ans.equals("3")) {
				this.exitProxiBanque();
				errorNC = false;
			} else {
				interaction.display("Ce n'est pas un choix valide.");
			}
		}
	}

	public void modify() {
		boolean alive = true;
		while (alive) {
			interaction.display("Que voulez-vous modifier?");
			this.modifyMenu.put("1", "Nom de famille");
			this.modifyMenu.put("2", "Prénom");
			this.modifyMenu.put("3", "Adresse");
			this.modifyMenu.put("4", "Code postal");
			this.modifyMenu.put("5", "Ville");
			this.modifyMenu.put("6", "Numéro de téléphone");
			this.modifyMenu.put("7", "Exit");
			for (String key : modifyMenu.keySet()) {
				this.interaction.display(key + ". " + modifyMenu.get(key));
			}
			this.interaction.display("\nVotre choix ?");

			String m = interaction.readData();
			if (m.equals("1")) {
				interaction.display("Modification de " + this.getClient().lastname + " par : [Nouveau Nom].");
				this.getClient().lastname = interaction.readData();
			} else if (m.equals("2")) {
				interaction.display("Modification de " + this.getClient().firstname + " par : [Nouveau Prénom]");
				this.getClient().firstname = interaction.readData();
			} else if (m.equals("3")) {
				interaction.display("Modification de " + this.getClient().address + " par : [Nouvelle Adresse]");
				this.getClient().address = interaction.readData();
			} else if (m.equals("4")) {
				interaction.display("Modification de " + this.getClient().zipCode + " par : [Nouveau Code postal]");
				this.getClient().zipCode = Integer.parseInt(interaction.readData());
			} else if (m.equals("5")) {
				interaction.display("Modification de " + this.getClient().city + " par : [Nouvelle Ville]");
				this.getClient().city = interaction.readData();
			} else if (m.equals("6")) {
				interaction.display(
						"Modification de " + this.getClient().telephone + " par : [Nouveau Numéro de téléphone]");
				this.getClient().telephone = interaction.readData();
			} else if (m.equals("7")) {
				interaction.display("Sortie de la modification de " + this.getClient().firstname + " "
						+ this.getClient().lastname + ".");
				alive = false;
			} else {
				interaction.display("Ce n'est pas un choix valide!");
			}
		}

	}

	public void read() {
		interaction.display("\n\nNom : " + this.getClient().lastname);
		interaction.display("Prénom : " + this.getClient().firstname);
		interaction.display("Adresse : " + this.getClient().address);
		interaction.display("Code postal : " + this.getClient().zipCode);
		interaction.display("Ville : " + this.getClient().city);
		interaction.display("Numéro de téléphone : " + this.getClient().telephone);
	}

	public void delete() {
		while (errorDel) {
			interaction.display("Etes-vous sûr de vouloir supprimer ce client ?\n1. Oui\n2. Non.");
			String ans = interaction.readData();
			if (ans.equals("1")) {
				this.getAdvisor().clientList.remove(this.getClient());
				interaction.display("Client supprimé.");
				errorDel = false;
			} else if (ans.equals("2")) {
				errorDel = false;
				this.manageFirstChoice();
			} else {
				interaction.display("Ce n'est pas un choix valide.");
			}
		}
	}

	public void transfer() {
		if (this.getClient().savingsAccount == null || this.getClient().currentAccount == null) {
			interaction.display("Le client " + this.getClient().firstname + " " + this.getClient().lastname
					+ " ne possède qu'un seul compte et ne peut donc pas s'effectuer de transfert à lui même.");
		} else {
			this.chooseAccount.put("1", "Compte courant : " + this.getClient().currentAccount.balance + " PO.");
			this.chooseAccount.put("2", "Compte épargne : " + this.getClient().savingsAccount.balance + " PO.");
			for (String key : chooseAccount.keySet()) {
				interaction.display(key + ". " + chooseAccount.get(key));
			}
			interaction.display("\nChoix du compte émetteur :");
			String c = interaction.readData();
			interaction.display("Choix du montant :");
			int v = Integer.parseInt(interaction.readData());
			if (c.equals("1")) {
				if ((this.getClient().currentAccount.balance - v + 1000) >= 0) {
					this.getClient().currentAccount.balance = this.getClient().currentAccount.balance - v;
					interaction.display("Le nouveau solde du compte courant est : "
							+ (this.getClient().currentAccount.balance) + " PO.");
					this.getClient().savingsAccount.balance = this.getClient().savingsAccount.balance + v;
					interaction.display("Le nouveau solde du compte épargne est : "
							+ (this.getClient().savingsAccount.balance) + " PO.");
				} else {
					interaction.display("Le solde actuel ne permet pas d'effectuer un tel virement.");
				}
			} else if (c.equals("2")) {
				if (this.getClient().savingsAccount.balance >= v) {
					this.getClient().savingsAccount.balance = this.getClient().savingsAccount.balance - v;
					interaction.display("Le nouveau solde du compte épargne est : "
							+ (this.getClient().savingsAccount.balance) + " PO.");
					this.getClient().currentAccount.balance = this.getClient().currentAccount.balance + v;
					interaction.display("Le nouveau solde du compte courant est : "
							+ (this.getClient().currentAccount.balance) + " PO.");
				} else {
					interaction.display("Le solde actuel ne permet pas d'effectuer un tel virement.");
				}
			} else {
				interaction.display("Entrée non valide");
			}
		}
	}

	public void simulateCredit() {
		String client = this.getClient().firstname + " " + this.getClient().lastname;
		interaction.display("\n\n\n\n\nVotre client " + client
				+ " est fauché, la simulation effectuée ne vous permet pas de lui accorder un crédit. Même avec du piston!");
	}

	public void loadTestData() {
		Branch branch = new Branch("88mph", "21/10/1985");
		branch.manager = new Manager("Erik Lenscherr");
		Advisor advisor1 = new Advisor("Guenievre");
		Advisor advisor2 = new Advisor("Charles Xavier");
		advisor1.clientList.add(new Client("Murdock", "Matthew", "Hell's Kitchen", 10036, "NY", "+33 8 36 65 65 65"));
		advisor1.clientList.add(new Client("Gloinson", "Gimli", "Mine de", 34551, "Moria", "+33 1 47 20 00 01"));
		advisor2.clientList
				.add(new Client("Oakenshield", "Thorin", "Erebor", 35453, "Lonely Mountain", "+33 6 43 46 36 58"));
		advisor2.clientList
				.add(new Client("Lupin", "Remus", "12 Grimmauld Place", 35658, "London", "+33 7 23 65 48 90"));
		advisor1.clientList.get(0).savingsAccount = new SavingsAccount(25425, 100, "01/01/2000");
		advisor1.clientList.get(1).savingsAccount = new SavingsAccount(36452, 1000000, "20/05/1998");
		advisor1.clientList.get(1).currentAccount = new CurrentAccount(78962, 25000, "20/05/1998");
		advisor2.clientList.get(0).savingsAccount = new SavingsAccount(54245, 2500000, "30/02/2005");
		advisor2.clientList.get(0).currentAccount = new CurrentAccount(40423, 145000, "30/02/2005");
		advisor2.clientList.get(1).currentAccount = new CurrentAccount(45012, 3500, "16/06/2002");
		branch.advisorList.add(advisor1);
		branch.advisorList.add(advisor2);
		this.data.branchList.add(branch);
	}

	public void manageFirstChoice() {
		while (errorFC) {
			this.firstChoice();
			String s = interaction.readData();
			if (s.equals("1")) {
				errorFC = false;
				this.create();
			} else if (s.equals("2")) {
				errorFC = false;
				this.clientChoice();
				this.optionMenu();
			} else if (s.equals("3")) {
				errorFC = false;
				this.exitProxiBanque();
			} else {
				interaction.display("Ce n'est pas un choix valide.");
			}
		}
	}

	public void homepage() {
		interaction.display("Bonjour !  Bienvenue dans ProxiBanqueSI.\n");

		while (advisorNum == 0) {
			interaction.display("Veuillez vous identifier.");
			String ans = interaction.readData();
			if (ans.equals("Guenievre")) {
				advisorNum = 1;
			} else if (ans.equals("Charles Xavier")) {
				advisorNum = 2;
			} else {
				interaction.display("Ce n'est pas un identifiant valide.\n");

			}
		}
	}

	public void firstChoice() {
		interaction.display(
				"\n\nQue voulez-vous faire ?\n\n1. Créer un nouveau client.\n2. Accéder à un client enregistré.\n3. Exit.\n\nVotre choix ?");
	}

	public void clientChoice() {
		while (errorCC) {
			interaction.display("\nQuel client voulez-vous consulter ?");
			for (int i = 0; i < this.getAdvisor().clientList.size(); i++) {
				interaction.display(Integer.toString(i + 1) + ". " + this.getAdvisor().clientList.get(i).firstname + " "
						+ this.getAdvisor().clientList.get(i).lastname);
			}
			interaction.display("Votre choix ?");
			String clch = interaction.readData();
			if (clch.matches("[0-9]*$")) {
				clientNum = Integer.parseInt(clch);
				errorCC = false;
			} else {
				interaction.display("Ce n'est pas une réponse valide.");
			}
		}
	}

	public void optionMenu() {
		while (errorOM) {
			this.optionMenu.put("1", "Lire les informations du client.");
			this.optionMenu.put("2", "Modifier les informations du client.");
			this.optionMenu.put("3", "Faire un virement.");
			this.optionMenu.put("4", "Faire une simulation de crédit.");
			this.optionMenu.put("5", "Supprimer le client.");
			this.optionMenu.put("6", "Exit.");
			interaction.display("Que voulez-vous faire?\n");
			for (String key : optionMenu.keySet()) {
				interaction.display(key + ". " + optionMenu.get(key));
			}
			interaction.display("\nVotre choix ?");
			String st = interaction.readData();
			if (st.equals("1")) {
				errorOM = false;
				this.read();
			} else if (st.equals("2")) {
				errorOM = false;
				this.modify();
				;
			} else if (st.equals("3")) {
				errorOM = false;
				this.transfer();
				;
			} else if (st.equals("4")) {
				errorOM = false;
				this.simulateCredit();
				;
			} else if (st.equals("5")) {
				errorOM = false;
				this.delete();
				;
			} else if (st.equals("6")) {
				errorOM = false;
				this.exitProxiBanque();
			} else {
				interaction.display("Ce n'est pas un choix valide.");
			}
		}
	}

	public Advisor getAdvisor() {
		return data.branchList.get(0).advisorList.get(this.advisorNum - 1);
	}

	public Client getClient() {
		return data.branchList.get(0).advisorList.get(this.advisorNum - 1).clientList.get(this.clientNum - 1);
	}

	public void exitProxiBanque() {
		this.running = false;
	}

}
