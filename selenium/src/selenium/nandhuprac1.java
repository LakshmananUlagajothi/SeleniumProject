package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nandhuprac1 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(5));
		driver.get("http://demoapps.qspiders.com/");
		driver.findElement(By.id("name")).sendKeys("lakshmanan u");
		driver.findElement(By.xpath("//input[@type=\'email\']")).sendKeys("sivajolakshmanan@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Sivajo@123");
		driver.findElement(By.xpath("//a[@type=\'button\']")).click();
		String text = driver.findElement(By.xpath("//div[@role=\'status\']")).getText();
		System.out.println(text);
		driver.close();
	}

}