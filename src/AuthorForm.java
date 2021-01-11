
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bie
 */
public class AuthorForm extends javax.swing.JFrame {
 DefaultTableModel model = new DefaultTableModel();
 
 ResultSet rs;
 Connection c = MyConnection.getConnection();
    PreparedStatement ps;
    /**
     * Creates new form AuthorForm
     */
    public AuthorForm() {
        initComponents();
        Date date = new Date();
        authorbirthdateBox.setDate(date);
        
         model = (DefaultTableModel) tbModel.getModel();
        showData();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbModel = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        authoridBox = new javax.swing.JTextField();
        authornameBox = new javax.swing.JTextField();
        authorsurnameBox = new javax.swing.JTextField();
        authorbirthdateBox = new com.toedter.calendar.JDateChooser();
        authornationallyBox = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        rbmale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Phetsarath OT", 0, 72)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ຈັດການຂໍ້ມູນນັກຂຽນ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 560, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 810, 130));

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setForeground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(null);

        tbModel.setFont(new java.awt.Font("Phetsarath OT", 0, 14)); // NOI18N
        tbModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "au_id", "au_name", "au_surname", "au_birthdate", "au_nationality", "au_gender"
            }
        ));
        tbModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbModelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbModel);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(50, 270, 710, 280);

        jLabel5.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jLabel5.setText("ສັນຊາດ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(160, 230, 49, 29);

        jLabel6.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jLabel6.setText("ວັນ/ເດືອນ/ປີເກີດ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(160, 189, 122, 20);

        jLabel7.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jLabel7.setText("ເພດ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(160, 140, 70, 29);

        jLabel9.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jLabel9.setText("ຊື່");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(160, 50, 70, 29);

        jLabel8.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jLabel8.setText("ID");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(160, 0, 70, 29);

        authoridBox.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        authoridBox.setEnabled(false);
        authoridBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authoridBoxActionPerformed(evt);
            }
        });
        jPanel1.add(authoridBox);
        authoridBox.setBounds(300, 0, 188, 29);

        authornameBox.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        authornameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authornameBoxActionPerformed(evt);
            }
        });
        jPanel1.add(authornameBox);
        authornameBox.setBounds(300, 40, 188, 40);

        authorsurnameBox.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jPanel1.add(authorsurnameBox);
        authorsurnameBox.setBounds(300, 90, 188, 40);
        jPanel1.add(authorbirthdateBox);
        authorbirthdateBox.setBounds(300, 180, 188, 30);

        authornationallyBox.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jPanel1.add(authornationallyBox);
        authornationallyBox.setBounds(300, 220, 188, 40);

        btndelete.setBackground(new java.awt.Color(255, 51, 51));
        btndelete.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        btndelete.setText("ລົບ");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete);
        btndelete.setBounds(560, 140, 90, 50);

        btnedit.setBackground(new java.awt.Color(0, 255, 153));
        btnedit.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        btnedit.setText("ແກ້ໄຂ");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        jPanel1.add(btnedit);
        btnedit.setBounds(560, 80, 90, 50);

        btnsave.setBackground(new java.awt.Color(51, 255, 0));
        btnsave.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        btnsave.setText("ບັນທຶກ");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave);
        btnsave.setBounds(560, 20, 90, 43);

        jLabel10.setFont(new java.awt.Font("Phetsarath OT", 0, 18)); // NOI18N
        jLabel10.setText("ນາມສະກຸນ");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(160, 90, 70, 29);

        buttonGroup1.add(rbmale);
        rbmale.setFont(new java.awt.Font("Phetsarath OT", 0, 11)); // NOI18N
        rbmale.setText("ຊາຍ");
        jPanel1.add(rbmale);
        rbmale.setBounds(300, 140, 60, 25);

        buttonGroup1.add(rbfemale);
        rbfemale.setFont(new java.awt.Font("Phetsarath OT", 0, 11)); // NOI18N
        rbfemale.setText("ຍິງ");
        jPanel1.add(rbfemale);
        rbfemale.setBounds(400, 140, 90, 25);

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jButton1.setText("ລ້າງ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(660, 20, 80, 170);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 810, 560));

        jButton2.setFont(new java.awt.Font("Phetsarath OT", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/house.png"))); // NOI18N
        jButton2.setText("ໜ້າຫຼັກ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/unsplash-book-reading.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void authoridBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authoridBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authoridBoxActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
Connection c = MyConnection.getConnection();
String  name = authornameBox.getText();
String surname = authorsurnameBox.getText();
 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
 String birthdate = dateformat.format(authorbirthdateBox.getDate());
String national = authornationallyBox.getText();
String gender="";
  if (rbmale.isSelected()) {
            gender=rbmale.getText();

        }
        if (rbfemale.isSelected()) {
            gender=rbfemale.getText();

        }

 if(name.equals("")){
            JOptionPane.showMessageDialog(null, "Please Fill All Of Information");
        }else if(surname.equals("")){
            JOptionPane.showMessageDialog(null, "Please Fill All Of Information");
        }else  if(national.equals("")){
            JOptionPane.showMessageDialog(null, "Please Fill All Of Information");
        }

        //   else if(BirthdateBox.getDate()!=null){
            //      SimpleDateFormat dataformat = new SimpleDateFormat("yyyy-mm-dd");
            //    bdate = dataformat.format(BirthdateBox.getDate());
            //  }
        else{
        try {
            String sql="INSERT INTO `tb_author`( `au_name`, `au_surname`, `au_birthdate`, `au_nationality`,au_gender) VALUES (?,?,?,?,?)";
            PreparedStatement ps = c.prepareStatement(sql);
            
            ps.setString(1, name);
            ps.setString(2, surname);
            ps.setString(3, birthdate);
            ps.setString(4,national);
             ps.setString(5,gender);
            
           
            
          if(ps.executeUpdate()!=-1){
                    JOptionPane.showMessageDialog(null, "complete","save",JOptionPane.INFORMATION_MESSAGE);
                    
                  
                }
          showData();
           authoridBox.setText("");
           authornameBox.setText("");
          authorsurnameBox.setText("");
          authornationallyBox.setText("");
          authorbirthdateBox.setDate(new Date()); 
         
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    
   private void showData() {
      int row = tbModel.getRowCount()-1;
      while(row>=0)
      {
          model.removeRow(row--);
      }
        try {
               String select  =  "select * from tb_author";
      ResultSet rs = c.createStatement().executeQuery(select);
      while(rs.next())
      {
         String []  arr = {String.valueOf(rs.getInt("au_id")),String.valueOf(rs.getString("au_name")),
         String.valueOf(rs.getString("au_surname")),String.valueOf(rs.getDate("au_birthdate")),String.valueOf(rs.getString("au_nationality")),String.valueOf(rs.getString("au_gender"))};
         model.addRow(arr);
      }
      
        } catch (Exception e) {
            e.printStackTrace();
        }
   
      
    }
    
    private void authornameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authornameBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authornameBoxActionPerformed

    private void tbModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbModelMouseClicked
    try {
            int index = tbModel.getSelectedRow();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            authoridBox.setText(tbModel.getValueAt(index, 0).toString());
            authornameBox.setText((String) tbModel.getValueAt(index, 1));
            authorsurnameBox.setText(tbModel.getValueAt(index, 2).toString());
              authorbirthdateBox.setDate(sdf.parse(tbModel.getValueAt(index, 3).toString()));
            authornationallyBox.setText(tbModel.getValueAt(index, 4).toString());
           String gender = tbModel.getValueAt(index, 5).toString();
            if(gender.equals("ຊາຍ")){
                rbmale.setSelected(true);
            }else{
                rbfemale.setSelected(true);
            }
          
          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbModelMouseClicked

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
     try {
            String sql="update tb_author set au_name=?,au_surname=?,au_birthdate=?,au_nationality=?,au_gender=? where au_id=?";
            
            ps = c.prepareStatement(sql);
 
             ps.setString(5, authoridBox.getText());
            ps.setString(1, authornameBox.getText());
            ps.setString(2, authorsurnameBox.getText());
            
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            ps.setString(3, sdf.format(authorbirthdateBox.getDate()));
            ps.setString(4, authornationallyBox.getText());
             String gender="";
            if(rbmale.isSelected()){
               gender= rbmale.getText();
            }else{
              gender=  rbfemale.getText();
            }
            ps.setString(5, gender);
         
            
       //     ps.executeUpdate();
       
       if(ps.executeUpdate()!=-1){
                    JOptionPane.showMessageDialog(null, "complete","save",JOptionPane.INFORMATION_MESSAGE);      
                }
            showData();
            authoridBox.setText("");
            authornameBox.setText("");
          authorsurnameBox.setText("");
          authornationallyBox.setText("");
          authorbirthdateBox.setDate(new Date());
          
        } catch (Exception e) {
            e.printStackTrace();
        }
     
    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
      try {
            String sql="DELETE FROM `tb_author` where au_id=?";
            
            ps = c.prepareStatement(sql);
 
             ps.setString(1, authoridBox.getText());
         
       if(ps.executeUpdate()!=-1){
                    JOptionPane.showMessageDialog(null, "complete","save",JOptionPane.INFORMATION_MESSAGE);
                    
                      
                }
            showData();
            authoridBox.setText("");
            authornameBox.setText("");
          authorsurnameBox.setText("");
          authornationallyBox.setText("");
          authorbirthdateBox.setDate(new Date()); 
          
        } catch (Exception e) {
            e.printStackTrace();
        }
     
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   authoridBox.setText("");
            authornameBox.setText("");
          authorsurnameBox.setText("");
          authornationallyBox.setText("");
          authorbirthdateBox.setDate(new Date()); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
new Home().setVisible(true);
this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(AuthorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AuthorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AuthorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AuthorForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AuthorForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser authorbirthdateBox;
    private javax.swing.JTextField authoridBox;
    private javax.swing.JTextField authornameBox;
    private javax.swing.JTextField authornationallyBox;
    private javax.swing.JTextField authorsurnameBox;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JTable tbModel;
    // End of variables declaration//GEN-END:variables
}
