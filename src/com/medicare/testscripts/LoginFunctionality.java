package com.medicare.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFunctionality extends Driver{
	@Given("A user is on the landing page")
	public void a_user_is_on_the_landing_page() {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(driver.getTitle(), "Medicare - Home");
	}

	@When("he clicks login button")
	public void he_clicks_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		landingPage.clickOnLoginBtn();
		Thread.sleep(4000);
	}

	@When("he enters valid user name and password")
	public void he_enters_valid_user_name_and_password() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		landingPage.EnteringCredentials("kn@gmail.com", "12345");
		Thread.sleep(4000);

		
	}

	@Then("he able to login succesfully")
	public void he_able_to_login_succesfully() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		String actualText=landingPage.clickOnLogin();
		
		System.out.println(actualText);
		Assert.assertEquals(actualText,"Kavita Nigam");
		
		Thread.sleep(4000);
	}

	@When("he enters invalid user name and password")
	public void he_enters_invalid_user_name_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		landingPage.EnteringCredentials("knv@gmail.com", "12345");
	}

	@Then("he able to get error message")
	public void he_able_to_get_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	   // Assert.assertNotSame(landingPage.clickOnLogin(), "Kavitha Nigam");
		String actualText=landingPage.clickOnLoginEr();
		String expectedText="Username and Password is invalid!";
	   // System.out.println(actualText);
		Assert.assertEquals(actualText,expectedText);
	    
	}
	



}
