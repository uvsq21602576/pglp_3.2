package fr.uvsq.uvsq21602576.pglp_3_2;

import java.util.ArrayList;

public class Entreprise {
	private ArrayList<Employe> listEmploye;

	public Entreprise() {
		listEmploye = new ArrayList<Employe>();
	}
	
	public void ajouteEmploye(Employe e) {
		listEmploye.add(e);
	}
	
	public double sommeTotaleSalaire() {
		double somme = 0;
		for (Employe E : listEmploye) {
			somme += E.calculSalaire();
		}
		return somme;
	}

}

