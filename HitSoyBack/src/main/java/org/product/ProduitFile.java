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
	// constructeur
	public ProduitFile(){
		
	}
	// constructeur avec paramètres
	public ProduitFile(String path, int count){
		setClientFile(path);
		setRecordCount(count);
	}
	
	// les fonctions get / set
	public void setClientFile(String path){
		file = new File(path);
	}
	
	public void setRecordCount(int count){
		recordCount = count;
	}
	
	public File getClientFile(){
		return file;
	}
	
	public int setRecordCount(){
		return recordCount;
	}
	
}
