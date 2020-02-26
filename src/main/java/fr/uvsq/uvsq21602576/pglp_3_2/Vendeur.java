package fr.uvsq.uvsq21602576.pglp_3_2;

public class Vendeur extends Employe{
	private double commission;

	public Vendeur(String nom, int dateArrivee) {
		super(nom,dateArrivee);
		commission=0;
	}
	
	public void setCommission(double commission) {
		this.commission=commission;
	}
	
	public double getCommission() {
		return this.commission;
	}
	
	@Override
	public double calculSalaire() {
		return super.calculSalaire()+this.commission;
	}

}
