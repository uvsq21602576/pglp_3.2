package fr.uvsq.uvsq21602576.pglp_3_2;

/**
 * Représente un vendeur.
 * Hérite d'employé.
 * Contient donc un nom et une année d'anciennté.
 * Possède en plus une commission.
 * @author Flora
 *
 */
public class Vendeur extends Employe {
    /**
     * Commission.
     */
    private double commission;

    /**
     * Constructeur.
     * Crée un vendeur à partir d'un nom et d'une année d'ancienneté
     * @param n    Nom
     * @param annee    Année d'arrivée
     */
    public Vendeur(final String n, final int annee) {
        super(n, annee);
        commission = 0;
    }

    /**
     * Modife la commission du vendeur.
     * Le remplace avec le nombre indiqué.
     * @param com   nouvelle commission
     */
    public void setCommission(final double com) {
        this.commission = com;
    }

    /**
     * Retourne la commission du vendeur.
     * @return commission
     */
    public double getCommission() {
        return this.commission;
    }

    /**
     * Retourne le salaire du vendeur.
     * Calculé comme l'employé, auquel s'ajoute la commission.
     * @return Salaire du vendeur.
     */
    @Override
    public double calculSalaire() {
        return super.calculSalaire() + this.commission;
    }
}
