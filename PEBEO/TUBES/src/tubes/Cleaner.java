   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;
import java.awt.Color;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Hasvi
 */
public class Cleaner extends javax.swing.JFrame {

    /**
     * Creates new form Cleaner
     */
    koneksi kon;
    public Cleaner() {
        kon = new koneksi ();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        no1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        no4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        r4 = new javax.swing.JRadioButton();
        no2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        r2 = new javax.swing.JRadioButton();
        no5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        r5 = new javax.swing.JRadioButton();
        no3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        r3 = new javax.swing.JRadioButton();
        no6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        r6 = new javax.swing.JRadioButton();
        pilih = new javax.swing.JButton();
        cek = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        no1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setText("No. 01");

        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout no1Layout = new javax.swing.GroupLayout(no1);
        no1.setLayout(no1Layout);
        no1Layout.setHorizontalGroup(
            no1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, no1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(no1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r1)
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        no1Layout.setVerticalGroup(
            no1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(no1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(r1)
                .addContainerGap())
        );

        no4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel4.setText("No. 04");

        javax.swing.GroupLayout no4Layout = new javax.swing.GroupLayout(no4);
        no4.setLayout(no4Layout);
        no4Layout.setHorizontalGroup(
            no4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, no4Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(no4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r4)
                    .addComponent(jLabel4))
                .addContainerGap())
        );
        no4Layout.setVerticalGroup(
            no4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(no4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(r4)
                .addContainerGap())
        );

        no2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel2.setText("No. 02");

        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout no2Layout = new javax.swing.GroupLayout(no2);
        no2.setLayout(no2Layout);
        no2Layout.setHorizontalGroup(
            no2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, no2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(no2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2)
                    .addComponent(jLabel2))
                .addContainerGap())
        );
        no2Layout.setVerticalGroup(
            no2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(no2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(r2)
                .addContainerGap())
        );

        no5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel5.setText("No. 05");

        javax.swing.GroupLayout no5Layout = new javax.swing.GroupLayout(no5);
        no5.setLayout(no5Layout);
        no5Layout.setHorizontalGroup(
            no5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(no5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(no5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r5)
                    .addComponent(jLabel5))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        no5Layout.setVerticalGroup(
            no5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(no5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(r5)
                .addContainerGap())
        );

        no3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel3.setText("No. 03");

        javax.swing.GroupLayout no3Layout = new javax.swing.GroupLayout(no3);
        no3.setLayout(no3Layout);
        no3Layout.setHorizontalGroup(
            no3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, no3Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(no3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r3)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        no3Layout.setVerticalGroup(
            no3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(no3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(r3)
                .addContainerGap())
        );

        no6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel6.setText("No. 06");

        javax.swing.GroupLayout no6Layout = new javax.swing.GroupLayout(no6);
        no6.setLayout(no6Layout);
        no6Layout.setHorizontalGroup(
            no6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, no6Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(no6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r6)
                    .addComponent(jLabel6))
                .addContainerGap())
        );
        no6Layout.setVerticalGroup(
            no6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(no6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(r6)
                .addContainerGap())
        );

        pilih.setText("Pilih");
        pilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihActionPerformed(evt);
            }
        });

        cek.setText("Cek");
        cek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(no1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(no2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(no3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(no4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(no5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(no6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cek)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(no1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(no4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pilih, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cek)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void pilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihActionPerformed
        try{Statement kt = kon.con.createStatement();
            if (r1.isSelected()){
                
                ResultSet cekkamar = kt.executeQuery("SELECT * FROM ruang WHERE kamar=1");
                PreparedStatement ubah = kon.con.prepareStatement("update ruang set status='kosong' where kamar = 1");
                PreparedStatement hapus =kon.con.prepareStatement("DELETE FROM bersih WHERE kamar=2");
                cekkamar.next();
                if (cekkamar.getRow()==1){
                    if(cekkamar.getString("status").equals("isi")){
                ubah.executeUpdate();
                hapus.executeUpdate();
                JOptionPane.showMessageDialog(null,"Kamar 1 Siap Digunakan");
                r1.setSelected(false);}
                else { JOptionPane.showMessageDialog(null,"Kamar 1 Sudah Tersedia");
                r1.setSelected(false);}}
               
            }
            if (r2.isSelected()){
                ResultSet cekkamar = kt.executeQuery("SELECT * FROM ruang WHERE kamar=2");
                PreparedStatement ubah = kon.con.prepareStatement("update ruang set status='kosong' where kamar = 2");
                PreparedStatement hapus =kon.con.prepareStatement("DELETE FROM bersih WHERE kamar=2");
                cekkamar.next();
                if (cekkamar.getRow()==1){
                    if(cekkamar.getString("status").equals("isi")){
                ubah.executeUpdate();
                hapus.executeUpdate();
                JOptionPane.showMessageDialog(null,"Kamar 2 Siap Digunakan");
                r2.setSelected(false);}
                else { JOptionPane.showMessageDialog(null,"Kamar 2 Sudah Tersedia");
                r2.setSelected(false);}}
               
            }
            if (r3.isSelected()){
                ResultSet cekkamar = kt.executeQuery("SELECT * FROM ruang WHERE kamar=3");
                PreparedStatement ubah = kon.con.prepareStatement("update ruang set status='kosong' where kamar = 3");
                PreparedStatement hapus =kon.con.prepareStatement("DELETE FROM bersih WHERE kamar=3");
                cekkamar.next();
                if (cekkamar.getRow()==1){
                    if(cekkamar.getString("status").equals("isi")){
                ubah.executeUpdate();
                hapus.executeUpdate();
                JOptionPane.showMessageDialog(null,"Kamar 3 Siap Digunakan");
                r3.setSelected(false);}
                else { JOptionPane.showMessageDialog(null,"Kamar 3 Sudah Tersedia");
                r3.setSelected(false);}}
               
            }
            if (r4.isSelected()){
                ResultSet cekkamar = kt.executeQuery("SELECT * FROM ruang WHERE kamar=4");
                PreparedStatement ubah = kon.con.prepareStatement("update ruang set status='kosong' where kamar = 4");
                PreparedStatement hapus =kon.con.prepareStatement("DELETE FROM bersih WHERE kamar=4");
                cekkamar.next();
                if (cekkamar.getRow()==1){
                    if(cekkamar.getString("status").equals("isi")){
                ubah.executeUpdate();
                hapus.executeUpdate();
                JOptionPane.showMessageDialog(null,"Kamar 4 Siap Digunakan");
                r4.setSelected(false);}
                else { JOptionPane.showMessageDialog(null,"Kamar 4 Sudah Tersedia");
                r4.setSelected(false);}}
               
            } 
            if (r5.isSelected()){
                ResultSet cekkamar = kt.executeQuery("SELECT * FROM ruang WHERE kamar=5");
                PreparedStatement ubah = kon.con.prepareStatement("update ruang set status='kosong' where kamar = 5");
                PreparedStatement hapus =kon.con.prepareStatement("DELETE FROM bersih WHERE kamar=5");
                cekkamar.next();
                if (cekkamar.getRow()==1){
                    if(cekkamar.getString("status").equals("isi")){
                ubah.executeUpdate();
                hapus.executeUpdate();
                JOptionPane.showMessageDialog(null,"Kamar 5 Siap Digunakan");
                r5.setSelected(false);}
                else { JOptionPane.showMessageDialog(null,"Kamar 5 Sudah Tersedia");
                r5.setSelected(false);}}
               
            } if (r6.isSelected()){
                ResultSet cekkamar = kt.executeQuery("SELECT * FROM ruang WHERE kamar=6");
                PreparedStatement ubah = kon.con.prepareStatement("update ruang set status='kosong' where kamar = 6");
                PreparedStatement hapus =kon.con.prepareStatement("DELETE FROM bersih WHERE kamar=6");
                cekkamar.next();
                if (cekkamar.getRow()==1){
                    if(cekkamar.getString("status").equals("isi")){
                ubah.executeUpdate();
                hapus.executeUpdate();
                JOptionPane.showMessageDialog(null,"Kamar 6 Siap Digunakan");
                r6.setSelected(false);}
                else { JOptionPane.showMessageDialog(null,"Kamar 6 Sudah Tersedia");
                r6.setSelected(false);}}
               
            }
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null, ""+e.getMessage());}
//JOptionPane.showMessageDialog(this, "SALAH GOBLOK");}// TODO add your handling code here:
    }//GEN-LAST:event_pilihActionPerformed

    private void cekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekActionPerformed
try{
        String query = "select * from bersih where kamar";
        int[] kamar=new int [7];
        Statement kt,q1,q2,q3,q4,q5,q6;
        kt = kon.con.createStatement();
        q1 = kon.con.createStatement();
        q2 = kon.con.createStatement();
        q3 = kon.con.createStatement();
        q4 = kon.con.createStatement();
        q5 = kon.con.createStatement();
        q6 = kon.con.createStatement();
        ResultSet cekkamar = kt.executeQuery(query);
        ResultSet cekkamar1 = q1.executeQuery("SELECT * FROM bersih WHERE kamar =1");
        ResultSet cekkamar2 = q2.executeQuery("SELECT * FROM bersih WHERE kamar =2");
        ResultSet cekkamar3 = q3.executeQuery("SELECT * FROM bersih WHERE kamar =3");
        ResultSet cekkamar4 = q4.executeQuery("SELECT * FROM bersih WHERE kamar =4");
        ResultSet cekkamar5 = q5.executeQuery("SELECT * FROM bersih WHERE kamar =5");
        ResultSet cekkamar6 = q6.executeQuery("SELECT * FROM bersih WHERE kamar =6");
        cekkamar1.next();
        cekkamar2.next();
        cekkamar3.next();
        cekkamar4.next();
        cekkamar5.next();
        cekkamar6.next();
        int i=1;
        while(cekkamar.next()){
            
           // if (cekkamar.getRow()==1){
                String kam=cekkamar.getString("kamar");
                int ka=Integer.parseInt(kam);
                kamar[ka]=ka;i++;}
            
      // }
       String masuk = "SELECT * FROM bersih WHERE kamar";
       Statement st = kon.con.createStatement();
            ResultSet rsLogin = st.executeQuery(masuk);
            rsLogin.next();
            if (kamar[1]==1)
                no1.setBackground(Color.MAGENTA);
            else no1.setBackground(Color.BLACK);
            rsLogin.next();
            if (kamar[2]==2)
                no2.setBackground(Color.MAGENTA);
            else no2.setBackground(Color.BLACK);
            rsLogin.next();
            if (kamar[3]==3)
                no3.setBackground(Color.MAGENTA);
            else no3.setBackground(Color.BLACK);
            rsLogin.next();
            if (kamar[4]==4)
                no4.setBackground(Color.MAGENTA);
            else no4.setBackground(Color.BLACK);
            if (kamar[5]==5)
                no5.setBackground(Color.MAGENTA);
            else no5.setBackground(Color.BLACK);
            if (kamar[6]==6)
                no6.setBackground(Color.MAGENTA);
            else no6.setBackground(Color.BLACK);
                
            
        
        } catch(SQLException e){JOptionPane.showMessageDialog(this, "SALAH GOBLOK"+e.getMessage());}  

        // TODO add your handling code here:
    }//GEN-LAST:event_cekActionPerformed

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
            java.util.logging.Logger.getLogger(Cleaner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cleaner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cleaner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cleaner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cleaner().setVisible(true);
                
            
                 
                /*if(cekkamar2.getString("status").equals("kosong"))
                no2.setBackground(Color.WHITE);
                else 
                no2.setBackground(Color.BLACK);
                    
         
           
                if(cekkamar3.getString("status").equals("kosong"))
                no3.setBackground(Color.WHITE);
                else 
                no3.setBackground(Color.BLACK);
                    
  
   
       
                if(cekkamar4.getString("status").equals("kosong"))
                no4.setBackground(Color.WHITE);

                else 
                no4.setBackground(Color.BLACK);
                    

      
          
                if(cekkamar5.getString("status").equals("kosong"))
                no5.setBackground(Color.WHITE);
                else 
                no5.setBackground(Color.BLACK);
                    
 
  
                if(cekkamar6.getString("status").equals("kosong"))
                no6.setBackground(Color.WHITE);
                else 
                no6.setBackground(Color.BLACK);*/
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel no1;
    private javax.swing.JPanel no2;
    private javax.swing.JPanel no3;
    private javax.swing.JPanel no4;
    private javax.swing.JPanel no5;
    private javax.swing.JPanel no6;
    private javax.swing.JButton pilih;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    // End of variables declaration//GEN-END:variables
}
