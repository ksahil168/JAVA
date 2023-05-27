import java.sql.*;

 

public class JdbcOracleConnection {
 
    public static void main(String[] args) {
 
     
      String url = "jdbc:oracle:thin:@localhost:1521:XE";
        try {
  
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection(url, "System", "System");
            System.out.println("Connection established");
            con.close(); 
        }
        catch(ClassNotFoundException e)
        {
            System.out.println("Driver not loaded");
        }
        catch(SQLException e)
        {
            System.out.println("connection not established");
        }
    }
}