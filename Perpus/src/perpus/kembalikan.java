/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpus;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.SQLException;
import javax.accessibility.AccessibleContext;
import javax.swing.JOptionPane;
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.Calendar;  

/**
 *
 * @author Afa
 */

import javax.swing.table.DefaultTableModel;
public class kembalikan extends javax.swing.JFrame {

    private DefaultTableModel model;
    koneksi kon;
    String serial,username,tglpin,tglkem,denda;
  public kembalikan() {
        kon = new koneksi();
        initComponents();
  
    }    
    
    public kembalikan(String user) {
        kon = new koneksi();
         initComponents ( );
         username=user;
             model = new DefaultTableModel ();
             tabel.setModel(model);
             model.addColumn("Serial Buku");
             model.addColumn("Tanggal Pinjam");
             model.addColumn("Tanggal Pengembalian");
             
     try{ 
           Statement kt = kon.con.createStatement();
           String sql        = "Select * from dipinjam where (pnama='"+username+"')";
           ResultSet res   = kt.executeQuery(sql);
           while(res.next ()){
                String a1 = res.getString("pserial"); 
                String a2 = res.getString("tglpin");
                String a3 = res.getString("tglkem"); 
                String obj[]={a1,a2,a3};
                model.addRow(obj);
            }
            
      }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jpinjam = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Serial Buku", "Tanggal Pinjam", "Tanggal Pengembalian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabel);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 470, 330));

        jpinjam.setText("Kembalikan Buku");
        jpinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpinjamActionPerformed(evt);
            }
        });
        getContentPane().add(jpinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 110, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpinjamActionPerformed
        //DefaultTableModel model = (DefaultTableModel) table.getModel();
            //modell.setRowCount(0);
        try{
            
        String tanggal,kem;
        long dend=0,hari = 0;//DefaultTableModel model1=(DefaultTableModel)tabel.getModel();
        //int SelectedRowIndex=tabel.getSelectedRow();
        //model.removeRow(SelectedRowIndex);
        SimpleDateFormat tglformat=new SimpleDateFormat("yyyy-MM-dd");
        Calendar kal=Calendar.getInstance();
        String tgld = tglformat.format(kal.getTime());
        //int tglkemb=Integer.parseInt(tglkem);
        //long dendab=tgld-tglkemb;
        //long udenda=dendab*2000;
        //tanggal=Long.toString(tgld);
        //denda=Long.toString(udenda);
        Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(tgld);
        Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(tglkem);
        long beda = date1.getTime() - date2.getTime();
        if(beda>0){
        hari=beda/1000/60/60/24;
        dend=hari*2000;}
        denda=Long.toString(dend);
        Statement mas = kon.con.createStatement();
        //String keluar="SELECT * FROM dipinjam WHERE pserial='"+serial+"'";
         //ResultSet cekseri = mas.executeQuery(keluar);
          
         String input= "update dipinjam set pnama='"+username+"',pserial='"+serial+"',tglpin='"+tglpin+"',tglkem='"+tglkem+"',tglden='"+tgld+"',denda='"+denda+"' where pserial='"+serial+"'";
         mas.execute(input);
         //PreparedStatement kt = kon.con.prepareStatement(input);
            //cekseri.next();
             //if (cekseri.getRow()==1){
               // kt.executeUpdate();
                //}
        
         
         
         
         if(beda<=0)
         JOptionPane.showMessageDialog(null, "Terima Kasih telah mengembalikan Buku tepat waktu ");
         else
             JOptionPane.showMessageDialog(null, "Anda telat mengembalikan Buku selama "+hari+" maka harus membayar denda sebesar "+dend);
         int SelectedRowIndex=tabel.getSelectedRow();
        model.removeRow(SelectedRowIndex);
         //cek.next(); 
           // if (cek.getRow()==1){
                
                
            //}
      
        }
        catch (Exception e){ JOptionPane.showMessageDialog(null, e);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jpinjamActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
         int selectedrow=tabel.getSelectedRow();
         DefaultTableModel model=(DefaultTableModel)tabel.getModel();
         serial=model.getValueAt(selectedrow,0).toString();
         tglpin=model.getValueAt(selectedrow,1).toString();
         tglkem=model.getValueAt(selectedrow,2).toString();
            // TODO add your handling code here:
    }//GEN-LAST:event_tabelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new awal().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(kembalikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kembalikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kembalikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kembalikan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kembalikan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jpinjam;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
