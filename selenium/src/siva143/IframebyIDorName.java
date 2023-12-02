package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframebyIDorName {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		
		driver.get("https://www.dezlearn.com/nested-iframes-example/");
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("demo_parent_iframe");
		
		driver.findElement(By.id("u_5_5")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().frame("demo_frame1");
		
		driver.findElement(By.id("u_5_6")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}

}
