/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

public class Ticket 
{
    private int idTicket;
    private String nomTicket;
    private String dateTicket;
    private String etatTicket;
    
    public Ticket(int unId,String unNom,String uneDate,String unEtat)
    {
        idTicket=unId;
        nomTicket=unNom;
        dateTicket=uneDate;
        etatTicket=unEtat;
    }

    /**
     * @return the idTicket
     */
    public int getIdTicket() {
        return idTicket;
    }

    /**
     * @return the nomTicket
     */
    public String getNomTicket() {
        return nomTicket;
    }

    /**
     * @return the dateTicket
     */
    public String getDateTicket() {
        return dateTicket;
    }

    /**
     * @return the etatTicket
     */
    public String getEtatTicket() {
        return etatTicket;
    }
    
}
