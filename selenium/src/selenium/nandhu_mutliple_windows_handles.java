package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nandhu_mutliple_windows_handles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/fileupload");
		Thread.sleep(2000);
		File file=new File("C:\\Users\\WELCOME\\Desktop\\sivaresume");
		Thread.sleep(2000);
		String path = file.getAbsolutePath();
		driver.findElement(By.id("fileInput")).sendKeys(path);
		Thread.sleep(2000);
		
	
	}
}