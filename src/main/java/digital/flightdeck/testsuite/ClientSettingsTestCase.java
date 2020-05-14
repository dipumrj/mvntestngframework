package digital.flightdeck.testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import digital.flightdeck.common.dataprovider.*;

import digital.flightdeck.common.Driver;
import digital.flightdeck.pages.LoginPage;
import digital.flightdeck.common.Url;
import digital.flightdeck.pages.Clientsettings;;

public class ClientSettingsTestCase {
	WebDriver driver = Driver.getChromeDriver(false);
	LoginPage lp = new LoginPage(driver);
	Clientsettings cs = new Clientsettings(driver);
	public String baseUrl = Url.FDlocalDevelopment;
	
	@BeforeTest()
	public void goToClientPage(ITestContext context) throws InterruptedException {
		context.setAttribute("WebDriver", driver);
		driver.manage().window().maximize();
		driver.get(baseUrl);
		lp.login("dipesh", "dmaharjan");
	} 
	
	@BeforeMethod
	public void gotoCreateBookingPage() throws InterruptedException {
		if (driver.getCurrentUrl().contentEquals(baseUrl)) {
			lp.login("dipesh", "dmaharjan");
			Thread.sleep(3000);   
		}
		driver.get(baseUrl + "/profileSetting/AddClientSettings");
		Thread.sleep(3000);
	}

//	@Test(dataProvider = "createclient", dataProviderClass = LoginPageDataProvider.class)
//	public void createClientWithValidData(String buyer, String agencyIndex, String monthIndex)
//	{
//		cs.clickaddprofileButton();
//		System.out.print("Inside Test");
//	
//		
//		
//	}
//	
	@Test	
	public void createClientWithValidData() throws InterruptedException 
	{
		cs.createclient("testclient10","testprofile10","www.testwebsite10.com","testdesc1","testPerson1","test1@gmail.com","Address1");
		Thread.sleep(3000);
		
	}
	
	
	@AfterTest
	public void clearSession() {
		driver.quit();
	}
	
}
