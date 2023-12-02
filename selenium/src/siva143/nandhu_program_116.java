package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nandhu_program_116 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create new account")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("year"));
		Thread.sleep(2000);
		
		Select select=new Select(day);
		System.out.println(select.isMultiple());
		select.selectByValue("13");
		Select select1=new Select(month);
		select1.selectByIndex(2);
		Select select2=new Select(year);
		select2.selectByVisibleText("1994");
		

	}

}
