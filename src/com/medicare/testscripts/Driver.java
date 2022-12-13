package com.medicare.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import com.medicare.pages.LandingPage;
import com.medicare.pages.ManageProductPage;
import com.medicare.pages.PaymentPage;
import com.medicare.pages.RegistrationPage;

public class Driver extends Tools{
	
	protected static LandingPage landingPage;
	protected static RegistrationPage registrationPage;
	protected static PaymentPage paymentPage; 
	protected static ManageProductPage manageProductPage;

	public static void init() {
		System.setProperty("webdriver.chrome.driver","resource//chromedriver.exe");
		driver=new ChromeDriver();

		landingPage=new LandingPage(driver);
		registrationPage=new RegistrationPage(driver);
		paymentPage=new PaymentPage(driver);
		manageProductPage=new ManageProductPage(driver);
	}
}