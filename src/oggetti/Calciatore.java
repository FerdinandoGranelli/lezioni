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
public class Calciatore {
    private String nominativo;
    private int eta;
    private int altezza;
    private int peso;
    private boolean titolare;
    private int ruolo;
    
    private int velocità;
    private int fisico;
    private int difesa;
    private int dribling;
    private int passaggi;
    private int tiri;
    
    private int coefficiente = 1;

    public Calciatore() {
    }

    public Calciatore(String nominativo, int eta, int altezza, int peso, int ruolo, int velocità, int fisico, int difesa, int dribling, int passaggi, int tiri) {
        this.nominativo = nominativo;
        if( eta < 0 || eta > 100){
            throw new IllegalArgumentException();
        } else 
        this.eta = eta;
        
        this.altezza = altezza;
        this.peso = peso;
        this.ruolo = ruolo;
        if( velocità < 0 || velocità > 100){
            throw new IllegalArgumentException();
        } else 
        this.velocità = velocità;
        if( fisico < 0 || fisico > 100){
            throw new IllegalArgumentException();
        } else 
        this.fisico = fisico;
        if( difesa < 0 || difesa > 100){
            throw new IllegalArgumentException();
        } else 
        this.difesa = difesa;
        if( dribling < 0 || dribling > 100){
            throw new IllegalArgumentException();
        } else 
        this.dribling = dribling;
        if( passaggi < 0 || passaggi > 100){
            throw new IllegalArgumentException();
        } else 
        this.passaggi = passaggi;
        this.tiri = tiri;
    }
   
    
    /**
     * @return the nominativo
     */
    public String getNominativo() {
        return nominativo;
    }

    /**
     * @param nominativo the nominativo to set
     */
    public void setNominativo(String nominativo) {
        this.nominativo = nominativo;
    }

    /**
     * @return the eta
     */
    public int getEta() {
        return eta;
    }

    /**
     * @param eta the eta to set
     */
    public void setEta(int eta) {
      if( eta < 0 || eta > 100){
          throw new IllegalArgumentException();
      } else 
      this.eta = eta;
    }

    /**
     * @return the altezza
     */
    public int getAltezza() {
        return altezza;
    }

    /**
     * @param altezza the altezza to set
     */
    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the ruolo
     */
    public int getRuolo() {
        return ruolo;
    }

    /**
     * @param ruolo the ruolo to set
     */
    public void setRuolo(int ruolo) {
        this.ruolo = ruolo;
    }

    /**
     * @return the velocità
     */
    public int getVelocità() {
        return velocità;
    }

    /**
     * @param velocità the velocità to set
     */
    public void setVelocità(int velocità) {
      if( velocità < 0 || velocità > 100){
          throw new IllegalArgumentException();
      } else 
      this.velocità = velocità;
    }

    /**
     * @return the fisico
     */
    public int getFisico() {
        return fisico;
    }

    /**
     * @param fisico the fisico to set
     */
    public void setFisico(int fisico) {
      if( fisico < 0 || fisico > 100){
          throw new IllegalArgumentException();
      } else 
      this.fisico = fisico;
    }

    /**
     * @return the difesa
     */
    public int getDifesa() {
        return difesa;
    }

    /**
     * @param difesa the difesa to set
     */
    public void setDifesa(int difesa) {
      if( difesa < 0 || difesa > 100){
          throw new IllegalArgumentException();
      } else 
      this.difesa = difesa;
    }

    /**
     * @return the dribling
     */
    public int getDribling() {
        return dribling;
    }

    /**
     * @param dribling the dribling to set
     */
    public void setDribling(int dribling) {
      if( dribling < 0 || dribling > 100){
          throw new IllegalArgumentException();
      } else 
      this.dribling = dribling;
    }

    /**
     * @return the passaggi
     */
    public int getPassaggi() {
        return passaggi;
    }

    /**
     * @param passaggi the passaggi to set
     */
    public void setPassaggi(int passaggi) {
      if( passaggi < 0 || passaggi > 100){
          throw new IllegalArgumentException();
      } else 
      this.passaggi = passaggi;
    }

    /**
     * @return the tiri
     */
    public int getTiri() {
        return tiri;
    }

    /**
     * @param tiri the tiri to set
     */
    public void setTiri(int tiri) {
      if( tiri < 0 || tiri > 100){
          throw new IllegalArgumentException();
      } else 
      this.tiri = tiri;
    }

    /**
     * @return the titolare
     */
    public boolean isTitolare() {
        return titolare;
    }

    /**
     * @param titolare the titolare to set
     */
    public void setTitolare(boolean titolare) {
        this.titolare = titolare;
    }
    
    public int getValoreMedio(){
    int result = ( velocità + fisico + difesa + dribling + passaggi + tiri ) / 6;
     result *= coefficiente ;
       return ( result);
    }
    
    public String creaSetatisiche() {
        SecureRandom random = new SecureRandom();

        RandomString nomeGenerico = new RandomString(10);
        nominativo = nomeGenerico.nextString().toUpperCase();
        this.dribling = random.nextInt(100);
        this.difesa= random.nextInt(100);
        this.passaggi= random.nextInt(100);
        this.velocità= random.nextInt(100);
        this.fisico= random.nextInt(100);
        this.tiri = random.nextInt(100);
        return nominativo;
    };
    
    @Override
    public String toString(){
        return (" Nome " + nominativo + " Valore medio " + getValoreMedio()+ " titolare "+
                 titolare ); 
    }
        
    
}
