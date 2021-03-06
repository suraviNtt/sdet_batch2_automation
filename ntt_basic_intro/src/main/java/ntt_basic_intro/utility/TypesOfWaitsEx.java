package ntt_basic_intro.utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TypesOfWaitsEx {

	public static void main(String[] args) throws Exception {

		// set up chrome
		WebDriverManager.chromedriver().setup();
		// settig chrome driver
		WebDriver driver = new ChromeDriver();
		// Implicit Wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// launching application
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		// creating web element of submit button
		WebElement submitbutton = driver.findElement(By.xpath("//input[@name='submit']"));
		// clicking button
		submitbutton.click();
		// accept alert
		driver.switchTo().alert().accept();
		// Putting selenium's thread to sleep
		driver.switchTo().alert().accept();
//				Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(submitbutton));
		// fLUENT wAIT
		Wait<WebDriver> waitF = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(StaleElementReferenceException.class);
		waitF.until(ExpectedConditions.visibilityOf(submitbutton));
		submitbutton.click();
		// cancel alert
		driver.switchTo().alert().dismiss();
	}
}