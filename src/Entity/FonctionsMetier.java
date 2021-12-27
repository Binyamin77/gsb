/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.UIManager.getString;


public class FonctionsMetier implements IMetier
{
    //ces 3 objets sont obligatoires pour faire les requetes 
    private ResultSet rs;
    private PreparedStatement ps;
    private Connection maCnx;
    
    @Override
    public ArrayList<Utilisateur> getAllUsers() 
    {
        ArrayList<Utilisateur>mesUsers = new ArrayList <Utilisateur>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select idUser,nomUser from users");
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                Utilisateur u = new Utilisateur((rs.getInt(1)),rs.getString(2),"");
                mesUsers.add(u);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesUsers;
    }

    @Override
    public ArrayList<Ticket> getAllTicketsByIdUser(int idUser) {
        ArrayList<Ticket> desTickets = new ArrayList<>();
        try {
            maCnx = ConnexionBdd.getCnx();
            ps = maCnx.prepareStatement("select tickets.idTicket, tickets.nomTicket, tickets.dateTicket, etats.nomEtat from tickets inner join etats on tickets.numEtat = etats.idEtat WHERE tickets.numUser ="+idUser);
            rs = ps.executeQuery();
            while(rs.next()){
                Ticket monTicket = new Ticket(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
                desTickets.add(monTicket);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return desTickets;
    }

   /* @Override
    public Utilisateur VerifierIdentifiants(String login, String mdp) {
        Utilisateur u = null;
        try {
            maCnx=ConnexionBdd.getCnx();
            
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("Select idUser, nomUser, statutUser from users where loginUser = '"+login+"' AND pwdUser='"+mdp+"'");
            
            rs=ps.executeQuery();
            
            //rs.next retourne boolean donc si c'est vrai 
            if(rs.next())
            {
                //on met 1 car il ya une seule colonne 
                //car dans le select on a mit seulement le statutUser
                u = new Utilisateur(Integer.parseInt(rs.getString(1)), rs.getString(2),rs.getString(3));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
    } */


    @Override
    public ArrayList<region> getAllRegion() {
      ArrayList<region>mesRegions = new ArrayList <region>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select * from region");
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                region r = new region((rs.getInt(1)),rs.getString(2),rs.getInt(3));
                mesRegions.add(r);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesRegions; 
    }

    @Override
    public ArrayList<labo> getAllLabo() {
        ArrayList<labo>mesLabos = new ArrayList <labo>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select labo.chefvente_labo,id_labo,nom_labo from labo");
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                labo l = new labo(rs.getString(1),rs.getInt(2),rs.getString(3));
                mesLabos.add(l);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesLabos; 
    }
    

    @Override
    public ArrayList<secteur> getAllSecteur() {
        ArrayList<secteur>mesSecteurs = new ArrayList <secteur>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select * from secteur");
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                secteur s = new secteur((rs.getInt(1)),rs.getString(2));
                mesSecteurs.add(s);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesSecteurs; 
    }

    @Override
    public ArrayList<travailler> getAllTravailler() {
           ArrayList<travailler>mesTravailler = new ArrayList <travailler>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select * from travailler");
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                travailler t;
                t = new travailler((rs.getInt(1)),rs.getInt(2),rs.getDate(3),rs.getString(4));
                mesTravailler.add(t);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesTravailler;
    }

    @Override
    public ArrayList<visiteur> getAllVisiteur() {
                ArrayList<visiteur>mesVisiteurs = new ArrayList <visiteur>();
        try {
            maCnx=ConnexionBdd.getCnx();
            //on ecrit dans le ps la requete
            ps= maCnx.prepareStatement("select adresse_visiteur,cp_visiteur,dateembauche_visiteur,id_labo,id_secteur,id_visiteur,nom_visiteur,prenom_visiteur,ville_visiteur from visiteur");
            
            rs=ps.executeQuery();
            while(rs.next())
            {
                visiteur v;
                v = new visiteur((rs.getString(1)),rs.getInt(2),rs.getDate(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getString(7),rs.getString(8),rs.getString(9));
                mesVisiteurs.add(v);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(FonctionsMetier.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mesVisiteurs;
    }

    @Override
    public Utilisateur VerifierIdentifiants(String login, String mdp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
