package fr.formation.proxibanquemariesidney.presentation;

import java.util.Scanner;

/**
 * @author marie
 * La classe � Interaction � permet la communication entre l�utilisateur (le conseiller) et la console gr�ce � l�import Scanner.
 */
public class Interaction {
	
	Scanner scanner = new Scanner(System.in);
	
	/**
	 * La m�thode � display � permet � la console d�afficher des messages pour l�utilisateur
	 * @param message correspond au message � afficher
	 */
	public void display(String message) {
		System.out.println(message);
	}
	
	/**
	 * La m�thode � readData � permet � la console d�analyser les commandes de l�utilisateur.
	 * @return  Elle renvoit la saisie de l'utilisateur sous forme de String.
	 */
	public String readData() {
		return scanner.nextLine();
	}
	
}
