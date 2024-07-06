import java.sql.*;
import project.ConnectionProvider;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.awt.Color;

public class StudentDetails extends javax.swing.JFrame {

    /**
     * Creates new form StudentDetails
     */
    // constructor
    public StudentDetails() {
        initComponents();
        // doesn't allow user to edit the text area when it's displayed
        jTextArea1.setEditable(false);
        // using date class to display the date of the day using the standard format of the date
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        // displaying the date on the screen
        jLabel4.setText(dFormat.format(date));
    }

    // This method is called from within the constructor to initialize the form.

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index student.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel2.setText("Fill Up The Form");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 31, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Date: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 40, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back student.png"))); // NOI18N
        jButton1.setText("  Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 20, -1, 70));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1268, 21, 77, 70));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 103, 1366, 10));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setText("Roll Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 153, 112, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("Name");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 201, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setText("Father Name");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 249, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setText("Mother Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 307, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setText("Gender");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 355, 118, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setText("Contact Number");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 404, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setText("Email");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 452, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel14.setText("Graduation");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setText("Address");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 150, 466, -1));

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 198, 466, -1));

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 246, 466, -1));

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 304, 466, -1));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male ", "Female" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 352, 466, -1));

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 401, 466, -1));

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 449, 466, -1));

        jTextField13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jTextField13.setForeground(new java.awt.Color(153, 153, 153));
        jTextField13.setText("Enter University Name");
        jTextField13.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField13FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField13FocusLost(evt);
            }
        });
        getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 460, -1));

        jTextField14.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jTextField14.setForeground(new java.awt.Color(153, 153, 153));
        jTextField14.setText("Enter Percentage");
        jTextField14.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField14FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField14FocusLost(evt);
            }
        });
        getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 500, 275, -1));

        jTextField15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jTextField15.setForeground(new java.awt.Color(153, 153, 153));
        jTextField15.setText("Enter Passout Year");
        jTextField15.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField15FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField15FocusLost(evt);
            }
        });
        getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 500, 275, -1));

        jTextField16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, 1145, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save.png"))); // NOI18N
        jButton3.setText("Save & Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 620, 313, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\n  Examination Management System is managing all the activities\n\n  related to examination management right from \n\n  receipt of Enorllment Forms and Examination Forms through\n\n  the processing of Results and Certificates and Grading Reports.");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 590, 210));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages background student.jpg"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // "back" button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // closing the students' form 
        setVisible(false);
        // returning back to index page
        new index().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    // "save and next" button 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String rollNo = jTextField1.getText();
        String name = jTextField2.getText();
        String fatherName = jTextField3.getText();
        String motherName = jTextField4.getText();
        String gender = (String)jComboBox1.getSelectedItem();
        String contactNo = jTextField5.getText();
        String email = jTextField6.getText();
        String graduationUniversityName = jTextField13.getText();
        String graduationPercentage = jTextField14.getText();
        String graduationPassoutYear = jTextField15.getText();       
        String address = jTextField16.getText();
        String marks="0";
        
        try{
            // connecting to database
            Connection con= ConnectionProvider.getCon();
            // query to insert student's data into databse 
            PreparedStatement ps= con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, rollNo);
            ps.setString(2, name);
            ps.setString(3, fatherName);
            ps.setString(4, motherName);
            ps.setString(5, gender);
            ps.setString(6, contactNo);
            ps.setString(7, email);
            ps.setString(8, graduationUniversityName);
            ps.setString(9, graduationPercentage);
            ps.setString(10, graduationPassoutYear);
            ps.setString(11, address);
            ps.setString(12, marks);
            ps.executeUpdate();
            // closing the form of the student 
            setVisible(false);
            // going to next page which is the exam instructions
            new instructionStudent(rollNo).setVisible(true);
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    // exit button 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        // a message appears to user to check whether he really wants to exit or not
        int ex= JOptionPane.showConfirmDialog(null, "Are You Sure You Want To Exit From The Application?", "Select", JOptionPane.YES_NO_OPTION);
        if (ex==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jTextField13FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusGained
      
        // by clicking on this text field, the text inside it will dissapear to let the users enter their data
        if(jTextField13.getText().equals("Enter University Name"))
        {
            // removing the text written 
            jTextField13.setText("");
            // allowing the user to write in black
            jTextField13.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField13FocusGained

    private void jTextField14FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusGained
       
        if(jTextField14.getText().equals("Enter Percentage"))
        {
            jTextField14.setText("");
            jTextField14.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField14FocusGained

    private void jTextField15FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusGained
       
        if(jTextField15.getText().equals("Enter Passout Year"))
        {
            jTextField15.setText("");
            jTextField15.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField15FocusGained

    private void jTextField13FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField13FocusLost
       // if the user pressed on any other textfield and lost the focus on the specified 
       // text field, then Enter University Name will appear one more time in its grey color
        if (jTextField13.getText().equals("")){
            jTextField13.setText("Enter University Name");
            jTextField13.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField13FocusLost

    private void jTextField14FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField14FocusLost
       
        if (jTextField14.getText().equals("")){
            jTextField14.setText("Enter Percentage");
            jTextField14.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField14FocusLost

    private void jTextField15FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField15FocusLost
        
        if (jTextField15.getText().equals("")){
            jTextField15.setText("Enter Passout Year");
            jTextField15.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField15FocusLost

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
