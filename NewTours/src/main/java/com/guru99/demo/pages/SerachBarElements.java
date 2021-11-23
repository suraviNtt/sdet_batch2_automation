package com.guru99.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99.demo.utility.CommonMethods;

public class SerachBarElements extends CommonMethods {

	@FindBy(id = "email")
	WebElement emailInbox;

	@FindBy(xpath = "//input[@name='password']")
	WebElement passwordField;

	@FindBy(xpath = "//input[@name='confirmPassword']")
	WebElement confrmPasswordField;

	@FindBy(xpath = "//input[@name='submit']")
	WebElement submit;

	public SerachBarElements() {
		PageFactory.initElements(driver, this);
	}
}
