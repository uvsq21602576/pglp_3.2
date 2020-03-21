package fr.uvsq.uvsq21602576.pglp_3_2;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

/**
 * Classe de test pour Entreprise.
 * @author Flora
 */
public class EntrepriseTest {

    /**
     * Teste la méthode sommeTotaleSalaire.
     */
    @Test
    public void sommeTotaleSalaire() {
        Entreprise e = new Entreprise();
        e.ajouteEmploye(new Employe("P1", 2019));
        e.ajouteEmploye(new Vendeur("P2", 2019));
        e.ajouteEmploye(new Manager("P3", 2019, 3));

        int anciennete = Calendar.getInstance().get(Calendar.YEAR) - 2019;
        double expected = (1500 + anciennete * 20) * 3 + 3 * 100;
        assertEquals(expected, e.sommeTotaleSalaire(), 0);
    }
}
