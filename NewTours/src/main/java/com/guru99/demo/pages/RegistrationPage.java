package com.guru99.demo.pages;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.guru99.demo.utility.CommonMethods;

public class RegistrationPage extends CommonMethods{

	@FindBy(id = "email")
	WebElement emailInbox;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//input[@name='confirmPassword']")
	WebElement confrmPasswordField;
	
	@FindBy(xpath = "//input[@name='submit']")
	WebElement submit;
	
	public RegistrationPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmailID(String emailID) {
		enterDataInTextField(emailInbox, emailID);
	}
	
	public void enterPasswordField(String pass) {
		enterDataInTextField(passwordField, pass);
	}
	
	public void enterConfrmPasswordField(String cpass) {
		enterDataInTextField(confrmPasswordField, cpass);
	}

	public void clickOnSubmitButton() {
		clickOnElement(submit);
	}
	
	/**
	 * For Registration with only required fields for registration required precondition TCs
	 * @param email
	 * @param pass
	 */
	public void RegiterOnlyRequiredFields(String email , String pass) {
		scrollToElement(emailInbox);
		enterEmailID(email);
		enterPasswordField(pass);
		enterConfrmPasswordField(pass);
		clickOnSubmitButton();
	}
	
	/**
	 * Registration success verification 
	 * @param email
	 */
	public void verifySuccessRegistration(String email) {
		WebElement successMsg = getWebElement("//b[normalize-space()='Note: Your user name is "+email+".']");
		assertNotNull(successMsg, "Success Msg found Successfully");
		
	}
}
