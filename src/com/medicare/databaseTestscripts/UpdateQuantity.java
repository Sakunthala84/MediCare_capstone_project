package com.medicare.databaseTestscripts;

import java.sql.SQLException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateQuantity extends BaseClass {
	
	@Test
	public void updateQuantity() throws SQLException {
		
		String query="update product set quantity=125 where name='Combiflame';";
				stmt.execute(query);
				
				landingPage.clickOnViewBtn();
				String quantity=landingPage.getQuantity();
				Assert.assertEquals(quantity, "125");
	}

}
