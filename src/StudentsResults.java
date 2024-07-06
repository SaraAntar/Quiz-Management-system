import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import project.ConnectionProvider;

public class StudentsResults extends javax.swing.JFrame {

    /**
     * Creates new form StudentsResults
     */
    public StudentsResults() {
        initComponents();
        try{
            // connecting to database
            Connection con= ConnectionProvider.getCon();
            Statement st= con.createStatement();
            // query to get all the students data stored in the database 
            ResultSet rs= st.executeQuery("select *from student");
            // function that doesn't allow the user to resize the table
            jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
            // displaying the students data brought from the database into the table
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(150, 183));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all student result.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 24, -1, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel2.setText("All Students Results");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 30, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 82, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1066, 10));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("Filter Students By Marks");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 121, -1, -1));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 118, 100, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 890, 350));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages background admin.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // close button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       AdminHome.open=0;
       setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // text field that filters the students by their marks
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        int marks;
        if (jTextField1.getText().equals("")){
            marks=0;
        }
        
        else{
            // storing the number entered by the user in the textfield into marks variable
            marks= Integer.parseInt(jTextField1.getText());
        }
        
        try{
            // connecting to database
            Connection con= ConnectionProvider.getCon();
            Statement st= con.createStatement();
            // query that brings the students whose marks are equal to or greater 
            // than the mark entered by the user in the filtration text field from the database 
            ResultSet rs= st.executeQuery("select *from student where marks >= "+marks+"");
            // not allowing the user to change the size of the table displayed
            jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
            // displaying the students whose marks are specified by the user in the table 
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception e){
            JFrame jf= new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jTextField1KeyReleased


    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentsResults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
