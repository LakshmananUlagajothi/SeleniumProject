package Siva_Nandhu_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group_Register {
	
	WebDriver driver=new ChromeDriver();
	
	@Test(groups = "smoke")
	public void registerlogin1()
	{
		
		driver.get("https://www.google.com");
		driver.quit();
		Reporter.log("register smoke gr oo1",true);
	}	
	
	@Test(groups = "func")
	public void registerlogin2()
	{
		driver.get("https://www.google.com");
		driver.quit();
		Reporter.log("register func gr oo2",true);
	}
	@Test(groups = "rt")
	public void registerlogin3()
	{
		driver.get("https://www.google.com");
		driver.quit();
		Reporter.log("register rt gr oo3",true);
	}
	

}
