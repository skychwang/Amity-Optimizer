package amitycalculator;
//Importing external libraries
import java.util.*;
import java.io.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.*;


public class AmityCalculatorUI extends javax.swing.JFrame {//This is the main class and main window

    //Path of files for NPCs, to be read and written to.
    String path = "/Users/skywang329/NetBeansProjects/AmityCalculator/build/classes/amitycalculator/npcfiles/";
    
    
    public AmityCalculatorUI() {
        initComponents();
        buttonGroup1.add(mostAmityRadio);//ButtonGroup is used here to make it such that users can only select one at a time.
        buttonGroup1.add(mostLikelyRadio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        npcList = new javax.swing.JList<>();
        confirmSelectionButton = new javax.swing.JButton();
        createNPCButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        successConditionList = new javax.swing.JList<>();
        editNPCValuesButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        canvas1 = new java.awt.Canvas();
        label4 = new java.awt.Label();
        label1 = new java.awt.Label();
        removeNPCButton = new javax.swing.JButton();
        reloadAppButton = new javax.swing.JButton();
        permDeleteNPCButton = new javax.swing.JButton();
        mostAmityRadio = new javax.swing.JRadioButton();
        mostLikelyRadio = new javax.swing.JRadioButton();
        helpButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ArrayList<String> tempArrayList = new ArrayList<String>();
        File folder = new File("/Users/skywang329/NetBeansProjects/AmityCalculator/build/classes/amitycalculator/npcfiles/");
        File[] listOfFiles = folder.listFiles();
        for (File file : listOfFiles) {
            if (file.isFile()) {
                String fileName = file.getName();
                if (fileName.charAt(0) != ".".charAt(0)) {
                    tempArrayList.add(file.getName().substring(0, file.getName().length()-4));
                }
            }
        }

        npcList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = tempArrayList.toArray(new String[tempArrayList.size()]);
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        npcList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        npcList.setToolTipText("");
        jScrollPane1.setViewportView(npcList);

        confirmSelectionButton.setText("Confirm Selection");
        confirmSelectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmSelectionButtonActionPerformed(evt);
            }
        });

        createNPCButton.setText("Create New NPC");
        createNPCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNPCButtonActionPerformed(evt);
            }
        });

        successConditionList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Talk Freely with the NPC", "Fail to Spark the Interest of the NPC 1 Time", "Fail to Spark the Interest of the NPC 2 Times", "Fail to Spark the Interest of the NPC 3 Times", "Fail to Spark the Interest of the NPC 4 Times", "Fail to Spark the Interest of the NPC 5 Times", "Spark the Interest of the NPC 1 Time", "Consecutively Spark the Interest of the NPC 2 Times", "Consecutively Spark the Interest of the NPC 3 Times", "Consecutively Spark the Interest of the NPC 4 Times", "Consecutively Spark the Interest of the NPC 5 Times" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        successConditionList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(successConditionList);

        editNPCValuesButton.setText("Edit NPC Values");
        editNPCValuesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editNPCValuesButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Exit");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        label2.setText("NPC List");

        label3.setText("Success Condition List");

        label4.setText("Display Routes with:");

        label1.setText("Amity Route Optimization Calculator CLOSED BETA v0.5");

        removeNPCButton.setText("Remove NPC");
        removeNPCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeNPCButtonActionPerformed(evt);
            }
        });

        reloadAppButton.setText("Reload App");
        reloadAppButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadAppButtonActionPerformed(evt);
            }
        });

        permDeleteNPCButton.setText("permDelete NPC");
        permDeleteNPCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permDeleteNPCButtonActionPerformed(evt);
            }
        });

        mostAmityRadio.setText("Most Amity Gained");
        mostAmityRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostAmityRadioActionPerformed(evt);
            }
        });

        mostLikelyRadio.setText("Greatest Likelihood to Succeed");
        mostLikelyRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostLikelyRadioActionPerformed(evt);
            }
        });

        helpButton.setText("Help");
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(235, 235, 235))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(reloadAppButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(editNPCValuesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(createNPCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(removeNPCButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(permDeleteNPCButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(closeButton))
                                            .addComponent(confirmSelectionButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(258, 258, 258)
                                                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(46, 46, 46))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mostAmityRadio)
                                            .addComponent(mostLikelyRadio)))))
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createNPCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(removeNPCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(permDeleteNPCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mostAmityRadio))
                        .addGap(5, 5, 5)
                        .addComponent(mostLikelyRadio)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editNPCValuesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(reloadAppButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmSelectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(closeButton)
                            .addComponent(helpButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_closeButtonActionPerformed

    private void editNPCValuesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editNPCValuesButtonActionPerformed
        //EDIT NPC VALUES BUTTON
        if (!npcList.isSelectionEmpty()) {//Users need to select an NPC from the list in order to edit; this is verification.
            //Program then reads the NPC from file.
            NPC selectedNPCObject = null;//By creating a new empty NPC object
            try {
                selectedNPCObject = readNPCFile(path, npcList.getSelectedValue());//then interpreting what's saved into the file and placing them into the empty NPC Object with the read method.
            } catch (Exception e) {//Exception catching
                e.printStackTrace();
            }
            new EditNPCValuesUI(selectedNPCObject).setVisible(true);//Opens up the EditNPCValues UI by creating the window object
            //Then it closes the current window
            setVisible(false);
            dispose();
        } else {
            //An error dialog will be shown if user did not select an NPC from the list to edit
            JOptionPane.showMessageDialog (null, "Please select an NPC from the <NPC List> in order to proceed.", "Error: Selection", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editNPCValuesButtonActionPerformed

    private void createNPCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNPCButtonActionPerformed
        //JOptionPane.showMessageDialog (null, "Invalid Datatype Entered in NPC Favor Level. Only Integers Allowed.", "Error: Input", JOptionPane.ERROR_MESSAGE);
        new createNewNPCUI().setVisible(true);//Opens up the newNPC UI by creating the window object
        //Closes current window
        setVisible(false);
        dispose();
    }//GEN-LAST:event_createNPCButtonActionPerformed

    private void confirmSelectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmSelectionButtonActionPerformed
        //Confirm button is pressed for best route calculations, first we need to do some initializing
        
        String selectedNPC;
        String selectedSuccessCondition;
        
        Boolean mostAmitySelected = mostAmityRadio.isSelected();//Checks which method to use by checking to see which radio button was selected into a boolean value
        Boolean mostLikelySelected = mostLikelyRadio.isSelected();
        

        if (!npcList.isSelectionEmpty() && !successConditionList.isSelectionEmpty() && (mostLikelyRadio.isSelected() || mostAmityRadio.isSelected())) {//Everything is valid; lets go!
            //Checks which NPC was selected from list, which condition was chosen
            selectedNPC = npcList.getSelectedValue();
            selectedSuccessCondition = successConditionList.getSelectedValue();
            //Creates empty new NPC object
            NPC selectedNPCObject = null;
            //Then it reads from file with the readNPCFIle method for its values and changes the null NPC object
            try {
                selectedNPCObject = readNPCFile(path, selectedNPC);
            } catch (Exception e) {//Exception catching
                e.printStackTrace();
            }
            
            int[] interests = new int[selectedNPCObject.Topics.size()]; //NPC topics interestrates array fill later
            
            for (int counter = 0; counter < selectedNPCObject.Topics.size(); counter++) { //extracts NPC topics interests and places them in array
                interests[counter] = selectedNPCObject.Topics.get(counter).getTopicFavorLevel();
            }
            
            float[] percentageSparkInterest = new float[interests.length];
            
            //Calculates basic percentage of sparking interest, inputs the percentages into the array above
            for (int counter = 0; counter < interests.length; counter++) {
                if (selectedNPCObject.Topics.get(counter).getTopicInterestLevel() > selectedNPCObject.getNPCInterestLevel()) {//If the topic's Interest level exceeds that of the user's selected NPC, it sparks the interest 100%
                    percentageSparkInterest[counter] = 1;
                } else {//Otherwise, the two interest levels are converted to percentage. TopicILevel/NPCILevel
                    percentageSparkInterest[counter] = ((float) selectedNPCObject.Topics.get(counter).getTopicInterestLevel() / (float) selectedNPCObject.getNPCInterestLevel());
                }
            }
            
            /** Self Notes:
                successconditions
                talkfreely = 0
                sparkinterest1 = 1
                sparkinterest2 = 2
                sparkinterest3 = 3
                sparkinterest4 = 4
                sparkinterest5 = 5
                failsparkinterest1 = 6
                failsparkinterest2 = 7
                failsparkinterest3 = 8
                failsparkinterest4 = 9
                failsparkinterest5 = 10
            */
            //getting successCondition #takes successcondition from GUI user selection, change to 0-10
                        
            //Initialize integer value for selected success condition; much easier than passing an entire string all the time around.
            int selectedSuccessConditionNUM = -1;
            
            switch (selectedSuccessCondition) {//A switch statement is used; multiple ifs could be used too here
                case "Talk Freely with the NPC":
                    selectedSuccessConditionNUM = 0;
                    break;
                case "Fail to Spark the Interest of the NPC 1 Time":
                    selectedSuccessConditionNUM = 6;
                    break;
                case "Fail to Spark the Interest of the NPC 2 Times":
                    selectedSuccessConditionNUM = 7;
                    break;
                case "Fail to Spark the Interest of the NPC 3 Times":
                    selectedSuccessConditionNUM = 8;
                    break;
                case "Fail to Spark the Interest of the NPC 4 Times":
                    selectedSuccessConditionNUM = 9;
                    break;
                case "Fail to Spark the Interest of the NPC 5 Times":
                    selectedSuccessConditionNUM = 9;
                    break;
                case "Spark the Interest of the NPC 1 Time":
                    selectedSuccessConditionNUM = 1;
                    break;
                case "Consecutively Spark the Interest of the NPC 2 Times":
                    selectedSuccessConditionNUM = 2;
                    break;
                case "Consecutively Spark the Interest of the NPC 3 Times":
                    selectedSuccessConditionNUM = 3;
                    break;
                case "Consecutively Spark the Interest of the NPC 4 Times":
                    selectedSuccessConditionNUM = 4;
                    break;
                case "Consecutively Spark the Interest of the NPC 5 Times":
                    selectedSuccessConditionNUM = 5;
                    break;
                default:
                    break;
            }
            
            // Bestroute script
            //get mostAmity/mostLikely #takes mostAmity/mostLikely from GUI user selection change to 1or2
            
            if (mostAmitySelected) {
                JOptionPane.showMessageDialog (null, bestRoute(selectedSuccessConditionNUM, 1, selectedNPCObject, percentageSparkInterest), "Most Amity Route:", JOptionPane.INFORMATION_MESSAGE);//Shows calculated bestroute method results in a JDiag
                //System.out.println(bestRoute(selectedSuccessConditionNUM, 1, selectedNPCObject, percentageSparkInterest));
            }
            if (mostLikelySelected) {
                JOptionPane.showMessageDialog (null, bestRoute(selectedSuccessConditionNUM, 2, selectedNPCObject, percentageSparkInterest), "Most Likely Route:", JOptionPane.INFORMATION_MESSAGE);
            }
            
            
        } else if (npcList.isSelectionEmpty() && successConditionList.isSelectionEmpty()) {//Various other error messages to appear if user did not select the needed things to start the bestroute calculation
            JOptionPane.showMessageDialog (null, "Please select an NPC from the <NPC List> and a success condition from the <Success Condition List> in order to proceed.", "Error: Selection", JOptionPane.ERROR_MESSAGE);
        } else if (npcList.isSelectionEmpty()) {
            JOptionPane.showMessageDialog (null, "Please select an NPC from the <NPC List> in order to proceed.", "Error: Selection", JOptionPane.ERROR_MESSAGE);
        } else if (successConditionList.isSelectionEmpty()) {
            JOptionPane.showMessageDialog (null, "Please select a SUCCESS CONDITION from the <Success Condition List> in order to proceed.", "Error: Selection", JOptionPane.ERROR_MESSAGE);
        } else if (!mostLikelyRadio.isSelected() && !mostAmityRadio.isSelected()) {
            JOptionPane.showMessageDialog (null, "Please tick at least ONE best route option in order to proceed. Tickboxes are located under <Create NEW NPC>.",  "Error: Selection", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmSelectionButtonActionPerformed

    private void removeNPCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeNPCButtonActionPerformed
        //Removing a NPC from the list
        if (!npcList.isSelectionEmpty()) {
            String homeDir = System.getProperty("user.home");
            String path = homeDir + "/NetBeansProjects/AmityCalculator/build/classes/amitycalculator/npcfiles/";//Path of stored NPC files
            
            String selectedNPC = npcList.getSelectedValue();//Gets name of selected NPC, corresponding to file name
            
            File deleteFile = new File(path + selectedNPC + ".txt");
            File deletedFileBackup = new File(path + "." + selectedNPC + ".txt");//Delete file merely hide the file, setting it to invisible as per the Mac OS X filesystem method of putting "." before the file name.
            
            boolean success = false;
            
            try {
                Files.move(deleteFile.toPath(), deletedFileBackup.toPath(), java.nio.file.StandardCopyOption.REPLACE_EXISTING);
                success = true;
            } catch (IOException e) {
                //
            }
            if (success == true) {
                JOptionPane.showMessageDialog (null, "Success. The " + selectedNPC + " NPC was removed from the list. A backup of the deleted file may be found in the same file directory as a hidden file with name prefix '.'", "Success:", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog (null, "An Unknown Error Occured. The NPC you have selected has not been deleted. Please Contact the Developer.", "Error: Unknown", JOptionPane.ERROR_MESSAGE);
            }
            
            //This refreshes the window, to update it to see if the NPC has been deleted from the list
            new AmityCalculatorUI().setVisible(true);
            setVisible(false);
            dispose();
        } else if (npcList.isSelectionEmpty()) {//Error message if user did not select NPC to delete
            JOptionPane.showMessageDialog (null, "Please select an NPC from the <NPC List> in order to proceed.", "Error: Selection", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeNPCButtonActionPerformed

    private void reloadAppButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadAppButtonActionPerformed
        //Refreshes the window by initializng everything again, from reading filenames, etc. Useful if user manually deletes a NPC file and wishes to see any updates.
        new AmityCalculatorUI().setVisible(true);
        setVisible(false);
        dispose();
    }//GEN-LAST:event_reloadAppButtonActionPerformed

    private void permDeleteNPCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permDeleteNPCButtonActionPerformed
        //But now if PERM DELETE is selected, it actually deletes the file instead of just hiding it.
        if (!npcList.isSelectionEmpty()) {
            String homeDir = System.getProperty("user.home");
            String path = homeDir + "/NetBeansProjects/AmityCalculator/build/classes/amitycalculator/npcfiles/";
            
            String selectedNPC = npcList.getSelectedValue();
            
            Path deletePath = Paths.get(path + selectedNPC + ".txt");
            
            Boolean success = false;
            
            try {
                Files.delete(deletePath);
                success = true;
            } catch (IOException e) {
                //
            }
            
            if (success == true) {
                JOptionPane.showMessageDialog (null, "Success. The " + selectedNPC + " NPC was permanently deleted. No backup file exists.", "Success:", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog (null, "An Unknown Error Occured. The NPC you have selected has not been deleted. Please Contact the Developer.", "Error: Unknown", JOptionPane.ERROR_MESSAGE);
            }
            
            new AmityCalculatorUI().setVisible(true);
            setVisible(false);
            dispose();
        } else if (npcList.isSelectionEmpty()) {
            JOptionPane.showMessageDialog (null, "Please select an NPC from the <NPC List> in order to proceed.", "Error: Selection", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_permDeleteNPCButtonActionPerformed

    private void mostLikelyRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostLikelyRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostLikelyRadioActionPerformed

    private void mostAmityRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostAmityRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostAmityRadioActionPerformed

    private void helpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
        JOptionPane.showMessageDialog (null, "FAQs: \n" +
                "'DELETE' simply hides the NPC file in the NPC file directory, \n"
                + "located in the same folder as this program; whereas 'PERM DELETE' permeneantly deletes the file. Always \n"
                + "use normal delete to be safe." + 
                "Click 'RELOAD APP' to refresh the window. This will update any manual changes to the file system.\n\n" + 
                "For more help, Feel free to contact the developer at sky.wang@yahoo.com.", "Help Pane:", JOptionPane.INFORMATION_MESSAGE);// TODO add your handling code here:
    }//GEN-LAST:event_helpButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AmityCalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AmityCalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AmityCalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AmityCalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AmityCalculatorUI().setVisible(true);//Default run, to open the main UI
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton closeButton;
    private javax.swing.JButton confirmSelectionButton;
    private javax.swing.JButton createNPCButton;
    private javax.swing.JButton editNPCValuesButton;
    private javax.swing.JButton helpButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JRadioButton mostAmityRadio;
    private javax.swing.JRadioButton mostLikelyRadio;
    private javax.swing.JList<String> npcList;
    private javax.swing.JButton permDeleteNPCButton;
    private javax.swing.JButton reloadAppButton;
    private javax.swing.JButton removeNPCButton;
    private javax.swing.JList<String> successConditionList;
    // End of variables declaration//GEN-END:variables

    /** Self note:
     successconditions
     talkfreely = 0
     sparkinterest1 = 1
     sparkinterest2 = 2
     sparkinterest3 = 3
     sparkinterest4 = 4
     sparkinterest5 = 5
     failsparkinterest1 = 6
     failsparkinterest2 = 7
     failsparkinterest3 = 8
     failsparkinterest4 = 9
     failsparkinterest5 = 10
     */
    
    /** Self note:
     mostLikely or mostAmity
     mostAmity = 1
     mostLikely = 2
     */
    
    public boolean contains(int[] arr, int item) {//Simple general contains method, to check if an int appears in an array; general usage throughout program
      for (int n : arr) {
         if (item == n) {
            return true;
         }
      }
      return false;
   }
    
    public String bestRoute(int successCondition, int mostLorA, NPC selectedNPC, float[] percentageSparkInterest) { //bestRoute computation method
        
        //The best route computation method works as follows;
        //It is passed X number of largest calculated individual topic "success" percentages.
        //Number X corresponds to the length of the constellation, so how many conversation topics an NPC can talk about
        //"success" percentages change according to the success condition; if it is to "spark interest", it will be the percentage a certain topic will spark interest. If it is instead "not spark interest", it will be 1 minus the percentage.
        //The X largest percentages are taken because a collection of the largest individual success conditions will produce the largest overall percentage of success.
        //Then, the program uses the combination method go over and calculate all the possible outcomes of the choice and their percentages
        //And combines to calculate the overarching percentage of success.
        
        //Initializing variables
        
        int[] positions = new int[selectedNPC.getConstellation().getLength()]; //order and number of placements array
        Arrays.fill(positions, -99);
        float[] likelihoods = new float[selectedNPC.getConstellation().getLength()];
        float value = 0;//Value is (next) largest favor level of NPC. 
        int pos = 0;
        
        /**
         * Self note:
         * IntStream.of(a).anyMatch(x -> x == 4)
         */
        
        for (int count = 0; count < selectedNPC.getConstellation().getLength(); count++) {
            float likelihood = 1; //default likelihood, to be multiplied upon with other likelihoods to compute final total likelihood
            pos = 0;//Default 
            value = 0;
            
            
            //Temp fixes
            if ((successCondition >= 6 && successCondition <= 10) && (mostLorA == 1)) {
                value = 0;
            } else if (successCondition >= 6 && successCondition <= 10) {
                value = 2147483647;
            }
            
            for (int counter = 0; counter < selectedNPC.Topics.size(); counter++) {
                if (mostLorA == 1) {//mostAmity
                    if ((selectedNPC.Topics.get(counter).getTopicFavorLevel() > value) && (contains(positions, counter) == false)) {
                        value = selectedNPC.Topics.get(counter).getTopicFavorLevel();
                        pos = counter;
                    }
                } else if ((mostLorA == 2) && (successCondition >= 0 && successCondition <= 5)) { //mostLikely
                    if ((percentageSparkInterest[counter] >= value) && (contains(positions, counter) == false)) {
                        value = percentageSparkInterest[counter];
                        pos = counter;
                    }
                } else if ((mostLorA == 2) && (successCondition >= 6 && successCondition <= 10)) { //Likely
                    if ((percentageSparkInterest[counter] <= value) && (contains(positions, counter) == false)) {//(IntStream.of(positions).anyMatch(x -> x == counter))) { //if percentageSparkInterest[counter] < min && counter !in positions[]
                        value = percentageSparkInterest[counter];
                        pos = counter;
                    }
                }
            }
            
            positions[count] = pos;
            
            if (successCondition >= 6 && successCondition <= 10) {
                likelihood = likelihood * (1 - percentageSparkInterest[pos]);
            } else {
                likelihood = likelihood * percentageSparkInterest[pos];
            }
            
            likelihoods[count] = likelihood;

        }
        
        String output = "";
        
        if (mostLorA == 2) {
            output += "Most Likely:";
        } else if (mostLorA == 1) {
            output += "Most Amity: ";
        }
        
        output += "\nRoute: ";
        
        for (int count = 0; count < selectedNPC.getConstellation().getLength(); count++) {
            output += selectedNPC.Topics.get(positions[count]).getTopicName() + "-";
        }
        output = output.substring(0, output.length()-1);
        
        float finallikelihood = 1;
        
        /**
     successconditions
     talkfreely = 0
     sparkinterest1 = 1
     sparkinterest2 = 2
     sparkinterest3 = 3
     sparkinterest4 = 4
     sparkinterest5 = 5
     failsparkinterest1 = 6
     failsparkinterest2 = 7
     failsparkinterest3 = 8
     failsparkinterest4 = 9
     failsparkinterest5 = 10
     */
        
        switch (successCondition) {
            case 0:
                for (int count = 0; count < selectedNPC.getConstellation().getLength(); count++) {
                    finallikelihood *= likelihoods[count];
                }
                
                output += "\nLikelihood for all " + likelihoods.length + " topics to spark interest: " + Float.toString(finallikelihood*100) + "%";
                
                finallikelihood = 1;
                for (int count = 0; count < selectedNPC.getConstellation().getLength(); count++) {
                    finallikelihood *= (1-likelihoods[count]);
                }
                
                output += "\nLikelihood that all " + likelihoods.length + " fail to spark interest: " + Float.toString(finallikelihood*100) + "%";
                break;
            case 1:
                for (int count = 0; count < selectedNPC.getConstellation().getLength(); count++) {
                    finallikelihood *= (1-likelihoods[count]);
                }
                finallikelihood = 1 - finallikelihood;
                
                output += "\nLikelihood of success condition fulfilment: " + Float.toString(finallikelihood*100) + "%";
                break;
            case 2:
                finallikelihood = 0;
                int startingpos = 0;
                
                for (int count = 0; count < selectedNPC.getConstellation().getLength() - 1; count++) {
                    int consecutive = 2;
                    float templikelihood = 1;
                    for (int counter = 0; counter < startingpos; counter++) {
                        templikelihood *= (1-likelihoods[counter]);
                        //System.out.println(templikelihood);
                    }
                    for (int counter = startingpos; counter < (startingpos + consecutive); counter++) {
                        templikelihood *= (likelihoods[counter]);
                        //System.out.println(templikelihood);
                    }
                    for (int counter = (startingpos + consecutive); counter < selectedNPC.getConstellation().getLength(); counter++) {
                        templikelihood *= (1-likelihoods[counter]);
                        //System.out.println(templikelihood);
                    }
                    startingpos += 1;
                    finallikelihood += templikelihood;
                }
                output += "\nLikelihood of success condition fulfilment: " + Float.toString(finallikelihood*100) + "%";
                    /** 
                     * Self note:
                     * - - - - -
                     * - - x x x
                     * x - - x x
                     * x x - - x
                     * x x x - -
                     * 
                     * - - - - - - 
                     * - - x x x x
                     * x - - x x x
                     * x x - - x x
                     * x x x - - x
                     * x x x x - -
                     * 
                     * 
                     */
                break;
            case 3:
                finallikelihood = 0;
                startingpos = 0;
                
                for (int count = 0; count < selectedNPC.getConstellation().getLength() - 2; count++) {
                    int consecutive = 3;
                    float templikelihood = 1;
                    for (int counter = 0; counter < startingpos; counter++) {
                        templikelihood *= (1-likelihoods[counter]);
                        //System.out.println(templikelihood);
                    }
                    for (int counter = startingpos; counter < (startingpos + consecutive); counter++) {
                        templikelihood *= (likelihoods[counter]);
                        //System.out.println(templikelihood);
                    }
                    for (int counter = (startingpos + consecutive); counter < selectedNPC.getConstellation().getLength(); counter++) {
                        templikelihood *= (1-likelihoods[counter]);
                        //System.out.println(templikelihood);
                    }
                    startingpos += 1;
                    finallikelihood += templikelihood;
                }
                output += "\nLikelihood of success condition fulfilment: " + Float.toString(finallikelihood*100) + "%";
                break;
            case 4:
                finallikelihood = 0;
                startingpos = 0;
                
                for (int count = 0; count < selectedNPC.getConstellation().getLength() - 3; count++) {
                    int consecutive = 4;
                    float templikelihood = 1;
                    for (int counter = 0; counter < startingpos; counter++) {
                        templikelihood *= (1-likelihoods[counter]);
                        //System.out.println(templikelihood);
                    }
                    for (int counter = startingpos; counter < (startingpos + consecutive); counter++) {
                        templikelihood *= (likelihoods[counter]);
                        //System.out.println(templikelihood);
                    }
                    for (int counter = (startingpos + consecutive); counter < selectedNPC.getConstellation().getLength(); counter++) {
                        templikelihood *= (1-likelihoods[counter]);
                        //System.out.println(templikelihood);
                    }
                    startingpos += 1;
                    finallikelihood += templikelihood;
                }
                output += "\nLikelihood of success condition fulfilment: " + Float.toString(finallikelihood*100) + "%";
                break;
            case 5:
                finallikelihood = 0;
                startingpos = 0;
                
                for (int count = 0; count < selectedNPC.getConstellation().getLength() - 4; count++) {
                    int consecutive = 5;
                    float templikelihood = 1;
                    for (int counter = 0; counter < startingpos; counter++) {
                        templikelihood *= (1-likelihoods[counter]);
                        //System.out.println(templikelihood);
                    }
                    for (int counter = startingpos; counter < (startingpos + consecutive); counter++) {
                        templikelihood *= (likelihoods[counter]);
                        //System.out.println(templikelihood);
                    }
                    for (int counter = (startingpos + consecutive); counter < selectedNPC.getConstellation().getLength(); counter++) {
                        templikelihood *= (1-likelihoods[counter]);
                        //System.out.println(templikelihood); 
                    }
                    startingpos += 1;
                    finallikelihood += templikelihood;
                }
                output += "\nLikelihood of success condition fulfilment: " + Float.toString(finallikelihood*100) + "%";
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            default:
                break;
        }
        
        return output;
    }
    
   
    public NPC readNPCFile(String pathOfFolder, String NPCName) throws FileNotFoundException, IOException {//Read NPC File Method!

        FileInputStream fs = new FileInputStream(pathOfFolder + NPCName + ".txt");

        BufferedReader br = new BufferedReader(new InputStreamReader(fs));
        String sCurrentLine;

        NPC selectedNPCObject = new NPC();
        int topicTotal = 0;
        ArrayList<Topic> selectedNPCObjectTopics = new ArrayList<Topic>();

        sCurrentLine = br.readLine();//Line1

        selectedNPCObject.setNPCName(sCurrentLine);

        sCurrentLine = br.readLine();//Line2

        //System.out.println(sCurrentLine);
        //SETCONSTELLATIONTHING
        selectedNPCObject.setConstellation(new Constellation(sCurrentLine));

        sCurrentLine = br.readLine();//Line3

        String temp = sCurrentLine;
        //counting ,
        int index = temp.indexOf(",");
        while (index != -1) {
            topicTotal++;
            temp = temp.substring(index + 1);
            index = temp.indexOf(",");
        }
        topicTotal++;
        //looping adding topics
        temp = sCurrentLine;
        for (int counter = 0; counter < topicTotal; counter++) {
            Topic tempTopic = new Topic();
            if (temp.indexOf(",") != -1) {
                index = temp.indexOf(",");
                tempTopic.setTopicName(temp.substring(0, index));
                temp = temp.substring(index + 1);
            } else {
                tempTopic.setTopicName(temp);
            }
            selectedNPCObjectTopics.add(tempTopic);
        }

        sCurrentLine = br.readLine();//Line4

        //System.out.println(sCurrentLine);
        //SETTOPICINTERESTLEVELS
        //looping adding topics
        temp = sCurrentLine;
        topicTotal = selectedNPCObjectTopics.size();
        //System.out.println(topicTotal);
        for (int counter = 0; counter < topicTotal; counter++) {
            //System.out.println(temp.indexOf(","));
            if (temp.indexOf(",") != -1) {
                index = temp.indexOf(",");
                selectedNPCObjectTopics.get(counter).setTopicInterestLevel(Integer.valueOf(temp.substring(0, index)));
                temp = temp.substring(index + 1);
            } else {
                selectedNPCObjectTopics.get(counter).setTopicInterestLevel(Integer.valueOf(temp));
            }
            //System.out.println(temp);
        }
        
        sCurrentLine = br.readLine();//Line5

        //System.out.println(sCurrentLine);
        //SETTOPICFAVORLEVELS
        temp = sCurrentLine;
        topicTotal = selectedNPCObjectTopics.size();
        //System.out.println(topicTotal);
        for (int counter = 0; counter < topicTotal; counter++) {
            //System.out.println(temp.indexOf(","));
            if (temp.indexOf(",") != -1) {
                index = temp.indexOf(",");
                selectedNPCObjectTopics.get(counter).setTopicFavorLevel(Integer.valueOf(temp.substring(0, index)));
                temp = temp.substring(index + 1);
            } else {
                selectedNPCObjectTopics.get(counter).setTopicFavorLevel(Integer.valueOf(temp));
            }
            //System.out.println(temp);
        }
        
        //Set selectedNPCObject topics as the temp thing
        selectedNPCObject.Topics = selectedNPCObjectTopics;
        
        sCurrentLine = br.readLine();//Line6
        //SetNPCInterestLevel
        selectedNPCObject.setNPCFavorLevel(Integer.valueOf(sCurrentLine));
        
        sCurrentLine = br.readLine();//Line7
        //SetNPCFavorLevel
        selectedNPCObject.setNPCInterestLevel(Integer.valueOf(sCurrentLine));
        
        return selectedNPCObject;
    }    
}