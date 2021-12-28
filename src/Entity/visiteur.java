/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.text.DateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class visiteur {
    
    private int id_visiteur;
    private String nom_visiteur;
    private String prenom_visiteur;
    private String adresse_visiteur;
    private String cp_visiteur;
    private String ville_visiteur;
    private String id_secteur;
    private String id_labo;
    private Date dateembauche_visiteur;
    
    public visiteur(String unAdresse,String unCp,Date unDateEmbauche,String unIdLabo, String unIdSecteur, int unId, String unNom, String unPrenom, String unVille){
        adresse_visiteur = unAdresse;
        cp_visiteur = unCp;
        dateembauche_visiteur = unDateEmbauche;
        id_labo = unIdLabo;
        id_secteur = unIdSecteur;
        id_visiteur = unId;
        nom_visiteur = unNom;
        prenom_visiteur = unPrenom;
        ville_visiteur = unVille;
    }

    /**
     * @return the getIdVisiteur
     */
    public int getIdVisiteur() {
        return id_visiteur;
    }

    /**
     * @return the getNomVisiteur
     */
    public String getNomVisiteur() {
        return nom_visiteur;
    }

    /**
     * @return the getPrenomVisiteur
     */
    public String getPrenomVisiteur() {
        return prenom_visiteur;
    }

    /**
     * @return the getAdresseVisiteur
     */
    public String getAdresseVisiteur() {
        return adresse_visiteur;
    }

    /**
     * @return the getCpVisiteur
     */
    public String getCpVisiteur() {
        return cp_visiteur;
    }

    /**
     * @return the getVilleVisiteur
     */
    public String getVilleVisiteur() {
        return ville_visiteur;
    }

    /**
     * @return the getIdSecteur
     */
    public String getIdSecteur() {
        return id_secteur;
    }

    /**
     * @return the getIdLabo
     */
    public String getIdLabo() {
        return id_labo;
    }
    
        /**
     * @return the getIdSecteur
     */
    public Date getDateEmbauche() {
        return dateembauche_visiteur;
    }
}
