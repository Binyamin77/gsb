/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Entity.visiteur;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author IBGUI
 */
public class ModelVisiteur extends AbstractTableModel{

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
    
     public void LoadDatasVisiteur(ArrayList<visiteur>desVisiteurs){
        nomsColonnes = new String[]{"Id","Nom","Prenom","Ville","Cp","Adresse","Secteur","Labo","Date Embauche"};
        rows = new Vector<String[]>();
        
        for (visiteur a  : desVisiteurs){
             rows.add(new String[] {String.valueOf(a.getIdVisiteur()),a.getNomVisiteur(),a.getPrenomVisiteur(),a.getVilleVisiteur(),a.getCpVisiteur(),a.getAdresseVisiteur(),String.valueOf(a.getIdSecteur()),String.valueOf(a.getIdLabo()),String.valueOf(a.getDateEmbauche())});
        }
        fireTableDataChanged();
}
}
