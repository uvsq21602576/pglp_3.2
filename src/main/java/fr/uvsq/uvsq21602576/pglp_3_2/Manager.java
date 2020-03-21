package fr.uvsq.uvsq21602576.pglp_3_2;

/**
 * Représente un manager.
 * Hérite d'employé, donc possède un nom et une année d'arrivée.
 * Possède en plus un nombre de personnels.
 * @author Flora
 */
public class Manager extends Employe {
    /**
     * Nombre de personnels.
     */
    private int nbPersonnel;

    /**
     * Salaire ajouté par personnel.
     */
    private static final int SALAIRE_PAR_PERSONNEL = 100;

    /**
     * Constructeur.
     * Crée un manager à partir d'un nom, d'une date d'arrivée
     * et d'un nombre de personnels.
     * @param n  nom du manager
     * @param annee  année d'arrivée
     * @param personnels  nombre de personnels
     */
    public Manager(final String n, final int annee, final int personnels) {
        super(n, annee);
        this.nbPersonnel = personnels;
    }

    /**
     * Retourne le salaire du manager.
     * Calculé comme l'employé.
     * Et prend en compte le nombre de personnels
     */
    @Override
    public double calculSalaire() {
        return super.calculSalaire() + SALAIRE_PAR_PERSONNEL * this.nbPersonnel;
    }
}
