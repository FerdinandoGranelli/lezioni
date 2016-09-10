/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oggetti;

/**
 *
 * @author ferdinando
 */
public class testPartita {
     static public void main (String [] args ) {
         Team milan = new Team("Milan");
         Team bologna = new Team("Bologna");
         System.out.println(milan.elementiTeam());
          milan.creaTeam();
         bologna.creaTeam();
         
         System.out.println(milan.elementiTeam());
         
         milan.schieraTitolari("regola");
         bologna.schieraTitolari("regola");
         
         System.out.println(Utility.confrontaSquadre(milan, bologna));
         
     }
        
}
