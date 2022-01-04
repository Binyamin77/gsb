/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Entity.region;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author IBGUI
 */
public class ModelRegion extends AbstractTableModel{

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
    
     public void LoadDatasRegion(ArrayList<region>desRegions){
        nomsColonnes = new String[]{"Num","Secteurs","Regions"};
        rows = new Vector<String[]>();
        
        for (region a  : desRegions){
             rows.add(new String[] {String.valueOf(a.getIdRegion()),a.getIdSecteur(),a.getNomRegion()});
        }
        fireTableDataChanged();
}
     
          public void LoadDatasRegionLISTSECTEUR(ArrayList<region>desRegions){
        nomsColonnes = new String[]{"Secteurs"};
        rows = new Vector<String[]>();
        
        for (region a  : desRegions){
             rows.add(new String[] {a.getIdSecteur()});
        }
        fireTableDataChanged();
}
}
