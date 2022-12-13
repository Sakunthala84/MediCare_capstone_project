package com.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageProductPage {
	
	Actions actions;
	
	@FindBy(xpath="//button[contains(@class,'btn-warning')]")
	WebElement addNewCategoryBtn;
	
	//@FindBy(id="name")
	@FindBy(xpath="(//input[contains(@class,'form-control')])[6]")
	WebElement categoryName;
	
	//@FindBy(id="description")
	@FindBy(xpath="(//textarea[contains(@class,'form-control')])[2]")
	WebElement description;
	
	@FindBy(xpath="(//input[contains(@class,'btn-primary')])[2]")
	WebElement saveBtn;
	
	public ManageProductPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		actions=new Actions(driver);
	}
	
	public void clickOnAddnewCategorybtn() {
		addNewCategoryBtn.click();
	}
	
	public void categoryName(String ctName) {
		
		actions.moveToElement(categoryName).build().perform();
		categoryName.sendKeys(ctName);
	}
	
	public void description(String desc) {
		actions.moveToElement(description).build().perform();
		description.sendKeys(desc);
	}
	
	public void clickOnSaveBtn() {
		saveBtn.click();
		
	}
}
