package ntt_basic_intro.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsExample {

	/**
	 *  seeing example of alert
	 *  
	 * @author suravi
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		//set up chrome
		WebDriverManager.chromedriver().setup();
		// settig chrome driver
		WebDriver driver = new ChromeDriver();
		//launching application
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		//creating web element of submit button
		WebElement submitbutton = driver.findElement(By.xpath("//input[@name='submit']"));
		//clicking button
		submitbutton.click();
		//accept alert
		driver.switchTo().alert().accept();
		//Putting selenium's thread to sleep
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(8000);
		submitbutton.click();
		//cancel alert
		driver.switchTo().alert().dismiss();
	}
}
