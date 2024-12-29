package project_bp1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
        
public class Connector {
    Connection connect;
    
    public Connector() {
        String id, pass, driver, url;
        id = "root";
        pass = "";
        driver = "com.mysql.cj.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/antiques";
        
        try {
            Class.forName(driver).newInstance();
            connect = DriverManager.getConnection(url, id, pass);
            JOptionPane.showMessageDialog(null, "Connection Successful");
        } catch (Exception err) {
            System.err.println("" + err.getLocalizedMessage());
        }
    }
    
    public static void main(String[] args) {
        Connector connector = new Connector();
    }
}
