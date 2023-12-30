package genericlibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Genericlibrary.UtilityMethods;
import pomclass.Loginpage;

public class BaseClass extends UtilityMethods {

	
	public WebDriver driver;
	
	 @BeforeClass
	  public void beforeClass() throws IOException {
		  
		  driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get(UtilityMethods.getProperty("url"));  
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() throws IOException
	  {
		  Loginpage Lo=new Loginpage(driver);
		  Lo.getLoginlink().click();
		  Lo.getEmailtextfield().sendKeys(UtilityMethods.getProperty("email"));
		  Lo.getPasswordtextfield().sendKeys(UtilityMethods.getProperty("password"));
		  Lo.getLoginbutton().click();
	  }

}
