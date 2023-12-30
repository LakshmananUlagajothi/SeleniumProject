package Siva_Nandhu_TestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Apachi_poi {
	
	public static String readDataFromExcel() throws EncryptedDocumentException, IOException
	{
	FileInputStream file=new FileInputStream("./Resource/sivadata.xlsx");
	
//	Workbook book = WorkbookFactory.create(file);
//	
//    Sheet sheet = book.getSheet("Sheet1");
//    
//    Row row=sheet.getRow(1);
//    
//    System.out.println(row.getCell(1));
	
	return WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).toString();

}
	
	public static String readcellDataFromExcel(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
	FileInputStream file=new FileInputStream("./Resource/sivadata.xlsx");
	
//	Workbook book = WorkbookFactory.create(file);
//	
//    Sheet sheet = book.getSheet("Sheet1");
//    
//    Row row=sheet.getRow(1);
//    
//    System.out.println(row.getCell(1));
	
	return WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(1).toString();
	
	}
	
	
	public static String[][] readRowDataFromExcel()
	{
		return null;
		
	}
	
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		System.out.println(readDataFromExcel());
		
		System.out.println(readcellDataFromExcel("Sheet1", 1, 1));
	}

}