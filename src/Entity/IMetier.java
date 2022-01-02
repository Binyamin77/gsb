/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;

public interface IMetier 
{
    //on ecrit ici toutes les methodes qpour aller chercher les données dans la base
    public ArrayList<Utilisateur>getAllUsers();
    //passer en parametre un id pour avoir tout ses tickets 
    public ArrayList<Ticket>getAllTicketsByIdUser(int idUser);
    //verifier si login et mdp sont vrai dans la base de donnees
    public Utilisateur VerifierIdentifiants (String login,String mdp);
    
    public ArrayList<region>getAllRegion();
    
    public ArrayList<labo>getAllLabo();
    
    public void AddLabo(String nomChef, String nomLabo);
    
    public ArrayList<secteur>getAllSecteur();
    
    public ArrayList<travailler>getAllTravailler();
    
    public ArrayList<visiteur>getAllVisiteur();
}
