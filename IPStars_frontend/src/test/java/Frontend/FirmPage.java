package Frontend;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Elements.Homepageele;
import common_methods.Common_Methods;

public class FirmPage extends Common_Methods {
	
	Homepageele f1  = PageFactory.initElements(driver, Homepageele.class);

	 @DataProvider(name="excelData")
	  public Object[][] readExcel() throws IOException  {
	      return Common_Methods.readExcel(filePath, sheetName);
	  }

	  @Test(priority=3,dataProvider = "excelData")
	  public void search(String firm, String lawyer, String Jurisdiction) throws InterruptedException {
		 Homepageele.search.sendKeys(firm);
		  Thread.sleep(3000);
		  Actions act = new Actions(driver);
		  act.sendKeys(Keys.DOWN,Keys.ENTER).build().perform();	
		  System.out.println("Firm Page");
		  Thread.sleep(2000);
		  Homepageele.firm_rankings.click();
		  Thread.sleep(2000);
		  Homepageele.firm_review.click();
		  Thread.sleep(2000);
		  Homepageele.firm_practi.click();
		  Thread.sleep(2000);
		  social_media(Homepageele.mail_firm);
		  Thread.sleep(5000);
		  Homepageele.search.clear();
		  Homepageele.search.sendKeys(lawyer);
		  System.out.println("lawyer Page");
		  Thread.sleep(2000);
		  act.sendKeys(Keys.DOWN,Keys.ENTER).build().perform();	  
		  social_media(Homepageele.mail_firm);
		  Homepageele.search.clear();
		  Homepageele.search.sendKeys(Jurisdiction);
		  System.out.println("Jurisdiction Page");
		  Thread.sleep(2000);
		  act.sendKeys(Keys.DOWN,Keys.ENTER).build().perform();	  
		  Thread.sleep(2000);
		  social_media(Homepageele.mail_firm_juris);

	  }
}
