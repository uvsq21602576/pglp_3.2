package fr.uvsq.uvsq21602576.pglp_3_2;

import java.util.Calendar;

/**
 * Représentante un employé.
 * Il possède un nom et une année d'arrivée dans l'entreprise.
 * @author Flora
 */
public class Employe {
    /**
     * Nom de l'employé.
     */
    private final String nom;
    /**
     * Année d'arrivée dans l'entreprise.
     */
    private final int dateArrivee;

    /**
     * Salaire de base.
     */
    private static final int BASE_SALAIRE = 1500;
    /**
     * Salaire ajouté par année d'ancienneté.
     */
    private static final int SALAIRE_PAR_ANNEE = 20;

    /**
     * Constructeur.
     * Crée un employé avec un nom et son année d'arrivée dans l'entreprise.
     * @param n   Nom de l'employé
     * @param anneeArrivee   Date de son arrivée
     */
    public Employe(final String n, final int anneeArrivee) {
        this.nom = n;
        this.dateArrivee = anneeArrivee;
    }

    /**
     * Retourne le salaire de l'employé.
     * Calculé en fonction de l'année d'arrivée, donc de l'ancienneté.
     * @return  salaire
     */
    public double calculSalaire() {
        int date = Calendar.getInstance().get(Calendar.YEAR);
        int anciennete = date - this.dateArrivee;
        return BASE_SALAIRE + SALAIRE_PAR_ANNEE * anciennete;
    }
}
