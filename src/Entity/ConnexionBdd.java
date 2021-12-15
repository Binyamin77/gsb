/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IBGUI
 */
public class ConnexionBdd {
    
    private static Connection cnx;
    
    public ConnexionBdd() 
    {
        try {
            String chaine="com.mysql.jdbc.Driver";
            Class.forName(chaine);
            
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/gsb?serverTimezone="
                    + TimeZone.getDefault().getID(), "root", "root");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnexionBdd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnexionBdd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the cnx
     */
    public static Connection getCnx() {
        return cnx;
    }
    
}
