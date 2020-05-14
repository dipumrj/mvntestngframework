

/* This page includes the module to get the WebDriver for different Browser   */

package digital.flightdeck.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {
	public static WebDriver driver;

	public static WebDriver getFirefoxDriver(boolean headless) {

		//System.setProperty("webdriver.gecko.driver", "D:\\Driver\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\Driver\\geckodriver.exe");
		if (headless == true) {
			FirefoxOptions options = new FirefoxOptions();
			options.setHeadless(true);
			driver = new FirefoxDriver(options);
		} else {
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public static WebDriver getChromeDriver(boolean i) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver_win32\\chromedriver.exe");
		if (i) {
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(true);
			driver = new ChromeDriver(options);
		} else {

			driver = new ChromeDriver();
		}
		return driver;
	}

	public static WebDriver getChromeDriver(String headless) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		driver = new ChromeDriver(options);
		return driver;
	}

	public static WebDriver getInternertExplorerDriver() {

		System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\Driver\\IEDriverServer.exe");
		return driver;
	}

	public static WebDriver getSafariDriver() {

		System.setProperty("webdriver.chrome.driver", "");
		return driver;
	}

	public static WebDriver getOperaDriver() {

		System.setProperty("webdriver.opera.driver",System.getProperty("user.dir")+"\\Driver\\operadriver.exe");
		return driver;
	}

	public static WebDriver getEdgeDriver() {

		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\msedgedriver.exe");
		return driver;
	}

}