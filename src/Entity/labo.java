/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *  
 * @author IBGUI
 */
public class labo {
    private int id_labo;
    private String nom_labo;
    private String chefvente_labo;
    
    public labo(String unChefVente, int unId, String unNom)
    {
        chefvente_labo = unChefVente;
        id_labo = unId;
        nom_labo = unNom;
       
        
    }
    
        /**
     * @return the idTicket
     */
    public int getIdLabo() {
        return id_labo;
    }
    
    /**
     * @return the nomTicket
     */
    public String getNomLabo() {
        return nom_labo;
    }
    
        /**
     * @return the dateTicket
     */
    public String getChefVente() {
        return chefvente_labo;
    }
    }

