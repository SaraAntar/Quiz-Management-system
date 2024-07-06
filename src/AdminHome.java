import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AdminHome extends javax.swing.JFrame {
    // an attribute that doesn't allow multiple opening of any form, just one at a time
    public static int open=0;
    /**
     * Creates new form AdminHome
     */
    public AdminHome() {
        initComponents();
    }
    // setters and getters
    public void setopen(int open){
        this.open=open;
    }
    
    public int getopen(){
        return open;
    }
    // This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu12 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -122, -1, 780));

        jMenuBar2.setBackground(new java.awt.Color(0, 102, 102));
        jMenuBar2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Navigation Bar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 102, 102))); // NOI18N

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new question.png"))); // NOI18N
        jMenu8.setText("Add New Question");
        jMenu8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu8.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu8.setMaximumSize(new java.awt.Dimension(230, 32767));
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu8);

        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Update Question.png"))); // NOI18N
        jMenu9.setText("Update Question");
        jMenu9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu9.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu9.setMaximumSize(new java.awt.Dimension(220, 32767));
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu9);

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all questions.png"))); // NOI18N
        jMenu10.setText("All Questions");
        jMenu10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu10.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu10.setMaximumSize(new java.awt.Dimension(190, 32767));
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu10);

        jMenu11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete Question.png"))); // NOI18N
        jMenu11.setText("Delete Question");
        jMenu11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu11.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu11.setMaximumSize(new java.awt.Dimension(200, 32767));
        jMenu11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu11MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu11);

        jMenu12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/all student result.png"))); // NOI18N
        jMenu12.setText("All Students Results");
        jMenu12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu12.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu12.setMaximumSize(new java.awt.Dimension(225, 32767));
        jMenu12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu12MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu12);

        jMenu13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logout.png"))); // NOI18N
        jMenu13.setText("Logout");
        jMenu13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu13.setMargin(new java.awt.Insets(0, 5, 0, 30));
        jMenu13.setMaximumSize(new java.awt.Dimension(150, 32767));
        jMenu13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu13MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu13);

        jMenu14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Close.png"))); // NOI18N
        jMenu14.setText("Exit");
        jMenu14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jMenu14.setMargin(new java.awt.Insets(0, 5, 0, 15));
        jMenu14.setMaximumSize(new java.awt.Dimension(130, 32767));
        jMenu14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu14MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenu14);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // "logout button" to log out to the admin login page
    private void jMenu13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu13MouseClicked
        // a message appears to the user to make sure whether he will logout the or not using JFrame class 
        JFrame jframe= new JFrame();
        jframe.setAlwaysOnTop(true);
        int option= JOptionPane.showConfirmDialog(jframe, "Are You Sure You Want to Logout?", "Select", JOptionPane.YES_NO_OPTION);
        if (option==0){
            // if the user pressed yes, then he will logout to the admin login page 
            setVisible(false);
            new AdminLogin().setVisible(true);
        }
    }//GEN-LAST:event_jMenu13MouseClicked
    // "close button" to close the entire application
    private void jMenu14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu14MouseClicked

        // condition to check whether the user really wants to exit the application
        JFrame jframe= new JFrame();
        int option= JOptionPane.showConfirmDialog(jframe, "Are You Sure You Want to Exit?", "Select", JOptionPane.YES_NO_OPTION);
        if (option==0){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenu14MouseClicked
    // "add new question" button
    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked

        // a condition to check if one form is already opened or not
        // if no, then open a new form of add new question
        if(open==0){
            new addNewQuestion().setVisible(true);
            // means that I opened one form, and the admin home page will still 
            // be appearing from behind the add new question form 
            open=1;
        }
        // this condition means that I already opened one form and it's still
        // opened, so I can't open another one
        else{
            // a message box is displayed to the user
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is already Opened");
        }
    }//GEN-LAST:event_jMenu8MouseClicked
    // "update question" button
    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked

        // a condition to check if one form is already opened or not
        // if no, then open a new form of update question
        if(open==0){
            new updateQuestion().setVisible(true);
            // means that I opened one form
            open=1;
        }
         // this condition means that I already opened one form and it's still
        // opened, so I can't open another one
        else{
            // a message box is displayed to the user
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is already Open");
        }
    }//GEN-LAST:event_jMenu9MouseClicked
    // "all question" button to go to all questions page
    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked

        if(open==0){
            new allQuestion().setVisible(true);
            open=1;
        }
        else{
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is already Open");
        }
    }//GEN-LAST:event_jMenu10MouseClicked
     // "delete question" button to go to delete questions page
    private void jMenu11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu11MouseClicked
       
        if(open==0){
            new DeleteQuestion().setVisible(true);
            open=1;
        }
        else{
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is already Open");
        }
    }//GEN-LAST:event_jMenu11MouseClicked
     // "all students results" button to go to all students results page
    private void jMenu12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu12MouseClicked
        
        if(open==0){
            new StudentsResults().setVisible(true);
            open=1;
        }
        else{
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf,"One form is already Open");
        }
    }//GEN-LAST:event_jMenu12MouseClicked

    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar2;
    // End of variables declaration//GEN-END:variables
}
