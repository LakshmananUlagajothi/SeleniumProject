package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_08 {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	driver.get("file:///C:/Users/WELCOME/Desktop/aaaa.html");
	Thread.sleep(2000);
	driver.findElement(By.linkText("MEO")).click();
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("ann")).click();
	Thread.sleep(2000);
	driver.close();
	}

}
