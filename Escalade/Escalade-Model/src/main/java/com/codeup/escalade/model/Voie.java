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
public class Voie {
    
    private int id;
    private String nomSite;
    private String nomVoie;
    private double longueur;
    private String cotation;
    
    public Voie() {
        super();
    }
    
    public Voie(String nomSite, String nomVoie, double longueur, String cotation) {
        
        this.nomSite = nomSite;
        this.nomVoie = nomVoie;
        this.longueur = longueur;
        this.cotation = cotation;
    }

    public String getNomSite() {
        return nomSite;
    }

    public void setNomSite(String nomSite) {
        this.nomSite = nomSite;
    }

    public String getNomVoie() {
        return nomVoie;
    }

    public void setNomVoie(String nomVoie) {
        this.nomVoie = nomVoie;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public String getCotation() {
        return cotation;
    }

    public void setCotation(String cotation) {
        this.cotation = cotation;
    }
    
    
}
