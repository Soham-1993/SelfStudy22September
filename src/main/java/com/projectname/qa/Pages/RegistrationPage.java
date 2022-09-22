package com.projectname.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.projectname.qa.Base.TestBase;

public class RegistrationPage extends TestBase{
	
	//Declaration ==>webelements
		//intialize==>pagefactory
		//usage==>validation==>methods
		
			//Declaration of Webelements
		
		@FindBy (xpath="//img[@alt='Facebook']") private WebElement reg_fblogo;
		@FindBy (xpath="//a[@aria-label='Already have an account?']") private WebElement already_acc;
		@FindBy (xpath="//a[@title='Sign up for Facebook']") private WebElement signup_link;
		@FindBy (name="firstname") private WebElement firstname;
		@FindBy (name="lastname") private WebElement lastname;
		@FindBy (name="reg_email__") private WebElement mobile_email;
		@FindBy (name="reg_passwd__") private WebElement password;
		@FindBy (name="birthday_day") private WebElement birthday;
		@FindBy (name="birthday_month") private WebElement birthmonth;
		@FindBy (name="birthday_year") private WebElement birthyear;
		@FindBy (xpath="//label[text()='Male']") private WebElement gender_male;
		@FindBy (xpath="//label[text()='Female']") private WebElement gender_female;
		@FindBy (name="websubmit") private WebElement signupbutton;


		//initialization

		public RegistrationPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//usage
		
		public void clickFacebookSignupLink() {
			signup_link.click();
		}
		
		public void verifyFacebookRegistrationPageFBlogo() {
			Assert.assertTrue(reg_fblogo.isDisplayed(), "The fb logo is not displayed on the registration page");
		}
		
		public void verifyFacebookRegistrationPageAlreadyAccountLink() {
			Assert.assertTrue(already_acc.isDisplayed(), "The fb already have an account not dispalyaed on the registration page");
			Assert.assertEquals(already_acc.getText(), "Already have an account?");
			}

		public void setFacebookRegistrationPageFirstName() {
			firstname.sendKeys("Soham");
		}
		
		public void setFacebookRegistrationPageLastName() {
			lastname.sendKeys("Velhal");
		}
		
		public void setFacebookRegistrationPageMobleNo() {
			mobile_email.sendKeys("@gmail.com");
		}
		
		public void setFacebookRegistrationPagePassword() {
			password.sendKeys("abc@123456789");
		}
		
		public void setFacebookRegistrationPageBirthDate() {
			Select bday = new Select(birthday);
			Assert.assertTrue(birthday.isDisplayed(), "The birthday option not dispalyaed on the registration page");
			Assert.assertFalse(birthday.isSelected());
			bday.selectByVisibleText("23");
			}
		
		public void setFacebookRegistrationPageBirthMonth() {
			Select bmonth = new Select(birthmonth);
			Assert.assertTrue(birthmonth.isDisplayed(), "The birthmonth option not dispalyaed on the registration page");
			Assert.assertFalse(birthmonth.isSelected());
			bmonth.selectByVisibleText("Oct");
			}
		
		public void setFacebookRegistrationPageBirthYear() {
			Select byear = new Select(birthyear);
			Assert.assertTrue(birthyear.isDisplayed(), "The birthyear option not dispalyaed on the registration page");
			Assert.assertFalse(birthyear.isSelected());
			byear.selectByVisibleText("1993");
			}
		
		public void setFacebookRegistrationPageGender(String gender) {
			if(gender.equalsIgnoreCase("Male")) {
				gender_male.click();
			}else if(gender.equalsIgnoreCase("Female")) {
				gender_female.click();
			}else {
				System.out.println("Wrong gender selected");
			}
		}
		
		public void clickFacebookRegistrationPageSignUpButton() {
			signupbutton.click();
			
		}


}
