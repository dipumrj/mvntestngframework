package digital.flightdeck.testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import digital.flightdeck.common.dataprovider.*;
import digital.flightdeck.common.Driver;
import digital.flightdeck.common.Syncwait;
import digital.flightdeck.pages.LoginPage;
import junit.framework.Assert;
import digital.flightdeck.common.Url;
import digital.flightdeck.common.FileUtility;
import digital.flightdeck.pages.Clientsettings;
import digital.flightdeck.pages.KeywordManagerPage;;

//POM git commit using hosting maven repo in github
public class ClientSettingsTestCase {
	WebDriver driver = Driver.getChromeDriver(false);
	LoginPage lp = new LoginPage(driver);
	Clientsettings cs = new Clientsettings(driver);
	KeywordManagerPage ObjKeywordManager= new KeywordManagerPage(driver);
	public String baseUrl = Url.FDlocalDevelopment;
	
	@BeforeTest()
	public void goToLoginPage() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(baseUrl);
		lp.login("dipesh", "dmaharjan");
	} 
	
	@BeforeMethod
	public void gotoClientSettingsPage() throws InterruptedException {
		if (driver.getCurrentUrl().contentEquals(baseUrl)) {
			lp.login("dipesh", "dmaharjan");
			Syncwait.Syncwaitfor(driver, 4000);
		}
		driver.get(baseUrl + "/profileSetting/AddClientSettings");
		Syncwait.Syncwaitfor(driver, 4000);
	}



	@Test	
	public void createClientWithValidData() throws Exception 
	{
		cs.createclient("testclient117","testprofile117","www.testwebsite117.com","testdesc12","testPerson1","test1@gmail.com","Address1");
		Syncwait.Syncwaitfor(driver, 15000);
		ObjKeywordManager.ClickaddnewkeywordButton();
		ObjKeywordManager.addKeywords();
		//Need to check details
		//ObjKeywordManager.checkSetImportant();
		ObjKeywordManager.SaveKeywords();
		Syncwait.Syncwaitfor(driver, 20000);
		ObjKeywordManager.ClickkeywordImportButton();
		Syncwait.Syncwaitfor(driver, 5000);
		ObjKeywordManager.ClickDownloadSamplelink();
		Syncwait.Syncwaitfor(driver, 5000);
		//Soft Assert, message is not displaying so revert back
						//new SoftAssert().assertTrue( FileUtility.getLatestFileName().contains("sample"), "Sample File is not downloaded");
		//Hard Assert
		Assert.assertTrue("Sample File is not downloaded", FileUtility.getLatestFileName().contains("sample"));

		// Assert with Exception
						//		if(FileUtility.getLatestFileName().contains("sample"))
						//		{
						//			assert(true);
						//		}
						//		else
						//		throw new Exception("Sample File is not downloaded"); 
		ObjKeywordManager.uploadCSVFile();
		ObjKeywordManager.ClickAddFileSelectOkButton();
		Syncwait.Syncwaitfor(driver, 10000);	
		ObjKeywordManager.clickonkeywordcheckboxes();
		ObjKeywordManager.clickDeleteKeywordsButton();
		ObjKeywordManager.clickConformkeywordOkButton();
		Syncwait.Syncwaitfor(driver, 10000);
		ObjKeywordManager.clickCompetitorstab();
		ObjKeywordManager.clickAddNewCompetitorButton();
		ObjKeywordManager.addCompetitors();
		ObjKeywordManager.saveCompetitors();
		Syncwait.Syncwaitfor(driver, 10000);
		ObjKeywordManager.clickonCompetitorscheckboxes();
		ObjKeywordManager.clickDeleteCompetitorsbutton();
		ObjKeywordManager.clickConformCompetitorOkButton();
		Syncwait.Syncwaitfor(driver, 5000);
		ObjKeywordManager.exportKeyword();
		Syncwait.Syncwaitfor(driver, 5000);
		if(FileUtility.getLatestFileName().contains("testclient"))
			{
					assert(true);
			}
		else
		         	throw new Exception("Keyword is not exported"); 
		Syncwait.Syncwaitfor(driver, 10000);		
		ObjKeywordManager.clickIncreasekwdlimitLink();
		ObjKeywordManager.enterkeywordLimitTexbox();
		ObjKeywordManager.enterReason();
		ObjKeywordManager.clickUpdateLimitRequestButton();
				
	}
		
	@AfterTest
	public void clearSession() {
		driver.quit();
	}
	
}
