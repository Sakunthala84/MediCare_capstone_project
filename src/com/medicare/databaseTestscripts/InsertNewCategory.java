package com.medicare.databaseTestscripts;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InsertNewCategory extends BaseClass{
	@Test
	public void addNewCategory() throws SQLException {
		String query="INSERT INTO Category (name, description,image_url,is_active) VALUES ('Antibiotics2', 'This is for reducing fever or pyrexia or pyresis', NULL, true);";
		stmt.execute(query);
		
		String actualText=landingPage.categoryNames("Antibiotics2");
		String expText="Antipiretics";
		Assert.assertEquals(actualText,expText );
	}

}
