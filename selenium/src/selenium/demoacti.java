package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoacti {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(2));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@name=\'username\']")).sendKeys("trainee");
		driver.findElement(By.xpath("//input[@type=\'password\']")).sendKeys("trainee");
		driver.findElement(By.xpath("//a[@id=\'loginButton\']")).click();
		driver.findElement(By.id("id=\"logoutLink\"")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[@href=\'/logout.do\']")).click();
		
	}

}


