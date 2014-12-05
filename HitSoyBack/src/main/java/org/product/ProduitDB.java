package org.product;

/**
 * ProduitDB base de données
 * @author HitSoy
 *
 */
public class ProduitDB {

	private ProduitFile produitFile;
	/**
	 * Créer une base de données du produit
	 * @param string le path de base de données
	 * @return
	 */
	public ProduitFile ProduitDB_create(String path) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * get le nombre de record
	 * @return le nombre de record recordCount
	 */
	public int getRecordCount() {
		// TODO Auto-generated method stub
		return (Integer) null;
	}

	/**
	 * flush cache données, fermer la base de données 
	 */
	public void ProduitDB_close() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * ouvrir une base de données existe du produit
	 * @param string
	 * @return un ProduitFile
	 */
	public ProduitFile ProduitDB_open(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * récupérer le nombre de record du produit dans la base de données
	 * @param produitDB
	 * @return le nombre de record du produit recordCount
	 */
	public int ProduitDB_getRecordCount(ProduitDB produitDB) {
		// TODO Auto-generated method stub
		return (Integer) null;
	}

	/**
	 * remove la base de données 
	 * @param string le path de fichier 
	 */
	public void ProduitDB_remove(String string) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * modifier le record à la position i 
	 * @param i position
	 * @param produitRecord record contient des données
	 */
	public void ProduitDB_writeRecord(int i, Produit produitRecord) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * lecture un record à la position i
	 * @param i 
	 * @param produitRecord record à remplir
	 */
	public void ProduitDB_readRecord(int i, Produit produitRecord) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * apprend un record à la fin de la base de données
	 * @param produitRecord le record
	 */
	public void ProduitDB_appendRecord(Produit produitRecord) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * ouvrir si exist ou créer une base de données du produit
	 * @param string le path de base de données
	 * @return un ProduitFile 
	 */
	public ProduitFile ProduitDB_openOrCreate(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * remove un record à la position i 
	 * @param i position
	 */
	public void ProduitDB_removeRecord(int i) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * insérer le record à la position i
	 * @param i position
	 * @param produitRecord le record
	 */
	public void ProduitDB_insertRecord(int i, Produit produitRecord) {
		// TODO Auto-generated method stub
		
	}


}
