package fr.formation.proxibanquemariesidney.application;

import java.util.ArrayList;

import fr.formation.proxibanquemariesidney.business.Advisor;
import fr.formation.proxibanquemariesidney.business.Branch;
import fr.formation.proxibanquemariesidney.business.Client;
import fr.formation.proxibanquemariesidney.business.Manager;
import fr.formation.proxibanquemariesidney.data.Database;
import fr.formation.proxibanquemariesidney.presentation.Interaction;

public class ProxiBanqueSI {
	
	public Database data;
	public Interaction interaction;
	
	public ProxiBanqueSI() {
		this.data = new Database();
		this.interaction = new Interaction();
	}

	public void start() {
		
		this.loadTestData();
		this.manageHomepage();

		
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
	}
	
	
	public void modify() {
		
	}
	
	
	public void read() {

	}
	
	
	public void delete() {
		
	}
	
	
	public void transfer() {
		
	}
	
	
	public void simulateCredit() {
		
	}
	
	
	public void loadTestData() {
//		this.data.branchList = new ArrayList<>();
		Branch branch = new Branch("88mph", "21/10/1985");
		branch.manager = new Manager ("Erik Lenscherr");
//		branch.advisorList = new ArrayList<>();
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
	
	public void manageHomepage() {
		interaction.homepage();
		String s = interaction.readData();
		if (s.equals("1")) {
			this.create();
		}
		else if (s.equals("2")) {
			interaction.options();			
		}
		else {
			interaction.display("exit");
		}
	}
	
}
