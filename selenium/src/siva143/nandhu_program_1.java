package siva143;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nandhu_program_1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(2));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions action=new Actions(driver);
		WebElement rom = driver.findElement(By.id("box6"));
		WebElement ilt = driver.findElement(By.id("box106"));
//		action.dragAndDrop(rom, ilt).build().perform();
		action.clickAndHold(rom);
		action.release(ilt).perform();;
		
		
		

	}

}
