
package hotel.managment.system;
import java.sql.*;
    
public class Conn {
    Connection c;
    Statement s;
    Conn() {
        
        try
        {
            
        Class .forName("com.mysql.cj.jdbc.Driver");
        c=DriverManager.getConnection("jdbc:mysql:///hotelmanagmentsystem", "root","Rohit993");
        s=c.createStatement();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[]args)
    {
        new Conn();
    }
    
}
