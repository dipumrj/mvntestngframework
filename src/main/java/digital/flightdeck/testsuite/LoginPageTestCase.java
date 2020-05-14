package digital.flightdeck.testsuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import digital.flightdeck.common.Driver;
//import com.skynetautomation.Common.Element;
import digital.flightdeck.common.Url;
import digital.flightdeck.common.dataprovider.LoginPageDataProvider;

//import digital.flightdeck.dataprovider.LoginPageDataProvider;
//import com.skynetautomation.Common.dataprovider.OmnetAU.LoginPageDataProvider;
import digital.flightdeck.pages.LoginPage;
//import digital.flightdeck.pages.clientsettings.Loginpage;
import digital.flightdeck.pages.Clientsettings;

//@Listeners(com.skynetautomation.Common.Listener.class)

public class LoginPageTestCase {

	public WebDriver driver = Driver.getChromeDriver(false);
	public String baseURL = Url.FDlocalDevelopment;
	LoginPage lp = new LoginPage(driver);
	//Clientsettings ObjClientsettings= new Clientsettings(driver);
	protected static final String ATTRIBUTE = "ATTRIBUTE";
	ITestResult testResult;
	public WebDriverWait wait;


	@BeforeClass
	public void goToHomePage(ITestContext context) {
		context.setAttribute("WebDriver", driver);
		driver.get(baseURL);

	}

@BeforeMethod
public void goToLoginPage() {
	
	driver.get(baseURL );
		if (driver.getCurrentUrl().contentEquals(baseURL))
				{	
						driver.get(baseURL );
				}
//Yet to work on 	
//		else
//			lp.getLogoutLink().click();
		
	}
	
	
	
	


//	@Test(dataProvider = "pageElementData", dataProviderClass = LoginPageDataProvider.class)
//	public void isElementPresent(String name, String locator, String value) throws Exception {
//		if (name != null && locator != null && value != null) {
//			try {
//				Element.isPresent(driver, locator, value);
//			} catch (Exception NoSuchElementFoundException) {
//				throw new Exception("Element ==> " + name + "is mot present. ");
//			}
//		}
//	}
//
	@Test(dataProvider = "validLoginData", dataProviderClass = LoginPageDataProvider.class)
	public void loginWithValidCredentials( String username, String password)throws Exception 
	{
		if (username != null && password != null)
		{
			lp.login(username, password);
			 //Title Verify 
			testResult=Reporter.getCurrentTestResult();
			testResult.setAttribute(ATTRIBUTE, driver); // set ATTRIBUTE as driver           
			wait= new WebDriverWait(driver,2);
			wait.until(ExpectedConditions.titleIs("Home Page"));  // Explicit wait page title
		}
	}
	
	
//	@Test(priority=1 ,dataProvider = "createclient", dataProviderClass = LoginPageDataProvider.class)
//	public void createclient(String Clientname)throws Exception 
//	{
//		if (Clientname != null)
//		{
//		Clientsettings ObjClientsettings= new Clientsettings(driver);
//		ObjClientsettings.createclient(Clientname);
//		testResult=Reporter.getCurrentTestResult();
//		testResult.setAttribute(ATTRIBUTE, driver); // set ATTRIBUTE as driver           
//		wait= new WebDriverWait(driver,2);
//		wait.until(ExpectedConditions.titleIs("Profile Settings"));  // Explicit wait page title
//		} 
//		
//	}
//	
//	
	
	
	
	
//
//	@Test(dataProvider = "invalidLoginData", dataProviderClass = LoginPageDataProvider.class)
//	public void loginWithInvalidCredentials(String username, String password, String expectedMessage) throws Exception {
//		if (username != null && password != null && expectedMessage != null) {
//			lp.login(username, password);
//			new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(lp.getErrorMessage()));
//
//			if ((lp.getErrorMessage().getText()).contentEquals(expectedMessage))
//				assert (true);
//			else
//				throw new Exception("The message ==> " + expectedMessage + " is not present");
//		}
//
//	}
	
}
