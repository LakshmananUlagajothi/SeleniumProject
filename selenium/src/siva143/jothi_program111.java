package siva143;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class jothi_program111 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//		WebDriverWait  wait=new WebDriverWait(driver,Duration.ofSeconds(10) );
//		driver.get("https://www.amazon.in/");
//		WebElement eng = driver.findElement(By.xpath("(//div[contains(.,'EN')])[6]"));
//		Actions action=new Actions(driver);
//		action.moveToElement(eng).build().perform();
//		Thread.sleep(2000);
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//span[contains(.,'தமிழ்')])[2]")));
//		driver.findElement(By.xpath("(//span[contains(.,'தமிழ்')])[2]")).click();
//		
		
	    Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(5000);
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("(//div[contains(.,'EN')])[6]"))));
//		action.moveToElement(driver.findElement(By.xpath("(//div[contains(.,'EN')])[6]"))).perform();
//		Thread.sleep(10000);
//		driver.findElement(By.xpath("(//span[.='English'])[1]")).click();
//		Thread.sleep(5000);
		Robot ref=new Robot();
//		Thread.sleep(2000);
//		ref.keyPress(KeyEvent.VK_PAGE_DOWN);
//		Thread.sleep(2000);
//		ref.keyPress
//		(KeyEvent.VK_PAGE_DOWN);
		
		ref.mouseMove(500, 500);
		Thread.sleep(2000);
		ref.keyRelease(KeyEvent.VK_PAGE_DOWN);
		//driver.close();

	}

}
