package digital.flightdeck.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private WebDriver driver;

	@FindBy(name = "UserName")
	WebElement usernameTextField;
		
	@FindBy(name = "Password")
	WebElement passwordTextField;

	@FindBy(name = "login")
	WebElement loginButton;
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUsernameTextField() {
		return usernameTextField;
	}

	public void setUsernameTextField(WebElement usernameTextField) {
		this.usernameTextField = usernameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public void setPasswordTextField(WebElement passwordTextField) {
		this.passwordTextField = passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}

	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void enterUsername(String username) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(usernameTextField));
		usernameTextField.sendKeys(username);
	}

	public void enterPassword(String password) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(passwordTextField));
		passwordTextField.sendKeys(password);
	}

	public void clickLoginButton() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();

	}
	
	public void login(String username, String password) throws InterruptedException {
		enterUsername(username);
		enterPassword(password);
		clickLoginButton();
	}

}
