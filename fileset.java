package jdbc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class fileset 
{
public static void main(String[] args) throws Exception {
	FileOutputStream fileOutputStream=new FileOutputStream("d2.properties");
	Properties properties=new Properties();
	properties.setProperty("dburl", "jdbc:mysql://localhost:3306/cricket");
	properties.setProperty("query", "select * from rcb");
	properties.store(fileOutputStream, "first insertion");
	System.out.println("data inserted successfully");
}
}
