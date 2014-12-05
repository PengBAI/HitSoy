package org.client;

import java.io.File;

/**
 * base de données du client, on utlise le fichier comme la base de données
 * @author HitSoy
 */
public class ClientDB {
	/**
	 * Création d’un ﬁchier client
	 * @param path le path du fichier de la base de données
	 * @return
	 */
	public ClientFile ClientDB_create(String path) {
		
		return null;
	}

	/**
	 * Ouverture d’un ﬁchier client existant
	 * @param path le path du fichier de la base de données
	 * @return
	 */
	public ClientFile ClientDB_open(String path) {
		
		return null;
	}

	/**
	 * Obtenir le nombre d’enregistrements clients
	 * @param clientDB 
	 * @return ClientFile 
	 */
	public ClientFile ClientDB_getRecordCount(ClientDB clientDB) {
		
		return null;
	}

	/**
	 * remove la base de données
	 * @param path le path du fichier de la base de données
	 */
	public void ClientDB_remove(String path) {
		
		
	}

	/**
	 * Fermeture de la base de données
	 */
	public void ClientDB_close() {
		
		
	}

	/**
	 * Ecriture d’un enregistrement de record
	 * @param id 
	 * @param client
	 */
	public void ClientDB_writeRecord(int id, Client client) {
		
		
	}

	/**
	 * Lecture d’un record client
	 * @param id
	 * @param client
	 */
	public void ClientDB_readRecord(int id, Client client) {
		
		
	}

	/**
	 * Obtenir le nombre d’enregistrements clients
	 * @return ClientFile
	 */
	public ClientFile getRecordCount() {
		
		return null;
	}

	/**
	 *  Ajout d’un enregistrement à la ﬁn
	 * @param client
	 */
	public void ClientDB_appendRecord(Client client) {
		
		
	}

	/**
	 * Ouverture ou, à défaut, création d’un ﬁchier client
	 * @param path 
	 * @return ClientFile
	 */
	public ClientFile ClientDB_openOrCreate(String path) {
		
		return null;
	}

	/**
	 * remove le record à la position i
	 * @param i la position
	 */
	public void ClientDB_removeRecord(int i) {
		
		
	}

	/**
	 * Insertion d’un record à la position i 
	 * @param i
	 * @param client
	 */
	public void ClientDB_insertRecord(int i, Client client) {
		
		
	}

	


	
}
