package at4_nanual.bsit.pkg1a;

import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileWriter;

public class Update2 extends javax.swing.JFrame {
    
    private String usernameToUpdate;
    private String filePath = "src\\at4_nanual\\bsit\\pkg1a\\Data.json"; // JSON file path

    public Update2(String username) {
        initComponents();
        this.usernameToUpdate = username;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jNewPass = new javax.swing.JTextField();
        jPass = new javax.swing.JTextField();
        jOk = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        jBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Set New Password");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 38, -1, -1));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("New Password:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 126, -1, -1));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirm Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 170, -1, -1));

        jNewPass.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jNewPass.setText("Enter New Password");
        getContentPane().add(jNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 125, 182, -1));

        jPass.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jPass.setText("Enter Password");
        getContentPane().add(jPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 169, 182, -1));

        jOk.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jOk.setText("Ok");
        jOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOkActionPerformed(evt);
            }
        });
        getContentPane().add(jOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 253, -1, -1));

        jClear.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jClear.setText("Clear");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });
        getContentPane().add(jClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 253, -1, -1));

        jBack.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });
        getContentPane().add(jBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 253, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("N:\\My download files\\Personal files\\Google\\Google Chrome Themes\\28Kb.gif")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOkActionPerformed
        //Gets the newPassword and confirmPassword from the text field
        String newPassword = jNewPass.getText();
        String confirmPassword = jPass.getText();

        if (newPassword.equals(confirmPassword)) { // Checks if the new password and confirmed password match
            try {
                updatePassword(usernameToUpdate, newPassword); // Updates the password in the JSON file
                // Opens Succes3 window
                Success3 x = new Success3();
                x.setVisible(true);
                setVisible(false);
            } catch (IOException | ParseException ex) {
                JOptionPane.showMessageDialog(this, "Error updating password.");
                ex.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Passwords do not match.");
        }
    }//GEN-LAST:event_jOkActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        // Clears jNewPass and jPass field
        jNewPass.setText("");
        jPass.setText("");
    }//GEN-LAST:event_jClearActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        // Opens Update window
        Update x = new Update();
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
            java.util.logging.Logger.getLogger(Update2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Update2("testUsername").setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBack;
    private javax.swing.JButton jClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jNewPass;
    private javax.swing.JButton jOk;
    private javax.swing.JTextField jPass;
    // End of variables declaration//GEN-END:variables

    private void updatePassword(String username, String newPassword) throws IOException, ParseException {
        JSONArray userArray = readUsersFromFile();
        JSONArray updatedUserArray = new JSONArray();

        for (Object obj : userArray) {
            JSONObject userObject = (JSONObject) obj;
            String currentUsername = (String) userObject.get("username"); // Retrieves the username from the user object

            if (currentUsername.equals(username)) { // Checks if the current username matches the username to be updated
                userObject.put("password", newPassword); // Updates the password for the matching user
            }
            updatedUserArray.add(userObject);
        }
        writeUsersToFile(updatedUserArray); // Writes the updated user array back to the JSON file
    }

    private JSONArray readUsersFromFile() throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONArray userArray = new JSONArray();

        try (FileReader reader = new FileReader(filePath)) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            userArray = (JSONArray) jsonObject.get("users");
        } catch (FileNotFoundException e) {
            return new JSONArray();
        }

        return userArray;
    }

    private JSONArray writeUsersToFile(JSONArray updatedUserArray) throws IOException, ParseException {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = new JSONObject();

        try (FileReader reader = new FileReader(filePath)) {
            jsonObject = (JSONObject) parser.parse(reader); // If file exists, parses to jsonObject
        } catch (FileNotFoundException e) {
            // File doesn't exist, create a new JSONObject.
        }

        jsonObject.put("users", updatedUserArray); // Updates or sets the users array in the JSON object
        try (FileWriter file = new FileWriter(filePath)) { // Opens the file for writing
            file.write(jsonObject.toJSONString()); // Writes the updated JSON object to the file
        }
        return null;   
    }
}
