package Siva_Nandhu_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class nandhu_challenge_Isdisplayed {
	
	@Test
	public void assertIsDisplayed() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.partialLinkText("Computers")).click();
		driver.findElement(By.partialLinkText("Wishlist")).click();
		Thread.sleep(2000);
	   //
		WebElement wishlist = driver.findElement(By.tagName("h1"));
		
		boolean wish = wishlist.isDisplayed();
		
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(wish, null);
		
		driver.quit();
		soft.assertAll();
	}

}
