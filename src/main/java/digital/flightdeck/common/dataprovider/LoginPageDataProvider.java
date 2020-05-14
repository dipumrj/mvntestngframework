package digital.flightdeck.common.dataprovider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import digital.flightdeck.common.csv.CSVDataProvider;

public class LoginPageDataProvider {

	@DataProvider(name = "validLoginData")
	public static Object[][] getLabelData() throws IOException {
		return CSVDataProvider.getCSVData(System.getProperty("user.dir")+"\\CSV Files\\validLoginData.csv"); 
	}
	
	@DataProvider(name = "createclient")
	public static Object[][] getclientdata() throws IOException {
		return CSVDataProvider.getCSVData(System.getProperty("user.dir")+"\\CSV Files\\createclient.csv"); 
	}
		
		
	

}
