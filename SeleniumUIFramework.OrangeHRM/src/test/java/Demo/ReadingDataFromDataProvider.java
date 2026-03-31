package Demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingDataFromDataProvider {
	@DataProvider(name="SampleData")
	public Object[][] getdata(){
		return new Object[][] {
			{"browser","chrome","firefox"},
			{"username","Admin","1"},
			{"password","admin123","2"},
			
		};
	}
	
	@Test(dataProvider="SampleData")
	public void readingFromDataProvider(String key,String value,String data) {
		System.out.println("key = "+key + ", Value = "+value + ", Data = "+data);
	}

}
