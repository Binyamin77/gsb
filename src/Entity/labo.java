/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *  
 * @author IBGUI
 */
public class labo { //On déclare la classe et le type des variables
    private int id_labo; 
    private String nom_labo;
    private String chefvente_labo;
    
    /**
     * @author alain
     * @param unChefVente correspond à polo
     * @param unId
     * @param unNom 
     * 
     */
    public labo(String unChefVente, int unId, String unNom)
    { //On déclare le constructeur 
        chefvente_labo = unChefVente;
        id_labo = unId;
        nom_labo = unNom;
    }
    
        /**
     * @return the idLabo
     */
    //On déclare les méthodes get
    public int getIdLabo() 
    {
        return id_labo;
    }
    
    /**
     * @return the nomLabo
     */
    public String getNomLabo() 
    {
        return nom_labo;
    }
    
        /**
     * @return the dateChefVente
     */
    public String getChefVente()
    {
        return chefvente_labo;
    }
    }

