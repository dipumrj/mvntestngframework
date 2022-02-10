package digital.flightdeck.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VueJSTestPage {
	
private WebDriver driver;

public VueJSTestPage(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}


@FindBy(xpath = "//a[contains(text(),'Sign In')]")
WebElement signinlink;

@FindBy(xpath = "//input[@type='email'][@name='email']")
WebElement emailtextbox;


@FindBy(xpath = "//button[contains(text(),'Log In')]")
WebElement Loginbutton;


@FindBy(xpath = "//input[@type='text'][@name='q']")
WebElement searchbox;


@FindBy(xpath = "//button[@id='search-trigger']")
WebElement searchicon;





public WebElement getSearchicon() {
	return searchicon;
}


public void setSearchicon(WebElement searchicon) {
	this.searchicon = searchicon;
}


public WebElement getSearchbox() {
	return searchbox;
}


public void setSearchbox(WebElement searchbox) {
	this.searchbox = searchbox;
}


public WebElement getEmailtextbox() {
	return emailtextbox;
}


public void setEmailtextbox(WebElement emailtextbox) {
	this.emailtextbox = emailtextbox;
}


public WebElement getSigninlink() {
	return signinlink;
}


public void setSigninlink(WebElement signinlink) {
	this.signinlink = signinlink;
}


public void clickSigninlink() {
	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(signinlink));
	signinlink.click();

}


public WebElement getLoginbutton() {
	return Loginbutton;
}


public void setLoginbutton(WebElement loginbutton) {
	Loginbutton = loginbutton;
}


public void enterEmail(String Email) {
	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(emailtextbox));
	emailtextbox.sendKeys(Email);

}


public void clickloginButton() {
	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(Loginbutton));
	Loginbutton.click();

}


public void clickSearchIcon() {
	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(searchicon));
	searchicon.click();

}


public void entersearchbox(String value) {
	new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(searchbox));
	searchbox.sendKeys(value);

}


}
