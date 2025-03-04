package at4_nanual.bsit.pkg1a;

public class Admin extends javax.swing.JFrame {
    
    public Admin() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLogout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jAdd = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jDelete = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jUpdate = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome Admin");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 129, -1, -1));

        jLogout.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLogout.setText("Log Out");
        jLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 199, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("N:\\My download files\\Personal files\\Google\\Google Chrome Themes\\28Kb.gif")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 280));

        jMenuBar1.setBackground(new java.awt.Color(30, 30, 30));

        jMenu1.setText("Add");

        jAdd.setText("Add Student");
        jAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddActionPerformed(evt);
            }
        });
        jMenu1.add(jAdd);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Delete");

        jDelete.setText("Delete Student");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });
        jMenu2.add(jDelete);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Update");

        jUpdate.setText("Update Student");
        jUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUpdateActionPerformed(evt);
            }
        });
        jMenu3.add(jUpdate);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutActionPerformed
        // Opens Login window, closes Admin window
        Login x = new Login();
        x.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jLogoutActionPerformed

    private void jAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddActionPerformed
        // Opens Add student window, closes Admin window
        Add x = new Add();
        x.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jAddActionPerformed

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        // Opens Delete student window, closes Admin window
        Delete x = new Delete();
        x.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUpdateActionPerformed
        // Opens Update student window, closes Admin window
        Update x = new Update();
        x.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jUpdateActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jAdd;
    private javax.swing.JMenuItem jDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jLogout;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem jUpdate;
    // End of variables declaration//GEN-END:variables
}