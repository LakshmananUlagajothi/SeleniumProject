package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nandhu_program_113 {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.partialLinkText("Fashion")).click();
	}

}
