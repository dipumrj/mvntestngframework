package digital.flightdeck.common;
import digital.flightdeck.common.Syncwait;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxUtility {
	
	public  static void checkSpecifiedNumberOfCheckbox(WebDriver driver,List<WebElement> checkbox,int numberofcheck) throws InterruptedException
	{
		int size=checkbox.size();
		int deduceby;
		deduceby=size-numberofcheck+1;
		
			if(size>0)
			{
				//-3 to check except last two checkboxes
				for(int i=0;i<=size-deduceby;i++)
		        {
					checkbox.get(i).click();
					Syncwait.Syncwaitfor(driver, 2000);
		        }
			}	
	}
}
