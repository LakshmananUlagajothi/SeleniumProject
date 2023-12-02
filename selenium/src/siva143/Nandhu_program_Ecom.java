package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nandhu_program_Ecom {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.manage().window().maximize();
		driver.get("https://www.gobizkorea.com/user/main.do");
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	    String Sourcecode = driver.getPageSource();
	    System.out.println(Sourcecode);
	    
	    WebElement access = driver.findElement(By.xpath("//a[.='accessories']"));
	    access.click();
	    System.out.println(driver.getTitle());
	    System.out.println(access.getText());
	    System.out.println(access.getTagName());
	    
	    

	}

}
