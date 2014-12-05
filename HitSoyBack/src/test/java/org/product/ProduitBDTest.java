package org.product;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * la classe test de la class ProduitDB
 * @author HitSoy
 *
 */
public class ProduitBDTest {

	ProduitDB produitDB;
	Produit produitRecord;
	@Before
	public void setUp() throws Exception {
		produitDB=new ProduitDB();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testProduitBD_openAndCreate() {
		assertNotNull("produitDB est cr��",produitDB.ProduitDB_create("../produitdb_unittest.db"));
		assertEquals("Est ce que produitDB est vide",0,produitDB.getRecordCount());
		produitDB.ProduitDB_close();
		
		assertNotNull("produitDB est ouvert",produitDB.ProduitDB_open("../produitdb_unittest.db"));
		assertEquals("Est ce que produitDB est vide",0,produitDB.getRecordCount());
		assertEquals("Est ce que produitDB est vide",0,produitDB.ProduitDB_getRecordCount(produitDB));
		produitDB.ProduitDB_close();
		
		produitDB.ProduitDB_remove("../produitdb-unittest-doesnotexist.db");
		assertEquals("Est ce que produitDB est vide",null,produitDB.ProduitDB_open("../produitdb-unittest-doesnotexist.db"));
		
	}

	@Test
	public void testProduitBD_readAndWrite() {
		produitRecord.ProduitRecord_init();
		produitDB.ProduitDB_create("../produitdb_unittest.db");
		
		for(int i=0;i<100;i++){
			produitRecord.setId(i);
			produitDB.ProduitDB_writeRecord(i,produitRecord);
			assertEquals("Est ce que produitDB est "+i+1,i+1,produitDB.getRecordCount());
		}
		produitDB.ProduitDB_close();
		produitDB.ProduitDB_open("../produitdb-unittest.db");
		
		for(int i=0;i<100;i++){
			produitDB.ProduitDB_readRecord(i,produitRecord);
			assertEquals("Est ce que record id est"+i,i,produitRecord.getId());
		}
		produitDB.ProduitDB_close();
	}
	
	@Test
	private void testProduitDB_append() {
		// TODO Auto-generated method stub
		produitRecord.ProduitRecord_init();
		assertNotNull("produitDB est cr��",produitDB.ProduitDB_create("../produitdb_unittest.db"));
		assertEquals("Est ce que produitDB est vide",0,produitDB.getRecordCount());
		
		produitDB.ProduitDB_appendRecord(produitRecord);
		assertEquals("Est ce que produitDB record est 1",1,produitDB.getRecordCount());
		produitDB.ProduitDB_appendRecord(produitRecord);
		assertEquals("Est ce que produitDB record est 2",2,produitDB.getRecordCount());
		produitDB.ProduitDB_close();
		
		assertNotNull("produitDB est ouvert",produitDB.ProduitDB_open("../produitdb_unittest.db"));
		assertEquals("Est ce que produitDB record est 2",2,produitDB.getRecordCount());
		produitDB.ProduitDB_close();
		
		produitDB.ProduitDB_remove("../produitdb-unittest-doesnotexist.db");
		assertNotNull("produitDB est cr�� ou ouvert",produitDB.ProduitDB_openOrCreate("../produitdb-unittest-doesnotexist.db"));
		assertEquals("Est ce que produitDB est vide",0,produitDB.getRecordCount());
		produitDB.ProduitDB_close();
		
		
	}
	
	@Test
	private void testProduitDB_insertAndRemove()throws Exception{
		produitRecord.ProduitRecord_init();
		produitDB.ProduitDB_create("../produitdb_unittest.db");
		
		for(int i=0;i<100;i++){
			produitRecord.setId(i);
			produitDB.ProduitDB_appendRecord(produitRecord);
		}
		
		for(int i=0;i<200;i+=2){
			produitRecord.setId(i);
			produitDB.ProduitDB_removeRecord(i);
			produitRecord.setId(2*i);
			produitDB.ProduitDB_insertRecord(i,produitRecord);
		}
		produitDB.ProduitDB_close();
		
		produitDB.ProduitDB_open("../produitdb_unittest.db");
		for (int i = 0; i < 100; ++i) {
			int k;
	        if (i % 2 == 0)
	            k=2*i;
	        else
	            k=i;

	        produitDB.ProduitDB_readRecord(i,produitRecord);
	        assertEquals("Est ce que record id",i,produitRecord.getId());
	    }
		
	}
}
