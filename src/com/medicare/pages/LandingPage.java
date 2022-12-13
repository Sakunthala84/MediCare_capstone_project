package com.medicare.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
	WebDriverWait wait;
	
	@FindBy(partialLinkText="Login")
	WebElement login;
	
	@FindBy(linkText="Sign Up")
	WebElement signUp;
		
	@FindBy(id="username")
	WebElement usernameTextBox;
	
	@FindBy(id="password")
	WebElement passwordTextBox;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[@class='btn btn-default dropdown-toggle']")
	WebElement loginText;
	
	@FindBy(xpath="//div[contains(@class,'alert alert-danger fade in')]")
	WebElement errMsg;
	
	@FindBy(linkText="Antipyretics")
	WebElement medicineType;
	
	@FindBy(xpath="(//a[@class=\"btn btn-primary\"])[1]")
	WebElement medicineName;
	
	@FindBy(xpath="(//a[@class=\"btn btn-success\"])[1]")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//a[@class=\"btn btn-warning\"]")
	WebElement continueBtn;
	
	@FindBy(linkText="Manage Product")
	WebElement manageProductBtn;
	
	@FindBy(xpath="//div[@class=\"col-md-3\"]")
	List<WebElement> categories;
	
	@FindBy(xpath="//div//h6")
	WebElement quantity;
	
	@FindBy(xpath="(//a[contains(@class,'btn-primary')])[1]")
	WebElement viewBtn;
	
	public LandingPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	
	public void clickOnLoginBtn() {
		
		login.click(); 
	}
	public void clickOnSignup() {
		signUp.click();
	}
	
	public void EnteringCredentials(String username,String password) {
		
		usernameTextBox.sendKeys(username);
		passwordTextBox.sendKeys(password);
	}
	
	public String clickOnLogin() throws InterruptedException {
		loginBtn.click();
		Thread.sleep(4000);
		String name1=loginText.getText();
		return name1;
		//String name=errMsg.getText();
		
	}
	public String clickOnLoginEr() {
			loginBtn.click();
			String name=errMsg.getText();
			return name;
	}
	
	public void clickOnMedicineType() {
		medicineType.click();
	}
	
	public void clickOnShowBtn() {
		medicineName.click();
	}
	
	public void clickAddToCartbtn() {
		addToCartBtn.click();
	}
	
	
	public void clickonContinueShoppingBtn() {
		continueBtn.click();
	}
	
	public void clickOnManageProductBtn() {
		manageProductBtn.click();
	}
	
	public String categoryNames(String ctname) {
		String cName[] = null;
		String ctype="";
		for (WebElement ctnames:categories) {
			cName=ctnames.getText().split("\n");
		}
			for(String c:cName) {
			
			if(c.equals(ctname)) 
				ctype=c;
			System.out.println(ctype+"\n");
			}
		
		return ctype;
	}
	
	public void clickOnViewBtn() {
		viewBtn.click();
	}
	
	public String getQuantity() {
		String str[]=quantity.getText().split(" ");
		String qu="";
		for(String c:str) {
			//System.out.println(c);
			qu=c;
		}
		return qu;
	}
}
