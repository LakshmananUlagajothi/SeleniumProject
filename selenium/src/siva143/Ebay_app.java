package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay_app {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.get("https://ebay.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Sign in")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
