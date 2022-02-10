package digital.flightdeck.testsuite;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.paulhammant.ngwebdriver.NgWebDriver;

import digital.flightdeck.common.Driver;
import digital.flightdeck.common.Url;


public class AnuglarPageTescase {
	
	WebDriver driver;
	NgWebDriver ngWebDriver;
	JavascriptExecutor jsDriver;
	ByAngularModel username= ByAngular.model("username"); //Using By locator
		
	public String baseUrl = Url.nodejsURL;
  @Test
  public void f() {
	   driver = Driver.getChromeDriver(false);
	   jsDriver=(JavascriptExecutor)driver;
	   ngWebDriver=new NgWebDriver(jsDriver);
	   driver.get(baseUrl);
	   ngWebDriver.waitForAngularRequestsToFinish(); // Wait for angular containters to rednder
	   driver.findElement(username).clear();
	   driver.findElement(username).sendKeys("dipesh");
	   
	  	  
  }
}
