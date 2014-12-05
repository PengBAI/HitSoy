package org.client;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test pour les fonctions de la classe ClientDB
 * 
 * @author HitSoy
 * */
public class ClientDBTest {

	protected ClientDB clientDB;
	protected Client clientRecord;

	@Before
	public void setUp() throws Exception {
		clientDB = new ClientDB();
		clientRecord = new Client();
	}

	@After
	public void tearDown() throws Exception {
		clientDB = null;
		clientRecord = null;
	}

	@Test
	public void testClientBD_createAndOpen() throws Exception {

		assertNotNull("clientDB est crée",
				clientDB.ClientDB_create("../clientdb_unittest.db"));
		assertEquals("Est ce que clientDB est vide", 0,
				clientDB.getRecordCount());
		clientDB.ClientDB_close();

		assertNotNull("clientDB est ouvert",
				clientDB.ClientDB_open("../clientdb_unittest.db"));
		assertEquals("Est ce que clientDB est vide", 0,
				clientDB.getRecordCount());
		assertEquals("Est ce que clientDB est vide", 0,
				clientDB.ClientDB_getRecordCount(clientDB));
		clientDB.ClientDB_close();

		clientDB.ClientDB_remove("../clientdb-unittest-doesnotexist.db");
		assertEquals("Est ce que clientDB est vide", null,
				clientDB.ClientDB_open("../clientdb-unittest-doesnotexist.db"));
	}

	@Test
	public void testClientBD_readAndWrite() throws Exception {
		clientDB.ClientDB_create("../clientdb_unittest.db");

		for (int i = 0; i < 100; i++) {
			clientRecord.setId(i);
			clientDB.ClientDB_writeRecord(i, clientRecord);
			assertEquals("Est ce que clientDB est " + i + 1, i + 1,
					clientDB.getRecordCount());
		}
		clientDB.ClientDB_close();
		clientDB.ClientDB_open("../customerdb-unittest.db");

		for (int i = 0; i < 100; i++) {
			clientDB.ClientDB_readRecord(i, clientRecord);
			assertEquals("Est ce que record id", i, clientRecord.getId());
		}
		clientDB.ClientDB_close();
	}

	@Test
	private void testClientDB_append() {
		assertNotNull("clientDB est crée",
				clientDB.ClientDB_create("../clientdb_unittest.db"));
		assertEquals("Est ce que clientDB est vide", 0,
				clientDB.getRecordCount());

		clientDB.ClientDB_appendRecord(clientRecord);
		assertEquals("Est ce que clientDB record est 1", 1,
				clientDB.getRecordCount());
		clientDB.ClientDB_appendRecord(clientRecord);
		assertEquals("Est ce que clientDB record est 2", 2,
				clientDB.getRecordCount());
		clientDB.ClientDB_close();

		assertNotNull("clientDB est ouvert",
				clientDB.ClientDB_open("../clientdb_unittest.db"));
		assertEquals("Est ce que clientDB record est 2", 2,
				clientDB.getRecordCount());
		clientDB.ClientDB_close();

		clientDB.ClientDB_remove("../clientdb-unittest-doesnotexist.db");
		assertNotNull(
				"clientDB est créé ou ouvert",
				clientDB.ClientDB_openOrCreate("../clientdb-unittest-doesnotexist.db"));
		assertEquals("Est ce que clientDB est vide", 0,
				clientDB.getRecordCount());
		clientDB.ClientDB_close();

	}

	@Test
	private void testClientDB_insertAndRemove() throws Exception {
		clientDB.ClientDB_create("../clientdb_unittest.db");

		for (int i = 0; i < 100; i++) {
			clientRecord.setId(i);
			clientDB.ClientDB_appendRecord(clientRecord);
		}

		for (int i = 0; i < 200; i += 2) {
			clientRecord.setId(i);
			clientDB.ClientDB_removeRecord(i);
			clientRecord.setId(2 * i);
			clientDB.ClientDB_insertRecord(i, clientRecord);
		}
		clientDB.ClientDB_close();

		clientDB.ClientDB_open("../clientdb_unittest.db");
		for (int i = 0; i < 100; ++i) {
			int k;
			if (i % 2 == 0)
				k = 2 * i;
			else
				k = i;

			clientDB.ClientDB_readRecord(i, clientRecord);
			assertEquals("Est ce que record id", i, clientRecord.getId());
		}
	}
}
