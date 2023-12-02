package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoprogramragavi {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\'username\']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@type=\'password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[@class=\'oxd-icon bi-caret-down-fill oxd-userdropdown-icon\']"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href=\'/web/index.php/auth/logout\']"));
		Thread.sleep(2000);
		driver.close();
		
	}
  
}
