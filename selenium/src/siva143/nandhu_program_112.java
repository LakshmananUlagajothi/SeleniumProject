package siva143;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Lakshmanan
 */

public class nandhu_program_112 {

	public static void main(String[] args) {
		
		//launch browser
		ChromeDriver driver=new ChromeDriver();
		//implicitlywait 
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		//navigate to url
		driver.get("https://demowebshop.tricentis.com/");
		//
		driver.findElement(By.partialLinkText("Books")).click();
		WebElement webelement = driver.findElement(By.id("products-orderby"));
		
		Select select=new Select(webelement);
		
		List<WebElement> size = select.getOptions();
		
		int d1 = size.size();
		
		System.out.println(d1);
//		for(int i=1;i<=d1;i++) {
//		select.selectByIndex(i);//#stale-element-reference-exception
//		}
//		for(int i=1;i<d1;i++) {
//			select.selectByIndex(i);
//			webelement = driver.findElement(By.id("products-orderby"));
//			select=new Select(webelement);
//		}
//		System.out.println(select.isMultiple());
		
//
		
		
		select.selectByVisibleText("Price: High to Low");
		select.selectByValue("https://demowebshop.tricentis.com/books?orderby=15");
		

		
}
}