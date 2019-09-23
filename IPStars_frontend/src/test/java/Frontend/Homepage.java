package Frontend;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Elements.Homepageele;
import common_methods.Common_Methods;
import testBase.Testbase;

public class Homepage extends Common_Methods {

	
	Homepageele f1  = PageFactory.initElements(driver, Homepageele.class);

	@Test(priority=1)
	public void navigation() throws InterruptedException{
		Homepageele.navigation_america.click();
		Homepageele.navigation_america_alabama.click();
		current_url();
		Homepageele.navigation_asia.click();
		Homepageele.navigation_asia_india.click();
		current_url();
		Homepageele.navigation_emea.click();
		Homepageele.navigation_emea_spain.click();
		current_url();
		Homepageele.navigation_news.click();
		current_url();
		Homepageele.navigation_about.click();
		Homepageele.navigation_about_OR.click();
		current_url();
		Homepageele.navigation_about.click();
		Homepageele.navigation_about_FAQ.click();
		current_url();
		Homepageele.navigation_contact.click();
		current_url();
		Thread.sleep(2000);
		Homepageele.navigation_mip.click();
		switch_tab();
		
	}

  @Test(priority=2)
  public void footer() throws InterruptedException {
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,1000)");
	  Thread.sleep(2000);
	  Homepageele.footer_jurisdiction_America.click();
      Thread.sleep(2000);
	  current_url();
	  Thread.sleep(2000);
	  Homepageele.footer_jurisdiction_Asia.click();
	  Thread.sleep(2000);
	  current_url();
	  Thread.sleep(2000);
      Homepageele.footer_jurisdiction_EMEA.click();
      Thread.sleep(2000);
      current_url();
      Thread.sleep(2000);
      Homepageele.footer_jurisdiction_News.click();
      Thread.sleep(2000);
      current_url();
      Thread.sleep(2000);
      Homepageele.footer_research.click();
      Thread.sleep(2000);
      current_url();
      Thread.sleep(2000);
      Homepageele.footer_methodology.click();
      Thread.sleep(2000);
      current_url();
      Thread.sleep(2000);
      Homepageele.footer_RFG.click();
      Thread.sleep(2000);
      current_url();
      Thread.sleep(2000);
      Homepageele.FAQ.click();
      Thread.sleep(2000);
      current_url();
      Thread.sleep(2000);
      Homepageele.TandC.click();
      Thread.sleep(2000);
      current_url();
      Thread.sleep(2000);
      Homepageele.Contactus.click();
      Thread.sleep(2000);
      current_url();
      Thread.sleep(2000);
      Homepageele.footer_mip.click();
      switch_tab();
  }
}
