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
public class travailler {
    
    private String id_visiteur;
    private String id_region;
    private Date jjmmaa_travailler;
    private String role_travailler;

  
    
    
    public travailler(String unId, String unIdRegion,Date unDateEmbauche, String unRole){
        id_visiteur = unId;
        id_region = unIdRegion;
        jjmmaa_travailler = unDateEmbauche;
        role_travailler = unRole;
    }

    /**
     * @return the getIdVisiteur
     */
    public String getIdVisiteur() {
        return id_visiteur;
    }

    /**
     * @return the getIdRegion
     */
    public String getIdRegion() {
        return id_region;
    }

   /**
     * @return the getDateTravaille
     */
    public Date getDateTravaille() {
        return jjmmaa_travailler;
    }

    /**
     * @return the getRoleTravailler
     */
    public String getRoleTravailler() {
        return role_travailler;
    }
}
