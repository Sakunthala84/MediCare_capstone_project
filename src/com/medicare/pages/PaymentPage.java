package com.medicare.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {

	@FindBy(xpath="//a[@class=\"btn btn-success btn-block\"]")
	WebElement checkoutbtn;
	
	@FindBy(linkText="Select")
	WebElement selectBtn;
	
	@FindBy(id="cardNumber")
	WebElement cardNumber;
	
	@FindBy(id="expityMonth")
	WebElement expMonth;
	
	@FindBy(id="expityYear")
	WebElement expYear;
	
	@FindBy(id="cvCode")
	WebElement cvcCode;
	
	@FindBy(linkText="Pay")
	WebElement payBtn;
	
	@FindBy(xpath="//h3[@class=\"text-center\"]")
	WebElement successMsg;
	
	public PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnCheckoutBtn() {
		checkoutbtn.click();
	}
	
	public void clickOnSelectAddressBtn() {
		selectBtn.click();
	}
	
	public void cardNumber(String cdNum) {
		cardNumber.sendKeys(cdNum);
	}
	
	public void expmonth(String expmth) {
		
		expMonth.click();
	}
	
	public void expyear(String expyr) {
		expYear.click();
	}
	
	public void cvcCode(String cvCd) {
		cvcCode.sendKeys(cvCd);
	}
	
	public void clickOnPayBtn() {
		payBtn.click();
	}
	
	public String orderConfirmedMsg() {
		String msg=	successMsg.getText();
		return msg;
	}
	
}
