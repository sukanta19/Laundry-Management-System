

 package Ousnik;
import java.awt.Desktop;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnect {
	
public static String USERNAME="root";
public static String PASSWORD="";
public static String CONN_STRING="jdbc:mysql://localhost:3308/test";

	public static void main(String args[]) throws SQLException
	{
	
Connection conn=null;
try
{    
    conn=DriverManager.getConnection( CONN_STRING,USERNAME,PASSWORD);
    System.out.print("Connected");              
}
catch(SQLException e)
{
   System.err.print("Not connected"+e);

}            
         
}
}

