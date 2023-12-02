package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumprac1 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//*[@id=\'name\']")).sendKeys("lakshamam");
		driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("sivajo@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("figac");
		driver.findElement(By.xpath("//button[contains(.,'Register')]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sivajo@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("figac");
		driver.findElement(By.xpath("//button")).click();
		String Ares = driver.findElement(By.xpath("(//div[@role=\'status\'])[3]")).getText();
		System.out.println(Ares);
		driver.quit();
	}

}
