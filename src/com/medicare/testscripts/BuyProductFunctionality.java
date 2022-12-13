package com.medicare.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyProductFunctionality extends Driver{
	
	@Given("An user is in the landing page")
	public void an_user_is_in_the_landing_page() {
		Assert.assertEquals(driver.getTitle(), "Medicare - Home");

	}
	

	@When("he clicks show product image button")
	public void he_clicks_show_product_image_button() throws InterruptedException {
		landingPage.clickOnMedicineType();
		   landingPage.clickOnShowBtn();
		   Thread.sleep(2000);
	}

	@When("he adds the product in the cart")
	public void he_adds_the_product_in_the_cart() throws InterruptedException {
		 landingPage.clickAddToCartbtn();
		    landingPage.EnteringCredentials("kn@gmail.com", "12345");
		    landingPage.clickOnLogin();
		    paymentPage.clickOnCheckoutBtn();
		    paymentPage.clickOnSelectAddressBtn();
		    Thread.sleep(2000);
	}

	@When("he enters card details")
	public void he_enters_card_details() throws InterruptedException {
		paymentPage.cardNumber("12324324");
		paymentPage.expmonth("17");
		paymentPage.expyear("2025");
		paymentPage.cvcCode("123");
		
		Thread.sleep(2000);
		
	   
	}

	@When("he confirms the payment")
	public void he_confirms_the_payment() {
		paymentPage.clickOnPayBtn();
	}

	@Then("user should able to buy the product successfully")
	public void user_should_able_to_buy_the_product_successfully() throws InterruptedException {
	   String actualText=paymentPage.orderConfirmedMsg();
	   String expText="Your Order is Confirmed!!";
	   Assert.assertEquals(actualText, expText);
	   Thread.sleep(4000);
	}


}
