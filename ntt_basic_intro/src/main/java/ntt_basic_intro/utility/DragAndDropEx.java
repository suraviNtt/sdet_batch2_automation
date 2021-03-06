package ntt_basic_intro.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropEx {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement dragItem = driver.findElement(By.xpath("//section[@id='g-container-main']//li[2]//a[1]"));
		WebElement dropItem = driver.findElement(By.xpath("//ol[@id='amt7']//li[@class='placeholder']"));
		Actions dragAndDrop = new Actions(driver);
		dragAndDrop.dragAndDrop(dragItem, dropItem).build().perform();
		
	}
}
