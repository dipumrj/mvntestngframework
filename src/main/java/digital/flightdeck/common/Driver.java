

/* This page includes the module to get the WebDriver for different Browser   */

package digital.flightdeck.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

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
		DesiredCapabilities cap = DesiredCapabilities.internetExplorer();
		cap.setCapability("nativeEvents", false);
		cap.setCapability("unexpectedAlertBehaviour", "accept");
		cap.setCapability("ignoreProtectedModeSettings", true);
		cap.setCapability("disable-popup-blocking", true);
		cap.setCapability("enablePersistentHover", true);
		cap.setCapability("ignoreZoomSetting", true);
		cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		InternetExplorerOptions options = new InternetExplorerOptions();
		options.merge(cap);
		driver = new InternetExplorerDriver(options);
		return driver;
	}

	public static WebDriver getSafariDriver() {

//		DesiredCapabilities cap = DesiredCapabilities.safari();
		SafariOptions options = new SafariOptions();
		options.setUseTechnologyPreview(true);
		driver = new SafariDriver(options);
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