/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eastern.enterprice;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sachith ariahilaka
 */
public class invoice extends javax.swing.JFrame {

    /**
     * Creates new form invoice
     */
    public invoice() {
        initComponents();
        showdate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        discount = new javax.swing.JTextField();
        qnt = new javax.swing.JTextField();
        warranty = new javax.swing.JTextField();
        invoice = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        insert = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_invoice = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Invoice");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Item code");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Price");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Discount(%)");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Quantity");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Invoice No");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Date");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Warranty(months)");

        insert.setBackground(new java.awt.Color(255, 255, 255));
        insert.setText("Insert");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        table_invoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Invoice No", "Item code", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(table_invoice);

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(code, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(price, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(discount, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(qnt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(warranty, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(invoice, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(date, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(insert, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(update, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(delete, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel1)
                .addContainerGap(414, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(61, 61, 61)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(price, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(code, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invoice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(date, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(discount)
                            .addComponent(qnt)
                            .addComponent(warranty, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(invoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(qnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(warranty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(insert)
                            .addComponent(update)
                            .addComponent(delete))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Search");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        
           
                 PreparedStatement pst=null;
                 Statement st=null;
                 Connection conn=null;
      try{
               Class.forName("com.mysql.jdbc.Driver");
               conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eastern","root","");
                }catch(Exception e)
           {
               e.printStackTrace();
           }
            
      try {
             String sql = "insert into price_list (item_code,invoice,Price,discount,Quantity,Warranty) values(?,?,?,?,?,?)";  

             pst = conn.prepareStatement(sql);
             pst.setString(1, code.getText());
             pst.setString(2, invoice.getText());
             pst.setString(3, price.getText());
             pst.setString(4, discount.getText());
             pst.setString(5, qnt.getText());
             pst.setString(6,warranty.getText());
             
             pst.execute();

            JOptionPane.showMessageDialog(null, "Success !");
         } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
               try{
                   
                   PreparedStatement ps=conn.prepareStatement("select * from price_list");
                   ResultSet rs=ps.executeQuery();
                   DefaultTableModel tm=(DefaultTableModel)table_invoice.getModel();
                   tm.setRowCount(0);
                   
                   while(rs.next()){
                       
                       Object O[]={rs.getInt("invoice"),rs.getString("item_code"),rs.getInt("Quantity"),rs.getInt("Price")};
                       tm.addRow(O);
                   }
                   
               }catch(Exception e){
                   JOptionPane.showMessageDialog(this, e);
               }
               code.setText(" ");
               invoice.setText(" ");
               price.setText(" ");
               discount.setText(" ");
               qnt.setText(" ");
               warranty.setText(" ");
    }//GEN-LAST:event_insertActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        
                 PreparedStatement pst=null;
                 Statement st=null;
                 Connection conn=null;
      try{
               Class.forName("com.mysql.jdbc.Driver");
               conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eastern","root","");
                }catch(Exception e)
           {
               e.printStackTrace();
           }
        String sql ="delete from price_list where item_code=?";

        try {
        pst=conn.prepareStatement(sql);

        pst.setString(1, code.getText());


        pst.execute();
        JOptionPane.showMessageDialog(null, "has been Deleted !");
            
        } catch (SQLException | HeadlessException e) {
        JOptionPane.showMessageDialog(null, e);
        }
         try{
                   
                   PreparedStatement ps=conn.prepareStatement("select * from price_list");
                   ResultSet rs=ps.executeQuery();
                   DefaultTableModel tm=(DefaultTableModel)table_invoice.getModel();
                   tm.setRowCount(0);
                   
                   while(rs.next()){
                       
                       Object O[]={rs.getInt("invoice"),rs.getString("item_code"),rs.getInt("Quantity"),rs.getInt("Price")};
                       tm.addRow(O);
                   }
                   
               }catch(Exception e){
                   JOptionPane.showMessageDialog(this, e);
               }
         
               code.setText(" ");
               invoice.setText(" ");
               price.setText(" ");
               discount.setText(" ");
               qnt.setText(" ");
               warranty.setText(" ");
         
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
                 PreparedStatement pst=null;
                 Statement st=null;
                 Connection conn=null;
                 
                 try{
               Class.forName("com.mysql.jdbc.Driver");
               conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eastern","root","");
                }catch(Exception e)
           {
               e.printStackTrace();
           }
        try {
            String code1 = code.getText();
            String Invoice1 = invoice.getText();
            String price1 = price.getText();
            String discount1 = discount.getText();
            String qnt1 = qnt.getText();
            String warranty1 = warranty.getText();
            

            String sql = "update price_list set item_code='"+code1+"',invoice='"+Invoice1+"',Price='"+price1+"',discount='"+discount1+"',Quantity='"+qnt1+"',Warranty='"+warranty1+"' where item_code='"+code1+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "has been Updated !");
                    } catch (SQLException | HeadlessException e) 
                    {
            JOptionPane.showMessageDialog(null, e);
        }
        try{
                   
                   PreparedStatement ps=conn.prepareStatement("select * from price_list");
                   ResultSet rs=ps.executeQuery();
                   DefaultTableModel tm=(DefaultTableModel)table_invoice.getModel();
                   tm.setRowCount(0);
                   
                   while(rs.next()){
                       
                       Object O[]={rs.getInt("invoice"),rs.getString("item_code"),rs.getInt("Quantity"),rs.getInt("Price")};
                       tm.addRow(O);
                   }
                   
               }catch(Exception e){
                   JOptionPane.showMessageDialog(this, e);
               }
        
               code.setText(" ");
               invoice.setText(" ");
               price.setText(" ");
               discount.setText(" ");
               qnt.setText(" ");
               warranty.setText(" ");
    }//GEN-LAST:event_updateActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        voicesearch bill=new voicesearch(); 
        bill.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed
            
    public static  String DateFormat = "yyyy-MM-dd";
    public void showdate()
    {
      Calendar cal= Calendar.getInstance();
      SimpleDateFormat format = new SimpleDateFormat(DateFormat);
      date.setText(format.format(cal.getTime()));

        
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
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(invoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField code;
    private javax.swing.JTextField date;
    private javax.swing.JButton delete;
    private javax.swing.JTextField discount;
    private javax.swing.JButton insert;
    private javax.swing.JTextField invoice;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qnt;
    private javax.swing.JTable table_invoice;
    private javax.swing.JButton update;
    private javax.swing.JTextField warranty;
    // End of variables declaration//GEN-END:variables
}