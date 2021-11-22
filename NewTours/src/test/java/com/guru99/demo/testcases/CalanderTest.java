package com.guru99.demo.testcases;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99.demo.pages.CalanderExample;
import com.guru99.demo.utility.PropertyReader;

public class CalanderTest {

	private CalanderExample calanderExample;
	private PropertyReader propertyReader;

	@BeforeMethod
	public void launchApplication() throws IOException {

		calanderExample = new CalanderExample();
		propertyReader = new PropertyReader();
		// propertyReader.updateURL();
		calanderExample.getDriver(propertyReader.getBrowserName());
		propertyReader.updateURL("https://www.irctc.co.in/nget/train-search");
		calanderExample.getApplication(propertyReader.getAppUrl());
		calanderExample.closePopUpalert();
	}
	
	
	@Test
	public void selectJourneyDateSuccess() {
		calanderExample = new CalanderExample();
		calanderExample.selectCurrentDate();
	}
}
