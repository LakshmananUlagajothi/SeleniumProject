package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.support.ui.Select;

public class nandhu_program_scroll {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	
		WebElement text = driver.findElement(By.xpath("//a[@href=\'https://www.amazon.science\']"));
	    Actions action=new Actions(driver);
//	    action.scrollByAmount(0,200);
//	    Thread.sleep(2000);
//	    action.scrollToElement(text).build().perform();
//	    text.click();
//	    Thread.sleep(2000);
	    
	 WheelInput.ScrollOrigin rr = WheelInput.ScrollOrigin.fromElement(text);
	 action.scrollFromOrigin(rr, 0, 100).build().perform();
	 Thread.sleep(2000);
	 text.click();
        
	}

}
