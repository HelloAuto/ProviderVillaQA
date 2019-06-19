package com.qa.testsuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeTest
	public void setup() {
		
		initialization();
		loginPage = new LoginPage();
		
		
	}
	
	@Test
	public void validateLoginPageTest() {
		
		homePage = loginPage.validateLoginPage(prop.getProperty("username"), prop.getProperty("password"));
		System.out.println("successfully loggedin.");
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}


}
