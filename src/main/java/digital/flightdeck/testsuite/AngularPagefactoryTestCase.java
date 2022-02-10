package digital.flightdeck.testsuite;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.paulhammant.ngwebdriver.NgWebDriver;

import digital.flightdeck.common.Driver;
import digital.flightdeck.common.Url;
import digital.flightdeck.pages.AngularTestPage;

public class AngularPagefactoryTestCase {
	

	WebDriver driver;
	NgWebDriver ngWebDriver;
	JavascriptExecutor jsDriver;
	public String baseUrl = Url.nodejsURL;
	
	
	 @Test
	 public void clearUrlTextArea() throws InterruptedException
	 {
		 driver = Driver.getChromeDriver(false);
		 jsDriver=(JavascriptExecutor)driver;
		 ngWebDriver=new NgWebDriver(jsDriver);
		 driver.get(baseUrl);
		 ngWebDriver.waitForAngularRequestsToFinish();
		 AngularTestPage atp= new AngularTestPage(driver);
		 atp.clearUserName();
		 atp.enterUserName("dipesh");
	 }

}
