package fr.formation.proxibanquemariesidney;

import fr.formation.proxibanquemariesidney.metier.ProxiBanqueSI;

public class Main {

	public static void main(String[] args) {
		
		ProxiBanqueSI proxiBanqueSI = new ProxiBanqueSI();
		proxiBanqueSI.start();
	}

}
