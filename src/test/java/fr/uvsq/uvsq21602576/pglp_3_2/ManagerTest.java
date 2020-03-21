package fr.uvsq.uvsq21602576.pglp_3_2;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

/**
 * Classe de test pour Manager.
 * @author Flora
 */
public class ManagerTest {

    /**
     * Teste la méthode calculSalaire.
     */
    @Test
    public void calculSalaireTest() {
        Manager m = new Manager("Prenom Nom", 2015, 3);
        int anciennete = Calendar.getInstance().get(Calendar.YEAR) - 2015;
        double expected = 1500 + anciennete * 20 + 100 * 3;
        assertEquals(expected, m.calculSalaire(), 0);
    }
}
