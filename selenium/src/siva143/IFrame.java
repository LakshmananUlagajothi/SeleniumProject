package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Multiple iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(1);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("raja");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("sivajalakshmanan@gmail.com");
	    Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("anbu");
		Thread.sleep(2000);
		/*
		 * defaultcontent switchto super most parent frame
		 * 
		 */
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("raja");
		Thread.sleep(2000);
//		driver.findElement(By.id("email")).sendKeys("sivajalakshmanan@gmail.com");
//	    Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("anbu");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Nested iframe")).click();
		driver.quit();
	}

}
