package fr.formation.proxibanquemariesidney.application;

import java.util.HashMap;
import java.util.Map;

import fr.formation.proxibanquemariesidney.business.Advisor;
import fr.formation.proxibanquemariesidney.business.Branch;
import fr.formation.proxibanquemariesidney.business.Client;
import fr.formation.proxibanquemariesidney.business.Manager;
import fr.formation.proxibanquemariesidney.data.Database;
import fr.formation.proxibanquemariesidney.presentation.Interaction;

public class ProxiBanqueSI {

	public Map<String, String> modifyMenu;

	public Database data;
	public Interaction interaction;
	public boolean running;

	public ProxiBanqueSI() {
		this.data = new Database();
		this.interaction = new Interaction();
		this.modifyMenu = new HashMap<>();
		this.running = true;
	}

	public void start() {

		this.loadTestData();
		interaction.homepage();
		while (this.running) {
			this.managefirstChoice();
			interaction.display("\nAppuyez sur 'Entrer' pour continuer");
			interaction.readData();
		}
	}

	public void create() {

		interaction.display("Nom de famille ?");
		String lastname = interaction.readData();
		interaction.display("Pr�nom ?");
		String firstname = interaction.readData();
		interaction.display("Adresse ?");
		String address = interaction.readData();
		interaction.display("Code postal ?");
		int zipCode = Integer.parseInt(interaction.readData());
		interaction.display("Ville ?");
		String city = interaction.readData();
		interaction.display("Num�ro de t�l�phone ?");
		String telephone = interaction.readData();
		this.getAdvisor().clientList.add (new Client(lastname, firstname, address, zipCode, city, telephone));
		interaction.display("Client enregistr�.");
		this.managefirstChoice();
	}

	public void modify() {
		boolean alive = true;
		while (alive) {
			interaction.display("Que voulez-vous modifier?");
			this.modifyMenu.put("1", "Nom de famille");
			this.modifyMenu.put("2", "Pr�nom");
			this.modifyMenu.put("3", "Adresse");
			this.modifyMenu.put("4", "Code postal");
			this.modifyMenu.put("5", "Ville");
			this.modifyMenu.put("6", "Num�ro de t�l�phone");
			this.modifyMenu.put("7", "Exit");
			for (String key : modifyMenu.keySet()) {
				this.interaction.display(key + ". " + modifyMenu.get(key));
			}
			this.interaction.display("Votre choix ?");
			
			String m = interaction.readData();
			if (m.equals("1")) {
				interaction.display("Modification de " + this.getClient().lastname + " par : [Nouveau Nom]");
//				this.
//				interaction.readData()
			}
			if (m.equals("2")) {
				interaction.display("Modification de " + this.getClient().firstname + " par : [Nouveau Prénom]");
								
			}
			if (m.equals("3")) {
				interaction.display("Modification de " + this.getClient().address + " par : [Nouvelle Adresse]");
				
			}
			if (m.equals("4")) {
				interaction.display("Modification de " + this.getClient().zipCode + " par : [Nouveau Code postal]");
				
			}
			if (m.equals("5")) {
				interaction.display("Modification de " + this.getClient().city + " par : [Nouvelle Ville]");
				
			}
			if (m.equals("6")) {
				interaction.display("Modification de " + this.getClient().telephone + " par / [Nouveau Numéro de téléphone]");
				
			}			
			if (m.equals("7")) {
				interaction.display("Sortie de la modification de " + this.getClient().lastname + " " + this.getClient().firstname);
				alive = false;
				}
			else {
				interaction.display("Ce n'est pas un choix valide!");
			}
		}

	}

	public void read() {
		interaction.display("\n\n\n\n\n\nNom : " + this.getClient().lastname);
		interaction.display("Prénom : " + this.getClient().firstname);
		interaction.display("Adresse : " + this.getClient().address);
		interaction.display("Code postal : " + this.getClient().zipCode);
		interaction.display("Ville : " + this.getClient().city);
		interaction.display("Numéro de téléphone : " + this.getClient().telephone);
	}

	public void delete() {
		interaction.display("Etes-vous s�r de vouloir supprimer ce client ?\n1. Oui\n2. Non.");
		String ans = interaction.readData();
		if (ans.equals("1")) {
			this.getAdvisor().clientList.remove(this.getClient());
		}
		else if (ans.equals("2")) {
			this.managefirstChoice();
		}
	}

	public void transfer() {

	}

	public void simulateCredit() {
		String client = "Jacky";
		interaction.display("\n\n\n\n\nVotre client " + client
				+ " est fauch�, la simulation effectu�e ne vous permet pas de lui accorder un cr�dit. M�me avec du piston!");
	}

	public void loadTestData() {
		Branch branch = new Branch("88mph", "21/10/1985");
		branch.manager = new Manager ("Erik Lenscherr");
		Advisor advisor1 = new Advisor("Guenievre");
		Advisor advisor2 = new Advisor("Charles Xavier");
		advisor1.clientList.add(new Client("Murdock","Matthew","Hell's Kitchen",10036,"NY", "+33 8 36 65 65 65"));
		advisor1.clientList.add(new Client("Gloinson", "Gimli","Mine de", 34551, "Moria", "+33 1 47 20 00 01"));
		advisor2.clientList.add(new Client("Oakenshield", "Thorin", "Erebor", 35453, "Lonely Mountain", "+33 6 43 46 36 58"));
		advisor2.clientList.add(new Client("Lupin", "Remus", "12 Grimmauld Place", 35658, "London", "+33 7 23 65 48 90"));
		branch.advisorList.add(advisor1);
		branch.advisorList.add(advisor2);
		this.data.branchList.add(branch);
	}

	public void managefirstChoice() {
		interaction.firstChoice();
		String s = interaction.readData();
		if (s.equals("1")) {
			this.create();
		}
		else if (s.equals("2")) {
			interaction.options();
			String st = interaction.readData();
			if (st.equals("1")) {
				this.read();
			}
			else if (st.equals("2")) {
				this.modify();;			
			}
			else if (st.equals("3")) {
				this.transfer();;			
			}
			else if (st.equals("4")) {
				this.simulateCredit();;			
			}
			else if (st.equals("5")) {
				this.delete();;			
			}
			else if (st.equals("6")) {
				this.exitProxiBanque();			
			}
			else {
				interaction.display("Ce n'est pas un choix valide.");
			}
		}
		else if (s.equals("3")) {
			this.exitProxiBanque();
		}
		else {
			interaction.display("Ce n'est pas un choix valide.");
		}
	}
	
	public Advisor getAdvisor() {
		return data.branchList.get(0).advisorList.get(interaction.advisorNum-1);
	}
	
	public Client getClient() {
		return data.branchList.get(0).advisorList.get(interaction.advisorNum-1).clientList.get(interaction.clientNum-1);
	}
	
	public void exitProxiBanque() {
		this.running = false;
	}

}
