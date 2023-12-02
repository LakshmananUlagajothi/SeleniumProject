package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maketheurtips_tha {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("8220817565");
		Thread.sleep(2000);
		driver.findElement(By.className(null));
		driver.close();
	}

}
