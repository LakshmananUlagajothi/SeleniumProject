package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoqsp {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.get("https://coreui.io/docs/forms/multi-select/");
		Thread.sleep(2000);
		WebElement mutli = driver.findElement(By.xpath("(//input[@placeholder=\"Please select...\"])[4]"));
        Thread.sleep(2000);
        Select  select=new Select(mutli);
        
        select.selectByIndex(3);
	}

}
