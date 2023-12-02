package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pickurtrails1 {
	
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver	=new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[.='FIND FOOD']")).click();
	driver.findElement(By.linkText("Login")).click();
	Thread.sleep(2000);
	driver.switchTo().activeElement().sendKeys("8220817565");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='a-ayg']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='name']")).sendKeys("lakshmanan u");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sivajolakshmanan@gamil.com");
	Thread.sleep(2000);
	driver.findElement(By.className("a-ayg")).click();
	Thread.sleep(4000);
	driver.close();
		
		
	}

}
