package Siva_Nandhu_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Siva_Nandhu_list_of_String {
	
	@Test
	public void testNandhu() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.get("https://www.shoppersstack.com/");
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("sivajolakshmanan@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Sivajo@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class=\"BaseBadge-root MuiBadge-root css-1rzb3uu\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//li[@class=\'MuiButtonBase-root MuiMenuItem-root MuiMenuItem-gutters css-1km1ehz\'])[6]")).click();
		//driver.findElement(By.partialLinkText("Logout")).click();
		driver.findElement(By.id("men")).click();
		
		Thread.sleep(2000);
		driver.quit();
		
		

	
		//Reporter.log("Nandhu love siva", true);//comment
		//Reporter.log("Siva love Anbu",true);
	}

}
