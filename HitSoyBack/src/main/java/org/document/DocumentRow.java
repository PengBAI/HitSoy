package org.document;

/**
 * La liste des produits d’un document est stockée sous la forme d’une liste chainée simple.
 * @author HitSoy
 * */
public class DocumentRow {
	String code;
	String designation;
	double quantity;
	String unity;
	double basePrice;
	double sellingPrice;
	double discount;
	double rateOfVAT; 
	DocumentRow next;
	
	/**
	 * set code
	 * @param _code
	 */
	public void setCode(String _code){
		code = _code;
	}
	
	/**
	 * set designation
	 * @param des
	 */
	public void setDesignation(String des){
		designation = des;
	}
	/**
	 * set quantity
	 * @param qua
	 */
	public void setQuantity(double qua){
		quantity = qua;
	}	
	
	/**
	 * set unity
	 * @param uni
	 */
	public void setUnity(String uni){
		unity = uni;
	}	
	
	// TODO toutes les fonctions get et set
	
	
}
