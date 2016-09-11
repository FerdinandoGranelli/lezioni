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
    private String nomeTeam;
    private static final int NUMEROTEAM = 22;
    
    public Team(String nomeTeam){
        this.nomeTeam = nomeTeam;
        
    }
    public int elementiTeam ( ){
        return team.size();
    }
    
    public void aggiungiCalciatore ( Calciatore calciatore){
        if ( this.elementiTeam() < NUMEROTEAM)
        team.add(calciatore);
    }
    
    public void rimuoviCalciatore ( Calciatore calciatore){
        team.remove( team.indexOf(calciatore));
    }
    
    public void creaTeam ( ){
        cancellaTeam();
        for (int i= 0; i <= NUMEROTEAM ; i++){
            Calciatore a = new Calciatore();
            a.creaSetatisiche();
            
            team.add(a);
        }
    }
    
    public void cancellaTeam (){
        team.clear();
    }
    
    public String stampaElencoCalciatori ( ){
        String result = "";
        for( int i = 0; i <= team.size(); i++ ){
           result += team.get(i).toString();
        }
        return result;
    }
    
    public final void schieraTitolari(String parametro) {
        // switch attacco difesa
          for( int i = 0; i <= NUMEROTEAM; i++ ){
            team.get(i).setTitolare(false);           
          }
          
          for( int i = 0; i <= 11; i++ ){
            team.get(i).setTitolare(true);           
          }
          
          
    }

    /**
     * @return the NomeTeam
     */
    public String getNomeTeam() {
        return nomeTeam;
    }

    /**
     * @param NomeTeam the NomeTeam to set
     */
    public void setNomeTeam(String nomeTeam) {
        this.nomeTeam = nomeTeam;
    }
    
     public int getValoreTeam() {
         int result = 0;
         for( int i = 0; i <= NUMEROTEAM; i++ ){
            if(team.get(i).isTitolare()){
                result += team.get(i).getValoreMedio();
            };           
          }
         return result;
    }
     
    @Override
     public String toString(){
       return ("");   
     }
    
}
