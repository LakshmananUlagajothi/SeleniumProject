package Siva_Nandhu_TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group_Execution {
	
	WebDriver driver=new ChromeDriver();

	@Test
	public void registerlogin1() throws InterruptedException
	{
		//Actions action=new Actions(driver);
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Text")).click();
//		WebElement cou = driver.findElement(By.id("select3"));
//		Select sel=new Select(cou);
//		//List<WebElement> sell = sel.getOptions();
//		sel.selectByIndex(3);
//		Thread.sleep(3000);
//		List<WebElement> qq = sel.getAllSelectedOptions();
//		for(WebElement e:qq) {
//			System.out.println(e.getText());
//		}
		
		driver.quit();
		Reporter.log("register smoke ge oo1",true);
	}	
	
//	@Test(groups = "func")
//	public void registerlogin2()
//	{
//		driver.get("https://www.google.com");
//		driver.quit();
//		Reporter.log("register func ge oo2",true);
//	}
//	@Test(groups = "rt")
//	public void registerlogin3()
//	{
//		driver.get("https://www.google.com");
//		driver.quit();
//		Reporter.log("register rt ge oo3",true);
//	}
	

}
