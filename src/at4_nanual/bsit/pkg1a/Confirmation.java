package at4_nanual.bsit.pkg1a;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Confirmation extends javax.swing.JFrame {
    
    private String filePath = "src\\at4_nanual\\bsit\\pkg1a\\Data.json"; // JSON file path
    private String usernameToDelete;
    private String passwordToDelete;

    public Confirmation(String usernameToDelete, String passwordToDelete) {
        initComponents();
        this.usernameToDelete = usernameToDelete;
        this.passwordToDelete = passwordToDelete;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelConfirm = new javax.swing.JLabel();
        jOk = new javax.swing.JButton();
        jCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelConfirm.setFont(new java.awt.Font("Eras Bold ITC", 1, 18)); // NOI18N
        labelConfirm.setText("Are you sure you will delete this account?");

        jOk.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jOk.setText("Ok");
        jOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOkActionPerformed(evt);
            }
        });

        jCancel.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jCancel.setText("Cancel");
        jCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(labelConfirm))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jCancel)
                        .addGap(70, 70, 70)
                        .addComponent(jOk)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labelConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jOk)
                    .addComponent(jCancel))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOkActionPerformed
        // Deletes the user account when confirming
        try {
            JSONArray userArray = readUsersFromFile();
            JSONArray updatedUserArray = new JSONArray();

            boolean userFound = false;
            for (Object obj : userArray) {
                JSONObject userObject = (JSONObject) obj;
                String username = (String) userObject.get("username");
                String password = (String) userObject.get("password");

                if (!username.equals(usernameToDelete) || !password.equals(passwordToDelete)) {
                    updatedUserArray.add(userObject);
                } else {
                    userFound = true;
                }
            }

            if (userFound) {
                writeUsersToFile(updatedUserArray); // Write updated user list to file
                // Opens Success2 window
                Success2 x = new Success2(); 
                x.setVisible(true);
                setVisible(false);
            } else {
                // Opens NotFound window
                NotFound x = new NotFound();
                x.setVisible(true);
                setVisible(false);
            }

        } catch (IOException | ParseException e) {
            JOptionPane.showMessageDialog(this, "Error deleting account.");
        }
    }//GEN-LAST:event_jOkActionPerformed

    private void jCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCancelActionPerformed
        // Opens Delete window
        Delete x = new Delete();
        x.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jCancelActionPerformed

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
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String username = "username";
            String password = "password";

            new Confirmation(username, password).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancel;
    private javax.swing.JButton jOk;
    private javax.swing.JLabel labelConfirm;
    // End of variables declaration//GEN-END:variables

    private JSONArray readUsersFromFile() throws FileNotFoundException, IOException, ParseException {
        // Reads users from JSON file
        JSONParser parser = new JSONParser();
        JSONArray userArray = new JSONArray();

        try (FileReader reader = new FileReader(filePath)) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            userArray = (JSONArray) jsonObject.get("users");
        }
        return userArray;
    }

    private void writeUsersToFile(JSONArray updatedUserArray) throws IOException {
        // Writes updated user list to JSON file
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("users", updatedUserArray);
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonObject.toJSONString());
        }
    }
}
