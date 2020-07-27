package digital.flightdeck.common.dataprovider.rss;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import digital.flightdeck.common.csv.CSVDataProvider;

public class RssDataProvider {
	
	@DataProvider(name = "RssElement")
	public static Object[][] getRssElements() throws IOException {
		return CSVDataProvider.getCSVData(System.getProperty("user.dir")+"\\CSV Files\\RssElement.csv"); 
	}
	
	@DataProvider(name = "ValidRssData")
	public static Object[][] getValidRssData() throws IOException {
		return CSVDataProvider.getCSVData(System.getProperty("user.dir")+"\\CSV Files\\ValidRssData.csv"); 
	}
	
	@DataProvider(name = "InValidRssData")
	public static Object[][] getInValidRssData() throws IOException {
		return CSVDataProvider.getCSVData(System.getProperty("user.dir")+"\\CSV Files\\InValidRssData.csv"); 
	}
	
	

}
