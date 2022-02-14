/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author IBGUI
 */
public class region {
     private int id_region;
    private String nom_region;
    private String id_secteur;
    
    public region(int unId,String unIdSecteur, String unNom )
    {
        id_region = unId;
        id_secteur = unIdSecteur;
        nom_region = unNom;
        
    }

    region(int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        /**
     * @return the idRegion
     */
    public int getIdRegion() {
        return id_region;
    }
    
    /**
     * @return the nomRegion
     */
    public String getNomRegion() {
        return nom_region;
    }
    
        /**
     * @return the idSecteur
     */
    public String getIdSecteur() {
        return id_secteur;
    }
    }

