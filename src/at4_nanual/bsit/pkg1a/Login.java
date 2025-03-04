package at4_nanual.bsit.pkg1a;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Login extends javax.swing.JFrame {
    
    private static String usname, pass, type = "admin"; // User credentials and type

    private static String filepath = "src\\at4_nanual\\bsit\\pkg1a\\Data.json"; // JSON file path
    private static JSONParser jsonParser = new JSONParser();
    private static JSONObject record = new JSONObject();
    private static JSONArray userlist = new JSONArray();

    public Login() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLogin = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        Psswrd = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        UserName.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        UserName.setText("Enter Username");
        getContentPane().add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 177, -1));

        jLogin.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLogin.setText("Login");
        jLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        jClear.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jClear.setText("Clear");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });
        getContentPane().add(jClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        Psswrd.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        Psswrd.setText("Enter Password");
        Psswrd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PsswrdActionPerformed(evt);
            }
        });
        getContentPane().add(Psswrd, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 177, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("N:\\My download files\\Personal files\\Google\\Google Chrome Themes\\28Kb.gif")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLoginActionPerformed
        try {
            usname = UserName.getText();
            pass = Psswrd.getText();

            filecheck(); // Checks and loads user data from file

            boolean loginSuccessful = false;
            String userType = null;
            for (int a = 0; a < userlist.size(); a++) {
                JSONObject userobject = (JSONObject) userlist.get(a);
                // Get the username, password, and user type from the user object
                String foundusname = (String) userobject.get("username");
                String foundpass = (String) userobject.get("password");
                String foundtype = (String) userobject.get("type");

                if (usname.equals(foundusname) && pass.equals(foundpass)) { // Check if the entered credentials match the stored credentials
                    loginSuccessful = true;
                    userType = foundtype;
                    break;
                }
            }

            if (!loginSuccessful) {
                // Opens Exist window if login fails
                Exist b = new Exist();
                b.setVisible(true);
                setVisible(false);
            } else {
                if ("admin".equalsIgnoreCase(userType)) {
                    // Opens Admin window
                    Admin x = new Admin();
                    x.setVisible(true);
                    setVisible(false);
                } else if ("member".equalsIgnoreCase(userType)) {
                    // Opens Member window
                    Member a = new Member();
                    a.setVisible(true);
                    setVisible(false);
                }
            }

        } catch (Exception e) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jLoginActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
        // Clears UserName and Password field
        UserName.setText("");
        Psswrd.setText("");
    }//GEN-LAST:event_jClearActionPerformed

    private void PsswrdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PsswrdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PsswrdActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Psswrd;
    private javax.swing.JTextField UserName;
    private javax.swing.JButton jClear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jLogin;
    // End of variables declaration//GEN-END:variables

    public void filecheck() throws FileNotFoundException, IOException, ParseException {
        FileReader reader = new FileReader(filepath);

        if (reader.ready()) {
            Scanner scan = new Scanner(reader);
            String line = "";

            while (scan.hasNext()) {
                line = line + scan.nextLine();
            }

            if (!line.equals("")) {
                reader.close();
                FileReader reader2 = new FileReader(filepath);
                record = (JSONObject) jsonParser.parse(reader2);
                userlist = (JSONArray) record.get("users");
                reader2.close();
            }
        }
    }
}