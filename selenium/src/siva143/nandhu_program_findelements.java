package siva143;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nandhu_program_findelements {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		driver.get("https://www.apple.com/in/store?afid=p238%7Csfo291LJq-dc_mtid_187079nc38483_pcrid_677073186475_pgrid_109516736059_pntwk_g_pchan__pexid__&cid=aos-IN-kwgo-brand--slid---product-");
	
		List<WebElement> apple = driver.findElements(By.xpath("//a[@class=\"rf-productnav-card-title\"]"));
		int count = apple.size();
		for (int i = 0; i < count; i++) {
			
		String text = apple.get(i).getText();
		System.out.println(text);
			
		}
		driver.close();
		
	}

}
