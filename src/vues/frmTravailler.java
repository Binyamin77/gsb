/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vues;

import Entity.ConnexionBdd;
import Entity.FonctionsMetier;
import model.ModelTravailler;

/**
 *
 * @author IBGUI
 */
public class frmTravailler extends javax.swing.JFrame {

    /**
     * Creates new form frmTravailler
     */FonctionsMetier fm;
    ModelTravailler mdlTravailler;
    public frmTravailler() {
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

        fondTravailler = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTravailler = new javax.swing.JTable();
        Modifier = new javax.swing.JButton();
        Ajouter = new javax.swing.JButton();
        menuTravailler = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        border = new javax.swing.JPanel();
        dashboardLab2 = new javax.swing.JLabel();
        logoLbl = new javax.swing.JLabel();
        visiteurLab = new javax.swing.JLabel();
        regionLab = new javax.swing.JLabel();
        travaillerLab = new javax.swing.JLabel();
        laboLab = new javax.swing.JLabel();
        secteurLab2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        fondTravailler.setBackground(new java.awt.Color(255, 255, 255));

        tblTravailler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblTravailler);

        Modifier.setBackground(new java.awt.Color(0, 153, 255));
        Modifier.setForeground(new java.awt.Color(255, 255, 255));
        Modifier.setText("Modifer");
        Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierActionPerformed(evt);
            }
        });

        Ajouter.setBackground(new java.awt.Color(0, 153, 255));
        Ajouter.setForeground(new java.awt.Color(255, 255, 255));
        Ajouter.setText("Ajouter");
        Ajouter.setMaximumSize(new java.awt.Dimension(75, 25));
        Ajouter.setMinimumSize(new java.awt.Dimension(75, 25));
        Ajouter.setPreferredSize(new java.awt.Dimension(75, 25));
        Ajouter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AjouterMouseClicked(evt);
            }
        });

        menuTravailler.setBackground(new java.awt.Color(255, 255, 255));
        menuTravailler.setPreferredSize(new java.awt.Dimension(150, 575));

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
        regionLab.setText("R??gions");
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

        secteurLab2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        secteurLab2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        secteurLab2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vues/Pictures/placeholderblackshapeforlocalizationonmaps_79861.png"))); // NOI18N
        secteurLab2.setText("Secteur");
        secteurLab2.setDoubleBuffered(true);
        secteurLab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secteurLab2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout menuTravaillerLayout = new javax.swing.GroupLayout(menuTravailler);
        menuTravailler.setLayout(menuTravaillerLayout);
        menuTravaillerLayout.setHorizontalGroup(
            menuTravaillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuTravaillerLayout.createSequentialGroup()
                .addGroup(menuTravaillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuTravaillerLayout.createSequentialGroup()
                        .addGroup(menuTravaillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(logoLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dashboardLab2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(laboLab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(visiteurLab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regionLab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuTravaillerLayout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuTravaillerLayout.createSequentialGroup()
                        .addGroup(menuTravaillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(secteurLab2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(travaillerLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(border, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menuTravaillerLayout.setVerticalGroup(
            menuTravaillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuTravaillerLayout.createSequentialGroup()
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
                .addComponent(secteurLab2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(travaillerLab, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(border, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Liste des travailleurs");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout fondTravaillerLayout = new javax.swing.GroupLayout(fondTravailler);
        fondTravailler.setLayout(fondTravaillerLayout);
        fondTravaillerLayout.setHorizontalGroup(
            fondTravaillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondTravaillerLayout.createSequentialGroup()
                .addComponent(menuTravailler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondTravaillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondTravaillerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(fondTravaillerLayout.createSequentialGroup()
                        .addGroup(fondTravaillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(fondTravaillerLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, fondTravaillerLayout.createSequentialGroup()
                                .addGap(694, 694, 694)
                                .addComponent(Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(423, Short.MAX_VALUE))))
        );
        fondTravaillerLayout.setVerticalGroup(
            fondTravaillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menuTravailler, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
            .addGroup(fondTravaillerLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addGroup(fondTravaillerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(284, 284, 284))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondTravailler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondTravailler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         ConnexionBdd cnx = new ConnexionBdd();
        fm = new FonctionsMetier();
        mdlTravailler = new ModelTravailler();
        
        mdlTravailler.LoadDatasTravailler(fm.getAllTravailler());
        
        tblTravailler.setModel(mdlTravailler);
    }//GEN-LAST:event_formWindowOpened

    private void AjouterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AjouterMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        frmAjouterTravailler frmAjout = new frmAjouterTravailler();
        frmAjout.setVisible(true);
    }//GEN-LAST:event_AjouterMouseClicked

    private void ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        frmModifierTravailler frmAjout = new frmModifierTravailler();
        frmAjout.setVisible(true);
    }//GEN-LAST:event_ModifierActionPerformed

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

    private void secteurLab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secteurLab2MouseClicked
        this.setVisible(false);
        frmSecteur frmAjout = new frmSecteur();
        frmAjout.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_secteurLab2MouseClicked

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
            java.util.logging.Logger.getLogger(frmTravailler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTravailler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTravailler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTravailler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTravailler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ajouter;
    private javax.swing.JButton Modifier;
    private javax.swing.JPanel border;
    private javax.swing.JLabel dashboardLab2;
    private javax.swing.JPanel fondTravailler;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel laboLab;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JPanel menuTravailler;
    private javax.swing.JLabel regionLab;
    private javax.swing.JLabel secteurLab2;
    private javax.swing.JTable tblTravailler;
    private javax.swing.JLabel travaillerLab;
    private javax.swing.JLabel visiteurLab;
    // End of variables declaration//GEN-END:variables
}
