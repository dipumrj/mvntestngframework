package digital.flightdeck.testsuite;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import digital.flightdeck.common.Driver;
import digital.flightdeck.common.Url;
import digital.flightdeck.pages.FD20ProfileSetting;

public class FD20ProfileSettingTestCases {
    WebDriver driver =Driver.getChromeDriver(false);
	public String baseURL=Url.FD20URL;
	FD20ProfileSetting FDProfileObject=new FD20ProfileSetting(driver);
	
@BeforeTest
public void GoToLoginPage()
{
	  driver.manage().window().maximize();
	  driver.get(baseURL);
}
@Test
 public void CreateProfileWithValidData()throws Exception 
{
	  Thread.sleep(3000);	 
	  FDProfileObject.clickBaseLineDateCalendar();
}
}
