package ntt_basic_intro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {

	public static void main(String[] args) throws Exception {
		
//		//Connecting with the chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.org/index.php?rp=/login");
//		driver.findElement(By.id("icon")).click();
//		List<WebElement> activeLinks = driver.findElements(By.tagName("a"));
//		for(WebElement x: activeLinks) {
//			String s = x.getText();
//			System.out.println(s);
//		}
		
	//	driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='inputEmail']")).clear();
		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("tester@gmail.com");
		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//input[@name='rememberme']")).click();
		
		//driver.findElement(By.xpath("//*[@class=\"rc-anchor-content\"]//span/div[3]")).click();
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.quit();
	}
}
