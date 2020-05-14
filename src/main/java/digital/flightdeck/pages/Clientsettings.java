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

public class Clientsettings {
	private WebDriver driver;
	JavascriptExecutor js;

	@FindBy(id = "IdMyProjects")
	WebElement myprojectsLink;
	
	@FindBy(linkText = "Add Profile")
	WebElement addprofileButton;
	
	@FindBy(name = "profileName_input")
	WebElement profilenamecombobox;
		
	@FindBy(name = "Clientname")
	WebElement clientnametextbox;
		
	@FindBy(id = "Website")
	WebElement websitetextbox;

	@FindBy(id = "trackMobileRanking")
	WebElement trackMobileRankingcheckbox;
			
	@FindBy(id = "Description")
	WebElement descriptiontextbox;
		
	@FindBy(id = "contact_person")
	WebElement contactpersontextbox;

	@FindBy(id = "txtEmail")
	WebElement emailtextbox;
	
	@FindBy(id = "seperatedbyComma")
	WebElement seperatedbyCommacheckbox;
		
	@FindBy(id = "address")
	WebElement addresstextbox;
	
	@FindBy(id = "file")
	WebElement uploadFileElement;
	
	@FindBy(id = "SaveId")
	WebElement SaveandNextbutton;
	
	@FindBy(id = "SaveAccountManager")
	WebElement SaveAccountManagerbutton;
	
	@FindBy(xpath = "//input[@type='submit'][@id='btnAddBrandedTerms']")
	WebElement AddBrandedTermsButton;
		
	@FindBy(xpath="//input[@type='text'][@class='span12 no-radius txtBrandedTerm']")
	WebElement BrandedTermsTextbox;
	
	@FindBy(id = "btnBrandedTerm")
	WebElement SaveBrandedTermbutton;
	
	@FindBy(className="clschkUserGroup")
	WebElement UserGroupcheckbox;
	
	@FindBy(xpath = "//input[@type='submit'][@id='btnAlias']")
	WebElement AddAliasesButton;
	
	@FindBy(xpath = "//input[@type='text'][@class='span12 no-radius txtAliase']")
	WebElement Aliasetextbox;
	
	@FindBy(xpath = "//input[@type='submit'][@id='btnAliase']")
	WebElement SaveAddAliasesButton;
	
	@FindBy(xpath = "//button[text()='OK']")
	WebElement ConfirmokButton;
	
	@FindBy(xpath = "//text()[contains(.,'Confirm')]/ancestor::button[1]")
	WebElement ConfirmPopup;
	
	
	
//
//	@FindBy(css = ".sp-dd")
//	WebElement primarycolorDropdown;
//	
//	@FindBy(css = ".sp-choose")
//	WebElement colorentrytextbox;
//			

	
//	@FindBy(css = "clschkUserGroup")
//	WebElement usergroupnamecheckbox;
//
//	@FindBy(xpath = "//*[@id=\\\"btnSaveUserGroup\\\"]")
//	WebElement SaveUserGroupbutton;
//	
	
//	@FindBy(xpath = "//input[@type='text'][@class='span12 no-radius txtBrandedTerm']")
//	WebElement BrandTermtextbox;
//		

	
	
	
//	
//	@FindBy(xpath = "//input[@type='submit'][@id='btnAlias']")
//	WebElement AddAliasButton;
//			


//	
//	@FindBy(id = "btnContinueMakingCharts")
//	WebElement contiuneButton;
//		
//	@FindBy(xpath = "//button[text()='Finish']")
//	WebElement FinishButton;
//	
//	
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getmyprojectsLink() {
		return myprojectsLink;
	}

	public void setmyprojectsLink(WebElement myprojectsLink) {
		this.myprojectsLink = myprojectsLink;
	}

	public WebElement getaddprofileButton() {
		return addprofileButton;
	}

	public void setaddprofileButton(WebElement addprofileButton) {
		this.addprofileButton = addprofileButton;
	}

	public WebElement getprofilenamecombobox() {
		return profilenamecombobox;
	}

	public void setprofilenamecombobox(WebElement profilenamecombobox) {
		this.profilenamecombobox = profilenamecombobox;
	}

	
	public WebElement getClientname() {
		return clientnametextbox;
	}

	public void setClientname(WebElement clientnametextbox) {
		this.clientnametextbox = clientnametextbox;
	}
		
	public WebElement getwebsitetextbox() {
		return websitetextbox;
	}

	public void setwebsitetextbox(WebElement websitetextbox) {
		this.websitetextbox = websitetextbox;
	}

	
	
	public WebElement gettrackMobileRankingcheckbox() {
		return trackMobileRankingcheckbox;
	}

	public void settrackMobileRankingcheckbox(WebElement trackMobileRankingcheckbox) {
		this.trackMobileRankingcheckbox = trackMobileRankingcheckbox;
	}

	public WebElement getDescriptiontextbox() {
		return descriptiontextbox;
	}

	public void setDescriptiontextbox(WebElement descriptiontextbox) {
		this.descriptiontextbox = descriptiontextbox;
	}

	public WebElement getContactpersontextbox() {
		return contactpersontextbox;
	}

	public void setContactpersontextbox(WebElement contactpersontextbox) {
		this.contactpersontextbox = contactpersontextbox;
	}

	WebElement getEmailtextbox() {
		return emailtextbox;
	}

	public void setEmailtextbox(WebElement emailtextbox) {
		this.emailtextbox = emailtextbox;
	}

	public WebElement getSeperatedbyCommacheckbox() {
		return seperatedbyCommacheckbox;
	}

	public void setSeperatedbyCommacheckbox(WebElement seperatedbyCommacheckbox) {
		this.seperatedbyCommacheckbox = seperatedbyCommacheckbox;
	}

	public WebElement getAddresstextbox() {
		return addresstextbox;
	}

	public void setAddresstextbox(WebElement addresstextbox) {
		this.addresstextbox = addresstextbox;
	}
	
	
	public WebElement getuploadFileElement() {
		return uploadFileElement;
	}

	public void setuploadFileElement(WebElement uploadFileElement) {
		this.uploadFileElement = uploadFileElement;
	}
	
	public WebElement getSaveandNextbutton() {
		return SaveandNextbutton;
	}

	public void setSaveandNextbutton(WebElement SaveandNextbutton) {
		this.SaveandNextbutton = SaveandNextbutton;
	}	
	

	public WebElement getSaveAccountManagerButton() {
		return SaveAccountManagerbutton;
	}

	public void setSaveAccountManagerButton(WebElement SaveAccountManagerbutton) {
		this.SaveAccountManagerbutton = SaveAccountManagerbutton;
	}
	
	
	public WebElement getAddBrandedTermsButton() {
		return AddBrandedTermsButton;
	}

	public void setAddBrandedTermsButton(WebElement AddBrandedTermsButton) {
		this.AddBrandedTermsButton = AddBrandedTermsButton;
	}

	
	public WebElement getSaveBrandedTermbutton() {
		return SaveBrandedTermbutton;
	}

	public void setSaveBrandedTermbutton(WebElement SaveBrandedTermbutton) {
		this.SaveBrandedTermbutton = SaveBrandedTermbutton;
	}

	public WebElement getAliasetextbox() {
		return Aliasetextbox;
	}

	public void setAliasetextbox(WebElement Aliasetextbox) {
		this.Aliasetextbox = Aliasetextbox;
	}

	public WebElement getAddAliasesButton() {
		return AddAliasesButton;
	}

	public void setAddAliasesButton(WebElement AddAliasesButton) {
		this.AddAliasesButton = AddAliasesButton;
	}

	public WebElement getSaveAddAliasesButton() {
		return SaveAddAliasesButton;
	}

	public void setSaveAddAliasesButton(WebElement SaveAddAliasesButton) {
		this.SaveAddAliasesButton = SaveAddAliasesButton;
	}
	
	
	public WebElement getConfirmokButton() {
		return ConfirmokButton;
	}

	public void setConfirmokButton(WebElement ConfirmokButton) {
		this.ConfirmokButton = ConfirmokButton;
	}
	
	public WebElement getConfirmPopup() {
		return ConfirmPopup;
	}

	public void setConfirmPopup(WebElement ConfirmPopup) {
		this.ConfirmPopup = ConfirmPopup;
	}
	
	
	
//	public WebElement getPrimarycolorDropdown() {
//		return primarycolorDropdown;
//	}
//
//	public void setPrimarycolorDropdown(WebElement primarycolorDropdown) {
//		this.primarycolorDropdown = primarycolorDropdown;
//	}
//
//	public WebElement getColorentrytextbox() {
//		return colorentrytextbox;
//	}
//
//	public void setColorentrytextbox(WebElement colorentrytextbox) {
//		this.colorentrytextbox = colorentrytextbox;
//	}
//
//
//	public WebElement getFinishButton() {
//		return FinishButton;
//	}
//
//	public void setFinishButton(WebElement finishButton) {
//		FinishButton = finishButton;
//	}

	
	public Clientsettings(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	/* Actions on WebElements */
	public void clickmyprojectsLink() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(myprojectsLink));
		myprojectsLink.click();
	}

	
	
//	synchronized (driver) // Wait 20 seconds for load
//	{
//	    this.driver.wait(20000);
//	   
//	}
//	
	public void clickaddprofileButton() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(addprofileButton));
		addprofileButton.click();
	}
	
	public void enterprofilename(String profilename) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(profilenamecombobox));
		profilenamecombobox.sendKeys(profilename);
	}
			
	public void enterClientname(String Clientname) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(clientnametextbox));
		clientnametextbox.sendKeys(Clientname);
	}
	
	
	public void enterWebsite(String website) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(websitetextbox));
		websitetextbox.sendKeys(website);
	}
	
	public void selectfrequency()
	{
		js=(JavascriptExecutor)driver; // Select Frequency 
		js.executeScript("$(\".ddlFrequency li:eq(3) a\").click()"); 
		js=null;
		
	}
	
	public void checktrackMobileRanking() {
		if(trackMobileRankingcheckbox.isSelected()==false)
		{
			trackMobileRankingcheckbox.click();
		}
	}
	
	
	public void enterdescription(String description) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(descriptiontextbox));
		descriptiontextbox.sendKeys(description);
	}
	
	
	
	public void entercontactperson(String contactperson) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(contactpersontextbox));
		contactpersontextbox.sendKeys(contactperson);
	}
	
	
	public void enteremail(String email) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(emailtextbox));
		emailtextbox.sendKeys(email);
	}
	
	//Seems not to be working		
	public void checkcommacheckbox() {
		new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOf(seperatedbyCommacheckbox));
//		if(seperatedbyCommacheckbox.isSelected()==false)
//		{
			seperatedbyCommacheckbox.click();
		//}
	}
	
	
	public void enteraddress(String address) {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(addresstextbox));
		addresstextbox.sendKeys(address);
	}
	
	public void selectsitetype()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("$(\"#divProfileSetting li:nth-child(2) span\").click()"); // Select Academic as SiteType
		js=null;
	}
	
	
	public void UploadImage()
	{
		
		
		//WebElement uploadFileElement=new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.id("file")));
		
		uploadFileElement=new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.id("file")));
		js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].style.visibility='visible'", uploadFileElement);
        uploadFileElement.sendKeys(System.getProperty("user.dir")+"/Images/images.jpg");
        js=null;
	}
	
	public void clicksaveandnext() {
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(SaveandNextbutton));
		SaveandNextbutton.click();
	}
	
	public void chooseusergroup()
	{
	
		List<WebElement> Usergroups =driver.findElements(By.className("clschkUserGroup")); // Select multiple Usergroups
		//List<WebElement> Usergroups =(List<WebElement>) UserGroupcheckbox; // Select multiple Usergroups
	 	js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].click();", Usergroups.get(0)); // Select 3rd user group
	    js=null;
	}
	
	public void saveusergroup()
	{
		js=(JavascriptExecutor)driver; // click save user group button
		js.executeScript("$('#btnSaveUserGroup').click()"); 
		js=null;
	}
	
	
	
	public void choosesearchengine()
	{
		js=(JavascriptExecutor)driver; // Choose Search Engine
	    js.executeScript("$('#searchEngine-list ul li:eq(13)').click()"); // 13 for australia
		js=null;
	}
	
	public void clickSaveAccountManagerbutton()
	{
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(SaveAccountManagerbutton));
		SaveAccountManagerbutton.click();
	}
	
	
	public void clickAddBrandedTermsButton()
	{
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(AddBrandedTermsButton));
		AddBrandedTermsButton.click();
	}
	
	public void passBrandedTerms()
	{
		
		List<WebElement> BrandTerms =driver.findElements(By.xpath("//input[@type='text'][@class='span12 no-radius txtBrandedTerm']")); 
			//new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(BrandedTermsTextbox)); // Select multiple Usergroups
		js = (JavascriptExecutor) driver;
		for(int i=0;i<=1;i++)
		{
			js.executeScript("arguments[0].value='"+ "AutoBrand"+i + "'", BrandTerms.get(i)); // Select 3rd user group
		}
		js=null;
	}
	
	
	public void SaveBrandedTerm()
	{
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(SaveBrandedTermbutton));
		SaveBrandedTermbutton.click();
		
	}
	
	public void clickAddAliasesButton()
	{
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(AddAliasesButton));
		AddAliasesButton.click();
	}
	
	public void enterAliase()
	{
		
		List<WebElement> Aliases =driver.findElements(By.xpath( "//input[@type='text'][@class='span12 no-radius txtAliase']")); // Select multiple Usergroups
	 	js = (JavascriptExecutor) driver;
	 	for(int i=0;i<=1;i++)
	 	{
	    //js.executeScript("arguments[0].value='"+AliasesValue+i + "'", Aliases.get(i)); // Select 3rd user group
	 	js.executeScript("arguments[0].value='"+"Aliases"+i+".com"+ "'", Aliases.get(i)); 
	 	}
	 	js=null;
		
	}
	
	
	public void SaveAliases()
	{
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(SaveAddAliasesButton));
		SaveAddAliasesButton.click();
	
	}
	
	public void clickConfirmokButton()
	{
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(ConfirmokButton));	
	
		ConfirmokButton.click();
	}
	
	public void clickoncontinueButton()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("$(\"#btnAdvancedSetting\").click()"); 
		js=null;
	}
	
	
	public void ConfirmClickPopupButton() throws InterruptedException
	{
		synchronized (driver) // Wait 5 seconds for confirm button load
		{
		    driver.wait(5000);
		}
		
		new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(ConfirmPopup));	
		Boolean iselementpresent =  driver.findElements(By.xpath("//text()[contains(.,'Confirm')]/ancestor::button[1]")).size()!= 0;
	   if (iselementpresent == true)
	   {
		   ConfirmPopup.click();
	   }
	   
	}
	
	public void ClickonFinishbutton() throws InterruptedException
	{
	
		synchronized (driver) // Wait 10 seconds for continue button load
		{
		    driver.wait(10000);
		}
		
		js=(JavascriptExecutor)driver;
		js.executeScript("$(\"#divProfileSetting > div > button.btn.btn-primary.btnNavigateToKeywordManager\").click()"); 
		js=null;
		
	}
	
	

	/* Page Functions */
	
	public void createclient(String Clientname,String Pofilename,String website,String description,String contactperson,String email,String address) throws InterruptedException {
		
		//clickmyprojectsLink();
		//clickaddprofileButton();
		enterClientname(Clientname);
		enterprofilename(Pofilename);
		enterWebsite(website);
		selectfrequency();
		checktrackMobileRanking();
		UploadImage();		
		enterdescription(description);
		entercontactperson(contactperson);
		enteremail(email);
		//checkcommacheckbox();
		enteraddress(address);
		selectsitetype();
		clicksaveandnext();
		chooseusergroup();
		saveusergroup();
		choosesearchengine();
		clickSaveAccountManagerbutton();
		clickAddBrandedTermsButton();
		passBrandedTerms();
		SaveBrandedTerm();
		clickAddAliasesButton();
		enterAliase();
		SaveAliases();
		clickConfirmokButton();
		clickoncontinueButton();
		ConfirmClickPopupButton();
		ClickonFinishbutton();
		
		
	}
	
	
	
}
