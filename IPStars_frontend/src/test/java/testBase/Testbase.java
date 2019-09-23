package testBase;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import Elements.Homepageele;

public class Testbase {
     

	
	public static WebDriver driver;
	public static Homepageele All_pageelements = null;
	

//	Actions act = new Actions(driver);
	
	@BeforeSuite
	 public void initialize() throws InterruptedException{
	 
	 System.setProperty("webdriver.chrome.driver","P:\\chromedriver.exe");
	 driver = new ChromeDriver(); 
	 All_pageelements = new Homepageele();
    driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://ipstars-dev.ase-si-group-ext.p.azurewebsites.net/");
	 }

}
