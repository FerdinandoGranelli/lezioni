/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oggetti;

import java.math.BigInteger;
import java.security.SecureRandom;
 
/**
 *
 * @author ferdinando
 */
public class TestRandom {
    
    static public void main (String [] args ) {
        
         SecureRandom random = new SecureRandom();
         String nominativo = new BigInteger(20, random).toString(32).toUpperCase();
         System.out.println(nominativo);
         
         int valore = new BigInteger(10, random).intValue();
         System.out.println(random.nextInt(100));
         
         RandomString prova = new RandomString(10);
         System.out.println(prova.nextString());
    }
    
}
