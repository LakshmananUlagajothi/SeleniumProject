package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nandhuexp100 {
	public static void main(String[] args) {
		ChromeDriver driver=new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Books")).click();
		String text = driver.findElement(By.xpath("//a[.='Computing and Internet']/../..//div//span//following-sibling::span")).getText();
		System.out.println(text);
	}

}
