package Siva_Nandhu_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mvg_framework {
	
	@Test
	public void frameWork() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myg.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='https://www.myg.in/laptop-desktops/']/span")).click();
		//driver.findElement(By.cssSelector("[href=\"/new-arrivals\"]")).click();
		//driver.findElement(By.xpath("//span[.='LATEST OFFERS']")).click();
		//driver.findElement(By.id("sw_dropdown_268")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Comparison list")).click();
		//driver.findElement(By.cssSelector("[href=\"https://www.myg.in/orders/\"]")).click();
		//driver.findElement(By.id("cs-login")).click();
		driver.quit();
	}
}
