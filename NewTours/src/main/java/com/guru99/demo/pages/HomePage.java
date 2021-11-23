package com.guru99.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.demo.utility.CommonMethods;

public class HomePage  extends CommonMethods {

	@FindBy(id = "email")
	WebElement emailInbox;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;
	
	@FindBy(xpath = "//input[@name='confirmPassword']")
	WebElement confrmPasswordField;
	
	@FindBy(xpath = "//input[@name='submit']")
	WebElement submit;
	
	@FindBy(id = "email")
	WebElement emailInbox1;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField1;
	
	@FindBy(xpath = "//input[@name='confirmPassword']")
	WebElement confrmPasswordField1;
	
	@FindBy(xpath = "//input[@name='submit']")
	WebElement submit1;
	
	@FindBy(id = "email")
	WebElement emailInbox2;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField2;
	
	@FindBy(xpath = "//input[@name='confirmPassword']")
	WebElement confrmPasswordField2;
	
	@FindBy(xpath = "//input[@name='submit']")
	WebElement submit2;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
}
