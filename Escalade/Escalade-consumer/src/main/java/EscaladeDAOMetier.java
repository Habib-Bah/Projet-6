
import com.codeup.escalade.model.Topos;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habib
 */
public interface EscaladeDAOMetier {
    
    public void ajouterTopo(Topos t);
    public void supprimerTopà(Topos t);
    public Topos afficherTopo(Topos t);
    public List <Topos> afficherTopoParPays(String pays);
    
}
