package jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import com.mysql.jdbc.Statement;

public class Firstinsert
{
public static void main(String[] args)  {
	//Connection connection=null;
	try {
	FileInputStream fileInputStream=new FileInputStream("d2.properties");
	Properties properties=new Properties();
	properties.load(fileInputStream);
	
	Connection connection=DriverManager.getConnection(properties.getProperty("dburl"), "root", "Abd");
 java.sql.Statement statement=connection.createStatement();
  ResultSet resultSet=statement.executeQuery(properties.getProperty("query"));
  while(resultSet.next())
	 
  {
	  System.out.println("id-"+resultSet.getInt(1));
	  System.out.println("name-"+resultSet.getString(2));
  }
	
}catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
}
}
}