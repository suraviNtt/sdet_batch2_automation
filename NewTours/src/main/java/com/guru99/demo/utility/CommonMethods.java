package com.guru99.demo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Contains all Common Methods
 * @author Suravi
 *
 */
public class CommonMethods {

	protected static WebDriver driver;
	
	/**
	 * getting chrome driver
	 * @return
	 */
	public WebDriver getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
	}

	/**
	 * 
	 * @return
	 */
	public WebDriver getEdgeDriver() {
		WebDriverManager.edgedriver().setup();
		return new EdgeDriver();
	}

	/**
	 * 
	 * @return
	 */
	public WebDriver getFirefoxDriver() {
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}

	public void getDriver(String browser) {
		
		switch (browser) {

		case "chrome":
			driver = getChromeDriver();
			break;
		case "edge":
			driver = getEdgeDriver();
			break;
		case "firefox":
			driver = getFirefoxDriver();
			break;
		default:
			System.out.println("Value entered is not valid");

		}
	}
	
	public void getApplication(String applicationUrl) {
		driver.get(applicationUrl);
		
	}

	public void closeBrowser() {
		driver.quit();
	}
	
	public void closeWindow() {
		driver.close();
	}
	
	public void enterDataInTextField(WebElement webElement , String testdata) {
		try {
			webElement.sendKeys(testdata);
		} catch (Exception e) {
			System.out.println("Element seected is not a text box");
			e.printStackTrace();
		}
	}
	
	public void clickOnElement(WebElement webElement) {
		try {
			webElement.click();
		} catch (Exception e) {
			System.out.println("element is not found");
			e.printStackTrace();
		}
	}
	
	public boolean scrollToElement(WebElement elem) {
		try {
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elem);
			if (elem.isDisplayed())
				return true;
			else
				return false;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	public WebElement getWebElement(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}
}