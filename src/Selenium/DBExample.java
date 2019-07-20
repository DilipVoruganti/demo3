package Selenium;
import java.io.EOFException;
import java.sql.*;


public class DBExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
			
		}catch(Exception e)
		{
			
		}
	}

}
