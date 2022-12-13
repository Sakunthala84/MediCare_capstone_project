package com.medicare.databaseTestscripts;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class RetrieveInfo extends BaseClass {

	@Test
	public void retrieveInfo() throws SQLException {
		String query="show tables;";
		
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			System.out.println(" "+rs.getString("Tables_in_medicare")+"\t");
			
		}
	}
}
