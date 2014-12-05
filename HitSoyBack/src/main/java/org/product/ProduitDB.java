package org.product;

/**
 * ProduitDB base de données
 * @author HitSoy
 *
 */
public class ProduitDB {

	private ProduitFile produitFile;
	/**
	 * Cr�er une base de donn�es du produit
	 * @param string le path de base de donn�es
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
	 * flush cache donn�es, fermer la base de donn�es 
	 */
	public void ProduitDB_close() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * ouvrir une base de donn�es existe du produit
	 * @param string
	 * @return un ProduitFile
	 */
	public ProduitFile ProduitDB_open(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * r�cup�rer le nombre de record du produit dans la base de donn�es
	 * @param produitDB
	 * @return le nombre de record du produit recordCount
	 */
	public int ProduitDB_getRecordCount(ProduitDB produitDB) {
		// TODO Auto-generated method stub
		return (Integer) null;
	}

	/**
	 * remove la base de donn�es 
	 * @param string le path de fichier 
	 */
	public void ProduitDB_remove(String string) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * modifier le record � la position i 
	 * @param i position
	 * @param produitRecord record contient des donn�es
	 */
	public void ProduitDB_writeRecord(int i, Produit produitRecord) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * lire un record � la position i
	 * @param i 
	 * @param produitRecord record � remplir
	 */
	public void ProduitDB_readRecord(int i, Produit produitRecord) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * apprend un record � la fin de la base de donn�es
	 * @param produitRecord le record
	 */
	public void ProduitDB_appendRecord(Produit produitRecord) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * ouvrir si exist ou cr�er une base de donn�es du produit
	 * @param string le path de base de donn�es
	 * @return un ProduitFile 
	 */
	public ProduitFile ProduitDB_openOrCreate(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * remove un record � la position i 
	 * @param i position
	 */
	public void ProduitDB_removeRecord(int i) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * ins�rer le record � la position i
	 * @param i position
	 * @param produitRecord le record
	 */
	public void ProduitDB_insertRecord(int i, Produit produitRecord) {
		// TODO Auto-generated method stub
		
	}


}
