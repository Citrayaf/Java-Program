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
import javax.swing.RowFilter;

/**
 *
 * @author Afa
 */

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
public class pinjam extends javax.swing.JFrame {

    private DefaultTableModel model;
    koneksi kon;
    String judul,penulis,penerbit,tahun,serial,jumlah,letak,username;
  public pinjam() {
        kon = new koneksi();
        initComponents();
  
    }    
    
    public pinjam(String user) {
        kon = new koneksi();
         initComponents ( );
         username=user;
             model = new DefaultTableModel ();
             tabel.setModel(model);
             model.addColumn("Judul");
             model.addColumn("Penulis");
             model.addColumn("Penerbit");
             model.addColumn("Tahun");
             model.addColumn("Serial");     
             model.addColumn("Jumlah");
             model.addColumn("Letak");
     try{ 
           Statement kt = kon.con.createStatement();
           String sql        = "Select * from buku where (jumlah!='0')";
           ResultSet res   = kt.executeQuery(sql);
           while(res.next ()){
                String a1 = res.getString("Judul"); 
                String a2 = res.getString("Penulis");
                String a3 = res.getString("Penerbit"); 
                String a4 = res.getString("Tahun");
                String a5 = res.getString("Serial"); 
                String a6 = res.getString("Jumlah");
                String a7 = res.getString("Letak");
                String obj[]={a1,a2,a3,a4,a5,a6,a7};
                model.addRow(obj);
            }
            
      }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
      
    }
private void filter (String query){
    TableRowSorter<DefaultTableModel> car=new TableRowSorter<DefaultTableModel>(model);
    tabel.setRowSorter(car);
    car.setRowFilter(RowFilter.regexFilter(query));
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
        jDate = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jcari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Judul", "Penulis", "Penerbit", "Tahun", "Serial", "Jumlah", "Letak"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 470, 330));

        jpinjam.setText("Pinjam");
        jpinjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpinjamActionPerformed(evt);
            }
        });
        getContentPane().add(jpinjam, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, -1, -1));
        getContentPane().add(jDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        jLabel1.setText("Tanggal Pinjam");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 90, 30));

        jButton1.setText("Kembali");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, -1));

        jcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcariKeyReleased(evt);
            }
        });
        getContentPane().add(jcari, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 260, 30));

        jLabel2.setText("Cari");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 70, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpinjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpinjamActionPerformed
        //DefaultTableModel model = (DefaultTableModel) table.getModel();
            //modell.setRowCount(0);
        try{
            //String dend;int den = 0,h=0;
            long hari=0;
            SimpleDateFormat tlformat=new SimpleDateFormat("yyyy-MM-dd");
        Calendar kal=Calendar.getInstance();
        String tglde = tlformat.format(kal.getTime());
          Statement d = kon.con.createStatement();
          String cekd="SELECT * FROM dipinjam WHERE pnama ='"+username+"'";
         ResultSet ck = d.executeQuery(cekd);
         ck.next(); 
            if (ck.getRow()==1){
                //dend=cek.getString("denda");
                //den= Integer.parseInt(dend);
                //h=h+den;
                String tglkem=ck.getString("tglkem");
                Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(tglde);
        Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(tglkem);
        long beda = date1.getTime() - date2.getTime();
        hari=beda/1000/60/60/24;
            }
        if(hari>0)
           JOptionPane.showMessageDialog(null, "Harap kembalikan buku yang terpinjam ");
           //DefaultTableModel model1=(DefaultTableModel)tabel.getModel();
        //int SelectedRowIndex=tabel.getSelectedRow();
        //model.removeRow(SelectedRowIndex);
        else{
        SimpleDateFormat tglformat=new SimpleDateFormat("yyyy-MM-dd");
        String tglp=tglformat.format(jDate.getDate());
        Calendar tgl= Calendar.getInstance();
        tgl.setTime(jDate.getDate());
        tgl.add(Calendar.DATE,3);
        String tglk=tglformat.format(tgl.getTime());
        String tgld="0";
        String denda="0";
         String pinjam = "insert into dipinjam values('"+username+"','"+serial+"','"+tglp+"','"+tglk+"','"+tgld+"','"+denda+"')";
          Statement st = kon.con.createStatement();
         st.executeUpdate(pinjam);
         String j = null;
         String kurang="SELECT * FROM buku WHERE serial ='"+serial+"'";
         ResultSet cek = st.executeQuery(kurang);
         cek.next(); 
            if (cek.getRow()==1){
                j=cek.getString("jumlah");
                int  jumlah= Integer.parseInt(j);
                jumlah--;
                j=Integer.toString(jumlah);
            }
       Statement mas = kon.con.createStatement();
        //String keluar="SELECT * FROM buku WHERE serial='"+serial+"'";
         //ResultSet cekseri = mas.executeQuery(keluar);
          String input= "update buku set judul='"+judul+"',penulis='"+penulis+"',penerbit='"+penerbit+"',tahun='"+tahun+"',serial='"+serial+"',jumlah='"+j+"',letak='"+letak+"' where serial='"+serial+"'";
        mas.executeUpdate(input);
          //PreparedStatement kt = kon.con.prepareStatement(input);
            //cekseri.next();
             //if (cekseri.getRow()==1){
               // kt.executeUpdate();
                //}
         
         JOptionPane.showMessageDialog(null, "Buku telah dipinjam, harap kembalikan tepat waktu 3 hari setelah peminjaman ");   
         //int SelectedRowIndex=tabel.getSelectedRow();
        //model.removeRow(SelectedRowIndex);
        if (model.getRowCount() > 0) {
    for (int i = model.getRowCount() - 1; i > -1; i--) {
        model.removeRow(i);
    }
}
         try{ 
          Statement qt = kon.con.createStatement();
         String sql        = "Select * from buku where (jumlah!='0')";
        ResultSet res   = qt.executeQuery(sql);
        while(res.next ()){
           String a1 = res.getString("Judul"); 
         String a2 = res.getString("Penulis");
        String a3 = res.getString("Penerbit"); 
        String a4 = res.getString("Tahun");
        String a5 = res.getString("Serial"); 
       String a6 = res.getString("Jumlah");
       String a7 = res.getString("Letak");
       String obj[]={a1,a2,a3,a4,a5,a6,a7};
        model.addRow(obj);
        }
            
      }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage() );
      }
         //cek.next(); 
           // if (cek.getRow()==1){
                
                
            //}
      
        }}
        catch (Exception e){ JOptionPane.showMessageDialog(null, e);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jpinjamActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
         int selectedrow=tabel.getSelectedRow();
         DefaultTableModel model=(DefaultTableModel)tabel.getModel();
         judul=model.getValueAt(selectedrow,0).toString();
         penulis=model.getValueAt(selectedrow,1).toString();
         penerbit=model.getValueAt(selectedrow,2).toString();
         tahun=model.getValueAt(selectedrow,3).toString();
         serial=model.getValueAt(selectedrow,4).toString();
         jumlah=model.getValueAt(selectedrow,5).toString();
         letak=model.getValueAt(selectedrow,6).toString();
            // TODO add your handling code here:
    }//GEN-LAST:event_tabelMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
       new awal(username).setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcariKeyReleased
    String c=jcari.getText();
    filter(c);
// TODO add your handling code here:
    }//GEN-LAST:event_jcariKeyReleased

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
            java.util.logging.Logger.getLogger(pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pinjam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pinjam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jcari;
    private javax.swing.JButton jpinjam;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}