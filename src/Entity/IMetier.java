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
 
    
    public ArrayList<region>getAllRegion();
    
    public void AddRegion(String cbSecteur, String nomRegion);
    
    public void ModifRegion(int idRegion,String cbSecteur, String nomRegion) ;

    public ArrayList<labo>getAllLabo();
    
    public void AddLabo(String nomChef, String nomLabo);
    
    public void ModifLabo(int idLabo, String nomChef, String nomLabo);
    
    public ArrayList<secteur>getAllSecteur();
    
    public void ModifSecteur(int idSecteur,String nomSecteur) ;

    public void AddSecteur(String nomSecteur);
    
    public ArrayList<travailler>getAllTravailler();
    
    public void ModifTravailler(String cbVisiteur, String cbRegion, String dateTravailler ,String roleTravailler) ;
    
    public void AddTravailler(String cbVisiteur, String cbRegion, String dateTravailler ,String roleTravailler); 

    public ArrayList<visiteur>getAllVisiteur();
    
    public void ModifVisiteur(String adresseVisiteur,String cpVisiteur,String dateEmbauche, String cbLabo, String cbSecteur,int IdVisiteur, String nomVisiteur, String prenomVisiteur, String villeVisiteur) ;
    
    public void AddVisiteur(String adresseVisiteur,String cpVisiteur, String dateEmbauche, String cbLabo, String cbSecteur, String nomVisiteur, String prenomVisiteur, String villeVisiteur);

}
