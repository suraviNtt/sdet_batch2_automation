package ntt_basic_intro.utility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandleExample {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.com/demo");
		WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
		String parentWindow = driver.getWindowHandle();
		loginButton.click();
		Set<String> windows = driver.getWindowHandles();
		for(String s : windows) {
			if(s != parentWindow) {
				driver.switchTo().window(s);
			}
		}
		WebElement email = driver.findElement(By.xpath("//input[@id='inputEmail']"));
		new FluentWait(driver).withTimeout(Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(email));
		email.sendKeys("test@gmail.com");
		driver.close();
		driver.switchTo().window(parentWindow);
		loginButton.click();
		Thread.sleep(2000);
		driver.quit();
	}
}
