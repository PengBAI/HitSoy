package org.document;

import org.client.Client;

/**
 * Document est la facture du client
 * la classe entity de Document
 * @author HitSoy
 * */
public class Document {
    Client customer /** The customer */;
    String editDate /** The last edit data */;
    String expiryDate /** The peremption date */;
    String docNumber /** The document number */;
    char operator /** The last operator */;
    DocumentRow rows /** The rows */;
    
    // TODO toutes les fonctions get / set
}
