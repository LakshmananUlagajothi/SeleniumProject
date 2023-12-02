package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program_07 {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver	driver=new ChromeDriver();
	driver.get("file:///E:/selenium/leo.html");
	Thread.sleep(2000);
	driver.findElement(By.className("c1")).click();
	Thread.sleep(2000);
	String exceptresult="https://www.flipkart.com/";
	Thread.sleep(2000);
	String actualresult=driver.getCurrentUrl();
	Thread.sleep(2000);
	if(exceptresult.equals(actualresult)) {
		System.out.println("the test case is pass"+actualresult);
	}
	else {
		System.out.println("the test case is fail"+actualresult);
	}
	driver.close();		
	}

}
