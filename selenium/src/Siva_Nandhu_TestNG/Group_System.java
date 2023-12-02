package Siva_Nandhu_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group_System {

	WebDriver driver=new ChromeDriver();

	@Test(groups = "smoke")
	public void registerlogin1()
	{
		driver.get("https://www.google.com");
		driver.quit();
		Reporter.log("register smoke oo101",true);
	}	
	
	@Test(groups = "rt")
	public void registerlogin2()
	{
		driver.get("https://www.google.com");
		driver.quit();
		Reporter.log("register rt oo201",true);
	}
	@Test(groups = "func")
	public void registerlogin3()
	{
		driver.get("https://www.google.com");
		driver.quit();
		Reporter.log("register func oo301",true);
	}
	
}
