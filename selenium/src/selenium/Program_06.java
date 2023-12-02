package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_06 {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.navigate().to("file:///C:/Users/WELCOME/Desktop/LCU1.html");
	Thread.sleep(2000);
	WebElement link1 = driver.findElement(By.id("d1"));
	link1.click();
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.name("n3")).click();
	Thread.sleep(2000);
	System.out.println(driver.getCurrentUrl());
	driver.close();
	}

}
