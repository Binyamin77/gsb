/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author IBGUI
 */
public class secteur {
     private int id_secteur;
     private String nom_secteur;

    /**
     * 
     * @param unId
     * @param unNom 
     */
    public secteur(int unId, String unNom)
    {
        id_secteur = unId;
        nom_secteur = unNom;
    
    }
    
        /**
     * @return the idSecteur
     */
    public int getIdSecteur() {
        return id_secteur;
    }
    
    /**
     * @return the nomSecteur
     */
    public String getNomSecteur() {
        return nom_secteur;
    }
    
    }

