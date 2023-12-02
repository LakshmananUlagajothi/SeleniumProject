package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nandhu_program_115 {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("(//section[contains(.,'Button')])[1]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Right Click')]")).click();
		Actions action=new Actions(driver);
		WebElement right = driver.findElement(By.xpath("(//button[.='Right Click'])[1]"));
		action.contextClick(right).build().perform();
		driver.findElement(By.xpath("//div[.='Yes']")).click();
		String txt = driver.findElement(By.xpath("//span[.='You selected \"Yes\"']")).getText();
		String Ac="You selected \"Yes\"";
		if(txt.equals(Ac)) {
			System.out.println("test case pass");
		}
		else
			System.out.println("test case failed");
		
	}

}
