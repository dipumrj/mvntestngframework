package digital.flightdeck.common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class JSExecutor {
	
	static JavascriptExecutor js;
	
	public static void scroll(WebDriver driver,String pixelwidth,String pixelheight) 
	{
		String windowscroll="window.scrollBy";
		String pixel="("+ pixelwidth + "," + pixelheight +")";
		windowscroll= windowscroll.concat(pixel);
		js=(JavascriptExecutor)driver;
		js.executeScript(windowscroll);
		js=null;
		//js.executeScript("window.scrollBy(0,1000)");
		//DeleteCompetitorsbutton.click();
	}
	
	public static void enterhiddenElementvalue(WebDriver driver,WebElement locator,String value  ) 
	{
		js=(JavascriptExecutor)driver;
		String argumentvalue="arguments[0].value=";
		String entervalue="'"+value+"';";
		argumentvalue=argumentvalue.concat(entervalue);
		js.executeScript(argumentvalue,locator);
		js=null;
		//  js.executeScript("arguments[0].value='2000';", locator);
		
	}
	
	public static void clickhiddenElement(WebDriver driver,WebElement locator ) 
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", locator);
		js=null;
	}
	
	public static String getElementTextByID (WebDriver driver,String locatorvalue) 
	{
		String invalidmessage;
		js=(JavascriptExecutor)driver;
		String stringagrument1="return document.getElementById(";
		String locatorValueString="'"+locatorvalue+"'";
		String stringagrument2=stringagrument1.concat(locatorValueString);
		String stringagrument3=").innerHTML";	
		String stringagrument4=stringagrument2.concat(stringagrument3);
		invalidmessage=js.executeScript(stringagrument4).toString();
		//js.executeScript("return document.getElementById('dvInvalidRssUrl').innerHTML").toString();
		js=null;
		return  invalidmessage;
		
		
		
		
	}

}
