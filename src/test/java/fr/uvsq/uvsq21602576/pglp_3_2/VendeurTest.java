package fr.uvsq.uvsq21602576.pglp_3_2;

import static org.junit.Assert.assertEquals;

import java.util.Calendar;

import org.junit.Test;

public class VendeurTest {

	@Test
	public void setCommissionTest() {
		Vendeur V = new Vendeur("Prenom Nom",2015);
		double com = 210;
		V.setCommission(com);
		assertEquals(com,V.getCommission(),0);
	}
	
	@Test
	public void calculSalaireTest() {
		Vendeur V = new Vendeur("Prenom Nom",2015);
		V.setCommission(210);
		assertEquals(1500+(Calendar.getInstance().get(Calendar.YEAR)-2015)*20+210,V.calculSalaire(),0);
	}

}
