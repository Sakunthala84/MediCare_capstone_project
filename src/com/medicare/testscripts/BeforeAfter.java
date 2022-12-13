package com.medicare.testscripts;


import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BeforeAfter extends Tools{
	
	//WebDriver driver;
	@Before
	public void setUp() {
		//1)open the browser
//		System.setProperty("webdriver.chrome.driver", "resource//chromedriver.exe");
//		driver=new ChromeDriver();
		Driver.init();
		
		//2)Maximize it
		driver.manage().window().maximize();
		
		
		//3)Navigate to https://www.redbus.in
		driver.get("http://localhost:8080/medicare/");
		
	}
	
	@After
	public void tearDown() {
		//16)Close the browser
		driver.quit();
		
	}
	

	
}
