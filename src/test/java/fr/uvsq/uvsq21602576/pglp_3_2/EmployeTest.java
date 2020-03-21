package fr.uvsq.uvsq21602576.pglp_3_2;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

/**
 * Classe de test d'Employe.
 * @author Flora
 */
public class EmployeTest {

    /**
     * Teste si le calcul du salaire fonctionne.
     */
    @Test
    public void calculSalaireTest() {
        Employe e = new Employe("Prenom Nom", 2015);
        int anciennete = Calendar.getInstance().get(Calendar.YEAR) - 2015;
        double expected = 1500 + anciennete * 20;
        assertEquals(expected, e.calculSalaire(), 0);
    }

}
