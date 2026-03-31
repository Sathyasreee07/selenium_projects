package Demo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.testng.annotations.Test;

public class ReadingDataFromCsvFile {
	@Test
	public void readCsvData() throws FileNotFoundException {
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\sathy\\eclipse-workspace\\seleniumTraining\\SeleniumUIFramework.OrangeHRM\\src\\test\\resources\\OrangeHRM_TestScriptData\\OrangeHRM_Recurtment_Vacancy_TestData\\sample.csv"));
	}
}
