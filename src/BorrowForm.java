
import java.awt.Image;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ko
 */
public class BorrowForm extends javax.swing.JFrame {

    /**
     * Creates new form BorrowForm
     */
    DefaultTableModel model = new DefaultTableModel();
    public BorrowForm() {
        initComponents();
        model = (DefaultTableModel)jTable2.getModel();
        showData();
        
        book_qty.setVisible(false);
    }
    
    
   Boolean bookCk=false,memberCheck=false,employeeCk=false;
    public void showData()
    {
        Connection c = MyConnection.getConnection();
        int rowCount = jTable2.getRowCount()-1;
        while(rowCount>=0)
        {
            model.removeRow(rowCount--);
        }
        try {
         /*   String insert = "select borrow_id, employee_id,member_id from tb_borrow where status = ? "
                    + "inner join tb_borrow_detail on tb_borrow.book_id = tb_borrow_detail.bookid "
                    + "on tb_borrow.borrow_date = tb_borrow_detail.borrow_date"
                    + "on tb_borrow.send_date = tb_borrow_detail.send_date"
                    + "on tb_borrow.status = tb_borrow_detail.borrow_date"; */
         String insert = "select * from tb_borrow where status = ? ";

            PreparedStatement ps = c.prepareStatement(insert);
            ps.setString(1, "ຍັງບໍ່ສົ່ງ");
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                String [] arr = {rs.getString("borrow_id").toString(),rs.getString("employee_id").toString(),rs.getString("member_id").toString(),rs.getString("book_id").toString(),rs.getDate("borrow_date").toString(),rs.getDate("send_date").toString(),rs.getString("status").toString()};
                model.addRow(arr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        book_id = new javax.swing.JTextField();
        bookSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        book_name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        book_qty = new javax.swing.JTextField();
        book_picture = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        employee_id = new javax.swing.JTextField();
        employee_search = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        employee_name = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        employ_surname = new javax.swing.JTextField();
        employee_picute = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        member_id = new javax.swing.JTextField();
        memberSearch = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        member_name = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        member_surname = new javax.swing.JTextField();
        member_picture = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        summit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Book", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Phetsarath OT", 1, 14), new java.awt.Color(255, 0, 102))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        book_id.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jPanel1.add(book_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 22, 100, -1));

        bookSearch.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        bookSearch.setText("ຄົ້ນຫາ");
        bookSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookSearchActionPerformed(evt);
            }
        });
        jPanel1.add(bookSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 70, 30));

        jLabel2.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jLabel2.setText("ຊຶ່ປຶ້ມ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 40, 20));

        book_name.setEditable(false);
        book_name.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jPanel1.add(book_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 100, 30));

        jLabel1.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jLabel1.setText("ລະຫັດ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 40, 20));

        book_qty.setEditable(false);
        book_qty.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jPanel1.add(book_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 100, 30));

        book_picture.setBackground(new java.awt.Color(255, 0, 51));
        book_picture.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        book_picture.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel1.add(book_picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 100, 130));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 430, 180));

        jPanel3.setLayout(new java.awt.BorderLayout());

        jTable2.setFont(new java.awt.Font("Phetsarath OT", 0, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "borrow_id", "employee_id", "member_id", "book_id", "borrow_date", "Must_send_date", "status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, 630, 370));

        jPanel5.setBackground(new java.awt.Color(255, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Libraian", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Phetsarath OT", 1, 14), new java.awt.Color(255, 0, 102))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employee_id.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jPanel5.add(employee_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 22, 100, -1));

        employee_search.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        employee_search.setText("ຄົ້ນຫາ");
        employee_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employee_searchActionPerformed(evt);
            }
        });
        jPanel5.add(employee_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 70, 30));

        jLabel11.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jLabel11.setText("ຊຶ່");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 20, 20));

        employee_name.setEditable(false);
        employee_name.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        employee_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employee_nameActionPerformed(evt);
            }
        });
        jPanel5.add(employee_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 100, 30));

        jLabel12.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jLabel12.setText("ນາມສະກຸນ");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 60, 20));

        employ_surname.setEditable(false);
        employ_surname.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jPanel5.add(employ_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 100, 30));

        employee_picute.setBackground(new java.awt.Color(255, 0, 51));
        employee_picute.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        employee_picute.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel5.add(employee_picute, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 100, 130));

        jLabel14.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jLabel14.setText("ລະຫັດ");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 40, 20));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 430, 160));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Member", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Phetsarath OT", 1, 14), new java.awt.Color(255, 0, 102))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        member_id.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jPanel2.add(member_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 22, 100, -1));

        memberSearch.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        memberSearch.setText("ຄົ້ນຫາ");
        memberSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberSearchActionPerformed(evt);
            }
        });
        jPanel2.add(memberSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 70, 30));

        jLabel5.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jLabel5.setText("ຊຶ່");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 20, 20));

        member_name.setEditable(false);
        member_name.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jPanel2.add(member_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 100, 30));

        jLabel6.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jLabel6.setText("ນາມສະກຸນ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 60, 20));

        member_surname.setEditable(false);
        member_surname.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jPanel2.add(member_surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 100, 30));

        member_picture.setBackground(new java.awt.Color(255, 0, 51));
        member_picture.setFont(new java.awt.Font("Saysettha OT", 0, 12)); // NOI18N
        member_picture.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)));
        jPanel2.add(member_picture, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 100, 130));

        jLabel8.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        jLabel8.setText("ລະຫັດ");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 40, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 410, 160));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jButton1.setText("ລ້າງ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 110, 50));

        summit.setBackground(new java.awt.Color(51, 204, 0));
        summit.setFont(new java.awt.Font("Phetsarath OT", 1, 12)); // NOI18N
        summit.setText("ຢຶນຢັນການຢຶມ");
        summit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                summitActionPerformed(evt);
            }
        });
        getContentPane().add(summit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 210, 50));

        jButton2.setFont(new java.awt.Font("Phetsarath OT", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/house.png"))); // NOI18N
        jButton2.setText("ໜ້າຫຼັກ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 50));

        jLabel3.setFont(new java.awt.Font("Phetsarath OT", 3, 48)); // NOI18N
        jLabel3.setText("ການຢືມປື້ມ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 410, 80));

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Bie\\Desktop\\borrow.png")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1360, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // Function To Resize The Image To Fit Into JLabel
     public ImageIcon ResizeImage(String ImagePath, byte[] pic)
    {
        ImageIcon MyImage = null;
        if(ImagePath != null)
        {
           MyImage = new ImageIcon(ImagePath);
        }else
        {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(member_picture.getWidth(), member_picture.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    
    
    
    
    
    
    private void memberSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberSearchActionPerformed
      String secrchMember = "select m_name,m_lastname,m_picture from tb_member where m_id=?";
        try {
            Connection c= MyConnection.getConnection();
            PreparedStatement ps = c.prepareStatement(secrchMember);
            ps.setString(1, member_id.getText());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                member_name.setText(rs.getString("m_name"));
                 member_surname.setText(rs.getString("m_lastname"));
                 member_picture.setIcon(ResizeImage(null, rs.getBytes("m_picture")));
                 memberCheck=true;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Can't find your ID");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_memberSearchActionPerformed

    private void employee_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employee_searchActionPerformed
        String secrchMember = "select fname,lname,photo from tb_employee where uid=?";
        try {
            Connection c= MyConnection.getConnection();
            PreparedStatement ps = c.prepareStatement(secrchMember);
            ps.setString(1, employee_id.getText());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                employee_name.setText(rs.getString("fname"));
                 employ_surname.setText(rs.getString("lname"));
                 employee_picute.setIcon(ResizeImage(null, rs.getBytes("photo")));
                 employeeCk=true;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Can't find your ID");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
    }//GEN-LAST:event_employee_searchActionPerformed

    public boolean check()
    {
       
        return true;
    }
    
    private void bookSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookSearchActionPerformed
           String secrchMember = "select b_name,b_amount,b_photo from tb_book where b_id=?";
        try {
            Connection c= MyConnection.getConnection();
            PreparedStatement ps = c.prepareStatement(secrchMember);
            ps.setString(1, book_id.getText());
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                book_name.setText(rs.getString("b_name"));
                 book_qty.setText(rs.getString("b_amount"));
                 book_picture.setIcon(ResizeImage(null, rs.getBytes("b_photo")));
                 bookCk=true;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Can't find your ID");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_bookSearchActionPerformed

    private void summitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_summitActionPerformed
if(bookCk==true&&employeeCk==true&&memberCheck==true)
{
   
        String insert = "insert into tb_borrow (employee_id,member_id,book_id,borrow_date,send_date,status) values (?,?,?,?,?,?)";
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        LocalDate today = LocalDate.now();
        Date date = Date.valueOf(today);
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.WEEK_OF_MONTH, 2);
        String send = sf.format(cal.getTime());
     
    
    
        try {
              
            PreparedStatement ps = MyConnection.getConnection().prepareStatement(insert);
            ps.setString(1,employee_id.getText().toString());
            ps.setString(2,member_id.getText().toString());
            ps.setString(3,book_id.getText().toString());
            ps.setString(4,sf.format(date));
            ps.setString(5,send);
            ps.setString(6,"ຍັງບໍ່ສົ່ງ");
          if(ps.executeUpdate()==1)
          {
               JOptionPane.showMessageDialog(null,"Done");
               showData();
          }
          else
          {
               JOptionPane.showMessageDialog(null,"Error");
          }
               
           
          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

else{
    JOptionPane.showMessageDialog(null, "Error");
}
        
    memberCheck=false;
    bookCk=false;
    employeeCk=false;
    
    member_id.setText("");
    member_name.setText("");
    member_surname.setText("");
    member_picture.setIcon(new ImageIcon());
    
    employee_id.setText("");
    employee_name.setText("");
    employ_surname.setText("");
     employee_picute.setIcon(new ImageIcon());
     
     book_id.setText("");
     book_name.setText("");
     book_picture.setIcon(new ImageIcon());
    
    
  
        
    }//GEN-LAST:event_summitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    member_id.setText("");
    member_name.setText("");
    member_surname.setText("");
    member_picture.setIcon(new ImageIcon());
    
    employee_id.setText("");
    employee_name.setText("");
    employ_surname.setText("");
     employee_picute.setIcon(new ImageIcon());
     
     book_id.setText("");
     book_name.setText("");
     book_picture.setIcon(new ImageIcon());
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void employee_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employee_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employee_nameActionPerformed

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
            java.util.logging.Logger.getLogger(BorrowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BorrowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BorrowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BorrowForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BorrowForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookSearch;
    private javax.swing.JTextField book_id;
    private javax.swing.JTextField book_name;
    private javax.swing.JLabel book_picture;
    private javax.swing.JTextField book_qty;
    private javax.swing.JTextField employ_surname;
    private javax.swing.JTextField employee_id;
    private javax.swing.JTextField employee_name;
    private javax.swing.JLabel employee_picute;
    private javax.swing.JButton employee_search;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton memberSearch;
    private javax.swing.JTextField member_id;
    private javax.swing.JTextField member_name;
    private javax.swing.JLabel member_picture;
    private javax.swing.JTextField member_surname;
    private javax.swing.JButton summit;
    // End of variables declaration//GEN-END:variables
}
