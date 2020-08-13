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
import org.testng.annotations.Parameters;
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


public class LoginPageTestCase {

	public WebDriver driver;//=Driver.getChromeDriver(false);
	public String baseURL = Url.FDlocalDevelopment;
	LoginPage lp; //= new LoginPage(driver);
	protected static final String ATTRIBUTE = "ATTRIBUTE";
	ITestResult testResult;
	public WebDriverWait wait;

	@BeforeClass
	@Parameters("browser")
	public void goToHomePage(ITestContext context,String browser) {
		
		if(browser.equalsIgnoreCase("Chrome"))
			driver = Driver.getChromeDriver(false);
		else if(browser.equalsIgnoreCase("Firefox"))
			driver = Driver.getFirefoxDriver(false);
		else if(browser.equalsIgnoreCase("IE"))
			driver = Driver.getInternertExplorerDriver();
		else if(browser.equalsIgnoreCase("Safari"))
			driver = Driver.getSafariDriver();
		lp = new LoginPage(driver);
		driver.get(baseURL);

	}
	
	@BeforeMethod
	public void goToLoginPage() {
		driver.get(baseURL );
			if (driver.getCurrentUrl().contentEquals(baseURL))
					{	
							driver.get(baseURL );
					}
		}
	
	
	
	@Test(dataProvider = "validLoginData", dataProviderClass = LoginPageDataProvider.class)
	public void loginWithValidCredentials( String username, String password)throws Exception 
	{
		if (username != null && password != null)
		{
			lp.login(username, password);
			testResult=Reporter.getCurrentTestResult();
			testResult.setAttribute(ATTRIBUTE, driver);         
			wait= new WebDriverWait(driver,2);
			wait.until(ExpectedConditions.titleIs("Home Page"));  
		}
	}
	
	

}
