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
	
//		if (interaction.readData().equals(null)) {
//			interaction.display("Que voulez-vous faire ?");
//		}
//		else {
//			interaction.display("Ce n'est pas un identifiant valide.");
//		}
		
	}
	
	
	public void create() {
		//demander infos et attribuer à chaque étape
//		Client client = new Client(lastname, firstname, address, zipCode, city, telephone);
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
	
	public void optionMenu() {
		
	}
	
	public void loadTestData() {
		this.data.branchList = new ArrayList<>();
		Branch branch = new Branch("88mph", "21/10/1985");
		branch.manager = new Manager ("Thorin");
		branch.advisorList = new ArrayList<>();
		Advisor advisor = new Advisor("Remus");
		advisor.clientList.add(new Client("Murdock","Matthew","Hell's Kitchen",10036,"NY",36656565));
		branch.advisorList.add(advisor);
		this.data.branchList.add(branch);
	}
	
	public void manageHomepage() {
		interaction.homepage();
		String s = interaction.readData();
		if (s.equals("1")) {
			interaction.display("creer");
		}
		else if (s.equals("2")) {
			interaction.display("consulter");
		}
		else {
			System.out.println("exit");
		}
	}
	
}
