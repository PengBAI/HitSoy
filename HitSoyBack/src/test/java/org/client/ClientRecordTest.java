package org.client;

import static org.junit.Assert.assertEquals;


import org.junit.After;
import org.junit.Before;


import org.junit.Test;

/**
 * Test pour ClientRecord
 * @author HitSoy
 * */
public class ClientRecordTest{
	
	protected Client clientRecord;
	protected ClientDB clientDB;
	@Before
	public void setUp() throws Exception {
		clientRecord=new Client();
		clientDB=new ClientDB();
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testClientRecord_accessible() throws Exception{
		clientDB.ClientDB_open("../clientrecord_unittest.db");
		
		clientRecord.setNom("Nom");
		assertEquals("Est ce que clientRecord nom est correct","Nom",clientRecord.getNom());
		clientRecord.setAddress("Address");
		assertEquals("Est ce que clientRecord address est correct","Adress",clientRecord.getAddress());
		clientRecord.setPostal("Postal");
		assertEquals("Est ce que clientRecord postal est correct","Postal",clientRecord.getPostal());
		clientRecord.setVille("Ville");
		assertEquals("Est ce que clientRecord ville est correct","Ville",clientRecord.getVille());
		
	}
}
