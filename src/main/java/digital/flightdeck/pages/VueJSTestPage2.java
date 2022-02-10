package digital.flightdeck.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VueJSTestPage2 {
	
	private WebDriver driver;

	public VueJSTestPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "//select[@name='gender']")
	WebElement GenderDropbox;
	
	@FindBy(name = "nickname")
	WebElement Nicknametextbox;
	
	
	public WebElement getNicknametextbox() {
		return Nicknametextbox;
	}


	public void setNicknametextbox(WebElement nicknametextbox) {
		Nicknametextbox = nicknametextbox;
	}


	public void enterNickname(String value) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Nicknametextbox));
		Nicknametextbox.sendKeys(value);

	}
	
	
	public void selectGender(String gender) {
		Select gdropbox = new Select(GenderDropbox);
	//	gdropbox.selectByValue(gender);
		gdropbox.selectByVisibleText(gender);
	}
	
//	public void clickloginButton() {
//		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Loginbutton));
//		Loginbutton.click();
//
//	}

}