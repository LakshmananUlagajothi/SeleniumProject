package Siva_Nandhu_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class parameters_nandhu_TwoDim_Array {
	
	
	
	@DataProvider(parallel = true)
	public String[][] register_data()
	{
		String [][] data=new String[3][5];
		
		        data[0][0]="baby";
				data[0][1]="love";
				data[0][2]="baby@gmail.com";
				data[0][3]="baby@123";
				data[0][4]="baby@123";
				
				data[1][0]="ani";
				data[1][1]="ruthu";
				data[1][2]="ani@gmail.com";
				data[1][3]="ani@123";
				data[1][4]="ani@123";
				
				data[2][0]="ani";
				data[2][1]="ruthu";
				data[2][2]="ani@gmail.com";
				data[2][3]="ani@123";
				data[2][4]="ani@123";
				
				
		return data;
	}
	
	@Test(dataProvider = "register_data")
	public void regidter_001(String firstname,String lastname,String email,String pass,String conpass)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofHours(1));
		
		//enter the url
		driver.get("https://demowebshop.tricentis.com/");
		
		//click on register link
		driver.findElement(By.linkText("Register")).click();
		
		//click on male ratio button
		driver.findElement(By.id("gender-male")).click();
		
		//enter the first name
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		
		//enter last name
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		
		//enter the email
		driver.findElement(By.id("Email")).sendKeys(email);
		
		//enter the password
		driver.findElement(By.id("Password")).sendKeys(pass);
		
		//enter the confirm password
		driver.findElement(By.id("ConfirmPassword")).sendKeys(conpass);
		
		//click on register-button
		driver.findElement(By.id("register-button")).click();
		
		driver.quit();
		
	}
	

}
