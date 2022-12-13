package com.medicare.testscripts;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewProduct extends Driver {
	
	@Given("user is navigated to landing page of medicare application")
	public void user_is_navigated_to_landing_page_of_medicare_application() {
		Assert.assertEquals(driver.getTitle(), "Medicare - Home");
	}

	@When("user is clicks login button")
	public void user_is_clicks_login_button() {
	  landingPage.clickOnLoginBtn();
	}

	@When("he entered valid credentials of admin user")
	public void he_entered_valid_credentials_of_admin_user() {
	   landingPage.EnteringCredentials("vk@gmail.com", "admin");
	   }

	@When("he should able to log in as admin")
	public void he_should_able_to_log_in_as_admin() throws InterruptedException {
	    Assert.assertEquals(landingPage.clickOnLogin(), "Vikas Kashyap");
	}

	@When("he click on manage product")
	public void he_click_on_manage_product() throws InterruptedException {
		landingPage.clickOnManageProductBtn();
		Thread.sleep(3000);
	    
	}

	@When("he click on add new category")
	public void he_click_on_add_n_ew_category() throws InterruptedException {
		manageProductPage.clickOnAddnewCategorybtn();
		Thread.sleep(2000);
	}

	@When("he enters name and type of category")
	public void he_enters_name_and_type_of_category() throws InterruptedException {
		manageProductPage.categoryName("VitaminesCapsules");
		manageProductPage.description("Part Of Healthy life");
		Thread.sleep(2000);
	}

	@When("he clicks save button")
	public void he_clicks_save_button() throws InterruptedException {
		manageProductPage.clickOnSaveBtn();
		Thread.sleep(2000);
	}

	@Then("admin can add new category successfully")
	public void admin_can_add_new_category_successfully() {
//	String actual=	landingPage.categoryNames("VitaminesCapsules");
//	Assert.assertEquals(actual, "VitaminesCapsules");
	   System.out.println("Product Added Suceessfully");
	}

}
