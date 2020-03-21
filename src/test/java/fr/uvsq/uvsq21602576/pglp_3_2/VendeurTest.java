package fr.uvsq.uvsq21602576.pglp_3_2;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

/**
 * Classe de test pour Vendeur.
 * @author Flora
 *
 */
public class VendeurTest {

    /**
     * Teste la méthode setCommission.
     */
    @Test
    public void setCommissionTest() {
        Vendeur v = new Vendeur("Prenom Nom", 2015);
        double com = 210;
        v.setCommission(com);
        assertEquals(com, v.getCommission(), 0);
    }

    /**
     * Teste la méthode calculSalaire.
     */
    @Test
    public void calculSalaireTest() {
        Vendeur v = new Vendeur("Prenom Nom", 2015);
        v.setCommission(210);
        int anciennete = Calendar.getInstance().get(Calendar.YEAR) - 2015;
        double expected = 1500 + anciennete * 20 + 210;
        assertEquals(expected, v.calculSalaire(), 0);
    }

}
