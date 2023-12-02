package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Program_04 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.zomato.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
		
	}

}
