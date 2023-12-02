package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class pickurcheck {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		boolean isss = driver.findElement(By.xpath("//input[@type='checkbox']")).isSelected();
		System.out.println(isss);
		String cc = driver.findElement(By.xpath("//a[@id='loginButton']")).getCssValue("border-top");
		System.out.println();
		
		driver.close();
	}

}
