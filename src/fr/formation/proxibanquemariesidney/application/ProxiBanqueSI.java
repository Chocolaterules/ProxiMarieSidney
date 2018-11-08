package fr.formation.proxibanquemariesidney.application;

import fr.formation.proxibanquemariesidney.business.Client;
import fr.formation.proxibanquemariesidney.data.Database;
import fr.formation.proxibanquemariesidney.presentation.Interaction;

public class ProxiBanqueSI {
	
	public Database data;
	public Interaction interaction;

	public void start() {
		interaction.display("Bonjour, bienvenue dans ProxiBanqueSI. Que voulez-vous faire ?\n1 - Créer un nouveau client.\n2 - Accéder à un client enregistré.");
		if (interaction.readData().equals("1")) {
			this.create();
		}
		else if (interaction.readData().equals("2")) {
			
		}
//		if (interaction.readData().equals(null)) {
//			interaction.display("Que voulez-vous faire ?");
//		}
//		else {
//			interaction.display("Ce n'est pas un identifiant valide.");
//		}
		
	}
	
	
	public void create() {
		Client client = new Client();
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

}
