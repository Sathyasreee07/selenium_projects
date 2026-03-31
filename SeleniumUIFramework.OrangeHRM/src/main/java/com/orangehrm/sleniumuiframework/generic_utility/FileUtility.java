package com.orangehrm.sleniumuiframework.generic_utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUtility {
	FileInputStream fis;
	FileOutputStream fos;
	Properties prop;
	
	// Read
	public String getPropertKeyValue(String key) throws IOException {
		fis=new FileInputStream("./src/test/resources/OrangeHRM_CommonData/commondata.properties");
		prop = new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;
	}
	// write
	public void setPropertyPair(String key,String value) throws IOException {
		prop = new Properties();
		fos=new FileOutputStream("./src/test/resources/OrangeHRM_CommonData/write.properties");
		prop.setProperty(key,value);
		prop.store(fos,"Updated common data");
		fos.close();
	}
}
