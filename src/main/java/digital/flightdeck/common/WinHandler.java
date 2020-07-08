package digital.flightdeck.common;

import org.openqa.selenium.WebDriver;

public class WinHandler {
	
	public static void switchOnLatestTab(WebDriver driver)
	{
	    for(String winHandle : driver.getWindowHandles())
	    {
	        driver.switchTo().window(winHandle);
	      
	    }
	    
	}
	    
}
