package at4_nanual.bsit.pkg1a;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Update extends javax.swing.JFrame {
    
    private String filePath = "src\\at4_nanual\\bsit\\pkg1a\\Data.json";
    
    public Update() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jOk = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        jBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Update Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 36, -1, -1));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        UserName.setFont(new java.awt.Font("Eras Bold ITC", 0, 12)); // NOI18N
        UserName.setText("Enter Username");
        getContentPane().add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 170, -1));

        jOk.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jOk.setText("Ok");
        jOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOkActionPerformed(evt);
            }
        });
        getContentPane().add(jOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, -1, -1));

        jClear.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jClear.setText("Clear");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });
        getContentPane().add(jClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, -1));

        jBack.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });
        getContentPane().add(jBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("N:\\My download files\\Personal files\\Google\\Google Chrome Themes\\28Kb.gif")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        // Opens Admin window
        Admin x = new Admin();
        x.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jBackActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        // Clears UserName field
        UserName.setText("");
    }//GEN-LAST:event_jClearActionPerformed

    private void jOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOkActionPerformed
        String username = UserName.getText();
        if (!username.isEmpty()) { // Check if the username field is not empty
            if (userExists(username)) { // Check if the user exists
                // Opens Update2 window if user does not exist
                Update2 x = new Update2(username);
                x.setVisible(true);
                setVisible(false);
            } else {
                // Opens NotFound window if the username field is empty
                NotFound2 x = new NotFound2();
                x.setVisible(true);
                setVisible(false);
            }
        } else {
            // Opens Empty2 window if the username field is empty
            Empty2 x = new Empty2();
            x.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_jOkActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField UserName;
    private javax.swing.JButton jBack;
    private javax.swing.JButton jClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jOk;
    // End of variables declaration//GEN-END:variables

    private boolean userExists(String username) {
        try {
            JSONArray userArray = readUsersFromFile(); // Reads user data from the JSON file
            for (Object obj : userArray) {
                JSONObject userObject = (JSONObject) obj;
                String currentUsername = (String) userObject.get("username");
                if (currentUsername.equals(username)) { // Checks if the username exists in the user array
                    return true;
                }
            }
            return false;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            return false;
        }
    }

    private JSONArray readUsersFromFile() throws IOException, ParseException {
        // Reads the user data from the JSON file
        JSONParser parser = new JSONParser();
        JSONArray userArray = new JSONArray();

        try (FileReader reader = new FileReader(filePath)) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            userArray = (JSONArray) jsonObject.get("users");
        } catch (FileNotFoundException e) {
            return new JSONArray(); // Returns an empty JSONArray if the file is not found
        }

        return userArray;
    }
}
