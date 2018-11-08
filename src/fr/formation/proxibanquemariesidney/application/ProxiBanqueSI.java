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

	public void start() {
		
		this.loadTestData();
		
		interaction.homepage();
		if (interaction.readData().equals("1")) {
			this.create();
		}
		else if (interaction.readData().equals("2")) {
			interaction.options();
		}
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
		Branch branch = new Branch("fghjk", "12/10/2016");
		branch.manager = new Manager ("dd");
		branch.advisorList = new ArrayList<>();
		Advisor advisor = new Advisor("conseiller1");
		advisor.clientList.add(new Client("g","g","hj",2,"ghj",5));
		branch.advisorList.add(advisor);
		this.data.branchList.add(branch);
	}
	
	
}
