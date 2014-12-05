package org.client;

import java.io.File;

/**
 * Cette structure de données joue un rôle similaire à FILE 
 * pour les fonctions d’E/S standard. Chaque ﬁchier
 * client ne peut être manipulé qu’en ayant une structure de ce type à disposition.
 * @author HitSoy
 * */
public class ClientFile {
		// The number of record in the database
		private int recordCount;
		// C’est le lien vers le ﬁchier ouvert 
		private File file;
		
		// constructeur
		public ClientFile(){
			
		}
		// constructeur avec paramètres
		public ClientFile(String path, int count){
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
