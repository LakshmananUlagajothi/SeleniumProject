package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nandhu_program_100Test {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(0));
		driver.get("https://demowebshop.tricentis.com/");
		WebElement computerlink = driver.findElement(By.xpath("(//a[contains(.,'Computers')])[1]"));
		Thread.sleep(2000);
		computerlink.click();
		//Actions action=new Actions(driver);
		//action.moveToElement(computerlink).build().perform();
		driver.findElement(By.xpath("(//a[@href=\'/desktops\'])[3]")).click();
		Thread.sleep(2000);

	}

}
