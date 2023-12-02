package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DEMO_DEEPA {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Today's Deals")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Today's Deals")).click();
		driver.close();
	}

}
