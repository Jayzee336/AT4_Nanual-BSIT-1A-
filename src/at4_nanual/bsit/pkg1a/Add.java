package at4_nanual.bsit.pkg1a;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;

public class Add extends javax.swing.JFrame {

    /**
     * Creates new form Add
     */
    private static String usname, pass, confirm = "admin";

    private String filePath = "src\\at4_nanual\\bsit\\pkg1a\\Data.json"; // Path to your JSON file

    public Add() {
        initComponents(); // Initializes the GUI components
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        Psswrd = new javax.swing.JTextField();
        jCreate = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        jBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Confirm = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Your Account");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 40, -1, -1));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 108, -1, -1));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 153, -1, -1));

        UserName.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        UserName.setText("Enter Username");
        getContentPane().add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 107, 200, -1));

        Psswrd.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        Psswrd.setText("Enter Password");
        getContentPane().add(Psswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 152, 200, -1));

        jCreate.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jCreate.setText("Create");
        jCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCreateActionPerformed(evt);
            }
        });
        getContentPane().add(jCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 258, -1, -1));

        jClear.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jClear.setText("Clear");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });
        getContentPane().add(jClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 258, -1, -1));

        jBack.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jBack.setText("Back");
        jBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBackActionPerformed(evt);
            }
        });
        getContentPane().add(jBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 258, -1, -1));

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 198, -1, -1));

        Confirm.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        Confirm.setText("Confirm Password");
        getContentPane().add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 197, 200, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("N:\\My download files\\Personal files\\Google\\Google Chrome Themes\\28Kb.gif")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCreateActionPerformed
        // Get username, password, and confirm password from text field
        usname = UserName.getText();
        pass = Psswrd.getText();
        confirm = Confirm.getText();

        // Checks and display error if username or password is empty
        if (usname.isEmpty() || pass.isEmpty()) {
            Empty x = new Empty();
            x.setVisible(true);
            setVisible(false);
            return;
        }
        
        // Checks and display error if passwords do not match
        if (!pass.equals(confirm)){
            Unmatch x = new Unmatch();
            x.setVisible(true);
            setVisible(false);
            return;
        }

        try {
            JSONArray userArray = readUsersFromFile(); // Read existing user data

            // Check if username already exists
            for (Object obj : userArray) {
                JSONObject userObject = (JSONObject) obj;
                if (usname.equals(userObject.get("username"))) { // Checks and display error if username already exists
                    Exist2 x = new Exist2();
                    x.setVisible(true);
                    setVisible(false);
                    return;
                }
            }

            JSONObject newUser = new JSONObject();
            newUser.put("username", usname);
            newUser.put("password", pass);
            newUser.put("type", "member");

            userArray.add(newUser);

            writeUsersToFile(userArray);

            // Display success message and clear fields
            Success x = new Success();
            x.setVisible(true);
            setVisible(false);
            UserName.setText("");
            Psswrd.setText("");

        } catch (IOException | ParseException e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
            JOptionPane.showMessageDialog(this, "Error creating account.");
        }
    }//GEN-LAST:event_jCreateActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        // Clear all input fields
        UserName.setText("");
        Psswrd.setText("");
        Confirm.setText("");
    }//GEN-LAST:event_jClearActionPerformed

    private void jBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBackActionPerformed
        // Opens Admin window, closes the Add window
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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Confirm;
    private javax.swing.JTextField Psswrd;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton jBack;
    private javax.swing.JButton jClear;
    private javax.swing.JButton jCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

    private JSONArray readUsersFromFile() throws IOException, ParseException {
        // Reads users from JSON file, returns JSONArray
        JSONParser parser = new JSONParser();
        JSONArray userArray = new JSONArray();

        try (FileReader reader = new FileReader(filePath)) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            userArray = (JSONArray) jsonObject.get("users"); // Get the "users" array
        } catch (FileNotFoundException e) {
            // Handle file not found by creating a new json object with an empty users array
            return new JSONArray();
        }
        return userArray;
    }

    private void writeUsersToFile(JSONArray userArray) throws IOException, ParseException {
        // Writes users to JSON file
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = new JSONObject();

        try (FileReader reader = new FileReader(filePath)) {
            jsonObject = (JSONObject) parser.parse(reader);
        } catch (FileNotFoundException e) {
            // Creates new JSONObject if file not found
        }

        jsonObject.put("users", userArray); // Update the "users" array
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonObject.toJSONString());
        }
    }
}
