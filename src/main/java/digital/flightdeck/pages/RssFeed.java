package digital.flightdeck.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import digital.flightdeck.common.JSExecutor;
import digital.flightdeck.common.Stringfunc;
import digital.flightdeck.common.WinHandler;
import java.util.List;


public class RssFeed {
		
	private WebDriver driver;
	
	public RssFeed(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//*[@class='icon-plus']")
	WebElement addNewURLsButton;
	@FindBy(id="txtAddRssUrl")
	WebElement enterURLTextArea;
	@FindBy(id="AddRssUrl")
	WebElement AddRssUrlSaveButton;
	@FindBy(css="div[id='dvInvalidRssUrlHolder']")
	WebElement invalidRssUrlDiv;
	@FindBy(xpath="//ul[@id='rssUrlScroll']/li")
	List<WebElement> rssvaluesUIliList;
	@FindBy(xpath="/html[1]/body[1]/div[1]/section[1]/section[1]/div[1]/div[2]/div[5]/div[4]/div[1]/div[1]/ul[1]/li[1]/a[1]/i[1]")
	WebElement rssFeedLink;
	
	
	public WebElement getRssFeedLink() {
		return rssFeedLink;
	}

	public void setRssFeedLink(WebElement rssFeedLink) {
		this.rssFeedLink = rssFeedLink;
	}

	public List<WebElement> getRssvaluesUIliList() {
		return rssvaluesUIliList;
	}

	public void setRssvaluesUIliList(List<WebElement> rssvaluesUIliList) {
		this.rssvaluesUIliList = rssvaluesUIliList;
	}

	public WebElement getInvalidRssUrlDiv() {
		return invalidRssUrlDiv;
	}

	public void setInvalidRssUrlDiv(WebElement invalidRssUrlDiv) {
		this.invalidRssUrlDiv = invalidRssUrlDiv;
	}

	public WebElement getAddRssUrlSaveButton() {
		return AddRssUrlSaveButton;
	}

	public void setAddRssUrlSaveButton(WebElement addRssUrlSaveButton) {
		AddRssUrlSaveButton = addRssUrlSaveButton;
	}


	public WebElement getEnterURLTextArea() {
		return enterURLTextArea;
	}

	public void setEnterURLTextArea(WebElement enterURLTextArea) {
		this.enterURLTextArea = enterURLTextArea;
	}

	public WebElement getAddNewURLsButton() {
		return addNewURLsButton;
	}

	public void setAddNewURLsButton(WebElement addNewURLsButton) {
		this.addNewURLsButton = addNewURLsButton;
	}
	
	public void clickaddNewURLsButton()
	{
		JSExecutor.scroll(driver, "0", "1000");
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(addNewURLsButton));
		addNewURLsButton.click();
	}
		
	
	public void enterURL(String url)
	{
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(enterURLTextArea));
		enterURLTextArea.sendKeys(url+"\n");
	}
	
	public void clearUrlTextArea()
	{
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(enterURLTextArea));
		if(enterURLTextArea.getAttribute("value").isEmpty()==false)
			enterURLTextArea.clear();
	}
	public void clickAddRssUrlSaveButton()
	{
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(AddRssUrlSaveButton));
		AddRssUrlSaveButton.click();
	
	}
	
	public void clickRssFirstFeedLink()
	{
		rssFeedLink.click();
	}
	
	public int getRssTotalCount()
	{	
		return rssvaluesUIliList.size();
	}
	
	public String getFirstRssFeed()
	{
		String RssFirstText=rssvaluesUIliList.get(0).getText();
		return RssFirstText;
	}
	
	
}
