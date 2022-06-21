
package Projet;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnexionMysql {
public static Connection connect()
     {
         Connection con=null;
         try {
             Class.forName("com.mysql.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_etudiant","root","");
             JOptionPane.showMessageDialog(null, "connection success");   
 } catch (Exception e) {
        System.out.println("inter.DBConnect.connect()");
    }
   return con;
}

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}