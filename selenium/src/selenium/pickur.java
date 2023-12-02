package selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pickur {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.get("https://www.facebook.com/");
		
		WebElement Xpath = driver.findElement(By.xpath("//input[@type='text']"));

		String cssa = Xpath.getCssValue("border");
		
		System.out.println(cssa);
	
		String text = driver.findElement(By.xpath("//button[@name='login']")).getText();
		
		System.out.println(text);
		
		String texttype = Xpath.getAttribute("type");
	
		System.out.println(texttype);
		
		String tag = Xpath.getTagName();
		System.out.println(tag);
		int height = Xpath.getSize().getHeight();

		System.out.println(height);
	
		int width = Xpath.getSize().getWidth();
		
		System.out.println(width);
		
		int x = Xpath.getLocation().getX();
		int y = Xpath.getLocation().getY();
		
		System.out.println(x+"===="+y);
	
		Rectangle rect = Xpath.getRect();
		System.out.println(rect);
		
		boolean is =driver.findElement(By.xpath("//img")).isDisplayed();
		System.out.println(is);
		
		boolean isee = Xpath.isEnabled();	
		System.out.println(isee);
	
		boolean isesd = Xpath.isSelected();
		System.out.println(isesd);
		
		driver.close();
	}

}
