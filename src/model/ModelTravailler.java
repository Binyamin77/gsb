/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Entity.travailler;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author IBGUI
 */
public class ModelTravailler extends AbstractTableModel{

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
    
     public void LoadDatasTravailler(ArrayList<travailler>desTravailler){
        nomsColonnes = new String[]{"Nom","Regions","Date de Travaille","Rôle"};
        rows = new Vector<String[]>();
        
        for (travailler a  : desTravailler){
             rows.add(new String[] {a.getIdVisiteur(),a.getIdRegion(),String.valueOf(a.getDateTravaille()),a.getRoleTravailler()});
        }
        fireTableDataChanged();
}
}
