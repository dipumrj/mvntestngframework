package digital.flightdeck.testsuite;
import org.testng.annotations.Test;
import digital.flightdeck.common.dataprovider.rss.RssDataProvider;
//import digital.flightdeck.common.dataprovider.LoginPageDataProvider;
import digital.flightdeck.common.Driver;
import digital.flightdeck.common.Syncwait;
import digital.flightdeck.common.Url;
import digital.flightdeck.common.Element;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import digital.flightdeck.pages.LoginPage;
import digital.flightdeck.pages.RssFeed;
import digital.flightdeck.common.JSExecutor;


public class RssFeedTestCase {
	WebDriver driver =Driver.getChromeDriver(false);
	public String baseURL=Url.FDlocalDevelopment;
	LoginPage lp= new LoginPage(driver);
	protected static final String ATTRIBUTE = "ATTRIBUTE";
	ITestResult testResult;
	RssFeed rs=new RssFeed(driver);
	public WebDriverWait wait;
	int validurlCount=0;
	
	
  @BeforeTest
  public void gotoLoginPage() throws InterruptedException
  {
	  driver.manage().window().maximize();
	  driver.get(baseURL);
	  lp.login("dipesh","dmaharjan");
  }
  
	@BeforeMethod
	public void gotoHomePage() throws InterruptedException 
	{
		if (!(driver.getCurrentUrl().contentEquals(baseURL+"/HomePage/Index"))) 
			driver.get(baseURL+ "/HomePage/Index");
	}
  

 @Test(priority=1)
 public void clearUrlTextArea() throws InterruptedException
 {
	 	Syncwait.Syncwaitfor(driver, 40000); //40 Seconds
	 	Syncwait.Syncwaitfor(driver, 40000); 
		rs.clickaddNewURLsButton();
		rs.clearUrlTextArea();
 }
 
 
@Test(priority=2,dataProvider = "RssElement", dataProviderClass = RssDataProvider.class)
public void isRSSElementPresent(String name, String locator, String value) throws Exception {
		boolean isRSSElementPresent = Element.isPresent(driver, locator, value);
		if (name != null && locator != null && value != null) {
			if (isRSSElementPresent)
				assert (true);
			else
				throw new Exception(name + "is not present");
		}
	}

 
 
 
 @Test(priority=3,dataProvider = "InValidRssData", dataProviderClass = RssDataProvider.class)
 public void enterInValidRssFeed(String url,String expectedMessage)throws Exception 
 { 
	 
	 JavascriptExecutor js;
		js=(JavascriptExecutor)driver;
 	
	 if (url != null)
		{
		 rs.enterURL(url);
		 rs.clickAddRssUrlSaveButton();
		 String invalidMessag= JSExecutor.getElementTextByID(driver,"dvInvalidRssUrl");
		if(invalidMessag.contains(expectedMessage))
				assert (true);
			else
				throw new Exception("Expected message\n" + expectedMessage);
		
		}
	 	 
		testResult=Reporter.getCurrentTestResult();
		testResult.setAttribute(ATTRIBUTE, driver); // set ATTRIBUTE as driver   
	
 }
  
 @Test(priority=4,dataProvider = "ValidRssData", dataProviderClass = RssDataProvider.class)
 public void enterValidRssFeed(String url)throws Exception 
 { 
	 
	 if(validurlCount==0)
	  rs.clearUrlTextArea();
	 
	 if (url != null)
		{
		 rs.enterURL(url);
		 validurlCount=validurlCount+1;
		}
	
		testResult=Reporter.getCurrentTestResult();
		testResult.setAttribute(ATTRIBUTE, driver); // set ATTRIBUTE as driver 
	
 }
 
 @Test(priority=5)
public void validateRssFeed() throws Exception
{
	 rs.clickAddRssUrlSaveButton();
	 Syncwait.Syncwaitfor(driver, 40000); 
	 Syncwait.Syncwaitfor(driver, 40000); 
	 
	 if(rs.getRssTotalCount()==20)
		 assert(true);
	 else
		 throw new Exception("Incorrect Number of Rss feed");
	  rs.getFirstRssFeed();
	  rs.clickRssFirstFeedLink();
	  Syncwait.Syncwaitfor(driver, 30000); 
	  if(driver.getPageSource().contains(rs.getFirstRssFeed()))
		  assert(true);
	  else
		  throw new Exception("Incorrect RssFeed"); 
	  
		testResult=Reporter.getCurrentTestResult();
		testResult.setAttribute(ATTRIBUTE, driver); // set ATTRIBUTE as driver 
}
 

 @AfterTest
	public void clearSession() {
		driver.quit();
	}
  
}
