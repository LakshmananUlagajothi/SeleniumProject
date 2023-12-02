package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='Frames']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[.='iframes']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Nested iframe")).click();
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement nest = driver.findElement(By.id("username"));
		//driver.switchTo().frame(nest);
		Thread.sleep(2000);
		nest.sendKeys("siva");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("sivajalakshmanan@gmail.com");
	    Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("anbu");
		Thread.sleep(2000);
		/*
		 * defaultcontent used to switch the driver to top most parent
		 */
		driver.switchTo().defaultContent();
		
		driver.findElement(By.partialLinkText("Default")).click();
		Thread.sleep(2000);
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("raja");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("anbu");
		Thread.sleep(2000);
		driver.quit();

	}

}
