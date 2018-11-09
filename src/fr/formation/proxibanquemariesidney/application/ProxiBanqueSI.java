package fr.formation.proxibanquemariesidney.application;

import java.util.ArrayList;
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

	public ProxiBanqueSI() {
		this.data = new Database();
		this.interaction = new Interaction();
		this.modifyMenu = new HashMap<>();

	}

	public void start() {

		this.loadTestData();
		interaction.homepage();
		this.managefirstChoice();
		String s = interaction.readData();
		if (s.equals("1")) {
			this.create();
		}
		else if (s.equals("2")) {
			interaction.options();			
		}
		else if (s.equals("3")) {
			interaction.display("exit");
		}
		else {
			interaction.display("Ce n'est pas un choix valide.");
		}
		s = interaction.readData();
		if (s.equals("1")) {
			this.read();
		}
		else if (s.equals("2")) {
			this.modify();;			
		}
		else if (s.equals("3")) {
			this.transfer();;			
		}
		else if (s.equals("4")) {
			this.simulateCredit();;			
		}
		else if (s.equals("5")) {
			this.delete();;			
		}
		else if (s.equals("6")) {
			interaction.display("exit");			
		}
		else {
			interaction.display("Ce n'est pas un choix valide.");
		}


	}

	public void create() {

		interaction.display("Nom de famille ?");
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
		int telephone = Integer.parseInt(interaction.readData());
		if  (interaction.advisorNum == 1) {
			data.getAdvisor1().clientList.add (new Client(lastname, firstname, address, zipCode, city, telephone));
		}
		else if (interaction.advisorNum == 2) {
			data.getAdvisor2().clientList.add (new Client(lastname, firstname, address, zipCode, city, telephone));
		}
		interaction.display("Client enregistré.");
		this.managefirstChoice();
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
			
			if (interaction.readData().equals("exit")) {
				alive = false;
				}
		}

	}

	public void read() {
		

	}

	public void delete() {

	}

	public void transfer() {

	}

	public void simulateCredit() {
//		interaction.homepage();
		String client = "ghfhg";
		interaction.display("Votre client " + client
				+ " est fauché, la simulation effectuée ne vous permet pas de lui accorder un crédit. Même avec du piston!");
	}

	public void loadTestData() {
		Branch branch = new Branch("88mph", "21/10/1985");
		branch.manager = new Manager ("Erik Lenscherr");
		Advisor advisor1 = new Advisor("Guenievre");
		Advisor advisor2 = new Advisor("Charles Xavier");
		advisor1.clientList.add(new Client("Murdock","Matthew","Hell's Kitchen",10036,"NY",36656565));
		advisor1.clientList.add(new Client("Gloinson", "Gimli","Mine de", 34551, "Moria", 25581525));
		advisor2.clientList.add(new Client("Oakenshield", "Thorin", "Erebor", 35453, "Lonely Mountain", 43463658));
		advisor2.clientList.add(new Client("Lupin", "Remus", "12 Grimmauld Place", 35658, "London", 37835873));
		branch.advisorList.add(advisor1);
		branch.advisorList.add(advisor2);
		this.data.branchList.add(branch);
	}

	public void managefirstChoice() {
		interaction.firstChoice();
	}

}
