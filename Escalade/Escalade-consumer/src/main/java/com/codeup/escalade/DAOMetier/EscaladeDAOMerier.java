/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeup.escalade.DAOMetier;

import com.codeup.escalade.model.Topos;
import java.util.*;

/**
 *
 * @author habib
 */
public interface EscaladeDAOMerier {
    
    public void ajouterTopo(Topos t);
    public void supprimerTopà(Topos t);
    public Topos afficherTopo(Topos t);
    public List <Topos> afficherTopoParPays(String pays);

}
