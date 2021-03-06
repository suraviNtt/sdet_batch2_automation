package ntt_basic_intro.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().driverVersion("95.0.4638.69").setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		WebElement selectCountry = driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(selectCountry);
		//select.selectByIndex(3);
		//select.selectByValue("ARUBA");
		select.selectByVisibleText("ANTIGUA AND BARBUDA");
	}
}
