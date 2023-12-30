package Siva_Nandhu_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Nandhu_Para_TestNG {
    @Parameters("url")
	@Test
	public void parameter_001(String url)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.manage().window().maximize();
		driver.get(url);
		driver.quit();
	}
    @Parameters("url")
	@Test
	public void parameter_002(String url)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.manage().window().maximize();
		driver.get(url);
		driver.quit();
	}
    @Parameters("url")
	@Test
	public void parameter_003(String url)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.manage().window().maximize();
		driver.get(url);
		driver.quit();
	}
	
	
}
