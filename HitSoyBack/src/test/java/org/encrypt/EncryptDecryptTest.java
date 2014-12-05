package org.encrypt;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Test pour la classe EncryptDecrypt
 * @author HitSoy
 * */
public class EncryptDecryptTest{

	private EncryptDecrypt myEncrypt;
	
    @Before
    public void setUp() {
    	myEncrypt = new EncryptDecrypt();
    	
    }
    
    @After
    public void tearDown() {
    	myEncrypt=null;
    }
 
    @Test
    public void testEncryptDecrypt(){
    	
    	// stringClair + key = strEncrypt
    	// strEncrypt + key = stringClair
    	// ex: Encrypt: "abcdef" + "AbC" = "acedfh"
    	//     Eecrypt: "acedfh" + "AbC" = "abcdef"
        Assert.assertEquals("acedfh", myEncrypt.encrypt("AbC", "abcdef"));
        Assert.assertEquals("abcdef", myEncrypt.decrypt("AbC", "acedfh"));

        Assert.assertEquals("ggiikk", myEncrypt.encrypt("gf", "abcdef"));
        Assert.assertEquals("abcdef", myEncrypt.decrypt("gf", "ggiikk"));
        
        Assert.assertEquals("ace", myEncrypt.encrypt("AbCDEF", "abc"));
        Assert.assertEquals("abc", myEncrypt.decrypt("AbCDEF", "ace"));
        
        Assert.assertEquals("ggh", myEncrypt.encrypt("gfffffffffffff", "abc"));
        Assert.assertEquals("abc", myEncrypt.decrypt("gfffffffffffff", "ggh"));

    }
    
}
