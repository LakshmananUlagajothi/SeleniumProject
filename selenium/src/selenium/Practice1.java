package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys("8220817565");
		Thread.sleep(2000);
		driver.findElement(By.className("gb_E")).click();
		Thread.sleep(2000);
		driver.close();
	}

}
