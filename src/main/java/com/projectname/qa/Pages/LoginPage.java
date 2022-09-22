package com.projectname.qa.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.projectname.qa.Base.TestBase;

public class LoginPage extends TestBase {

	//declaration
	
		@FindBy(xpath="//img[@alt='Facebook']") private WebElement fbLoginPage_logo;
		@FindBy(xpath="//h2[text()='Facebook helps you connect and share with the people in your life.']") private WebElement fbLoginPage_tagline;
		@FindBy(xpath="//input[@id='email']") private WebElement username;
		@FindBy(xpath="//input[@id='pass']") private WebElement password;
		@FindBy(xpath="//button[@name='login']") private WebElement fbLogin_btn;
		@FindBy(xpath="//a[text()='Forgotten password?']") private WebElement forgotpassword;
		@FindBy(xpath="//body[@dir='ltr']") private WebElement createnewaccbtn;
		@FindBy(xpath="//a[text()='Create a Page']") private WebElement createpagelink;
		@FindBys({@FindBy(xpath="//div[@id='pageFooterChildren']/ul/li/a")}) private List<WebElement> footerlink;
		
		
		//initialization
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//usage
		
		public void verifyFacebookLoginPageLogo() {
			Assert.assertTrue(fbLoginPage_logo.isDisplayed(), "The fb logo is not displayed on the login page");
			Reporter.log("verifyFacebookLoginPageLogo",true);
		}
		
		public void verifyFacebookLoginPageTagline() {
			Assert.assertTrue(fbLoginPage_tagline.isDisplayed(), "The fb tagline is not displayed on the login page");
			Reporter.log("verifyFacebookLoginPageTagline",true);
		}
		
		public void verifyFacebookLoginPageCreateNewAccountBtn() {
			Assert.assertTrue(createnewaccbtn.isDisplayed(), "The fb create new account is not displayed on the login page");
			Reporter.log("verifyFacebookLoginPageCreateNewAccountBtn",true);
		}
		
		public void verifyFacebookLoginPageCreatePageLink() {
			Assert.assertTrue(createpagelink.isDisplayed(), "The fb create page link is not displayed on the login page");
			Reporter.log("verifyFacebookLoginPageCreatePageLink",true);
		}
		
		public void verifyFacebookLoginPageForgotPasswordLink() {
			Assert.assertTrue(forgotpassword.isDisplayed(), "The fb forgot password link is not displayed on the login page");
			Reporter.log("verifyFacebookLoginPageForgotPasswordLink",true);
		}
		
		public void setFacebookLoginPageUsername() {
			Assert.assertTrue(username.isDisplayed(), "The fb username is not displayed on the login page");
			username.sendKeys("Soham");
			Reporter.log("setFacebookLoginPageUsername",true);
		}
		
		public void setFacebookLoginPagePassword() {
			Assert.assertTrue(password.isDisplayed(), "The fb password is not displayed on the login page");
			password.sendKeys("Soham@1993");
			Reporter.log("setFacebookLoginPagePassword",true);
		}
		
		public void clickFacebookLoginPageLoginBtn() {
			Assert.assertTrue(fbLogin_btn.isEnabled(), "The fb fbLogin_btn is not enabled on the login page");
			fbLogin_btn.click();
			Reporter.log("clickFacebookLoginPageLoginBtn",true);
		}
		
		public void verifyFacebookLoginPageFooterLinks() {
			Assert.assertEquals(footerlink.size(), 31);
			Reporter.log("verifyFacebookLoginPageFooterLinks",true);
		}
}
