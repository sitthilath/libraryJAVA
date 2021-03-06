
import java.awt.Image;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.rmi.server.UID;
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import javax.print.SimpleDoc;
//import javax.swing.ImageIcon;
//import javax.swing.JFileChooser;
//import javax.swing.JFrame;
//import javax.swing.JOptionPane;
//import javax.swing.JRadioButton;
//import javax.swing.table.DefaultTableModel;
//import javax.swing.table.TableModel;
import javax.swing.*;
import javax.swing.table.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bie
 */
public class EmployeeForm extends javax.swing.JFrame {

    
   
    
    Connection c = MyConnection.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel model = new DefaultTableModel();
  
    /**
     * Creates new form EditInformationUserForm
     */
    public EmployeeForm() {
        initComponents();
          model = (DefaultTableModel) tbModel.getModel();
        showData();
        birthdateBox.setDate(new Date());
        
      //   Toolkit tk = Toolkit.getDefaultToolkit(); //full screen
       // int xsize=(int) tk.getScreenSize().getWidth();
        // int ysize=(int) tk.getScreenSize().getHeight();
         //this.setSize(xsize,ysize);
         
  //       setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
   
    //show TableModel
    
    
    
    private void showData() {
      int row = tbModel.getRowCount()-1;
      while(row>=0)
      {
          model.removeRow(row--);
      }
        try {
               String select  =  "select * from tb_employee";
      ResultSet rs = c.createStatement().executeQuery(select);
      while(rs.next())
      {
         String []  arr = {String.valueOf(rs.getInt("uid")),String.valueOf(rs.getString("fname")),
         String.valueOf(rs.getString("lname")),String.valueOf(rs.getInt("age")),
                 String.valueOf(rs.getString("uname")),String.valueOf(rs.getString("pass")),
                         String.valueOf(rs.getDate("bdate")),String.valueOf(rs.getString("village")),
                         String.valueOf(rs.getString("city")),String.valueOf(rs.getString("province")),
                         String.valueOf(rs.getInt("phonenum")),String.valueOf(rs.getString("gender")),
                         String.valueOf(rs.getString("Status")),String.valueOf(rs.getBlob("photo"))};
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        LabelMin = new javax.swing.JLabel();
        LabelClose = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        passwordBox = new javax.swing.JTextField();
        firstnameBox = new javax.swing.JTextField();
        usernameBox = new javax.swing.JTextField();
        villageBox = new javax.swing.JTextField();
        cityBox = new javax.swing.JTextField();
        provinceBox = new javax.swing.JTextField();
        phoneBox = new javax.swing.JTextField();
        lastnameBox = new javax.swing.JTextField();
        btnChoose = new javax.swing.JButton();
        labelPhoto = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        PositionBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbModel = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        rbmale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        birthdateBox = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        idBox = new javax.swing.JTextField();
        labelbackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 51, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelMin.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LabelMin.setText("-");
        LabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelMinMouseClicked(evt);
            }
        });
        jPanel1.add(LabelMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, -1, -1));

        LabelClose.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LabelClose.setForeground(new java.awt.Color(255, 0, 0));
        LabelClose.setText("X");
        LabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelCloseMouseClicked(evt);
            }
        });
        jPanel1.add(LabelClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Phetsarath OT", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ຈັດການຂໍ້ມູນພະນັກງານ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, 90));

        jButton2.setFont(new java.awt.Font("Phetsarath OT", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/house.png"))); // NOI18N
        jButton2.setText("ໜ້າຫຼັກ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 90));

        jPanel3.setBackground(new java.awt.Color(204, 51, 0));
        jPanel3.setLayout(null);

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 255, 153));
        jLabel14.setText("ເພດ :");
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel14);
        jLabel14.setBounds(80, 450, 50, 27);

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 255, 153));
        jLabel15.setText("ເບີໂທ :");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel15);
        jLabel15.setBounds(80, 400, 53, 27);

        jLabel17.setBackground(new java.awt.Color(0, 0, 0));
        jLabel17.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 255, 153));
        jLabel17.setText("ແຂວງ :");
        jLabel17.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel17);
        jLabel17.setBounds(80, 360, 56, 27);

        jLabel18.setBackground(new java.awt.Color(0, 0, 0));
        jLabel18.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 255, 153));
        jLabel18.setText("ເມືອງ :");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel18);
        jLabel18.setBounds(80, 320, 60, 27);

        jLabel16.setBackground(new java.awt.Color(0, 0, 0));
        jLabel16.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 255, 153));
        jLabel16.setText("ທີ່ຢູ່ບ້ານ :");
        jLabel16.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel16);
        jLabel16.setBounds(70, 280, 69, 27);

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 255, 153));
        jLabel13.setText("ວັນເດືອນປີເກີດ :");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel13);
        jLabel13.setBounds(20, 240, 120, 27);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 255, 153));
        jLabel9.setText("ລະຫັດຜ່ານ :");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel9);
        jLabel9.setBounds(40, 200, 90, 27);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 153));
        jLabel8.setText("ຊື່ຜູ້ໃຊ້ :");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel8);
        jLabel8.setBounds(80, 160, 70, 27);

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 255, 153));
        jLabel10.setText("ນາມສະກຸນ :");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel10);
        jLabel10.setBounds(50, 120, 89, 27);

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 255, 153));
        jLabel11.setText("ຊື່ :");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel11);
        jLabel11.setBounds(100, 80, 24, 27);

        passwordBox.setFont(new java.awt.Font("Phetsarath OT", 0, 10)); // NOI18N
        jPanel3.add(passwordBox);
        passwordBox.setBounds(160, 200, 146, 30);

        firstnameBox.setFont(new java.awt.Font("Phetsarath OT", 0, 10)); // NOI18N
        jPanel3.add(firstnameBox);
        firstnameBox.setBounds(160, 80, 146, 30);

        usernameBox.setFont(new java.awt.Font("Phetsarath OT", 0, 10)); // NOI18N
        jPanel3.add(usernameBox);
        usernameBox.setBounds(160, 160, 146, 30);

        villageBox.setFont(new java.awt.Font("Phetsarath OT", 0, 10)); // NOI18N
        jPanel3.add(villageBox);
        villageBox.setBounds(160, 280, 146, 30);

        cityBox.setFont(new java.awt.Font("Phetsarath OT", 0, 10)); // NOI18N
        jPanel3.add(cityBox);
        cityBox.setBounds(160, 320, 146, 30);

        provinceBox.setFont(new java.awt.Font("Phetsarath OT", 0, 10)); // NOI18N
        jPanel3.add(provinceBox);
        provinceBox.setBounds(160, 360, 146, 30);

        phoneBox.setFont(new java.awt.Font("Phetsarath OT", 0, 10)); // NOI18N
        jPanel3.add(phoneBox);
        phoneBox.setBounds(160, 400, 146, 30);

        lastnameBox.setFont(new java.awt.Font("Phetsarath OT", 0, 10)); // NOI18N
        jPanel3.add(lastnameBox);
        lastnameBox.setBounds(160, 120, 146, 30);

        btnChoose.setBackground(new java.awt.Color(255, 204, 204));
        btnChoose.setFont(new java.awt.Font("Phetsarath OT", 0, 11)); // NOI18N
        btnChoose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/browsButton.png"))); // NOI18N
        btnChoose.setText("ເລືອກ");
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });
        jPanel3.add(btnChoose);
        btnChoose.setBounds(540, 70, 100, 40);

        labelPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 204)));
        jPanel3.add(labelPhoto);
        labelPhoto.setBounds(420, 20, 110, 120);

        btnClear.setBackground(new java.awt.Color(102, 102, 255));
        btnClear.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clearButton.png"))); // NOI18N
        btnClear.setText("ລ້າງ");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel3.add(btnClear);
        btnClear.setBounds(360, 540, 90, 50);

        jLabel20.setBackground(new java.awt.Color(0, 0, 0));
        jLabel20.setFont(new java.awt.Font("Phetsarath OT", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 255, 255));
        jLabel20.setText("ຮູບ :");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel20);
        jLabel20.setBounds(360, 40, 50, 29);

        PositionBox.setFont(new java.awt.Font("Phetsarath OT", 0, 11)); // NOI18N
        PositionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ເລືອກ", "Admin", "User", " " }));
        PositionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositionBoxActionPerformed(evt);
            }
        });
        jPanel3.add(PositionBox);
        PositionBox.setBounds(160, 490, 150, 30);

        tbModel.setFont(new java.awt.Font("Phetsarath OT", 0, 11)); // NOI18N
        tbModel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Uid", "Fname", "Lname", "Age", "Uname", "Password", "Bdate", "Village", "City", "Province", "PhoneNumber", "Gender", "Status", "photo"
            }
        ));
        tbModel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbModelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbModel);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(490, 150, 860, 440);

        btnEdit.setBackground(new java.awt.Color(0, 255, 153));
        btnEdit.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Edit5.gif"))); // NOI18N
        btnEdit.setText("ແກ້ໄຂ");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel3.add(btnEdit);
        btnEdit.setBounds(140, 540, 98, 50);

        btnDelete.setBackground(new java.awt.Color(255, 51, 51));
        btnDelete.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Delete5.gif"))); // NOI18N
        btnDelete.setText("ລົບ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);
        btnDelete.setBounds(250, 540, 100, 50);

        btnSave.setBackground(new java.awt.Color(51, 255, 0));
        btnSave.setFont(new java.awt.Font("Phetsarath OT", 0, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Add5.gif"))); // NOI18N
        btnSave.setText("ເພິ່ມ");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnSave);
        btnSave.setBounds(30, 540, 100, 50);

        jLabel19.setBackground(new java.awt.Color(0, 0, 0));
        jLabel19.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 255, 153));
        jLabel19.setText("ຕຳແໜ່ງ :");
        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel19);
        jLabel19.setBounds(60, 490, 70, 27);

        buttonGroup1.add(rbmale);
        rbmale.setFont(new java.awt.Font("Phetsarath OT", 0, 10)); // NOI18N
        rbmale.setForeground(new java.awt.Color(102, 255, 153));
        rbmale.setText("ຊາຍ");
        jPanel3.add(rbmale);
        rbmale.setBounds(160, 450, 60, 25);

        buttonGroup1.add(rbfemale);
        rbfemale.setFont(new java.awt.Font("Phetsarath OT", 0, 10)); // NOI18N
        rbfemale.setForeground(new java.awt.Color(102, 255, 153));
        rbfemale.setText("ຍິງ");
        jPanel3.add(rbfemale);
        rbfemale.setBounds(250, 450, 70, 25);
        jPanel3.add(birthdateBox);
        birthdateBox.setBounds(160, 240, 150, 30);

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Phetsarath OT", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 255, 153));
        jLabel12.setText("ລະຫັດ ພະນັກງານ :");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(jLabel12);
        jLabel12.setBounds(15, 40, 140, 22);

        idBox.setEnabled(false);
        jPanel3.add(idBox);
        idBox.setBounds(160, 40, 146, 30);

        labelbackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/photo-1481627834876-b7833e8f5570_1.png"))); // NOI18N
        jPanel3.add(labelbackground);
        labelbackground.setBounds(0, 0, 1370, 650);

        jScrollPane2.setViewportView(jPanel3);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1400, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    
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
        Image newImg = img.getScaledInstance(labelPhoto.getWidth(), labelPhoto.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }
    
    
    
    
    private void tbModelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbModelMouseClicked
        try {
            int index = tbModel.getSelectedRow();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            idBox.setText(tbModel.getValueAt(index, 0).toString());
            firstnameBox.setText((String) tbModel.getValueAt(index, 1));
            lastnameBox.setText(tbModel.getValueAt(index, 2).toString());
            usernameBox.setText(tbModel.getValueAt(index, 4).toString());
            passwordBox.setText(tbModel.getValueAt(index, 5).toString());
            birthdateBox.setDate(sdf.parse(tbModel.getValueAt(index, 6).toString()));
            villageBox.setText(tbModel.getValueAt(index, 7).toString());
            cityBox.setText(tbModel.getValueAt(index,8).toString());
            provinceBox.setText(tbModel.getValueAt(index, 9).toString());
            phoneBox.setText(tbModel.getValueAt(index,10).toString());
         String gender = tbModel.getValueAt(index, 11).toString();
            if(gender.equals("ຊາຍ")){
                rbmale.setSelected(true);
            }else{
                rbfemale.setSelected(true);
            }
             
            String position =tbModel.getValueAt(index, 12).toString();
            if(position.equals("Admin")){
                PositionBox.setSelectedIndex(1);
            }else if(position.equals("User")){
                PositionBox.setSelectedIndex(2);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try{
            int index = tbModel.getSelectedRow();
         String select = "select photo from tb_employee where uid=?";
            PreparedStatement ps = MyConnection.getConnection().prepareStatement(select);
            ps.setString(1,tbModel.getValueAt(index, 0).toString());
            ResultSet rs = ps.executeQuery();
            while(rs.next())
            {
                labelPhoto.setIcon(ResizeImage(null, rs.getBytes("photo")));
                photo = rs.getBytes("photo");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_tbModelMouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            String sql="update tb_employee set fname=?,lname=?,age=?,uname=?,pass=?,bdate=?,village=?,city=?,province=?,phonenum=?,gender=?,Status=?,photo=? where uid=?";
            
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String bdate = dateformat.format(birthdateBox.getDate());
             LocalDate today = LocalDate.now();
            LocalDate birthdate = LocalDate.parse(bdate);
int age= Period.between(birthdate,today).getYears();
            
            ps = c.prepareStatement(sql);
 
             ps.setString(14, idBox.getText());
            ps.setString(1, firstnameBox.getText());
            ps.setString(2, lastnameBox.getText());
                 ps.setInt(3, age);
            ps.setString(4, usernameBox.getText());
            ps.setString(5,passwordBox.getText());
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            
            ps.setString(6, sdf.format(birthdateBox.getDate()));
            ps.setString(7, villageBox.getText());
            ps.setString(8,cityBox.getText());
            ps.setString(9, provinceBox.getText());
            ps.setString(10,phoneBox.getText());
            String gender="";
            if(rbmale.isSelected()){
               gender= rbmale.getText();
            }else{
              gender=  rbfemale.getText();
            }
            ps.setString(11, gender);
            
             String position="";
        if(PositionBox.getSelectedIndex()==0){
          position = "";
        }else if(PositionBox.getSelectedIndex()==1){
            position = "Admin";
        }else if(PositionBox.getSelectedIndex()==2){
            position ="User";
        }
            ps.setString(12, position);
         
            
             //Set Picture for Edit////////////////////////////////////////////////////////////////////////////////////           
    /*    File image = new File(new JFileChooser().getSelectedFile().getAbsolutePath());
   FileInputStream fis = new FileInputStream(image); */
     ps.setBytes(13, photo);
         
            
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           
          if(ps.executeUpdate()!=-1){
                    JOptionPane.showMessageDialog(null, "complete","save",JOptionPane.INFORMATION_MESSAGE);
                }
          
          showData();
            idBox.setText("");
             birthdateBox.setDate(new Date());
                    firstnameBox.setText("");
        lastnameBox.setText("");
     usernameBox.setText("");
    passwordBox.setText("");

   phoneBox.setText("");

   
       labelPhoto.setIcon(new ImageIcon());
       villageBox.setText("");
     cityBox.setText("");
     provinceBox.setText("");
         PositionBox.setSelectedIndex(0);
          
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        Connection c=MyConnection.getConnection();

        String fname = firstnameBox.getText();
        String lname = lastnameBox.getText();
        String uname = usernameBox.getText();
        String pass = String.valueOf(passwordBox.getText());
      
        String phonenum = phoneBox.getText();
        String gender = "";
   //     String status="User";
     
        String village = villageBox.getText();
        String city = cityBox.getText();
        String province = provinceBox.getText();

        if (rbmale.isSelected()) {
            gender=rbmale.getText();

        }
        if (rbfemale.isSelected()) {
            gender=rbfemale.getText();

        }
      String position="";
        if(PositionBox.getSelectedIndex()==0){
          position = "";
        }else if(PositionBox.getSelectedIndex()==1){
            position = "Admin";
        }else if(PositionBox.getSelectedIndex()==2){
            position ="User";
        }

        if(uname.equals("") || fname.equals("") || lname.equals("") || pass.equals("") || phonenum.equals("") || gender.equals("") || village.equals("") || city.equals("") || province.equals("")){
            JOptionPane.showMessageDialog(null, "Please Fill All Information");
        }else if(checkusername(uname)){
            JOptionPane.showMessageDialog(null, "This Username Already Exist");
     
        }else if(position.equals("")){
             JOptionPane.showMessageDialog(null, "Please Select The Position");
        }

        //   else if(BirthdateBox.getDate()!=null){
            //      SimpleDateFormat dataformat = new SimpleDateFormat("yyyy-mm-dd");
            //    bdate = dataformat.format(BirthdateBox.getDate());
            //  }
        else{
           
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
            String bdate = dateformat.format(birthdateBox.getDate());
           
            LocalDate today = LocalDate.now();
            LocalDate birthdate = LocalDate.parse(bdate);
int age= Period.between(birthdate,today).getYears();
            // PreparedStatement ps;
            // String query = "insert into tbregister values(?,?,?,?,?)";
            try{
                //  ps = MyConnection.getConnection().prepareStatement(sql);
                String sql="insert into tb_employee values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps=c.prepareStatement(sql);
                ps.setString(1,null);
                ps.setString(2, fname);
                ps.setString(3, lname);
                ps.setInt(4, age);
                ps.setString(5, uname);
                ps.setString(6, pass);

                if(bdate != null){
                    ps.setString(7, bdate); }
                 ps.setString(8, village);
                ps.setString(9, city);
                ps.setString(10, province);
                ps.setString(11, phonenum);
                ps.setString(12, gender);
                ps.setString(13, position);
                ps.setBytes(14, photo);

              
                if(ps.executeUpdate()!=-1){
                    JOptionPane.showMessageDialog(null, "complete","save",JOptionPane.INFORMATION_MESSAGE);
                }
                showData();
                 idBox.setText("");
                  birthdateBox.setDate(new Date());
                    firstnameBox.setText("");
        lastnameBox.setText("");
     usernameBox.setText("");
    passwordBox.setText("");

   phoneBox.setText("");

   labelPhoto.setIcon(new ImageIcon());
     
       villageBox.setText("");
     cityBox.setText("");
     provinceBox.setText("");
     PositionBox.setSelectedIndex(0);
            }catch (Exception e){
                // Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE,null,e);
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
     try {
            String sql="DELETE FROM `tb_employee` where uid=?";
            
            ps = c.prepareStatement(sql);
 
             ps.setString(1, idBox.getText());
         
       if(ps.executeUpdate()!=-1){
                    JOptionPane.showMessageDialog(null, "complete","save",JOptionPane.INFORMATION_MESSAGE);
                    
                      
                }
            showData();
           idBox.setText("");
            firstnameBox.setText("");
          lastnameBox.setText("");
          usernameBox.setText("");
          passwordBox.setText("");
          birthdateBox.setDate(new Date()); 
           villageBox.setText("");
           cityBox.setText("");
            provinceBox .setText("");
             phoneBox.setText("");
  labelPhoto.setIcon(new ImageIcon());
              PositionBox.setSelectedIndex(0);
            
          
        } catch (Exception e) {
            e.printStackTrace();
        }
     
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
     JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(labelPhoto.getWidth(), labelPhoto.getHeight(), Image.SCALE_SMOOTH));
        labelPhoto.setIcon(imageicon);

        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[ ]buf = new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            photo=bos.toByteArray();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnChooseActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
 idBox.setText("");
            firstnameBox.setText("");
          lastnameBox.setText("");
          usernameBox.setText("");
          passwordBox.setText("");
          birthdateBox.setDate(new Date()); 
           villageBox.setText("");
           cityBox.setText("");
            provinceBox .setText("");
             phoneBox.setText("");
  labelPhoto.setIcon(new ImageIcon());
             PositionBox.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void PositionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositionBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PositionBoxActionPerformed

    private void LabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelMinMouseClicked
        // TODO add your handling code her e:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_LabelMinMouseClicked

    private void LabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelCloseMouseClicked
        // TODO add your handling code here:
 this.dispose();
    }//GEN-LAST:event_LabelCloseMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
 public boolean checkusername(String uname){
    
                PreparedStatement ps;
                ResultSet rs;
                boolean checkuser =false;
                String sql ="select * from tb_employee where uname=?";
                
                try {
            ps = MyConnection.getConnection().prepareStatement(sql);
            ps.setString(1, uname);
            rs = ps.executeQuery();
            
            if(rs.next()){
                checkuser=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
                return checkuser;
    }
 
 
 
 
 
 
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
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelClose;
    private javax.swing.JLabel LabelMin;
    private javax.swing.JComboBox<String> PositionBox;
    private com.toedter.calendar.JDateChooser birthdateBox;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cityBox;
    private javax.swing.JTextField firstnameBox;
    private javax.swing.JTextField idBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelPhoto;
    private javax.swing.JLabel labelbackground;
    private javax.swing.JTextField lastnameBox;
    private javax.swing.JTextField passwordBox;
    private javax.swing.JTextField phoneBox;
    private javax.swing.JTextField provinceBox;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JTable tbModel;
    private javax.swing.JTextField usernameBox;
    private javax.swing.JTextField villageBox;
    // End of variables declaration//GEN-END:variables
 String filename;
    byte[] photo;

}
