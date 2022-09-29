package com.startup.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.springframework.web.bind.annotation.GetMapping;

import lombok.Value;
import oracle.jdbc.driver.OracleDriver;

public class JdbcConnection {
	
	

	
	
	 public static void main(String[] args) throws IOException {
         // TODO Auto-generated method stub
  
  try {
	  
   DriverManager.registerDriver(new OracleDriver());    //This is for loading the odbc driver
   System.out.println("Driver loaded Successfully");  
   Connection con= DriverManager.getConnection("jdbc:oracle:thin:@35.208.69.48:1521/devdb.4cteam.com","adfuat3","adfuat3n"); //connecting to the database
   System.out.println("Connection Successful");
   Statement stmt=con.createStatement();  
   ResultSet rs=stmt.executeQuery("UPDATE PROJECT SET IS_MONTHLY_FORECASTED = 0 WHERE INSERVICE_DATE < SYSDATE  AND IS_MONTHLY_FORECASTED =  1");
   System.out.println("done it !");
   while(rs.next())  
	   System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
	     
	   //step5 close the connection object  
	   con.close();  
  } catch (SQLException e) {
   System.out.println("Some problem in connection");
   
   
   // TODO Auto-generated catch block
   e.printStackTrace();
  }

 }
	

}
