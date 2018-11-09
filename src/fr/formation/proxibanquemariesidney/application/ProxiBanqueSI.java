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
		this.manageHomepage();

//		if (interaction.readData().equals(null)) {
//			interaction.display("Que voulez-vous faire ?");
//		}
//		else {
//			interaction.display("Ce n'est pas un identifiant valide.");
//		}

	}

	public void create() {
		// demander infos et attribuer � chaque �tape
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
		int telephone = Integer.parseInt(interaction.readData());
		Client client = new Client(lastname, firstname, address, zipCode, city, telephone);
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
		interaction.homepage();
		String client = "ghfhg";
		interaction.display("Votre client " + client
				+ " est fauché, la simulation effectuée ne vous permet pas de lui accorder un crédit. Même avec du piston!");
	}

	public void loadTestData() {
		this.data.branchList = new ArrayList<>();
		Branch branch = new Branch("88mph", "21/10/1985");
		branch.manager = new Manager("Thorin");
		branch.advisorList = new ArrayList<>();
		Advisor advisor = new Advisor("Remus");
		advisor.clientList.add(new Client("Murdock", "Matthew", "Hell's Kitchen", 10036, "NY", 36656565));

		branch.advisorList.add(advisor);
		this.data.branchList.add(branch);
	}

	public void manageHomepage() {
		interaction.homepage();
		String s = interaction.readData();
		if (s.equals("1")) {
			this.create();
		} else if (s.equals("2")) {
			interaction.options();
		} else {
			System.out.println("exit");
		}
	}

}
