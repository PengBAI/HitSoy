package org.product;

import java.io.File;

/**
 * Cette structure de données joue un rôle similaire à FILE 
 * pour les fonctions d’E/S standard. Chaque ﬁchier
 * Produit ne peut être manipulé qu’en ayant une structure de ce type à disposition.
 * @author HitSoy
 * */
public class ProduitFile {

	private int recordCount;
	private File file;
	/**
	 * constructeur
	 */
	public ProduitFile(){
		
	}
	/**
	 *  constructeur avec paramètres
	 * @param path le path de la base de données
	 * @param count le nombre du record
	 */
	public ProduitFile(String path, int count){
		setClientFile(path);
		setRecordCount(count);
	}
	
	/**
	 * set le path de ClientFile
	 * @param path
	 */
	public void setClientFile(String path){
		file = new File(path);
	}
	
	/**
	 * set le nombre du recordCount
	 * @param count le nombre du recordCount
	 */
	public void setRecordCount(int count){
		recordCount = count;
	}
	
	/**
	 * get ClientFile
	 * @return File
	 */
	public File getClientFile(){
		return file;
	}
	
	/**
	 * set le nombre du recordCount
	 * @return recordCount le nombre du recordCount
	 */
	public int setRecordCount(){
		return recordCount;
	}
	
}
