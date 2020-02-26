package fr.uvsq.uvsq21602576.pglp_3_2;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class EmployeTest {
	
	@Test
	public void calculSalaireTest() {
		Employe E = new Employe("Prenom Nom", 2015);
		assertEquals(1500+(Calendar.getInstance().get(Calendar.YEAR)-2015)*20,E.calculSalaire(),0);
	}
	
}
