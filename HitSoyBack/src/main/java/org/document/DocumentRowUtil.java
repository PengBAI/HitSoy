package org.document;

import java.util.List;

/**
 * les fonctions pour générer la liste de DocumentRow
 * et interaction avec des fichiers
 * @author HitSoy
 * */
public class DocumentRowUtil {
	
	// un list stockant les DocumentRow
	private List<DocumentRow> documentRowList;

	public DocumentRow DocumentRow_create() {
		// TODO Allocation sur le tas et initialisation d’une cellule
		return null;
	}

	public void DocumentRowList_pushBack(DocumentRow rows,
			DocumentRow documentRow_create) {
		// TODO Ajout en ﬁn de liste
		
	}

	public void DocumentRowList_insertAfter(DocumentRow list, DocumentRow position,
			 DocumentRow row){
		 // TODO Insertion après une cellule
		 
	}
	
	public void DocumentRowList_insertBefore(DocumentRow list, DocumentRow position,
			DocumentRow row) {
		// TODO Insertion avant une cellule
	}
	
	public void DocumentRowList_removeRow(DocumentRow list, DocumentRow position){
		// TODO Suppression d’une cellule
		
	}
	
	public int DocumentRowList_getRowCount(DocumentRow rows) {
		// TODO Nombre d’éléments d’une liste
		return -1;
	}

	public void Document_saveToFile(Document doc, String pathFile) {
		// TODO Ecriture dans un ﬁchier
		
	}

	public void Document_loadFromFile(Document doc, String pathFile) {
		// TODO Lecture dans un ﬁchier
		
	}
	
	
}
