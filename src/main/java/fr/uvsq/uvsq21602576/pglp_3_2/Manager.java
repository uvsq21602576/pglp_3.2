package fr.uvsq.uvsq21602576.pglp_3_2;

public class Manager extends Employe {
	private int nbPersonnel;

	public Manager(String nom, int dateArrivee, int nbPersonnel) {
		super(nom, dateArrivee);
		this.nbPersonnel = nbPersonnel;
	}
	
	@Override
	public double calculSalaire() {
		return super.calculSalaire() + 100 * this.nbPersonnel;
	}
	
}

