package selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Program_02 {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		System.out.println(driver.getPageSource());
		Thread.sleep(2000);
		driver.close();
		
	}

}
