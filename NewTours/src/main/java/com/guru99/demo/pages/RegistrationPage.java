package com.guru99.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
		enterEmailID(email);
		enterPasswordField(pass);
		enterConfrmPasswordField(pass);
		clickOnSubmitButton();
	}
	
}
