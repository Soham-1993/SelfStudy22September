package com.projectname.qa.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.projectname.qa.Base.TestBase;
import com.projectname.qa.Pages.RegistrationPage;

public class RegistrationTest extends TestBase {
	
//	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		CrossBrowser("chrome");
	}

	@AfterClass
	public void teardown() {
		TestBase.driver.close();
	}
	
	@Test
	public void FacebookRegistrationPage() {
		RegistrationPage rgPage = new RegistrationPage(driver);
		
		rgPage.clickFacebookSignupLink();
		rgPage.verifyFacebookRegistrationPageFBlogo();
		rgPage.verifyFacebookRegistrationPageAlreadyAccountLink();
		rgPage.setFacebookRegistrationPageFirstName();
		rgPage.setFacebookRegistrationPageLastName();
		rgPage.setFacebookRegistrationPageMobleNo();
		rgPage.setFacebookRegistrationPagePassword();
		rgPage.setFacebookRegistrationPageBirthDate();
		rgPage.setFacebookRegistrationPageBirthMonth();
		rgPage.setFacebookRegistrationPageBirthYear();
		rgPage.setFacebookRegistrationPageGender("Male");
		rgPage.clickFacebookRegistrationPageSignUpButton();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
