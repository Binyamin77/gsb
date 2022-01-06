/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vues;

import Entity.ConnexionBdd;
import Entity.FonctionsMetier;

/**
 *
 * @author IBGUI
 */
public class frmAjouterSecteur extends javax.swing.JFrame {

    /**
     * Creates new form frmAjouterSecteur
     */FonctionsMetier fm;
    public frmAjouterSecteur() {
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

        fondAddSecteur = new javax.swing.JPanel();
        enregistrerSecteur = new javax.swing.JButton();
        nomSecteur = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Retour = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        visiteurLab = new javax.swing.JLabel();
        regionLab = new javax.swing.JLabel();
        travaillerLab = new javax.swing.JLabel();
        laboLab = new javax.swing.JLabel();
        dashboardLab = new javax.swing.JLabel();
        logoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fondAddSecteur.setBackground(new java.awt.Color(255, 255, 255));

        enregistrerSecteur.setBackground(new java.awt.Color(0, 153, 255));
        enregistrerSecteur.setForeground(new java.awt.Color(255, 255, 255));
        enregistrerSecteur.setText("Enregistrer");
        enregistrerSecteur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enregistrerSecteurMouseClicked(evt);
            }
        });
        enregistrerSecteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enregistrerSecteurActionPerformed(evt);
            }
        });

        jLabel3.setText("Nom du Secteur :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ajouter un Secteur");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Retour.setBackground(new java.awt.Color(0, 153, 255));
        Retour.setForeground(new java.awt.Color(255, 255, 255));
        Retour.setText("Retour");
        Retour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        dashboardLab.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        dashboardLab.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardLab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vues/Pictures/home_icon-icons.com_73532.png"))); // NOI18N
        dashboardLab.setText("Dashboard");
        dashboardLab.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);
        dashboardLab.setDisabledIcon(null);
        dashboardLab.setInheritsPopupMenu(false);
        dashboardLab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardLabMouseClicked(evt);
            }
        });

        logoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vues/Pictures/SANOFI.png"))); // NOI18N
        logoLbl.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboardLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(visiteurLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(logoLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(regionLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(travaillerLab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(laboLab, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(logoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(dashboardLab, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(laboLab, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(visiteurLab, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(regionLab, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(travaillerLab, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout fondAddSecteurLayout = new javax.swing.GroupLayout(fondAddSecteur);
        fondAddSecteur.setLayout(fondAddSecteurLayout);
        fondAddSecteurLayout.setHorizontalGroup(
            fondAddSecteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondAddSecteurLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(fondAddSecteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondAddSecteurLayout.createSequentialGroup()
                        .addGroup(fondAddSecteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondAddSecteurLayout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(98, 98, 98)
                                .addComponent(nomSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondAddSecteurLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Retour, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondAddSecteurLayout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(enregistrerSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(282, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondAddSecteurLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        fondAddSecteurLayout.setVerticalGroup(
            fondAddSecteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondAddSecteurLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(Retour)
                .addGap(83, 83, 83)
                .addGroup(fondAddSecteurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(enregistrerSecteur, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondAddSecteur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondAddSecteur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enregistrerSecteurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enregistrerSecteurMouseClicked
        // TODO add your handling code here:
        ConnexionBdd cnx = new ConnexionBdd();
        fm = new FonctionsMetier();
        fm.AddSecteur(nomSecteur.getText());

        this.setVisible(false);
        frmSecteur frmAjout = new frmSecteur();
        frmAjout.setVisible(true);
        // labo l = fm.AddLabo(nomChef.getText(),nomLabo.getText());
        /* if(unLabo !=null)
        {
            if (unLabo.getNomLabo().compareTo("'+nomLabo+'") == nomLabo.getText())
            {
                //si il est admin
                frmAdministrateur frm= new frmAdministrateur();
                frm.setVisible(true);
            }*/
    }//GEN-LAST:event_enregistrerSecteurMouseClicked

    private void enregistrerSecteurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enregistrerSecteurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enregistrerSecteurActionPerformed

    private void RetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RetourActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        frmSecteur frmAjout = new frmSecteur();
        frmAjout.setVisible(true);
    }//GEN-LAST:event_RetourActionPerformed

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

    private void dashboardLabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardLabMouseClicked
        this.setVisible(false);
        frmDashbord frmAjout = new frmDashbord();
        frmAjout.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_dashboardLabMouseClicked

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
            java.util.logging.Logger.getLogger(frmAjouterSecteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAjouterSecteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAjouterSecteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAjouterSecteur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAjouterSecteur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Retour;
    private javax.swing.JLabel dashboardLab;
    private javax.swing.JButton enregistrerSecteur;
    private javax.swing.JPanel fondAddSecteur;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel laboLab;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JTextField nomSecteur;
    private javax.swing.JLabel regionLab;
    private javax.swing.JLabel travaillerLab;
    private javax.swing.JLabel visiteurLab;
    // End of variables declaration//GEN-END:variables
}
