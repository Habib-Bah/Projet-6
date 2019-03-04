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
public class Publication {
    
    public ArrayList<Commentaire> commentaires = new ArrayList<>();
    
    public Publication() {
        super();
    }
    
   public void addComment(String userName, String texte) {
        
        Commentaire commentaire = new Commentaire (userName, texte);
        commentaires.add(commentaire);
    }
   
   public void addComment(Commentaire c) {
        commentaires.add(c);
    }
}