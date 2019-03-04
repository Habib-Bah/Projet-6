/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codeup.escalade.connexion;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author habib
 */
public class SingletonConnection {
   private static Connection connection;
   
   static {
       try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres");
        } catch (ClassNotFoundException e) {

        } catch (SQLException ex) {
           Logger.getLogger(SingletonConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   public static Connection getConnection() {
       return connection;
   }
    
}
