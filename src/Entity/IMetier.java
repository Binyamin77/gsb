/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.ListModel;

public interface IMetier 
{
    //on ecrit ici toutes les methodes qpour aller chercher les données dans la base
    public ArrayList<Utilisateur>getAllUsers();
    //passer en parametre un id pour avoir tout ses tickets 
    public ArrayList<Ticket>getAllTicketsByIdUser(int idUser);
    //verifier si login et mdp sont vrai dans la base de donnees
    public Utilisateur VerifierIdentifiants (String login,String mdp);
    
    public ArrayList<region>getAllRegion();
    
    public void AddRegion(String cbSecteur, String nomRegion);

    public ArrayList<labo>getAllLabo();
    
    public void AddLabo(String nomChef, String nomLabo);
    
    public void ModifLabo(int idLabo, String nomChef, String nomLabo);

    
    public ArrayList<secteur>getAllSecteur();
    
    public void AddSecteur(String nomSecteur);
    
    public ArrayList<travailler>getAllTravailler();
    
    public void AddTravailler(String cbVisiteur, String cbLabo, String dateTravailler ,String roleTravailler); 

    public ArrayList<visiteur>getAllVisiteur();
    
    public void AddVisiteur(String adresseVisiteur,String cpVisiteur, String dateEmbauche, String cbLabo, String cbSecteur, String nomVisiteur, String prenomVisiteur, String villeVisiteur);

}
