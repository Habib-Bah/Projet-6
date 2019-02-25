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
public class Utilisateur {
    
    private int id;
    private String nom;
    private String prenom;
    private String email;
    private int telephone;
    
    public Utilisateur() {   
        super();
    }
    
    public Utilisateur(String nom, String prenom, String email, int telephone) {
        
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getNom() {
        return nom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    public String getPrenom() {
        return prenom;
    }
    
    public void seteMail(String email) {
        this.email = email;
    }
    
    public String geteMail() {
        return email;
    }
    
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    
    public int getTelephone() {
        return telephone;
    }
}
