package Siva_Nandhu_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Iframes_nandhu {
	WebDriver driver;
	
	/*
	 * default iframe
	 */
	@Test
	public void iframes_nan_Defaultiframe() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/frames?sublist=0");
		WebElement elementIframe = driver.findElement(By.xpath("//iframe[@title=\"Login Form\"]"));
		driver.switchTo().frame(elementIframe);
		driver.findElement(By.id("username")).sendKeys("sivaanbu");
		Thread.sleep(2000);
		driver.quit();
	}
	/*
	 * multiple iframe 
	 */
	@Test 
	public void iframes_nan2_Multipleiframe() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/frames/multiple?sublist=2");
		//WebElement elementIframe = driver.findElement(By.xpath("//iframe[@src=\"../signin.html\"]"));
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("sivaanbu");
		Thread.sleep(2000);
		//parentFrame is used to change the driver focus on main html page after that only able switch to iframes
		driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.findElement(By.id("email")).sendKeys("sivaanbu");
		Thread.sleep(2000);
		driver.quit();
	}
	
	/*
	 * Nested iframe
	 */
	@Test
	public void iframes_nan_Nested_iframe() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/frames/nested?sublist=1");
		//WebElement elementIframe = driver.findElement(By.xpath("//iframe[@src=\"../signin.html\"]"));
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys("sivaanbu");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		System.out.println(driver.findElement(By.xpath("//p")).getText());
		//parentFrame is used to change the driver focus on main html page after that only able switch to iframes
		//driver.switchTo().parentFrame();
		//driver.switchTo().frame(1);
		//driver.findElement(By.id("email")).sendKeys("sivaanbu");
		Thread.sleep(2000);
		driver.quit();
	}

}