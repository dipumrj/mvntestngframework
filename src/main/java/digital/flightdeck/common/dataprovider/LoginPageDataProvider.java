package digital.flightdeck.common.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import digital.flightdeck.common.csv.CSVDataProvider;

public class LoginPageDataProvider {

	@DataProvider(name = "validLoginData")
	public static Object[][] getLabelData() throws IOException {
		return CSVDataProvider.getCSVData(System.getProperty("user.dir")+"\\CSV Files\\validLoginData.csv"); 
	}
	
//	@DataProvider(name = "ValidRssData")
//	public static Object[][] getValidRssData() throws IOException {
//		return CSVDataProvider.getCSVData(System.getProperty("user.dir")+"\\CSV Files\\ValidRssData.csv"); 
//	}
//	
//	@DataProvider(name = "InValidRssData")
//	public static Object[][] getInValidRssData() throws IOException {
//		return CSVDataProvider.getCSVData(System.getProperty("user.dir")+"\\CSV Files\\InValidRssData.csv"); 
//	}
//	

}
