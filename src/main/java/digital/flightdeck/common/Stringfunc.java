package digital.flightdeck.common;

import org.openqa.selenium.Keys;

public class Stringfunc

{
	
	public static String SplitInNewline(String value)
	{
		//String myText = "first line\nsecond line";
		value = value.replace("\n", Keys.chord(Keys.SHIFT, Keys.ENTER));
		return value;
		//myElement.sendKeys(myText)
	}
}