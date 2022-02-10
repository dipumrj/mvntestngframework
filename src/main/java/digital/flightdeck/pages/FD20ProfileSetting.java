package digital.flightdeck.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FD20ProfileSetting {
	
	private WebDriver driver;
	JavascriptExecutor js;

	public FD20ProfileSetting(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@type='text'][@class='appearance-none block w-full bg-gray-200 text-gray-700 border border-gray-200 rounded py-3 px-4 mb-3 leading-tight focus:outline-none focus:bg-white flatpickr-input']")
	WebElement BaseLineDateCalendar;
	
	
	public WebElement getBaseLineDateCalendar() {
		return BaseLineDateCalendar;
	}

	public void setBaseLineDateCalendar(WebElement baseLineDateCalendar) {
		BaseLineDateCalendar = baseLineDateCalendar;
	}

	public void clickBaseLineDateCalendar() throws InterruptedException {
	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(BaseLineDateCalendar));
	BaseLineDateCalendar.click();
	Thread.sleep(3000);
	String dateVal = "December 2, 2020";
	 js=(JavascriptExecutor)driver; 
     //js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@class='flatpickr-day'and @aria-label='"+dateVal+"']")));
     js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[contains(@class,'flatpickr-day') and @aria-label='"+dateVal+"']")));
     js=null;
	

		
	

}
}
