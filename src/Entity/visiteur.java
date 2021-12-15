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
    private int id_secteur;
    private int id_labo;
    private Date dateembauche_visiteur;
    
    public visiteur(int unId, String unNom, String unPrenom, String unAdresse, String unCp, String unVille, int unIdSecteur, int unIdLabo, Date unDateEmbauche){
        id_visiteur = unId;
        nom_visiteur = unNom;
        prenom_visiteur = unPrenom;
        adresse_visiteur = unAdresse;
        cp_visiteur = unCp;
        ville_visiteur = unVille;
        id_secteur = unIdSecteur;
        id_labo = unIdLabo;
        dateembauche_visiteur = unDateEmbauche;
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
    public int getIdSecteur() {
        return id_secteur;
    }

    /**
     * @return the getIdLabo
     */
    public int getIdLabo() {
        return id_labo;
    }
    
        /**
     * @return the getIdSecteur
     */
    public Date getDateEmbauche() {
        return dateembauche_visiteur;
    }
}
