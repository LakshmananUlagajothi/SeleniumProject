package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Program_05 {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[.='Login']")).click();
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.)
	driver.close();
	driver.quit();
	EdgeDriver driver1=new EdgeDriver();
	driver1.get("https://www.google.com/");
	driver1.navigate().to("https://www.swiggy.com/");
	driver1.quit();
//	webElement button=driver.findElement(By.id("id"));
//	tag name <_>
//	text element >text<
//	attribute of value attribute=Attribute value
//	
	}

}
