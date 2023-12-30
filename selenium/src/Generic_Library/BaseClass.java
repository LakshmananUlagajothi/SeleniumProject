package Generic_Library;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	 
	public WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite()
	{
		Reporter.log("connected to data base", true);;
	}

	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("connected to base", true);;
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("lauch browser", true);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");	
	}
	@BeforeMethod
	public void beforeMethod()
	{
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("sivajolakshmanan@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sivajo@123");
		driver.findElement(By.cssSelector("[value=\"Log in\"]")).click();
	}
	@AfterMethod
	public void afterMethod()
	{
		driver.findElement(By.linkText("Log out")).click();
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}
	@AfterTest
	public void afterTest()
	{
		Reporter.log("connected test to base", true);;
	}
	@AfterSuite
	public void afterSuite()
	{
		Reporter.log("connectSuite base", true);;
	}
	
}
