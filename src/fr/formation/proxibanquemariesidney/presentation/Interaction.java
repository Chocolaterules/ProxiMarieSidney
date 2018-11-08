package fr.formation.proxibanquemariesidney.presentation;

import java.util.Scanner;

public class Interaction {
	
	Scanner scanner = new Scanner(System.in);
	
	public void display(String message) {
		System.out.println(message);
	}
	
	public String readData() {
		return scanner.nextLine();
	}
	
	public String homepage() {
		this.display("Bonjour, bienvenue dans ProxiBanqueSI. Que voulez-vous faire ?\n1. Créer un nouveau client.\n2. Accéder à un client enregistré.\n3. Exit.\nVotre choix ?");
		return this.readData();
	}
	
	public void options() {
		
	}


}
