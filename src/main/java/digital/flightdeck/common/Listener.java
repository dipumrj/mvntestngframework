package digital.flightdeck.common;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import com.google.common.io.Files;

public class Listener implements ITestListener	 {
	public WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {
		System.out.print("Started Tescase:\t"+ result.getName()+"\n" );
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.print("Successful Testcase :\t"+ result.getName()+"\n");
		
	}

	@Override
	//Screen shot failed web page and method name
	public void onTestFailure(ITestResult result) {
		//Get driver from ATTRIBUTE
		driver=(WebDriver) result.getAttribute("ATTRIBUTE");
//		System.out.println("Attribute value:- "+ driver );
	System.out.println("Failed Testcase:\t"+result.getName()+"\n");
		String methodName = result.getName();
      if(!result.isSuccess()){	  
    	  TakesScreenshot scrShot =((TakesScreenshot)driver);
    	    File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);   	        
         try {
            String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath() + "/Screenshots";
             File destFile = new File((String) reportDirectory+"/failure_screenshots/"+methodName+".png");
             FileUtils.copyFile(SrcFile, destFile);
             Reporter.log("<a href='"+ destFile.getAbsolutePath() + "'> <img src='"+ destFile.getAbsolutePath() + "' height='100' width='100'/> </a>");
            } catch (IOException e) {
             e.printStackTrace();
         }
     }
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
