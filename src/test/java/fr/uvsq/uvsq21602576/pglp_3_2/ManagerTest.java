package fr.uvsq.uvsq21602576.pglp_3_2;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class ManagerTest {

	@Test
	public void calculSalaireTest() {
		Manager M = new Manager("Prenom Nom", 2015, 3);
		assertEquals(1500 + (Calendar.getInstance().get(Calendar.YEAR) - 2015) * 20 + 100 * 3,M.calculSalaire(),0);
	}

}
