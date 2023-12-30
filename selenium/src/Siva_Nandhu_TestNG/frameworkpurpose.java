package Siva_Nandhu_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class frameworkpurpose {
	
	@Test
	public void frameWork() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("sivajolakshmanan@gmail.com");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Sivajo@123");
		Thread.sleep(2000);
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[.='L']//span")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("search")).sendKeys("tshirt");
		//driver.findElement(By.cssSelector("[data-testid=\"PersonIcon\"]")).click();
		//driver.findElement(By.cssSelector("[data-testid=\"FavoriteBorderIcon\"]")).click();
		//driver.findElement(By.cssSelector("[data-testid=\"ShoppingBagIcon\"]")).click();
		//driver.findElement(By.cssSelector("[data-testid=\"AccountBalanceWalletIcon\"]")).click();
		//driver.findElement(By.cssSelector("[data-testid=\"FilterAltOutlinedIcon\"]")).click();
		//driver.findElement(By.cssSelector("[data-testid=\"LogoutIcon\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("cart")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("[class=\"chatbot\"]")).click();
		Thread.sleep(2000);
		//System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		//driver.findElement(By.id("kidsProd")).click();
		Thread.sleep(2200);
		driver.quit();
	}

}
