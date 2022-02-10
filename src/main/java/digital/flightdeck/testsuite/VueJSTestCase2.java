package digital.flightdeck.testsuite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import digital.flightdeck.common.Driver;
import digital.flightdeck.common.Url;
import digital.flightdeck.pages.Clientsettings;
import digital.flightdeck.pages.VueJSTestPage2;;

public class VueJSTestCase2 {
	WebDriver driver =Driver.getChromeDriver(false);
	public String baseURL=Url.vuejsURL2;
	VueJSTestPage2 vjs2=new VueJSTestPage2(driver);
	
@BeforeTest
public void d()
{
	  driver.manage().window().maximize();
	  driver.get(baseURL);

	
}
  @Test
   public void singup()throws Exception 
{
	 // vjs.clickSigninlink();
//	Thread.sleep(3000);
//	  vjs.enterEmail("test@test.com");
//	  vjs.clickloginButton();
	  Thread.sleep(3000);
	  vjs2.enterNickname("harry");
	  Thread.sleep(3000);
 vjs2.selectGender("Male");
  }
}
