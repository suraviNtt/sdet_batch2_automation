package ntt_basic_intro.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioAndCheckBoxes {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/test/radio.html");

		WebElement radioOption1 = driver.findElement(By.xpath("//input[@id='vfb-7-1']"));
		radioOption1.click();
		String name = radioOption1.getAttribute("name");
		System.out.println(name);
		Boolean l = false;
		if (name.equals("webform")) {
			l = true;
		}
		System.out.println(l);
		
		WebElement checkbox1 = driver.findElement(By.xpath("//input[@id=\"vfb-6-0\"]"));
		checkbox1.click();

	}
}
