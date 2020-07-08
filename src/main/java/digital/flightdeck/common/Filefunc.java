package digital.flightdeck.common;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Filefunc {
	static JavascriptExecutor js;
	
	public static void UploadCSV(WebDriver driver,String subDirwithfilName)
	{
		WebElement uploadFileElement=new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.id("file")));
		js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].style.visibility='visible'", uploadFileElement);
	    uploadFileElement.sendKeys(System.getProperty("user.dir")+ subDirwithfilName);
	    js=null;
	}

}
