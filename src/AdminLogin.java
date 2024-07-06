import javax.swing.ImageIcon;    // this import help in changing Jpane option icon
import javax.swing.JOptionPane;

public class AdminLogin extends javax.swing.JFrame {

    /**
     * Creates new form AdminLogin
     */
    public AdminLogin() {
        initComponents();
    }

    // This method is called from within the constructor to initialize the form.

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 210, -1, -1));

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 240, 221, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 290, -1, -1));

        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox1.setText("Show Password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 360, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.png"))); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 410, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 410, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 320, 220, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login Background.PNG"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // "back" button to get back to index page
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        // closing the admin login page
        setVisible(false);
        // returning back to the index page
        new index().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
    // "login" button to go to the admin home page
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // checking whether the username and password are correct or not
        if (jTextField1.getText().equals("dina") && jPasswordField1.getText().equals("admin")){
            // if they are correct, then go to admin home page
            setVisible(false);
            new AdminHome().setVisible(true);
        }
        
        else if (jTextField1.getText().equals("nada") && jPasswordField1.getText().equals("admin2")){
            // if they are correct, then go to admin home page
            setVisible(false);
            new AdminHome().setVisible(true);
        }
        
        else if (jTextField1.getText().equals("rawan") && jPasswordField1.getText().equals("admin3")){
            // if they are correct, then go to admin home page
            setVisible(false);
            new AdminHome().setVisible(true);
        }
        
        else if (jTextField1.getText().equals("farah") && jPasswordField1.getText().equals("admin4")){
            // if they are correct, then go to admin home page
            setVisible(false);
            new AdminHome().setVisible(true);
        }
        else{
            // a message appears to the user that the password is incorrect
            ImageIcon icon= new ImageIcon("Incorrect Password.PNG");
            // using html command to display the message box
            JOptionPane.showMessageDialog(null, "<html> <b style=\"color: red; font-size: 10px\"> <t>Incorrect <br> Username Or Password </b> </t></html>", "Error!", JOptionPane.INFORMATION_MESSAGE,icon );
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    // "show password" checkbox 
    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        // if the user selected the checkbox then the password will appear to him in characters
        // using the function setEchoChar
        if (jCheckBox1.isSelected()){
            jPasswordField1.setEchoChar((char)0);
        }
        // if the user stopped selecting it then the password will return back 
        // to be in the form of stars to be hidden 
        else {
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
