package fr.formation.proxibanquemariesidney.presentation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Interaction {
	
	public Map<String,String> optionMenu;
	
	public Interaction() {
		this.optionMenu = new HashMap<>();
	}
	
	Scanner scanner = new Scanner(System.in);
	
	public void display(String message) {
		System.out.println(message);
	}
	
	public String readData() {
		return scanner.nextLine();
	}
	
	public void homepage() {
		this.display("Bonjour, bienvenue dans ProxiBanqueSI. Que voulez-vous faire ?\n1. Créer un nouveau client.\n2. Accéder à un client enregistré.\n3. Exit.\nVotre choix ?");
	}
	
	public void options() {
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
