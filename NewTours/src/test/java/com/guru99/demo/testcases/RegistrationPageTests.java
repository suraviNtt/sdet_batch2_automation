package com.guru99.demo.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru99.demo.pages.RegistrationPage;
import com.guru99.demo.utility.CommonMethods;
import com.guru99.demo.utility.PropertyReader;

public class RegistrationPageTests {

	private RegistrationPage registrationPage;
	private PropertyReader propertyReader;

	@BeforeMethod
	public void launchApplication() throws IOException {

		registrationPage = new RegistrationPage();
		propertyReader = new PropertyReader();
		// propertyReader.updateURL();
		registrationPage.getDriver(propertyReader.getBrowserName());
		registrationPage.getApplication(propertyReader.getAppUrl());
	}

	@DataProvider(name = "validCreds")
	public Object validData() {
		Object[][] usercreds = { { "Shreya@gmail.com", "password" } };
		return usercreds;
	}

	@DataProvider(name = "invalidCreds")
	public Object invalidData() {
		Object[][] usercreds = { { " ", " " } };
		return usercreds;
	}

	@DataProvider(name = "invalidMail")
	public Object invalidMailID() {
		Object[][] usercreds = { { "stf", "pass" } };
		return usercreds;
	}

	@Test(dataProvider = "validCreds")
	public void registrationSucess(String mail, String password) {
		registrationPage = new RegistrationPage();
		registrationPage.RegiterOnlyRequiredFields(mail, password);
		registrationPage.verifySuccessRegistration(mail);

	}

	@Test(dataProvider = "invalidCreds")
	public void registrationFailure(String mail, String password) {
		registrationPage = new RegistrationPage();
		registrationPage.RegiterOnlyRequiredFields(mail, password);

	}

	@Test(dataProvider = "invalidMail")
	public void registrationFailureInvalidMail(String mail, String password) {
		registrationPage = new RegistrationPage();
		registrationPage.RegiterOnlyRequiredFields(mail, password);

	}

	@AfterMethod
	public void teardown() {
		registrationPage = new RegistrationPage();
		registrationPage.closeBrowser();
	}
	
	
}
