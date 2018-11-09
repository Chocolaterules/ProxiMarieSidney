package fr.formation.proxibanquemariesidney.presentation;

import java.util.Scanner;

public class Interaction {
	
	/*
	 * 
	 */
	
	Scanner scanner = new Scanner(System.in);
	
	public void display(String message) {
		System.out.println(message);
	}
	
	/*
	 * 
	 */
	
	public String readData() {
		return scanner.nextLine();
	}
	
	/*
	 * 
	 */
}
