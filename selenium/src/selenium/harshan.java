package selenium;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class harshan {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(2));
		driver.get("https://www.youtube.com");
	}

}
