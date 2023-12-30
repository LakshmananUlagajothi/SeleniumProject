package Siva_Nandhu_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Asics_Project {
	
	@Test
	public void frameWork() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.asics.com/in/en-in");
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("[class=\"loginlnk signin loginimg\"]")).click();
		//driver.findElement(By.xpath("//a[.='Login']")).click();
		//driver.findElement(By.linkText("Create your Account")).click();
	    driver.findElement(By.linkText("Men")).click();
		driver.quit();

}
}
