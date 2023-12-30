package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {
	
	public static String getProperty(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("./src/test/resources/commondata.properties");
		
		Properties p=new Properties();
		p.load(file);
		String property=p.getProperty(key);
		
		return property;
		
	}
	
	public static String[][] readfromexcel(String sheet1) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("./src/test/resources/testdadanothing.xlsx");
		
		Workbook book=WorkbookFactory.create(file);
		
		Sheet sheet=book.getSheet(sheet1);
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		
		int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
		
		String[] [] data=new String[rowcount-1][cellcount];
		
		for(int i=1;i<rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		
		return data;
		
	}
	
	/**
	 * This method is used to click  on given element
	 */
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	
	/**
	 * This Methodisisused to enter valuetoelement like text field
	 * @param element
	 * @param value
	 */
	public static void enterValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	
	public static void selectOptionByIndex(WebElement element, int index) {
		Select select=new Select(element);
		select.selectByIndex(index);
	}
	
	public static void selectOptionByValue(WebElement element, String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	
	public static void selectOptionByVisibleText(WebElement element, String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public static void switchToWindowByTitle(WebDriver driver,String title) {
		Set<String> childWindows = driver.getWindowHandles();
		
		for (String child : childWindows) {
			driver.switchTo().window(child);
			
			if(driver.getTitle().contains(title)) {
				break;
			}
		}
	}
	
	
	
	public static void switchToWindowByURL(WebDriver driver,String URL) {
		Set<String> childWindows = driver.getWindowHandles();
		
		for (String child : childWindows) {
			driver.switchTo().window(child);
			
			if(driver.getCurrentUrl().contains(URL)) {
				break;
			}
		}
	}
	
	

}
