/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author Afa Fadhlika
 */
public class koneksi {
   Connection con;
public koneksi() {
   String id, pass, driver, url;
   id="root";
   pass="";
   driver ="com.mysql.jdbc.Driver";
   url="jdbc:mysql://localhost:3306/sekolah";
   try{
       Class.forName(driver).newInstance();
       con=DriverManager.getConnection(url,id,pass);
       if (con==null){
           JOptionPane.showMessageDialog(null, "Gagal");
       }
       else{
           JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
       }
   }catch( Exception e){
      System.out.print("gagal"+e.getMessage());
   }
}



public  static void main(String[] args)
{
    koneksi k=new koneksi();
    
}

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

