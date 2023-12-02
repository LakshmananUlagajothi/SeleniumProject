package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_pickur {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
