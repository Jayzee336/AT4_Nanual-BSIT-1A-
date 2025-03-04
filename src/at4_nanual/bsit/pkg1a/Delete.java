package at4_nanual.bsit.pkg1a;

import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Delete extends javax.swing.JFrame {

    private String filePath = "src\\at4_nanual\\bsit\\pkg1a\\Data.json";

    public Delete() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jDelete = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        jBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Delete Account");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 28, -1, -1));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        UserName.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        UserName.setText("Enter Username");
        getContentPane().add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 210, -1));

        jDelete.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jDelete.setText("Delete");
        jDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, -1, -1));

        jClear.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jClear.setText("Clear");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });
        getContentPane().add(jClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        jBack.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });
        getContentPane().add(jBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        Password.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        Password.setText("Enter Password");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 175, 210, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("N:\\My download files\\Personal files\\Google\\Google Chrome Themes\\28Kb.gif")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDeleteActionPerformed
        String usernameToDelete = UserName.getText();
        String passwordToDelete = new String(Password.getText()); // Get password

        if (usernameToDelete.isEmpty() || passwordToDelete.isEmpty()) {
            // Opens NotFound window error if fields are empty
            NotFound x = new NotFound();
            x.setVisible(true);
            setVisible(false);
            return;
        }
        // Opens Confirmation window with username and password
        Confirmation x = new Confirmation(usernameToDelete, passwordToDelete); // Pass username and password
        x.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jDeleteActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        // Clears UserName and Password field
        UserName.setText("");
        Password.setText("");
    }//GEN-LAST:event_jClearActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        // Opens admin window
        Admin x = new Admin();
        x.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBackActionPerformed

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
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Password;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton jBack;
    private javax.swing.JButton jClear;
    private javax.swing.JButton jDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private JSONArray readUsersFromFile() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONArray userArray = new JSONArray();

        try (FileReader reader = new FileReader(filePath)) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            userArray = (JSONArray) jsonObject.get("users");
        }
        return userArray;
    }
}
