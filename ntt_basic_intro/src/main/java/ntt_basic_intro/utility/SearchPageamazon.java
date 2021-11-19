package ntt_basic_intro.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchPageamazon {

	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().driverVersion("95.0.4638.69").setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		WebElement searchBar = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchBar.sendKeys("Selenium");
	//	searchBar.sendKeys(Keys.ARROW_DOWN);
		searchBar.sendKeys(Keys.ENTER);
	}
}
