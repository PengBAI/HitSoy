package org.product;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * la classe test de la class ProduitRecord
 * @author HitSoy
 *	
 */
public class ProduitRecordTest {

	Produit produitRecord;
	ProduitDB produitDB;
	@Before
	public void setUp() throws Exception {
		produitRecord=new Produit();
		produitDB=new ProduitDB();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testProduitRecord_accessible() throws Exception{
		produitRecord.ProduitRecord_init();
		produitDB.ProduitDB_open("../produitrecord_unittest.db");
		
		produitRecord.setCode("Code");
		assertEquals("Est ce que produitRecord code est correct","Code",produitRecord.getCode());
		produitRecord.setDesignation("Designation");
		assertEquals("Est ce que produitRecord designation est correct","designation",produitRecord.getDesignation());
		produitRecord.setUnity("Unity");
		assertEquals("Est ce que produitRecord unity est correct","Unity",produitRecord.getUnity());
		produitRecord.setBasePrice(9.45);
		assertEquals("Est ce que produitRecod basePrice est correct","9.45",produitRecord.getBasePrice());
		produitRecord.setSellingPrice(12.45);
		assertEquals("Est ce que produitRecod sellingPrice est correct","12.45",produitRecord.getSellingPrice());
		produitRecord.setRateVAT(10.45);
		assertEquals("Est ce que produitRecod rateVAT est correct","10.45",produitRecord.getRateVAT());
	
		assertFalse("Le mot de passe est trop long",
				produitRecord.ProduitDB_isValuePosivtive("-14.37"));
		assertFalse("Le mot de passe est trop long",
				produitRecord.ProduitDB_isValuePosivtive("17.4fr"));
		assertTrue("Le mot de passe est valide",
				produitRecord.ProduitDB_isValuePosivtive("10.21"));
		
	}
	
}
