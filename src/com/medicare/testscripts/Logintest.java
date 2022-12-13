package com.medicare.testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logintest extends Driver {
	
	@BeforeClass
	public void openApp() {
		//1)open the browser
//		System.setProperty("webdriver.chrome.driver", "resource//chromedriver.exe");
//		driver=new ChromeDriver();
		Driver.init();
		
		//2)Maximize it
		driver.manage().window().maximize();
		
		
		//3)Navigate to https://www.redbus.in
		driver.get("http://localhost:8080/medicare/");
		
	}
	
	@Test
	public void login() throws InterruptedException {
		//After application launched click on login btn
		landingPage.clickOnLoginBtn();
		
		//when login page opened enter the credentials 
		
		landingPage.EnteringCredentials("kn@gmail.com", "12345");
		
		//Click on Login Button,and verify user name
		
		String actualText=landingPage.clickOnLogin();
		
		
		Assert.assertEquals(actualText,"Kavita Nigam");
		
		Thread.sleep(4000);
		
		
	}
	@AfterClass
	public void closeApp() {
		//16)Close the browser
		driver.quit();
		
	}
	

}
