package fr.formation.proxibanquemariesidney;

import fr.formation.proxibanquemariesidney.metier.ProxiBanqueSI;

public class Main {

	/*
	 * Cette classe "Main" est la classe principale qui permet de lancer la console,
	 * pour cela elle importe la classe "ProxiBanqueSI.
	 */

	public static void main(String[] args) {

		ProxiBanqueSI proxiBanqueSI = new ProxiBanqueSI();
		proxiBanqueSI.start();
	}

}
