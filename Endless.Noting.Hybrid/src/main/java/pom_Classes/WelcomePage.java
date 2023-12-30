package pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WelcomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[.='NOTHING (R)']")
	private WebElement nothingRLink;
	
	@FindBy(linkText = "phone")
	private WebElement phoneLink;
			
			
    @FindBy(linkText = "audio")
    private WebElement audioLink;
    		
    		
    @FindBy(linkText = "cmf")
    private WebElement cmfLink;

    		
    @FindBy(linkText = "community")
    private WebElement communityLink;
    
    @FindBy(linkText = "support")
    private WebElement supportLink;
    
    @FindBy(css ="[href='/account/login']")
    private WebElement accountLink;
    
    @FindBy(linkText = "Shop on Flipkart")
    private WebElement shopOnFlipkartPhone_2Link;
    
    @FindBy(linkText = "( View models )")
    private WebElement viewModelsPhone_2Link;
    
    @FindBy(linkText = "Learn more")
    private WebElement learnMoreEar_2Link;
    
    @FindBy(linkText = "( Learn more on Flipkart )")
    private WebElement learnMoreOnFlipkartEar_2Link;
    
    
    
    
}
