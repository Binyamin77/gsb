/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Entity.secteur;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author IBGUI
 */
public class ModelSecteur extends AbstractTableModel{

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
    
     public void LoadDatasSecteur(ArrayList<secteur>desSecteurs){
        nomsColonnes = new String[]{"Numéro","Nom du Secteur"};
        rows = new Vector<String[]>();
        
        for (secteur a  : desSecteurs){
             rows.add(new String[] {String.valueOf(a.getIdSecteur()),a.getNomSecteur()});
        }
        fireTableDataChanged();
}
}
