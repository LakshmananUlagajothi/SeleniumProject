package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac_shopper {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(8000);
		driver.findElement(By.name("loginBtn")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
