/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeup.escalade.model;

import java.util.*;

/**
 *
 * @author habib
 */
public class Site {
    
    private int id;
    private String nom;
    private int nombreDeVoies;
    private int nombreDeSpits;
    private String localisation;
    public ArrayList<Voie> voies = new ArrayList<>();
    
    public Site() {
        super();
    }
    
    public Site(String nom, int nombreDeVoies, int nombreDeSpits, String localisation) {
        
        this.nom = nom;
        this.nombreDeVoies = nombreDeVoies;
        this.nombreDeSpits = nombreDeSpits;
        this.localisation = localisation;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setNombreDeVoies(int nombreDeVoies) {
        this.nombreDeVoies = nombreDeVoies;
    }
    
    public int getNombreDeVoies() {
        return nombreDeVoies;
    }
    
    public void setNombreDeSpits(int nombreDeSpits) {
        this.nombreDeSpits = nombreDeSpits;
    }
    
    public int getNombreDeSpits() {
        return nombreDeSpits;
    }    
    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
    
    public String getLocalisation() {
        return localisation;
    }
    
    public Adresse getAdresse(int numero, String nom, String ville, int codePostal) {  
        return new Adresse(numero, nom, ville, codePostal);
    }    
    
    public void addVoie(String nomSite, String nomVoie, double longueur, String cotation) {
        
       Voie voie = new Voie(nomSite, nomVoie, longueur, cotation);
       voies.add(voie);
    }
}
