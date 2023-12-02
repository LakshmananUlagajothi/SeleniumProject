package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_09 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://mail.google.com/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("sivajolakshmanan@gamil.com");
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("a[href='/deals?ref_=nav_cs_gb']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("a[href='/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles']")).click();
//		Thread.sleep(2000);
		driver.close();

	}

}
