package fr.formation.proxibanquemariesidney;

import fr.formation.proxibanquemariesidney.metier.ProxiBanqueSI;

/**
 * @author marie La classe "Main" est la classe principale qui permet de lancer
 *         le programme. Elle importe la classe ProxiBanqueSI.
 */
public class Main {

	/**
	 * La méthode "main" lance le programme en faisant appel à la méthode "start" de
	 * la classe ProxiBanqueSI.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		ProxiBanqueSI proxiBanqueSI = new ProxiBanqueSI();
		proxiBanqueSI.start();
	}

}
