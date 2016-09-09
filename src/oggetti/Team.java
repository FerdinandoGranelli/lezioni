/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oggetti;

import java.util.ArrayList;

/**
 *
 * @author ferdinando
 */
public class Team {
    private final ArrayList<Calciatore> team = new ArrayList(22);
    private String NomeTeam;
    
    public void aggiungiCalciatore ( Calciatore calciatore){
        team.add(calciatore);
    }
    
    public void rimuoviCalciatore ( Calciatore calciatore){
        team.remove( team.indexOf(calciatore));
    }
    
    public void creaTeam ( Calciatore calciatore){
        
    }
    
    public void cancellaTeam ( Calciatore calciatore){
        team.clear();
    }
    
    public String stampaElencoCalciatori ( ){
        return "";
    }
    
    public static void schieraTitolari(String massimoAttacco) {
        
    }

    /**
     * @return the NomeTeam
     */
    public String getNomeTeam() {
        return NomeTeam;
    }

    /**
     * @param NomeTeam the NomeTeam to set
     */
    public void setNomeTeam(String NomeTeam) {
        this.NomeTeam = NomeTeam;
    }
    
}
