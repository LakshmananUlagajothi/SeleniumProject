package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(partialLinkText = "loginBtn")
	private WebElement loginlink;


}
