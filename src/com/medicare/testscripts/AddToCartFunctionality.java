package com.medicare.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartFunctionality extends Driver {
	@Given("A user on the landing page")
	public void a_user_on_the_landing_page() {
		Assert.assertEquals(driver.getTitle(), "Medicare - Home");
	}

	@When("he clicks on show product image button")
	public void he_clicks_on_show_product_image_button() throws InterruptedException {
	   landingPage.clickOnMedicineType();
	   landingPage.clickOnShowBtn();
	   Thread.sleep(2000);
	}

	@When("he clicks on Add to cart button")
	public void he_clicks_on_add_to_cart_button() throws InterruptedException {
	    landingPage.clickAddToCartbtn();
	    landingPage.EnteringCredentials("kn@gmail.com", "12345");
	    landingPage.clickOnLogin();
	    Thread.sleep(2000);
	}

	@When("he clicks on continue shopping button")
	public void he_clicks_on_continue_shopping_button() {
	   landingPage.clickonContinueShoppingBtn();
	}

	@Then("the user should able to do the shopping successfully")
	public void the_user_should_able_to_do_the_shopping_successfully() throws InterruptedException {
		Assert.assertEquals(driver.getTitle(), "Medicare - All Products");
		Thread.sleep(2000);
	}



}
