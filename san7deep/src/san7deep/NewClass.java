/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package san7deep;
import java.sql.*;


/**
 *
 * @author dbit
 */
public class NewClass {
    public static String url="jdbc:derby://localhost:1527/sandeep77";
    public static String driverName="org.apache.derby.jdbc.ClientDriver";
    public static String username="sandeep77";
    public static String password="sandeep77";
    public static Connection con;
    public static Statement statement;
    public static PreparedStatement ps;
    public static ResultSet rs;
      
    
    public static Connection getConnection()  {
        try  {
            Class.forName(driverName);
            con=DriverManager.getConnection(url,username,password);
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
        catch(Exception se)
        {
            se.printStackTrace();
            
        }
        return con;
    }
    

    
}
