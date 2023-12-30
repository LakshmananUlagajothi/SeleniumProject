package Siva_Nandhu_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class nothing_framework {
	
	@Test
	public void test() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.lotmobiles.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("sm_megamenu_34")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("sm_megamenu_42")).click();
		//driver.findElement(By.id("user-icon")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.id("email")).sendKeys("sivajolakshmanan@gmail.com");
		Thread.sleep(2000);
		//driver.findElement(By.id("pass")).sendKeys("siva@jo");
		Thread.sleep(2000);
		driver.quit();
	}

}
