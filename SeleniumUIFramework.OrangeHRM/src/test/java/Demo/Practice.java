package Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Practice {
	@Test
	public void readData() throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/OrangeHRM_CommonData/OrangeHRM_CommonData");
		Properties prop=new Properties();
		
		prop.load(fis);
		String URL=prop.getProperty("url");
		String browser=prop.getProperty("browser");
		String validUserName=prop.getProperty("username");
		String validPassword=prop.getProperty("password");
		
		System.out.println("The default broswer for testing is: " + browser);
		System.out.println("The Url of the application for testing is: " + URL);
		System.out.println("The Valid  user name: " + validUserName);
		System.out.println("The Valid password for the apllication is: " + validPassword);
		
		FileOutputStream fos=new FileOutputStream("./src/test/resources/OrangeHRM_CommonData/OrangeHRM_CommonData");
		prop.setProperty("CandidateName", "Thor");
		prop.store(fos,null);

		
		
		
	}

}
