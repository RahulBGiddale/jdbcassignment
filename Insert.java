package jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Insert 
{
public static void main(String[] args) {
	
	Connection connection=null;
	 java.sql.Statement statement=null;
	try {
		FileInputStream fileInputStream=new FileInputStream("d2.properties");
	
	Properties properties=new Properties();
	properties.load(fileInputStream);
	
	 connection=DriverManager.getConnection(properties.getProperty("dburl"), "root", "Abd");
  statement=connection.createStatement();
 int result=statement.executeUpdate(properties.getProperty("query1"));
 if(result!=0)
 {
	 System.out.println(result+" no of rows affected");
	 System.out.println("inserted successfully");
 }
	}catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
		if(connection!=null)
		{
			
				connection.close();
			}
		if(statement!=null)
		{
			statement.close();
		}
		}
		catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

