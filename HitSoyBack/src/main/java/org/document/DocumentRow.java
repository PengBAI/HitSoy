package org.document;

/**
 * La liste des produits d’un document est stockée sous la forme d’une liste chainée simple.
 * @author HitSoy
 * */
public class DocumentRow {
	String code;
	String destination;
	double quantity;
	String unity;
	double basePrice;
	double sellingPrice;
	double discount;
	double rateOfVAT; 
	DocumentRow next;
	
	public void setCode(String _code){
		code = _code;
	}
	
	public void setDestination(String des){
		destination = des;
	}
	
	public void setQuantity(double qua){
		quantity = qua;
	}	
	
	public void setUnity(String uni){
		unity = uni;
	}	
	
	// TODO toutes les fonctions get et set
	
	
}
