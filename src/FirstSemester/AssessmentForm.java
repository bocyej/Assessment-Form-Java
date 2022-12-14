/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FirstSemester;

import javax.swing.*;

/**
 *
 * @author Jacob Laurel
 */
public class AssessmentForm extends javax.swing.JFrame {

    /**
     * Creates new form AssessmentForm
     */
    public AssessmentForm() {
        initComponents();
        
        ButtonGroup bg = new ButtonGroup();
	    bg.add(jRadMale);
	    bg.add(jRadFemale);
        bg.add(jRadInvisible);
        ButtonGroup cf = new ButtonGroup();
        cf.add(jRadRegular);
	    cf.add(jRadIrregular);
        cf.add(jRadInvisible2);
        
        jTextArea.setText("\n\n\n\n                                              Submit Here");
        
        jComboProgram.addItem("--- Select Program ---");
        jComboProgram.addItem("College of Arts and Sciences (CAS)");
        jComboProgram.addItem("College of Education (CoE)");
        jComboProgram.addItem("College of Business and Management (CBM)");
        jComboProgram.addItem("College of Music and the Performing Arts (CMPA)");
        jComboProgram.addItem("College of Nursing and Allied Health Services (CNAHS)");
        
        jComboYear.addItem("--- Select Year Level ---");
        jComboYear.addItem("First Year");
        jComboYear.addItem("Second Year");
        jComboYear.addItem("Third Year");
        jComboYear.addItem("Fourth Year");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadInvisible = new javax.swing.JRadioButton();
        jRadInvisible2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jName = new javax.swing.JTextField();
        jRadMale = new javax.swing.JRadioButton();
        jRadFemale = new javax.swing.JRadioButton();
        jComboProgram = new javax.swing.JComboBox<>();
        jComboYear = new javax.swing.JComboBox<>();
        jComboCourse = new javax.swing.JComboBox<>();
        jOtherFees = new javax.swing.JTextField();
        jSubmit = new javax.swing.JButton();
        jClear = new javax.swing.JButton();
        jExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jUnits = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jRadRegular = new javax.swing.JRadioButton();
        jRadIrregular = new javax.swing.JRadioButton();

        jRadInvisible.setSelected(true);
        jRadInvisible.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadInvisible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadInvisibleActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SPUM Assessment Form");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("St. Paul University Manila Assesment");

        jLabel2.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel3.setText("Sex:");

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel4.setText("Program:");

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel5.setText("Year Level:");

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel6.setText("Course:");

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel7.setText("Other Fees:");

        jName.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameActionPerformed(evt);
            }
        });

        jRadMale.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jRadMale.setText("Male");
        jRadMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadMaleActionPerformed(evt);
            }
        });

        jRadFemale.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jRadFemale.setText("Female");
        jRadFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadFemaleActionPerformed(evt);
            }
        });

        jComboProgram.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jComboProgram.setToolTipText("");
        jComboProgram.setName(""); // NOI18N
        jComboProgram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboProgramActionPerformed(evt);
            }
        });

        jComboYear.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        jComboCourse.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jComboCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCourseActionPerformed(evt);
            }
        });

        jOtherFees.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jOtherFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jOtherFeesActionPerformed(evt);
            }
        });

        jSubmit.setText("Submit");
        jSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSubmitActionPerformed(evt);
            }
        });

        jClear.setText("Clear");
        jClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClearActionPerformed(evt);
            }
        });

        jExit.setText("Exit");
        jExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitActionPerformed(evt);
            }
        });

        jTextArea.setColumns(20);
        jTextArea.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jTextArea.setLineWrap(true);
        jTextArea.setRows(5);
        jTextArea.setFocusable(false);
        jScrollPane1.setViewportView(jTextArea);

        jUnits.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel8.setText("Units:");

        jLabel9.setForeground(new java.awt.Color(128, 128, 128));
        jLabel9.setText("Note: Leave blank if no additional other fees.");

        jLabel10.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel10.setText("Classification of Student:");

        jRadRegular.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jRadRegular.setText("Regular");

        jRadIrregular.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jRadIrregular.setText("Irregular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jClear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jName)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadFemale)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jComboProgram, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jUnits, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jOtherFees)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel9)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboYear, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jRadRegular)
                                .addGap(18, 18, 18)
                                .addComponent(jRadIrregular)))))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadMale)
                    .addComponent(jRadFemale)
                    .addComponent(jLabel4)
                    .addComponent(jComboProgram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jRadRegular)
                    .addComponent(jRadIrregular))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jOtherFees, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jUnits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(8, 8, 8)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNameActionPerformed

    private void jRadMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadMaleActionPerformed

    private void jRadFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadFemaleActionPerformed

    private void jExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jExitActionPerformed

    private void jClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClearActionPerformed
       jName.setText("");
       jRadMale.setSelected(false);
       jRadFemale.setSelected(false);
       jRadInvisible.setSelected(true);
       jRadRegular.setSelected(false);
       jRadIrregular.setSelected(false);
       jRadInvisible2.setSelected(true);
       jComboProgram.setSelectedIndex(0);
       jComboYear.setSelectedIndex(0);
       jComboCourse.setSelectedIndex(0);
       jUnits.setText("");
       jOtherFees.setText("");
       jTextArea.setText("\n\n\n\n                                              Submit Here");
       jName.requestFocus();
       
    }//GEN-LAST:event_jClearActionPerformed

    private void jComboProgramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboProgramActionPerformed
        try
        {
            if (jComboProgram.getSelectedItem().equals("--- Select Program ---"))
            {
            
                jComboCourse.removeAllItems();
                jComboCourse.addItem("--- Select Course ---");
            
            }
        
            else if (jComboProgram.getSelectedItem().equals("College of Arts and Sciences (CAS)"))
            {
            
                jComboCourse.removeAllItems();
                jComboCourse.addItem("--- Select Course ---");
                jComboCourse.addItem("Bachelor of Arts in Communication");
                jComboCourse.addItem("Bachelor of Arts in English Language");
                jComboCourse.addItem("Bachelor of Arts in Visual Design and Communication");
                jComboCourse.addItem("Bachelor of Science in Psychology");
                
            }
            else if (jComboProgram.getSelectedItem().equals("College of Education (CoE)"))
            {
            
                jComboCourse.removeAllItems();
                jComboCourse.addItem("--- Select Course ---");
                jComboCourse.addItem("Bachelor of Early Childhood Education (with straight Masters Program)");
                jComboCourse.addItem("Bachelor of Elementary Education (with straight Masters Program)");
                jComboCourse.addItem("Bachelor of Secondary Education (with straight Masters program) Major in English");
                jComboCourse.addItem("Bachelor of Secondary Education (with straight Masters program) Major in Mathematics");
                jComboCourse.addItem("Bachelor of Secondary Education (with straight Masters program) Major in Science");
                jComboCourse.addItem("Bachelor of Special Needs Education");
                
            }
            else if (jComboProgram.getSelectedItem().equals("College of Business and Management (CBM)"))
            {

                jComboCourse.removeAllItems();
                jComboCourse.addItem("--- Select Course ---");
                jComboCourse.addItem("Bachelor of Science in Business Administration Major in Marketing Management");
                jComboCourse.addItem("Bachelor of Science in Computer Science");
                jComboCourse.addItem("Bachelor of Science in Entrepreneurship");
                jComboCourse.addItem("Bachelor of Science in Hospitality Management Major in Culinary Arts");
                jComboCourse.addItem("Bachelor of Science in Hospitality Management Major in Institutional Management");
                jComboCourse.addItem("Bachelor of Science in Information Technology");
                jComboCourse.addItem("Bachelor of Science in Science in Management Accounting");
                jComboCourse.addItem("Bachelor of Science in Science in Tourism Management");
        
            }
            else if (jComboProgram.getSelectedItem().equals("College of Music and the Performing Arts (CMPA)"))
            {

                jComboCourse.removeAllItems();
                jComboCourse.addItem("--- Select Course ---");
                jComboCourse.addItem("Bachelor of Music in Collaborative Piano");
                jComboCourse.addItem("Bachelor of Music in Guitar");
                jComboCourse.addItem("Bachelor of Music in Marimba");
                jComboCourse.addItem("Bachelor of Music in Music Education");
                jComboCourse.addItem("Bachelor of Music in Music Education with concentration in Composition");
                jComboCourse.addItem("Bachelor of Music in Music Education with concentration in Music Theory");
                jComboCourse.addItem("Bachelor of Music in Music Therapy");
                jComboCourse.addItem("Bachelor of Music in Performance");
                jComboCourse.addItem("Bachelor of Music in Piano");
                jComboCourse.addItem("Bachelor of Music in Technical Theater");
                jComboCourse.addItem("Bachelor of Music in Violin");
                jComboCourse.addItem("Bachelor of Music in Voice");
            }
            else if (jComboProgram.getSelectedItem().equals("College of Nursing and Allied Health Services (CNAHS)"))
            {
            
                jComboCourse.removeAllItems();
                jComboCourse.addItem("--- Select Course ---");
                jComboCourse.addItem("Bachelor of Science in Nursing");
        
            }
            
        }
        catch(Exception e)
                {
                System.out.print(e);
                }
    }//GEN-LAST:event_jComboProgramActionPerformed

    private void jRadInvisibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadInvisibleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadInvisibleActionPerformed

    private void jSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSubmitActionPerformed
        
        String Name;
        String Gender = "";
        String Classification = "";
        String Program = (String) jComboProgram.getSelectedItem();
        String Year = (String) jComboYear.getSelectedItem();
        String Course = (String) jComboCourse.getSelectedItem();
        String AdditionalOtherFees;
        
        double Units;
        double TuitionPerUnit = 0;
        double TotalTuitionFees = 0;
        double MiscellaneousFees = 4054.00;
        double OtherFees = 4235.55;
        double AdditionalFees = 4138.60;
        double TotalFees = 0;
        
        Name = jName.getText();
        Units = Integer.parseInt(jUnits.getText());
        AdditionalOtherFees = jOtherFees.getText();

        // Gender Radio Button
        if (jRadMale.isSelected()){
            Gender = "Male";
        }
        else if (jRadFemale.isSelected()){
            Gender = "Female";
        }
        
        // Classification of Student Radio Button
        if (jRadRegular.isSelected()){
            Classification = "Regular Student";
        }
        else if (jRadIrregular.isSelected()){
            Classification = "Irregular Student";
        }
        
        // CSIT and BSN Courses are 2% Higher than other courses
        if ("Bachelor of Science in Computer Science".equals(Course) || "Bachelor of Science in Information Technology".equals(Course) || "Bachelor of Science in Nursing".equals(Course))
        {
            TuitionPerUnit = 1647.93;
            TotalTuitionFees = 1647.93 * Units;
        }
        else
        {
            TuitionPerUnit = 1614.97;
            TotalTuitionFees = 1614.97 * Units;
        }
        
        TotalFees = TotalTuitionFees + MiscellaneousFees + OtherFees + AdditionalFees;
        
        jTextArea.setText("Name: " + Name); 
        jTextArea.append("\nGender: " + Gender);
        jTextArea.append("\nProgram: " + Program);
        jTextArea.append("\nYear Level: " + Year);
        jTextArea.append("\nClassification of Student: " + Classification);
        jTextArea.append("\nCourse: " + Course);
        jTextArea.append("\nUnits: " + Units);
        jTextArea.append("\n");
        jTextArea.append("\n----------------------------------------------------------------------------------------------------");
        jTextArea.append("\nTuition Fees Per Unit: " + TuitionPerUnit);
        jTextArea.append("\nTotal Tuition Fees: " + TotalTuitionFees);
        jTextArea.append("\nMiscellaneous Fees: " + MiscellaneousFees);
        
        if (jOtherFees.getText().equals(""))
        {
            jTextArea.append("\nOther Fees: " + OtherFees);
            jOtherFees.setText("None");
            jTextArea.append("\nAdditional Fees: " + AdditionalFees);
            jTextArea.append("\n----------------------------------------------------------------------------------------------------");
            jTextArea.append("\n");
            jTextArea.append("\nTOTAL ASSESSED FEES: " + String.format("%.2f", TotalFees));
        }
        else
        {
            jTextArea.append("\nOther Fees: " + OtherFees + " + " + AdditionalOtherFees);
            jTextArea.append("\nAdditional Fees: " + AdditionalFees);
            jTextArea.append("\n----------------------------------------------------------------------------------------------------");
            jTextArea.append("\n");
            jTextArea.append("\nTOTAL ASSESSED FEES: " + String.format("%.2f", TotalFees) + " + " +  AdditionalOtherFees);
            jTextArea.append("\n");
            jTextArea.append("\n----------------------------------------------------------------------------------------------------");
            jTextArea.append("\nNote: Additional other fees (" + AdditionalOtherFees + ") would be given at a later date.");
        }
        
        jTextArea.setEditable(false);
        
    }//GEN-LAST:event_jSubmitActionPerformed

    private void jComboCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCourseActionPerformed
        
    }//GEN-LAST:event_jComboCourseActionPerformed

    private void jOtherFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jOtherFeesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jOtherFeesActionPerformed

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
            java.util.logging.Logger.getLogger(AssessmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AssessmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AssessmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AssessmentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AssessmentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jClear;
    private javax.swing.JComboBox<String> jComboCourse;
    private javax.swing.JComboBox<String> jComboProgram;
    private javax.swing.JComboBox<String> jComboYear;
    private javax.swing.JButton jExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jName;
    private javax.swing.JTextField jOtherFees;
    private javax.swing.JRadioButton jRadFemale;
    private javax.swing.JRadioButton jRadInvisible;
    private javax.swing.JRadioButton jRadInvisible2;
    private javax.swing.JRadioButton jRadIrregular;
    private javax.swing.JRadioButton jRadMale;
    private javax.swing.JRadioButton jRadRegular;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jSubmit;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jUnits;
    // End of variables declaration//GEN-END:variables
}