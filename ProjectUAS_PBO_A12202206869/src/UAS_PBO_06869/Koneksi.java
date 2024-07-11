
package UAS_PBO_06869;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Koneksi {
       private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
          
            String url="jdbc:mysql://127.0.0.1/projekuas"; 
               
            String user="root"; 
            String pass=""; 
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        return mysqlconfig;
    }    

    static Object GetConnection() {
        throw new UnsupportedOperationException("Not supported yet."); 
    // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
