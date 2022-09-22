package com.projectname.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.TestBase;
import com.projectname.qa.Pages.LoginPage;

public class LoginTest extends TestBase {
	
//    WebDriver driver;
	
	@BeforeClass
	public void setup() {
		CrossBrowser("firefox");
	}

	@AfterClass
	public void teardown() {
		TestBase.driver.close();
	}

	@Test
	public void FacebookLoginPageTest() {
		 
		LoginPage lp = new LoginPage(driver);
		lp.verifyFacebookLoginPageLogo();
		lp.verifyFacebookLoginPageTagline();
		lp.verifyFacebookLoginPageCreateNewAccountBtn();
		lp.verifyFacebookLoginPageForgotPasswordLink();
		lp.verifyFacebookLoginPageCreatePageLink();
		lp.verifyFacebookLoginPageFooterLinks();
		lp.setFacebookLoginPageUsername();
		lp.setFacebookLoginPagePassword();
		lp.clickFacebookLoginPageLoginBtn();
		 
		
	}
	
	
}
