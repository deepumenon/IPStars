package common_methods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Elements.Homepageele;
import testBase.Testbase;

public class Common_Methods extends Testbase {

	 protected String filePath = "P:\\search.xls";
	 protected String sheetName = "Sheet1";
	    
	public void current_url(){
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
	}
	public void switch_tab(){
		 ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(tabs.get(0));
	}
	
	 public static Object[][] readExcel(String filePath, String sheetName) throws IOException{
         FileInputStream file= new FileInputStream(filePath);
         HSSFWorkbook wb = new HSSFWorkbook(file);
         HSSFSheet sheet = wb.getSheet(sheetName);
         int rowCount = sheet.getLastRowNum();
         int column = sheet.getRow(0).getLastCellNum();
         Object[][] data = new Object[rowCount][column];
         for (int i = 1; i <= rowCount; i++) {
             HSSFRow row = sheet.getRow(i);
             for (int j = 0; j < column; j++) {
                 HSSFCell cell = row.getCell(j);
                 DataFormatter formatter = new DataFormatter();
                 String val = formatter.formatCellValue(cell);
                 data[i - 1][j] = val;
             }
         }

         return data;
     }
	
	 
	 public void window(){
	 String winHandleBefore = driver.getWindowHandle();
	  for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
	  driver.close();
	  driver.switchTo().window(winHandleBefore);
   }
	 
	 public void social_media(WebElement E1) throws InterruptedException{
		 Homepageele.linkdn_firm.click();
		  Thread.sleep(2000);
		  window();
		  Homepageele.twitter_firm.click();
		  Thread.sleep(2000);
		  window();
		  Homepageele.fb_firm.click();
		  Thread.sleep(2000);
		  window();
		  E1.click();		  
		  Homepageele.mail_cancel_firm.click();
	 }
}