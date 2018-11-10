package fr.formation.proxibanquemariesidney.persistance;

import java.util.ArrayList;
import java.util.List;
import fr.formation.proxibanquemariesidney.metier.Branch;

/**
 * @author marie La classe « Database » correspond à la base de données de la
 *         console. Elle a pour import List, ArrayList et la classe «Branch», et
 *         pour attribut "branchList" correspondant à la liste des agences
 *         ProxiBanque.
 */
public class Database {

	public List<Branch> branchList;

	/**
	 * Cette méthode permet d'instancier la base de données sans préciser ses
	 * attributs.
	 */
	public Database() {
		this.branchList = new ArrayList<>();
	}

}
