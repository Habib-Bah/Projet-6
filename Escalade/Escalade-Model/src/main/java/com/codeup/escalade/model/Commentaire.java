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
public class Commentaire {
    
    private int id;
    private String UserName;
    private String texte;
    
    public Commentaire() { 
        super();
    }
    
    public Commentaire(String UserName, String texte) {
        this.UserName = UserName;
        this.texte = texte;
    }
    
    public String getCommentaire() {
        return "Commentaire de " + UserName + " : \n"+ "texte : " + texte;  
    }
}
