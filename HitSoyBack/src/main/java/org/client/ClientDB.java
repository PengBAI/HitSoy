package org.client;

import java.io.File;

/**
 * base de données du client, on utlise le fichier comme la base de données
 * @author CHEN_Jing
 */
public class ClientDB {
	
	public ClientFile ClientDB_create(String string) {
		// TODO Création d’un ﬁchier client
		return null;
	}

	public ClientFile ClientDB_open(String string) {
		// TODO Ouverture d’un ﬁchier client existant
		return null;
	}


	public ClientFile ClientDB_getRecordCount(ClientDB clientDB) {
		// TODO Obtenir le nombre d’enregistrements clients
		return null;
	}

	public void ClientDB_remove(String string) {
		// TODO Suppression d’un enregistrement
		
	}

	public void ClientDB_close() {
		// TODO Fermeture d’un ﬁchier client
		
	}

	public void ClientDB_writeRecord(int id, Client client) {
		// TODO Ecriture d’un enregistrement
		
	}

	public void ClientDB_readRecord(int id, Client client) {
		// TODO Lecture d’un enregistrement
		
	}

	public ClientFile getRecordCount() {
		// TODO Obtenir le nombre d’enregistrements clients
		return null;
	}

	public void ClientDB_appendRecord(Client client) {
		// TODO Ajout d’un enregistrement à la ﬁn
		
	}

	public ClientFile ClientDB_openOrCreate(String string) {
		// TODO Ouverture ou, à défaut, création d’un ﬁchier client
		return null;
	}

	public void ClientDB_removeRecord(int i) {
		// TODO Suppression d’un enregistrement
		
	}

	public void ClientDB_insertRecord(int i, Client client) {
		// TODO Insertion d’un enregistrement au sein du ﬁchier
		
	}

	


	
}
