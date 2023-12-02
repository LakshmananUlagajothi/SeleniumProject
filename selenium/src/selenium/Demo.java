package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		//FirefoxDriver drive=new FirefoxDriver();
	//	EdgeDriver drive1=new EdgeDriver();
		Thread.sleep(2000);	
		driver.get("https://www.swiggy.com/?utm_source=Google-Sok&utm_medium=CPC&utm_campaign=perf_food_nu_google_search_sok_narm_brand_v1_v2_march23_brand_em&gclid=Cj0KCQjwmvSoBhDOARIsAK6aV7hHcYeyDRZjNZ9Rn8iZeEmI7IP3WocrAwr_xsFMhlhR_yE9wvNPw3MaAkT7EALw_wcB");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.id(""));
		button.click();
		String Title=driver.getTitle();
		Thread.sleep(2000);
		System.out.println(Title);
		Thread.sleep(2000);
		driver.getPageSource();
		Thread.sleep(2000);
		driver.close();		
		}

}
