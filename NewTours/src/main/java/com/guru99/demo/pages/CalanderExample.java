package com.guru99.demo.pages;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.guru99.demo.utility.CommonMethods;

public class CalanderExample extends CommonMethods {

	@FindBy(xpath = "//p-calendar[@id='jDate']//descendant::input")
	WebElement calander;

	@FindBy(xpath = "(//p-calendar[@id='jDate']//descendant::a)[1]")
	WebElement calanderBack;

	@FindBy(xpath = "(//p-calendar[@id='jDate']//descendant::a)[2]")
	WebElement calanderForward;

	@FindBy(xpath = "//p-calendar[@id='jDate']//descendant::input")
	WebElement months;

	@FindBy(xpath = "//button[normalize-space()='OK']")
	WebElement alertBoxClose;

	// p-calendar[@id='jDate']//descendant::table//td[

	public void closePopUpalert() {
		clickOnElement(alertBoxClose);
	}

	public void selectCurrentDate() {
		Date date = new Date();
		int s = date.getDay();
		WebElement currentDate = getWebElement("//a[normalize-space()='" + s + "']");
		clickOnElement(currentDate);

	}

}
