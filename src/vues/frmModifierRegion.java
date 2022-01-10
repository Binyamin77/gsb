/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vues;

import Entity.ConnexionBdd;
import Entity.FonctionsMetier;
import Entity.secteur;
import javax.swing.JOptionPane;
import model.ModelRegion;

/**
 *
 * @author IBGUI
 */
public class frmModifierRegion extends javax.swing.JFrame {

    /**
     * Creates new form frmModifierRegion
     */FonctionsMetier fm;
       ModelRegion mdlRegion;
       
    public frmModifierRegion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondModifierRegion = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegionM = new javax.swing.JTable();
        secteurRegionPnl = new javax.swing.JLabel();
        nomRegion = new javax.swing.JLabel();
        modifierRegion = new javax.swing.JButton();
        modifierRegionTitle = new javax.swing.JLabel();
        nomRegionM = new javax.swing.JTextField();
        cbSecteur = new javax.swing.JComboBox<>();
        returnBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        border = new javax.swing.JPanel();
        dashboardLab2 = new javax.swing.JLabel();
        logoLbl = new javax.swing.JLabel();
        visiteurLab = new javax.swing.JLabel();
        regionLab = new javax.swing.JLabel();
        travaillerLab = new javax.swing.JLabel();
        laboLab = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        fondModifierRegion.setBackground(new java.awt.Color(255, 255, 255));

        tblRegionM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRegionM.setGridColor(new java.awt.Color(255, 255, 255));
        tblRegionM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRegionMMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblRegionM);

        secteurRegionPnl.setText("Secteur de la region :");

        nomRegion.setText("Nom Region :");

        modifierRegion.setBackground(new java.awt.Color(0, 153, 255));
        modifierRegion.setForeground(new java.awt.Color(255, 255, 255));
        modifierRegion.setText("Enregistrer");
        modifierRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modifierRegionMouseClicked(evt);
            }
        });

        modifierRegionTitle.setBackground(new java.awt.Color(255, 255, 255));
        modifierRegionTitle.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        modifierRegionTitle.setForeground(new java.awt.Color(0, 153, 0));
        modifierRegionTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        modifierRegionTitle.setText("Modifier Region");
        modifierRegionTitle.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cbSecteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSecteurActionPerformed(evt);
            }
        });

        returnBtn.setBackground(new java.awt.Color(0, 153, 255));
        returnBtn.setForeground(new java.awt.Color(255, 255, 255));
        returnBtn.setText("Retour");
        returnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnBtnActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 575));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 3));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 123, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        border.setBackground(new java.awt.Color(255, 204, 51));
        border.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout borderLayout = new javax.swing.GroupLayout(border);
        border.setLayout(borderLayout);
        borderLayout.setHorizontalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        borderLayout.setVerticalGroup(
            borderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        dashboardLab2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        dashboardLab2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardLab2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vues/Pictures/home_icon-icons.com_73532.png"))); // NOI18N
        dashboardLab2.setText("Dashboard");
        dashboardLab2.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        dashboardLab2.setDisabledIcon(null);
        dashboardLab2.setInheritsPopupMenu(false);
        dashboardLab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardLab2MouseClicked(evt);
            }
        });

        logoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vues/Pictures/SANOFI.png"))); // NOI18N
        logoLbl.setToolTipText("");

        visiteurLab.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        visiteurLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        visiteurLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vues/Pictures/3289576-individual-man-people-person_107097.png"))); // NOI18N
        visiteurLab.setText("Visiteurs");
        visiteurLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                visiteurLabMouseClicked(evt);
            }
        });

        regionLab.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        regionLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        regionLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vues/Pictures/icons8-application-scientifique-32.png"))); // NOI18N
        regionLab.setText("Régions");
        regionLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                regionLabMouseClicked(evt);
            }
        });

        travaillerLab.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        travaillerLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        travaillerLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vues/Pictures/work-briefcase_icon-icons.com_72464.png"))); // NOI18N
        travaillerLab.setText("Travailler");
        travaillerLab.setDoubleBuffered(true);
        travaillerLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                travaillerLabMouseClicked(evt);
            }
        });

        laboLab.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        laboLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        laboLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vues/Pictures/icons8-application-scientifique-32.png"))); // NOI18N
        laboLab.setText("Laboratoire");
        laboLab.setPreferredSize(new java.awt.Dimension(101, 32));
        laboLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laboLabMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logoLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dashboardLab2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laboLab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(visiteurLab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regionLab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(travaillerLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(border, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(logoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(dashboardLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(laboLab, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(visiteurLab, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(regionLab, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(travaillerLab, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondModifierRegionLayout = new javax.swing.GroupLayout(fondModifierRegion);
        fondModifierRegion.setLayout(fondModifierRegionLayout);
        fondModifierRegionLayout.setHorizontalGroup(
            fondModifierRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondModifierRegionLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(fondModifierRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modifierRegionTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1476, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(fondModifierRegionLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(fondModifierRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondModifierRegionLayout.createSequentialGroup()
                                .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(fondModifierRegionLayout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGroup(fondModifierRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(fondModifierRegionLayout.createSequentialGroup()
                                        .addGap(58, 58, 58)
                                        .addGroup(fondModifierRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(nomRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(secteurRegionPnl))
                                        .addGap(104, 104, 104)
                                        .addGroup(fondModifierRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nomRegionM, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(fondModifierRegionLayout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(modifierRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(362, 362, 362))))))
        );
        fondModifierRegionLayout.setVerticalGroup(
            fondModifierRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondModifierRegionLayout.createSequentialGroup()
                .addComponent(modifierRegionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondModifierRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondModifierRegionLayout.createSequentialGroup()
                        .addGroup(fondModifierRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(fondModifierRegionLayout.createSequentialGroup()
                                .addGroup(fondModifierRegionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nomRegionM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nomRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addComponent(cbSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(secteurRegionPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addComponent(modifierRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondModifierRegionLayout.createSequentialGroup()
                        .addComponent(returnBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondModifierRegion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondModifierRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ConnexionBdd cnx = new ConnexionBdd();
        fm = new FonctionsMetier();
        mdlRegion = new ModelRegion();
        
        mdlRegion.LoadDatasRegion(fm.getAllRegion());
        
        tblRegionM.setModel(mdlRegion);
        
        for (secteur s : fm.getAllSecteur())
        {
        
            cbSecteur.addItem(s.getNomSecteur());
        }
    }//GEN-LAST:event_formWindowOpened

    private void modifierRegionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modifierRegionMouseClicked
        // TODO add your handling code here:
        ConnexionBdd cnx = new ConnexionBdd();
        fm = new FonctionsMetier();
        
        int IdRegion = Integer.parseInt(tblRegionM.getValueAt(tblRegionM.getSelectedRow(), 0).toString());;

        fm.ModifRegion(IdRegion,cbSecteur.getSelectedItem().toString(), nomRegionM.getText());

        Actualisation();
        
        JOptionPane.showMessageDialog(this,"Votre modification a été rélisé avec succés");


    }//GEN-LAST:event_modifierRegionMouseClicked

    
        private void Actualisation()
    {
        
        ConnexionBdd cnx = new ConnexionBdd();
        fm = new FonctionsMetier();
        ModelRegion reg = new ModelRegion();
        
        reg.LoadDatasRegion(fm.getAllRegion());
        tblRegionM.setModel(reg);
        
    
    }
    private void returnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        frmRegion frmAjout = new frmRegion();
        frmAjout.setVisible(true);
    }//GEN-LAST:event_returnBtnActionPerformed

    private void cbSecteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSecteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSecteurActionPerformed

    private void tblRegionMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRegionMMouseClicked
        // TODO add your handling code here:
         /*String sect = tblRegionM.getValueAt(tblRegionM.getSelectedRow(), 1).toString();
         cbSecteur.getSelectedItem().toString();*/
        
        String nomRegion = tblRegionM.getValueAt(tblRegionM.getSelectedRow(), 2).toString();
        nomRegionM.setText(nomRegion);
        
        String secteur = tblRegionM.getValueAt(tblRegionM.getSelectedRow(), 1).toString();
        cbSecteur.setSelectedItem(secteur);
        
    }//GEN-LAST:event_tblRegionMMouseClicked

    private void dashboardLab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLab2MouseClicked
        this.setVisible(false);
        frmDashbord frmAjout = new frmDashbord();
        frmAjout.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardLab2MouseClicked

    private void visiteurLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_visiteurLabMouseClicked
        this.setVisible(false);
        frmVisiteur frmAjout = new frmVisiteur();
        frmAjout.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_visiteurLabMouseClicked

    private void regionLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_regionLabMouseClicked

        this.setVisible(false);
        frmRegion frmAjout = new frmRegion();
        frmAjout.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_regionLabMouseClicked

    private void travaillerLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_travaillerLabMouseClicked
        this.setVisible(false);
        frmTravailler frmAjout = new frmTravailler();
        frmAjout.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_travaillerLabMouseClicked

    private void laboLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laboLabMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        frmLabo frmAjout = new frmLabo();
        frmAjout.setVisible(true);
    }//GEN-LAST:event_laboLabMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmModifierRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmModifierRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmModifierRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmModifierRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmModifierRegion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel border;
    private javax.swing.JComboBox<String> cbSecteur;
    private javax.swing.JLabel dashboardLab2;
    private javax.swing.JPanel fondModifierRegion;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel laboLab;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JButton modifierRegion;
    private javax.swing.JLabel modifierRegionTitle;
    private javax.swing.JLabel nomRegion;
    private javax.swing.JTextField nomRegionM;
    private javax.swing.JLabel regionLab;
    private javax.swing.JButton returnBtn;
    private javax.swing.JLabel secteurRegionPnl;
    private javax.swing.JTable tblRegionM;
    private javax.swing.JLabel travaillerLab;
    private javax.swing.JLabel visiteurLab;
    // End of variables declaration//GEN-END:variables
}
