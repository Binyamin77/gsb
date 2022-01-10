/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Entity.labo;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author IBGUI
 */
public class ModelLabo extends AbstractTableModel{

    private String[]nomsColonnes;
    private Vector<String[]>rows;
    
    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
         return nomsColonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows.get(rowIndex)[columnIndex]; 
    }
    
    @Override
    public String getColumnName(int numColonne)
    {
        return nomsColonnes[numColonne];
    }
    
     public void LoadDatasLabo(ArrayList<labo>desLabos){
        nomsColonnes = new String[]{"Numéro","Laboratoire","Chef de Vente"};
        rows = new Vector<String[]>();
        
        for (labo a  : desLabos){
             rows.add(new String[] {String.valueOf(a.getIdLabo()),a.getNomLabo(),a.getChefVente()});
        }
        fireTableDataChanged();
}
}
