package selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Sele_prac {
	public static void main(String[] args) throws InterruptedException {
	EdgeDriver	driver=new EdgeDriver();
	driver.get("https://www.indeed.com/");
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
	System.out.println(driver.getCurrentUrl());
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.manage().window().minimize();
	Thread.sleep(2000);
	//System.out.println(driver.getPageSource());
	//Thread.sleep(2000);
	driver.close();
	}

}
