package digital.flightdeck.common;

import org.openqa.selenium.WebDriver;

public class Syncwait {
	
	public static void Syncwaitfor(WebDriver driver,long time) throws InterruptedException
	{
		synchronized (driver) // time in milliseconds
		{
		    driver.wait(time);
		}

	}
}
