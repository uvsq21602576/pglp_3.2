package fr.uvsq.uvsq21602576.pglp_3_2;

import java.util.ArrayList;

/**
 * Représente une entreprise.
 * Contient une liste de salariés.
 * @author Flora
 *
 */
public class Entreprise {
    /**
     * Liste d'employés.
     */
    private ArrayList<Employe> listEmploye;

    /**
     * Constructeur.
     * Crée une entrprise avec zéro employé (liste vide).
     */
    public Entreprise() {
        listEmploye = new ArrayList<Employe>();
    }

    /**
     * Ajoute l'employé e à l'entreprise.
     * @param e    Employé
     */
    public void ajouteEmploye(final Employe e) {
        listEmploye.add(e);
    }

    /**
     * Calcule et retourne la somme totale des salaires.
     * @return  somme des salaires de tous les employés
     */
    public double sommeTotaleSalaire() {
        double somme = 0;
        for (Employe e : listEmploye) {
            somme += e.calculSalaire();
        }
        return somme;
    }

}
