package fr.uvsq.uvsq21602576.pglp_3_2;

import java.util.Calendar;

public class Employe {
	private final String nom;
	private final int dateArrivee;
	
	public Employe(String nom, int dateArrivee) {
		this.nom=nom;
		this.dateArrivee=dateArrivee;
	}
	
	public double calculSalaire() {
		int anciennete = Calendar.getInstance().get(Calendar.YEAR)-this.dateArrivee;
		return 1500+20*anciennete;
	}

}
