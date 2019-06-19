package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	@FindBy(id="userId")
	WebElement username;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(id="btnSubmit")
	WebElement submit;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage validateLoginPage(String un, String pwd) {
		
		username.sendKeys(un);
		password.sendKeys(pwd);
		submit.click();
		
		return new HomePage();
		
	}
}
