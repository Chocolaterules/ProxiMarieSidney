package fr.formation.proxibanquemariesidney.presentation;

import java.util.Scanner;

public class Interaction {
	
	Scanner scanner = new Scanner(System.in);
	
	public void display(String message) {
		System.out.println(message);
	}
	
	public String readData() {
		return scanner.next();
	}
	
	public void homepage() {
		this.display("Bonjour, bienvenue dans ProxiBanqueSI. Que voulez-vous faire ?\n1. Cr�er un nouveau client.\n2. Acc�der � un client enregistr�.\n3. Exit.\nVotre choix ?");
	}
	
	public void options() {
		
	}


}
