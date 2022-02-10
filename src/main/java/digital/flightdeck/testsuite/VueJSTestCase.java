package digital.flightdeck.testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import digital.flightdeck.common.Driver;
import digital.flightdeck.common.Url;
import digital.flightdeck.pages.Clientsettings;
import digital.flightdeck.pages.VueJSTestPage;;

public class VueJSTestCase {
	WebDriver driver =Driver.getChromeDriver(false);
	public String baseURL=Url.vuejsURL;
	VueJSTestPage vjs=new VueJSTestPage(driver);
	
@BeforeTest
public void d()
{
	  driver.manage().window().maximize();
	  driver.get(baseURL);

	
}
  @Test
   public void singin( )throws Exception 
{
	 // vjs.clickSigninlink();
//	Thread.sleep(3000);
//	  vjs.enterEmail("test@test.com");
//	  vjs.clickloginButton();
	  Thread.sleep(3000);
	  vjs.clickSearchIcon();
	  Thread.sleep(3000);
	  vjs.entersearchbox("check");
  }
}
