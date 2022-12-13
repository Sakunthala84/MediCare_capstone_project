package com.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	@FindBy(id="firstName")
	WebElement firstNametxtbox;
	
	@FindBy(id="lastName")
	WebElement lastnametxtbox;
	
	@FindBy(id="email")
	WebElement emailtxtbox;
	
	@FindBy(id="contactNumber")
	WebElement contactNumTxtBox;
	
	@FindBy(id="password")
	WebElement passwordTxtBox;
	
	@FindBy(id="confirmPassword")
	WebElement conPassWdTxtBox;
	
	@FindBy(id="role1")
	WebElement userRole;
	
	@FindBy(id="role2")
	WebElement adminRole;
	
	//@FindBy(name="_eventId_billing")
	@FindBy(xpath="//button[contains(@class,btn-primary)]")
	WebElement nextBtn;
	
	@FindBy(id="addressLineOne")
	WebElement addLineOneTxtBox;
	
	@FindBy(id="addressLineTwo")
	WebElement addLineTwoTxtBox;
	
	@FindBy(id="city")
	WebElement cityTxtBox;
	
	@FindBy(id="postalCode")
	WebElement postalcdtxtbox;
	
	@FindBy(id="state")
	WebElement stateTxtbox;
	
	@FindBy(id="country")
	WebElement countryTxtbox;
	
	@FindBy(xpath="(//button[contains(@class,btn-primary)])[2]")
	WebElement submitBtn;
	
	@FindBy(linkText="Confirm")
	WebElement confirmBtn;
	
	@FindBy(xpath="//div/h6")
	WebElement msg;
	
	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void firstName(String fName) throws InterruptedException {
		firstNametxtbox.sendKeys(fName);
		Thread.sleep(2000);
	}
	public void lastName(String lName) throws InterruptedException {
		lastnametxtbox.sendKeys(lName);
		Thread.sleep(2000);
	}
	public void email(String eml) {
		emailtxtbox.sendKeys(eml);
	}
	public void contactNum(String num) {
		contactNumTxtBox.sendKeys(num);		
	}
	public void password(String psd) {
		passwordTxtBox.sendKeys(psd);
	}
	public void conPassword(String psd) {
		conPassWdTxtBox.sendKeys(psd);
	}
	public void user() {
		userRole.isSelected();
	}
	public void Admin() {
		adminRole.isSelected();
	}
	public void clickOnNextBtn() {
		nextBtn.click();
	}
	public void addressone(String ads1) {
		addLineOneTxtBox.sendKeys(ads1);
	}
	public void addresstwo(String ads2) {
		addLineTwoTxtBox.sendKeys(ads2);
	}
	public void city(String ctyName) {
		cityTxtBox.sendKeys(ctyName);
	}
	public void postalCode(String pcode) {
		postalcdtxtbox.sendKeys(pcode);
	}
	public void state(String st) {
		stateTxtbox.sendKeys(st);
	}
	public void country(String ctry) {
		countryTxtbox.sendKeys(ctry);
	}
	public void clickOnSubmit() {
		submitBtn.click();
	}
	public void clickOnConfirm() {
		confirmBtn.click();
		
	}
	public String getWelcomeMsg() {
		String mg=msg.getText();
		return mg;
	}
	
	

}
