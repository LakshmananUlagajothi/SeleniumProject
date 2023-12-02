package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pickur1CCCS {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement Xpath = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		Xpath.sendKeys("sivajo");
		Thread.sleep(2000);
		Xpath.clear();
		Thread.sleep(2000);
		driver.close();
	}

}
