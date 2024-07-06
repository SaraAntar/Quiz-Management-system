
public class instructionStudent extends javax.swing.JFrame {
    // defining rollNo of the student
    public String rollNo;

    /**
     * Creates new form instructionStudent
     */
    public instructionStudent() {
        initComponents();
    }

    public instructionStudent(String rollNo1) {
        initComponents();
        // doesn't allow the user to edit the text area
        jTextArea1.setEditable(false);
        // receiving the rollNo of the student from student details class to send it to the quiz page
        rollNo= rollNo1;
    }
    
    // setter and getter
    public void setrollno(String rollNo){
        this.rollNo=rollNo;
    }
    
    public String getrollno(){
        return rollNo;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/index student.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 40)); // NOI18N
        jLabel2.setText("Instructions");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 12, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 1366, 10));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("During the exam:\n\n1. The student must not use his or her notebook, course notes or receive help from proctor or any other outside source.\n\n2. Students must complete the 10-question multiple-choice exam within the 10-minute time frame allotted for the exam.\n\n3. Students must not stop the session and then return to it. This is especially important in the online environment where \n\n   the system will \"time-out\" and will not allow the student or you to reenter the exam.\n\n\nNumber of Questions: 10\n\nExam Duration: 10 mins\n\nBest Luck! ");
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 121, 1354, 491));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jButton1.setText("START QUIZ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 650, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pages background student.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // "Start Quiz" button
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        // closing the instruction form 
        setVisible(false);
        // opening the quiz form 
        new QuizStudent(rollNo).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextArea1MouseClicked
        // doesn't allow the user to edit the text area
        jTextArea1.setEditable(false);
    }//GEN-LAST:event_jTextArea1MouseClicked


    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new instructionStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
