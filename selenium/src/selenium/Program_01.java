package selenium;

//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program_01 {
	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver=new ChromeDriver();
		FirefoxDriver driver1=new FirefoxDriver();
		Thread.sleep(2000);
		driver1.get("https://www.oindeed.com/");
		Thread.sleep(2000);
		String Url=driver1.getCurrentUrl();
		Thread.sleep(2000);
		System.out.println(Url);
		Thread.sleep(2000);
		driver1.close();
		
	}

}
