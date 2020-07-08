package digital.flightdeck.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import digital.flightdeck.common.Syncwait;
import digital.flightdeck.common.Stringfunc;
import digital.flightdeck.common.Filefunc;
import digital.flightdeck.common.FileUtility;
import digital.flightdeck.common.CheckboxUtility;
import digital.flightdeck.common.JSExecutor;
public class KeywordManagerPage
{
	
	private WebDriver driver;
	JavascriptExecutor js;
	
	//WebElements with @FindBy
	
	@FindBy(xpath = "//a[@id='btnAddNewKeyword']")
	WebElement AddNewKeywordButton;
	
	@FindBy(id = "txtAddKeywords")
	WebElement AddKeywordstextarea;
	
	@FindBy(id = "setImportantChkBox")
	WebElement setImportantCheckBox;
	

	@FindBy(id = "AddKeywords")
	WebElement AddKeywordsButton;
	
	
	@FindBy(id = "keywordImport")
	WebElement keywordImportButton;
	
	
	@FindBy(id = "AddFileSelect")
	WebElement AddFileSelectOkButton;
	
	
//	@FindBy(linkText = "Download Sample")
//	WebElement DownloadSamplelink;
	
	@FindBy(xpath = "//a[text()='Download Sample']")
	WebElement DownloadSamplelink;
	
	
	@FindBy(className = "chkkeyword")    
	List<WebElement> allkeywordscheckboxes;
	
	@FindBy(id = "btnDeleteKeywords")
	WebElement DeleteKeywordsButton;
	
	@FindBy(xpath = "//a[text()='YES']")
	WebElement ConformkeywordOkButton;
	
	@FindBy(css= "a[href='#dvCompetitors']")
	WebElement Competitorstab;
	
	@FindBy(id = "btnAddNewCompetitor")
	WebElement AddNewCompetitorButton;
	
	
	@FindBy(id = "txtAddCompetitors")
	WebElement AddCompetitorstextarea;
	
	
	@FindBy(id = "AddCompetitors")
	WebElement SaveCompetitorsButton;
	
	@FindBy(className = "chkcompetitor")
	List<WebElement> allCompetitorscheckboxes;
			
	@FindBy(id = "btnDeleteCompetitors")
	WebElement  DeleteCompetitorsbutton;
	
	@FindBy(xpath = "//a[text()='YES']")
	WebElement  ConformCompetitorOkButton;
	
	
	@FindBy(id = "keywordExport")
	WebElement  keywordExporticon;
	
	
	@FindBy(xpath = "//a[text()='Increase keywords limit']")
	WebElement  IncreasekwdlimitLink;
		
	
	@FindBy(id = "txtkeywordLimit")
	WebElement  keywordLimitTexbox;
	

	@FindBy(id = "txtReason")
	WebElement  ReasonTextArea;
	
	
	@FindBy(id = "UpdateLimit")
	WebElement  UpdateLimitRequestButton;
	
	
	
	public WebElement getUpdateLimitRequestButton() {
		return UpdateLimitRequestButton;
	}

	public void setUpdateLimitRequestButton(WebElement updateLimitRequestButton) {
		UpdateLimitRequestButton = updateLimitRequestButton;
	}

	public WebElement getReasonTextArea() {
		return ReasonTextArea;
	}

	public void setReasonTextArea(WebElement reasonTextArea) {
		ReasonTextArea = reasonTextArea;
	}

	public WebElement getKeywordLimitTexbox() {
		return keywordLimitTexbox;
	}

	public void setKeywordLimitTexbox(WebElement keywordLimitTexbox) {
		this.keywordLimitTexbox = keywordLimitTexbox;
	}
	
	
	public WebElement getIncreasekwdlimitLink() {
		return IncreasekwdlimitLink;
	}

	public void setIncreasekwdlimitLink(WebElement increasekwdlimitLink) {
		IncreasekwdlimitLink = increasekwdlimitLink;
	}
	
	
	
	public WebElement getKeywordExporticon() {
		return keywordExporticon;
	}

	public void setKeywordExporticon(WebElement keywordExporticon) {
		this.keywordExporticon = keywordExporticon;
	}

	public WebElement getConformCompetitorOkButton() {
		return ConformCompetitorOkButton;
	}

	public void setConformCompetitorOkButton(WebElement conformCompetitorOkButton) {
		ConformCompetitorOkButton = conformCompetitorOkButton;
	}

	public WebElement getDeleteCompetitorsbutton() {
		return DeleteCompetitorsbutton;
	}

	public void setDeleteCompetitorsbutton(WebElement deleteCompetitorsbutton) {
		DeleteCompetitorsbutton = deleteCompetitorsbutton;
	}

	public List<WebElement> getAllCompetitorscheckboxes() {
		return allCompetitorscheckboxes;
	}

	public void setAllCompetitorscheckboxes(List<WebElement> allCompetitorscheckboxes) {
		this.allCompetitorscheckboxes = allCompetitorscheckboxes;
	}

	public WebElement getSaveCompetitorsButton() {
		return SaveCompetitorsButton;
	}

	public void setSaveCompetitorsButton(WebElement SaveCompetitorsButton) {
		this.SaveCompetitorsButton = SaveCompetitorsButton;
	}

	public WebElement getAddCompetitorstextarea() {
		return AddCompetitorstextarea;
	}

	public void setAddCompetitorstextarea(WebElement addCompetitorstextarea) {
		AddCompetitorstextarea = addCompetitorstextarea;
	}

	public WebElement getConformkeywordOkButton() {
		return ConformkeywordOkButton;
	}

	public void setConformkeywordOkButton(WebElement conformkeywordOkButton) {
		ConformkeywordOkButton = conformkeywordOkButton;
	}
		

		
	public WebElement getAddNewCompetitorButton() {
		return AddNewCompetitorButton;
	}

	public void setAddNewCompetitorButton(WebElement addNewCompetitorButton) {
		AddNewCompetitorButton = addNewCompetitorButton;
	}

	public WebElement getCompetitorstab() {
		return Competitorstab;
	}

	public void setCompetitorstab(WebElement competitorstab) {
		Competitorstab = competitorstab;
	}

	public WebElement getDeleteKeywordsButton() {
		return DeleteKeywordsButton;
	}

	public void setDeleteKeywordsButton(WebElement deleteKeywordsButton) {
		DeleteKeywordsButton = deleteKeywordsButton;
	}

	public List<WebElement> getAllkeywordscheckboxes() {
		return allkeywordscheckboxes;
	}

	public void setAllkeywordscheckboxes(List<WebElement> allkeywordscheckboxes) {
		this.allkeywordscheckboxes = allkeywordscheckboxes;
	}

	public WebElement getDownloadSamplelink() {
		return DownloadSamplelink;
	}

	public void setDownloadSamplelink(WebElement downloadSamplelink) {
		DownloadSamplelink = downloadSamplelink;
	}

	public WebElement getAddFileSelectOkButton() {
		return AddFileSelectOkButton;
	}

	public void setAddFileSelectOkButton(WebElement addFileSelectOkButton) {
		AddFileSelectOkButton = addFileSelectOkButton;
	}

	public WebElement getKeywordImportButton() {
		return keywordImportButton;
	}

	public void setKeywordImportButton(WebElement keywordImportButton) {
		this.keywordImportButton = keywordImportButton;
	}

	//PageFactory with Constructor	
	public KeywordManagerPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	public WebElement getAddKeywordsButton() {
		return AddKeywordsButton;
	}

	public void setAddKeywordsButton(WebElement addKeywordsButton) {
		AddKeywordsButton = addKeywordsButton;
	}
	
	public WebElement getSetImportantCheckBox() {
		return setImportantCheckBox;
	}

	public void setSetImportantCheckBox(WebElement setImportantCheckBox) {
		this.setImportantCheckBox = setImportantCheckBox;
	}

	//Getter and Setter
	public WebElement getAddKeywordstextarea() {
		return AddKeywordstextarea;
	}

	public void setAddKeywordstextarea(WebElement addKeywordstextarea) {
		AddKeywordstextarea = addKeywordstextarea;
	}

	public WebElement getAddNewKeywordButton() {
		return AddNewKeywordButton;
	}

	public void setAddNewKeywordButton(WebElement AddNewKeywordButton) {
		this.AddNewKeywordButton = AddNewKeywordButton;
	}
	
	//Actions on WebElements
		
	public void ClickaddnewkeywordButton() throws InterruptedException 
	{
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(AddNewKeywordButton));
		AddNewKeywordButton.click();
		Syncwait.Syncwaitfor(driver, 5000);

	}
	
	
	public void addKeywords() throws InterruptedException 
	{
		String Keywords=Stringfunc.SplitInNewline("first keyword\nsecond keyword");	
		new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(AddKeywordstextarea)); 
		AddKeywordstextarea.sendKeys(Keywords);
	}
	
	public void checkSetImportant() throws InterruptedException 
	{
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(setImportantCheckBox));
		setImportantCheckBox.click();	
	}
	
	public void SaveKeywords() throws InterruptedException 
	{
		new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(AddKeywordsButton));
		AddKeywordsButton.click();
	}
	
	public void ClickkeywordImportButton() throws InterruptedException 
	{
		
		new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(keywordImportButton));
		keywordImportButton.click();
	
	}
	
	public void uploadCSVFile() throws InterruptedException 
	{
		Syncwait.Syncwaitfor(driver, 5000);
		Filefunc.UploadCSV(driver, "/UploadFiles/CSV/sample.csv");
		
	}
	
	public void ClickAddFileSelectOkButton() throws InterruptedException 
	{
		
		new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(AddFileSelectOkButton));
		AddFileSelectOkButton.click();
	
	}
	
	public void ClickDownloadSamplelink() throws InterruptedException 
	{
		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(DownloadSamplelink));
		DownloadSamplelink.click();
	
	}
	
	public void clickonkeywordcheckboxes() throws InterruptedException 
	{
	
		CheckboxUtility.checkSpecifiedNumberOfCheckbox(driver,allkeywordscheckboxes,3);
//		if(allkeywordscheckboxes.size()>0)
//		{
//			//-3 to check except last two checkboxes
//			for(int i=0;i<=allkeywordscheckboxes.size()-3;i++)
//	        {
//				allkeywordscheckboxes.get(i).click();
//				Syncwait.Syncwaitfor(driver, 5000);
//	        }
//		}
		
	}
	
	public void clickDeleteKeywordsButton() throws InterruptedException 
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");	
		DeleteKeywordsButton.click();
	}
	
	
	public void clickConformkeywordOkButton() throws InterruptedException 
	{
		new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(ConformkeywordOkButton));
		ConformkeywordOkButton.click();
	}
	
	
	public void clickCompetitorstab() throws InterruptedException 
	{
//		new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(Competitorstab));
//		Competitorstab.click();
		
		js=(JavascriptExecutor)driver; 
		js.executeScript("$(\"a[href='#dvCompetitors']\").click()"); 
		js=null;
	}
	
	public void clickAddNewCompetitorButton() throws InterruptedException 
	{
		new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(AddNewCompetitorButton));
		AddNewCompetitorButton.click();
	}
	
	public void addCompetitors() throws InterruptedException 
	{
		String Competitors=Stringfunc.SplitInNewline("http://www.first.com\nwww.second.com\nwww.third.com\nwww.fourth.com\nfifth.com");	
		new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(AddCompetitorstextarea));
		AddCompetitorstextarea.sendKeys(Competitors);
	}
	
	public void saveCompetitors() throws InterruptedException 
	{
		new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(SaveCompetitorsButton));
		SaveCompetitorsButton.click();
		
		
	}
	
	public void clickonCompetitorscheckboxes() throws InterruptedException 
	{
		
		//Syncwait.Syncwaitfor(driver, 10000);
		if(allCompetitorscheckboxes.size()>0)
		{
			//-3 to check except last two checkboxes
			for(int i=0;i<=allCompetitorscheckboxes.size()-3;i++)
	        {
				allCompetitorscheckboxes.get(i).click();
				Syncwait.Syncwaitfor(driver, 2000);
	        }
		}	
		
	}
	
	public void clickDeleteCompetitorsbutton() throws InterruptedException 
	{
		
		JSExecutor.scroll(driver, "0", "1000");
//		js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)");
		DeleteCompetitorsbutton.click();
	}
	
	
	public void clickConformCompetitorOkButton() throws InterruptedException 
	{
		new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(ConformCompetitorOkButton));
		ConformCompetitorOkButton.click();
	}
	
	
	public void exportKeyword() throws InterruptedException 
	{
		//new WebDriverWait(driver,5).until(ExpectedConditions.elementToBeClickable(keywordExporticon));
		keywordExporticon.click();
	}
	
		
	public void clickIncreasekwdlimitLink() throws InterruptedException 
	{
		//driver.getPageSource(); 
		
		WebElement increasekwdlimit=driver.findElement(By.xpath("//a[text()='Increase keywords limit']"));
		JSExecutor.clickhiddenElement(driver,increasekwdlimit);
//		js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", increasekwdlimit);
//        js=null;
		
		}
	
	public void enterkeywordLimitTexbox() throws InterruptedException 
	{
		
		JSExecutor.enterhiddenElementvalue(driver,keywordLimitTexbox,"2000");
//		js = (JavascriptExecutor) driver;
//      js.executeScript("arguments[0].value='2000';", keywordLimitTexbox);
//      js=null;
		        
	}
	
	public void enterReason() throws InterruptedException 
	{
		JSExecutor.enterhiddenElementvalue(driver,keywordLimitTexbox,"Automated Test");
//		js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].value='Automated Test';", ReasonTextArea);
//		js=null;
		
	}
	
	public void clickUpdateLimitRequestButton() throws InterruptedException 
	{
		JSExecutor.clickhiddenElement(driver,UpdateLimitRequestButton);
//		js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", UpdateLimitRequestButton);
	
	}
	
	
}
