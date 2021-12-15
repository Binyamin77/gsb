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
    private int id_secteur;
    
    public region(int unId, String unNom, int unIdSecteur)
    {
        id_region = unId;
        nom_region = unNom;
        id_secteur = unIdSecteur;
    }

    region(int i, String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
        /**
     * @return the idTicket
     */
    public int getIdRegion() {
        return id_region;
    }
    
    /**
     * @return the nomTicket
     */
    public String getNomRegion() {
        return nom_region;
    }
    
        /**
     * @return the dateTicket
     */
    public int getIdSecteur() {
        return id_secteur;
    }
    }

