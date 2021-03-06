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
public class Topos {
    
    private String nomSite;
    private int secteur;
    private int nombreDeVoies;
    private String hauteur;
    private String cotation;
    private int nombreDePoints;
    private String localisation;
    
    public Topos() {
        super();
    }
    
    public Topos(String nomSite, int secteur, int nombreDeVoies, String hauteur, String cotation, int nombreDePoints){
        
        this.nomSite = nomSite;
        this.secteur = secteur;
        this.nombreDeVoies = nombreDeVoies;
        this.hauteur = hauteur;
        this.cotation = cotation;
        this.nombreDePoints = nombreDePoints;
    }
    
    public void setNomSite(String nomSite) {
        this.nomSite = nomSite;
    }
    
    public String getNomSite() {
        return nomSite;
    }
    
    public void setSecteur(int secteur) {
        this.secteur = secteur;
    }
    
    public int getSecteur() {
        return this.secteur;
    }
    
    public void setNombreDeVoies(int nombreDeVoies) {
        this.nombreDeVoies = nombreDeVoies;
    }
    
    public int getNombreDeVoies() {
        return nombreDeVoies;
    }
    
    public void setNombreDePoints(int nombreDePoints) {
        this.nombreDePoints = nombreDePoints;
    }
    
    public int getNombreDePoints() {
        return nombreDePoints;
    }
    
    public void setHauteur(String hauteur) {
        this.hauteur = hauteur;
    }
    
    public String getHauteur() {
        return hauteur;
    }
    
    public void setCotation(String cotation) {
        this.cotation = cotation;
    }
    
    public String getCotation() {
        return cotation;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
    
    
}
