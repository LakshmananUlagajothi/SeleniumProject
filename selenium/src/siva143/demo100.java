package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class demo100 {

	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(2));
		driver.get("https://www.google.com/gmail/about/");
        driver.findElement(By.xpath("//a[@href=\'https://mail.google.com/mail/&ogbl\']")).click();
        driver.findElement(By.xpath("//a[@data-action=\'sign in\']")).click();
        driver.findElement(By.xpath("//input[@aria-label=\'Email or phone\']")).sendKeys("sivajolakshmanan@gmail.com");
        driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
        driver.findElement(By.xpath("//input[@aria-label=\'Enter your password\']")).sendKeys("Sivajo@98426");
        
        driver.close();
	}

}
