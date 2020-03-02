package fr.uvsq.uvsq21602576.pglp_3_2;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class EntrepriseTest {
	
	@Test
	public void sommeTotaleSalaire() {
		Entreprise E = new Entreprise();
		E.ajouteEmploye(new Employe("P1", 2019));
		E.ajouteEmploye(new Vendeur("P2", 2019));
		E.ajouteEmploye(new Manager("P3", 2019, 3));
		
		assertEquals((1500 + (Calendar.getInstance().get(Calendar.YEAR) - 2019) * 20) * 3 + 3 * 100, E.sommeTotaleSalaire(), 0);
	}
}
