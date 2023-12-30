package Generic_Library;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript_Demo extends BaseClass {
	
	@Test
	public void testScript001()
	{
		driver.findElement(By.linkText("BOOKS")).click();
		
	}

}
