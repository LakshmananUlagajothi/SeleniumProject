package siva143;

/*
 * author lakshmanan
 */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nandhu_program_114 {
	public static void main(String[] args) throws InterruptedException {
		
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
	driver.get("https://demowebshop.tricentis.com/");
	Actions action=new Actions(driver);
	 WebElement comp = driver.findElement(By.xpath("(//a[contains(.,'Computers')])[1]"));
	Thread.sleep(2000);
	action.moveToElement(comp).build().perform();
	driver.findElement(By.xpath("(//a[contains(.,'Desktops')])[1]")).click();
//    driver.findElement(By.xpath("(//a[@href=\"/desktops\"])[4]")).click();
    String text = driver.findElement(By.xpath("//h1")).getText();
    
    String Ac="Desktops";
    
    if(text.equals(Ac)) {
    	System.out.println("test case pass");
    }
    driver.quit();
}
}
