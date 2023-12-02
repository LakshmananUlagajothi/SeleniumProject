package siva143;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nandhu_program_findmultielements {
	public static void main(String[] args) {
		ChromeDriver  driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.get("https://www.flipkart.com/");
		 List<WebElement> element = driver.findElements(By.xpath("//div//a//span"));
		 int count = element.size();
		 for (int i = 0; i < count; i++) {
			WebElement s = element.get(i);
			System.out.println(s.getText());
		}
		
	}

}