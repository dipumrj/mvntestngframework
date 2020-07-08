package digital.flightdeck.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Element {
	
	
	public static boolean isPresent(WebDriver driver, String locator, String value) {
		if (locator != null)
			locator = locator.toLowerCase();
		boolean isPresent = true;
		try {
			if (locator.contentEquals("xpath")) {
				driver.findElement(By.xpath(value));
			} else if (locator.contentEquals("name")) {
				driver.findElement(By.name(value));
			} else if (locator.contains("id")) {
				driver.findElement(By.id(value));
			} else if (locator.contentEquals("linktext")) {
				driver.findElement(By.linkText(value));
			} else if (locator.contains("cssselector")) {
				driver.findElement(By.cssSelector(value));
			} else if (locator.contentEquals("classname")) {
				driver.findElement(By.className(value));
			} else if (locator.contentEquals("tagname")) {
				driver.findElement(By.tagName(value));
			}

		} catch (Exception NoSuchElementFoundException) {
			isPresent = false;
		}

		return isPresent;

	}

}
