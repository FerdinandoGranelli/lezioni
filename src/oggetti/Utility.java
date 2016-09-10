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
public final class Utility {
    public static String confrontaSquadre( Team inCasa, Team fuoriCasa){
        String result ="";
        if(inCasa.getValoreTeam() >= fuoriCasa.getValoreTeam()){
            result = inCasa.getNomeTeam() + "Vince";
        }else {
            result =fuoriCasa.getNomeTeam() + "Vince";
        }
        
        return result;
    }
}
