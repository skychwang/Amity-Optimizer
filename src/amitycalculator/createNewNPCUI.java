package amitycalculator;
//Importing external libraries
import java.io.*;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class createNewNPCUI extends javax.swing.JFrame {//Class for the "creating a new npc" UI.

    public createNewNPCUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        newNPCname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        newNPCtopicamount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        newNPCfavorlevel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        newNPCinterestlevel = new javax.swing.JTextField();
        exitButton = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        newNPCconstellation = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();

        jLabel5.setText("Creating a new NPC...");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("New NPC Name");

        newNPCname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNPCnameActionPerformed(evt);
            }
        });

        jLabel2.setText("Amount of Topics");

        newNPCtopicamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNPCtopicamountActionPerformed(evt);
            }
        });

        jLabel3.setText("NPC Favor Level");

        newNPCfavorlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNPCfavorlevelActionPerformed(evt);
            }
        });

        jLabel4.setText("NPC Interest Level");

        newNPCinterestlevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNPCinterestlevelActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        newNPCconstellation.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "BlackDragon", "Camel", "Giant", "Shield", "Boat", "Hammer", "Seal", "Key", "Goblin", "Wagon", "Owl", "Elephant" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(newNPCconstellation);

        jLabel6.setText("Constellation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newNPCname))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newNPCtopicamount))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newNPCfavorlevel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newNPCinterestlevel))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(newNPCname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(newNPCtopicamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(newNPCfavorlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(newNPCinterestlevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitButton)
                    .addComponent(confirmButton)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newNPCnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNPCnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newNPCnameActionPerformed

    private void newNPCtopicamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNPCtopicamountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newNPCtopicamountActionPerformed

    private void newNPCfavorlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNPCfavorlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newNPCfavorlevelActionPerformed

    private void newNPCinterestlevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNPCinterestlevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newNPCinterestlevelActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        //Transferrs data input into variables
        String newNPCNameINPUT = newNPCname.getText();
        int newNPCTopicAmountINPUT = Integer.parseInt(newNPCtopicamount.getText());
        int newNPCFavorLevel = Integer.parseInt(newNPCfavorlevel.getText());
        int newNPCInterestLevel = Integer.parseInt(newNPCinterestlevel.getText());
        Constellation newNPCConstellation = new Constellation(newNPCconstellation.getSelectedValue());
        
        //Writing to file chunk
        String homeDir = System.getProperty("user.home");
        String path = homeDir + "/NetBeansProjects/AmityCalculator/build/classes/amitycalculator/npcfiles/" + newNPCNameINPUT + ".txt";
        File file = new File(path);
        
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                //
            }
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file.getAbsoluteFile()))) {
            bw.write(newNPCNameINPUT + "\n");
            bw.write(newNPCConstellation.getName() + "\n");
            bw.write("topics" + "\n");//TEMP
            bw.write("topicinterestlevels" + "\n");
            bw.write("topicfavorlevels" + "\n");
            bw.write(newNPCFavorLevel + "\n");
            bw.write(newNPCInterestLevel + "\n");
            //System.out.println("Success.");
        } catch (IOException e) {
            //
        }
        
        //Initializing variables for later use
        String topicNames = "";
        String topicInterestLevels = "";
        String topicFavorLevels = "";
        
        //FOR Loop to loop the amount of topics entered for the user to enter the necessary data for each topic
        for (int count = 1; count <= newNPCTopicAmountINPUT; count++) {
            
            JTextField topicNameField = new JTextField("");
            JTextField topicInterestLevelField = new JTextField("");
            JTextField topicFavorLevelField = new JTextField("");
            
            JPanel panel = new JPanel(new GridLayout(0, 1));
            panel.add(new JLabel("Topic " + count + " Name"));
            panel.add(topicNameField);
            panel.add(new JLabel("Topic " + count + " Interest Level"));
            panel.add(topicInterestLevelField);
            panel.add(new JLabel("Topic " + count + "  Favor Level"));
            panel.add(topicFavorLevelField);
            
            int result = JOptionPane.showConfirmDialog(null, panel, "Test", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            
            if (result == JOptionPane.OK_OPTION) {
                topicNames += topicNameField.getText() + ",";
                topicInterestLevels += topicInterestLevelField.getText() + ",";
                topicFavorLevels += topicFavorLevelField.getText() + ",";
            } else {
                //System.out.println("Cancelled");
            }
        }
        //removing last comma
        topicNames = topicNames.substring(0, topicNames.length()-1);
        topicInterestLevels = topicInterestLevels.substring(0, topicInterestLevels.length()-1);
        topicFavorLevels = topicFavorLevels.substring(0, topicFavorLevels.length()-1);
        //
        
        //Write to specific lines delete placeholders
        try {
            Path wiki_path = Paths.get(path);
            List<String> lines = Files.readAllLines(wiki_path);
            lines.set(2, topicNames);
            lines.set(3, topicInterestLevels);
            lines.set(4, topicFavorLevels);
            Files.write(file.toPath(), lines); // You can add a charset and other options too
            //System.out.println("Test.");
            JOptionPane.showMessageDialog (null, "New NPC Successfully Created.", "Success:", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog (null, "An Error Has Occured: Contact the Developer. Error code #0001.", "Error:", JOptionPane.ERROR_MESSAGE);
        }
        
        //Closes current window
        new AmityCalculatorUI().setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
       AmityCalculatorUI newWindow = new AmityCalculatorUI();
       newWindow.setVisible(true);
       setVisible(false);
       dispose();// TODO add your handling code here:
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(createNewNPCUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createNewNPCUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createNewNPCUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createNewNPCUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createNewNPCUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> newNPCconstellation;
    private javax.swing.JTextField newNPCfavorlevel;
    private javax.swing.JTextField newNPCinterestlevel;
    private javax.swing.JTextField newNPCname;
    private javax.swing.JTextField newNPCtopicamount;
    // End of variables declaration//GEN-END:variables
}
