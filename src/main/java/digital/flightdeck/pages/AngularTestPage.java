package digital.flightdeck.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.ByAngularModel;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class AngularTestPage {
	
	private WebDriver driver;
	
	public AngularTestPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@ByAngularModel.FindBy(model="username")
	WebElement usernametextbox;

	public WebElement getUsernametextbox() {
		return usernametextbox;
	}

	public void setUsernametextbox(WebElement usernametextbox) {
		this.usernametextbox = usernametextbox;
	}
	

	public void enterUserName(String username)
	{
		usernametextbox.sendKeys(username);
	}

	public void clearUserName()
	{
		usernametextbox.clear();
	}
}
