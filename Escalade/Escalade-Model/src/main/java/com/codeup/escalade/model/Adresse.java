/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeup.escalade.model;

/**
 *
 * @author habib
 */
public class Adresse {
    
    private int numeroRue;
    private String nomRue;
    private  String ville;
    private int codePostal;
    
    public Adresse() {
        super();
    }
    
    public Adresse(int numeroRue, String nomRue, String ville, int codePostal) {
      
        this.numeroRue = numeroRue;
        this.nomRue = nomRue;
        this.ville = ville;
        this.codePostal = codePostal;
    }
    
    public void setNumeroRue(int numeroRue) {
        this.numeroRue = numeroRue;
    }
    
    public int getNumeroRue() {
        return numeroRue;
    }
    
    public void setNonmRue(String nomRue) {
        this.nomRue = nomRue;
    }
    
    public String getNomRue() {
        return nomRue;
    }
    
    public void setVille(String ville) {
        this.ville = ville;
    }
    
    public String getVille() {
        return ville;
    }
    
    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }
    
    public int getCodePostal() {
        return codePostal;
    }
}
