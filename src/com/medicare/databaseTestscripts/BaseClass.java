package com.medicare.databaseTestscripts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.medicare.testscripts.Driver;

public class BaseClass extends Driver {
	public static String dbUrl="jdbc:mysql://localhost:3306/medicare";
	public static String username="root";
	public static String password="root";
	Connection con;
	Statement stmt;
	
	@BeforeClass
	public void dbDetails() throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	 con=DriverManager.getConnection(dbUrl,username,password);
	 stmt=con.createStatement();
	 Driver.init();
		
		//2)Maximize it
		driver.manage().window().maximize();
		
		
		//3)Navigate to https://www.redbus.in
		driver.get("http://localhost:8080/medicare/");
		
	
	}	
	@AfterClass
	public void closeConnection() throws SQLException {
		con.close();
		driver.quit();
	}
}



