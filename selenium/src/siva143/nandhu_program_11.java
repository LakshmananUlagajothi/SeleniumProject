package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class nandhu_program_11 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		WebElement bar = driver.findElement(By.xpath("//input[@class=\'form-control select-input placeholder-active active focused\']"));
        
		Select select=new Select(bar);
		select.selectByIndex(1);
		select.selectByIndex(2);
		
	}

}
