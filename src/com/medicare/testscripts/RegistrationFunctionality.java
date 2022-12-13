package com.medicare.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationFunctionality extends Driver{

	@Given("An user is on the landing page")
	public void an_user_is_on_the_landing_page() {
		Assert.assertEquals(driver.getTitle(), "Medicare - Home");
	}

	@When("he clicks on Sign up button")
	public void he_clicks_on_sign_up_button() throws InterruptedException {
	    landingPage.clickOnSignup();
	    Thread.sleep(3000);
	}

	@When("he enters valid details")
	public void he_enters_valid_details() throws InterruptedException {
		registrationPage.firstName("Krishna");
		registrationPage.lastName("vemuri");
		registrationPage.email("kvri@gmail.com");
		registrationPage.contactNum("544545");
		registrationPage.password("123");
		registrationPage.conPassword("123");
		registrationPage.user();
		registrationPage.clickOnNextBtn();
		Thread.sleep(3000);
	}

	@When("he enters valid address")
	public void he_enters_valid_address() throws InterruptedException {
		registrationPage.addressone("1-74/2");
		registrationPage.addresstwo("AutoNagar");
		registrationPage.city("Hyd");
		registrationPage.postalCode("500089");
		registrationPage.state("Telangana");
		registrationPage.country("India");
		registrationPage.clickOnSubmit();
		Thread.sleep(3000);
	}

	@When("he clicks confirm button")
	public void he_clicks_confirm_button() {
		registrationPage.clickOnConfirm();
	}

	@Then("an user should able to register and login successfully")
	public void an_user_should_able_to_register_and_login_successfully() {
		String msg=registrationPage.getWelcomeMsg();
		System.out.print(msg);
	}


}
