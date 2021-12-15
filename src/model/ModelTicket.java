/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Entity.Ticket;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author stelz
 */
public class ModelTicket extends AbstractTableModel{

    private String[] nomColonnes;
    private Vector<String[]> lignes;
    
    @Override
    public int getRowCount() {
        return lignes.size();
    }

    @Override
    public int getColumnCount() {
        return nomColonnes.length;
    }

     @Override
    public Object getValueAt(int rowIndex, int columnIndex) 
    {
        return lignes.get(rowIndex)[columnIndex];
    }
    
    @Override
    public String getColumnName(int numColonne)
    {
        return nomColonnes[numColonne];
    }
    
    public void LoadDats2Colonnes(ArrayList<Ticket> lesTickets ){
        
        nomColonnes = new String[]{"Numéro ticket","Nom ticket"};
        lignes = new Vector<>();
        
        for(Ticket tic : lesTickets){
            lignes.add(new String[]{String.valueOf(tic.getIdTicket()),tic.getNomTicket()});
        }
        fireTableDataChanged();
    }
     public void LoadDats4Colonnes(ArrayList<Ticket> lesTickets ){
        
        nomColonnes = new String[]{"Numéro","Nom","Date","Etat"};
        lignes = new Vector<>();
        
        for(Ticket tic : lesTickets){
            lignes.add(new String[]{String.valueOf(tic.getIdTicket()),tic.getNomTicket(),tic.getDateTicket(),tic.getEtatTicket()});
        }
        fireTableDataChanged();
    }
}
