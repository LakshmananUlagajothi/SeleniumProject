package selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Program_01a {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		Thread.sleep(2000);
		driver.get("https://www.swiggy.com/");
		Thread.sleep(2000);
		String Url=driver.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println(Url);
		Thread.sleep(2000);
		driver.close();
	}
	

}
