/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeup.escalade.Imp;
import com.codeup.escalade.DAOMetier.EscaladeDAOMerier;
import com.codeup.escalade.model.Topos;
import java.sql.*;
import java.util.*;

/**
 *
 * @author habib
 */
import com.codeup.escalade.connexion.SingletonConnection;
public class EscaladeDAOImpl implements EscaladeDAOMerier {

    @Override
    public void ajouterTopo(Topos t) {
       Connection conn = SingletonConnection.getConnection();
       try {
           PreparedStatement ps = conn.prepareCall("insert into topos(nomsite, secteur, nombredevoie, hauteur, cotation, nombredePoints) values (?,?,?,?,?,?)");
           ps.setString(1, t.getNomSite());
           ps.setInt(2, t.getSecteur());
           ps.setInt(3, t.getNombreDeVoies());
           ps.setString(4, t.getHauteur());
           ps.setString(5, t.getCotation());
           ps.setInt(6, t.getNombreDePoints());
           
           ps.executeUpdate();
           ps.close();
       } catch(SQLException e) {
           e.printStackTrace();
       }
    }
    
    @Override
    public List<Topos> afficherTopo() {
        List <Topos> listTopo = new ArrayList<Topos>();
       Connection conn = SingletonConnection.getConnection();
       
       try {
           PreparedStatement ps = conn.prepareStatement("select * from topo");
           ResultSet rs = ps.executeQuery();
           while(rs.next()) {
               Topos topo = new Topos();
               topo.setNomSite(rs.getString("nomsite"));
               topo.setSecteur(rs.getInt("secteur"));
               topo.setNombreDeVoies(rs.getInt("nombredevoie"));
               topo.setHauteur(rs.getString("hauteur"));
               topo.setCotation(rs.getString("cotation"));
               topo.setNombreDePoints(rs.getInt("nombredepoint"));
               
               listTopo.add(topo);
           }
           ps.close();
       }catch(SQLException e) {
           e.printStackTrace();
       }
       return listTopo;
    }

    @Override
    public void supprimerTopo(Topos t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Topos> afficherTopoParPays(String pays) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
