package fr.formation.proxibanquemariesidney.persistance;

import java.util.ArrayList;
import java.util.List;
import fr.formation.proxibanquemariesidney.metier.Branch;

/**
 * @author marie La classe � Database � correspond � la base de donn�es de la
 *         console. Elle a pour import List, ArrayList et la classe �Branch�, et
 *         pour attribut "branchList" correspondant � la liste des agences
 *         ProxiBanque.
 */
public class Database {

	public List<Branch> branchList;

	/**
	 * Cette m�thode permet d'instancier la base de donn�es sans pr�ciser ses
	 * attributs.
	 */
	public Database() {
		this.branchList = new ArrayList<>();
	}

}
