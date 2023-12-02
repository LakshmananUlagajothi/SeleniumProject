package siva143;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nandhu_program_scroll_amo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(2));
		driver.get("https://www.amazon.com");
		Actions action=new Actions(driver);
		action.scrollByAmount(0, 2000);
		Thread.sleep(2000);
		action.scrollByAmount(0, 1000);
		Thread.sleep(2000);
		action.scrollByAmount(0, -1800).build().perform();
		Thread.sleep(2000);

	}

}
