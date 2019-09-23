package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import testBase.Testbase;

public class Homepageele extends Testbase{
	
	public Homepageele() {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(how=How.XPATH, using="/html/body/footer/div[1]/div/div/div[1]/ul/li[1]/a") 
	public static WebElement footer_jurisdiction_America;
	
	@FindBy(how=How.XPATH, using="/html/body/footer/div[1]/div/div/div[1]/ul/li[2]/a") 
	public static WebElement footer_jurisdiction_Asia;
	
	@FindBy(how=How.XPATH, using="/html/body/footer/div[1]/div/div/div[1]/ul/li[3]/a") 
	public static WebElement footer_jurisdiction_EMEA;
	
	@FindBy(how=How.XPATH, using="/html/body/footer/div[1]/div/div/div[1]/ul/li[4]/a") 
	public static WebElement footer_jurisdiction_News;
	
	@FindBy(how=How.XPATH, using="/html/body/footer/div[1]/div/div/div[2]/ul/li[1]/a") 
	public static WebElement footer_research;
	
	@FindBy(how=How.XPATH, using="/html/body/footer/div[1]/div/div/div[2]/ul/li[2]/a") 
	public static WebElement footer_methodology;
	
	@FindBy(how=How.XPATH, using="/html/body/footer/div[1]/div/div/div[2]/ul/li[3]/a") 
	public static WebElement footer_RTimeline;
	
	@FindBy(how=How.XPATH, using="/html/body/footer/div[1]/div/div/div[2]/ul/li[4]/a") 
	public static WebElement footer_RFG;
	
	@FindBy(how=How.XPATH, using="/html/body/footer/div[1]/div/div/div[2]/ul/li[5]/a") 
	public static WebElement FAQ;
	
	@FindBy(how=How.XPATH, using="/html/body/footer/div[1]/div/div/div[2]/ul/li[6]/a") 
	public static WebElement TandC;

	@FindBy(how=How.XPATH, using="/html/body/footer/div[1]/div/div/div[3]/ul/li/a") 
	public static WebElement Contactus;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div[1]/div/div[2]/ul[1]/li[2]/a") 
	public static WebElement navigation_america;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div[1]/div/div[2]/ul[1]/li[2]/ul/li/div/ul/li[2]/a") 
	public static WebElement navigation_america_alabama;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div[1]/div/div[2]/ul[1]/li[3]/a") 
	public static WebElement navigation_asia;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div[1]/div/div[2]/ul[1]/li[3]/ul/li/div/ul/li[6]/a") 
	public static WebElement navigation_asia_india;

	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div[1]/div/div[2]/ul[1]/li[4]/a") 
	public static WebElement navigation_emea;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div[1]/div/div[2]/ul[1]/li[4]/ul/li/div/ul/li[42]/a") 
	public static WebElement navigation_emea_spain;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div[1]/div/div[2]/ul[1]/li[5]/a") 
	public static WebElement navigation_news;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div[1]/div/div[2]/ul[1]/li[6]/a") 
	public static WebElement navigation_about;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div[1]/div/div[2]/ul[1]/li[6]/ul/li[1]/a") 
	public static WebElement navigation_about_OR;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div[1]/div/div[2]/ul[1]/li[6]/ul/li[2]/a") 
	public static WebElement navigation_about_FAQ;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div[1]/div/div[2]/ul[1]/li[7]/a") 
	public static WebElement navigation_contact;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div[1]/div/div[2]/ul[2]/li") 
	public static WebElement navigation_mip;
	
	@FindBy(how=How.XPATH, using="/html/body/footer/div[1]/div/div/div[4]/ul/li/a") 
	public static WebElement footer_mip;
	
	@FindBy(how=How.XPATH, using="/html/body/div[1]/div[2]/div/div[1]/div/div[2]/ul[2]/li/a") 
	public static WebElement Latest_article;
	
	@FindBy(how=How.XPATH, using="//*[@id='Keyword']") 
	public static WebElement search;
	
	@FindBy(how=How.XPATH, using="//*[@id='search-btn']") 
	public static WebElement search_btn;
	
	@FindBy(how=How.XPATH, using="//*[@id='quick_search_form']/div/div/span[1]/span/div/span/div/p[2]") 
	public static WebElement search_result;
	
	@FindBy(how=How.XPATH, using="//*[@id='firmTab']/li[2]/a") 
	public static WebElement firm_rankings;
	
	@FindBy(how=How.XPATH, using="//*[@id='firmTab']/li[3]/a") 
	public static WebElement firm_review;
	
	@FindBy(how=How.XPATH, using="//*[@id='firmTab']/li[4]/a") 
	public static WebElement firm_practi;

	@FindBy(how=How.XPATH, using="//*[@id='ShareLinkedInId']/i") 
	public static WebElement linkdn_firm;
	
	@FindBy(how=How.XPATH, using="//*[@id='ShareTwitterId']/i") 
	public static WebElement twitter_firm;
	
	@FindBy(how=How.XPATH, using="//*[@id='ShareFacebookId']/i") 
	public static WebElement fb_firm;
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div/a[4]") 
    public static WebElement mail_firm;
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/a[4]") 
    public static WebElement mail_firm_juris;
	
	@FindBy(how=How.XPATH, using="//*[@id='emailShareModal']/div/div/form/div[2]/div/button") 
	public static WebElement mail_cancel_firm;
	
	}






