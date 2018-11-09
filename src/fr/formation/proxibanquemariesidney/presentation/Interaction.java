package fr.formation.proxibanquemariesidney.presentation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Interaction {
	
	public Map<String,String> optionMenu;
	public Map<String,String> clientChoice;
	public int advisorNum;
	public int clientNum;
	
	public Interaction() {
		this.optionMenu = new HashMap<>();
		this.clientChoice = new HashMap<>();
		this.advisorNum = 0;
		this.clientNum = 0;
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void display(String message) {
		System.out.println(message);
	}
	
	public String readData() {
		return scanner.nextLine();
	}
	
	public void homepage() {
		this.display("Bonjour, bienvenue dans ProxiBanqueSI. Veuillez vous identifier.");
		String ans = this.readData();
		if (ans.equals("Guenievre")) {
			advisorNum = 1;
			this.clientChoice.put("1", "Murdock");
			this.clientChoice.put("2", "Gloinson");
//			this.display("Que voulez-vous faire ?\n1. Créer un nouveau client.\n2. Accéder à un client enregistré.\n3. Exit.\nVotre choix ?");
		}
		else if (ans.equals("Charles Xavier")) {
			advisorNum = 2;
			this.clientChoice.put("1", "Oakenshield");
			this.clientChoice.put("2", "Lupin");
//			this.display("Que voulez-vous faire ?\n1. Créer un nouveau client.\n2. Accéder à un client enregistré.\n3. Exit.\nVotre choix ?");
		}
		else {
			this.display("Ce n'est pas un identifiant valide.");
		}
	}
	
	public void firstChoice() {
		this.display("Que voulez-vous faire ?\n1. Créer un nouveau client.\n2. Accéder à un client enregistré.\n3. Exit.\nVotre choix ?");
	}
	
	public void options() {
		this.display("Quel client voulez-vous consulter ?");
		for (String k : clientChoice.keySet()) {
			this.display(k + ". " + clientChoice.get(k));
		}
		this.display("Votre choix ?");
		clientNum = Integer.parseInt(this.readData());
		this.optionMenu.put("1", "Lire les informations du client.");
		this.optionMenu.put("2", "Modifier les informations du client.");
		this.optionMenu.put("3", "Faire un virement.");
		this.optionMenu.put("4", "Faire une simulation de crédit.");
		this.optionMenu.put("5", "Supprimer le client.");
		this.optionMenu.put("6", "Exit.");
		this.display("Que voulez-vous faire?\n");
		for (String key : optionMenu.keySet()) {
			this.display(key + ". " + optionMenu.get(key));
		}
		this.display("Votre choix ?");
	}

}
