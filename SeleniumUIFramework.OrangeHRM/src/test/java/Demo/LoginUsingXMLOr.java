package Demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

@Test
public class LoginUsingXMLOr {

	public void login() throws SAXException, IOException, ParserConfigurationException {
        // Read XML file
        Document file = DocumentBuilderFactory.newInstance()
                .newDocumentBuilder()
                .parse(new File("./src/main/resources/DemoObjectRepository/LoginPage.xml"));

        // Fetch locators
        String username = file.getElementsByTagName("UsernameField").item(0).getTextContent();
        String password = file.getElementsByTagName("PasswordField").item(0).getTextContent();
        String loginbutton = file.getElementsByTagName("loginbtn").item(0).getTextContent();
        
        //splitting the locator and value
        String userLoc=username.split(":")[0];
        String userLocValue=username.split(":")[1];
        
        String passLoc=password.split(":")[0];
        String passLocValue=password.split(":")[1];

        String loginBtnLoc=loginbutton.split(":")[0];
        String loginBtnLocValue=loginbutton.split(":")[1];
        
        WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//username
		if(userLoc.equals("name")) {
			driver.findElement(By.name(userLocValue)).sendKeys("Admin");
		}
		// password
		if(passLoc.equals("name")) {
			driver.findElement(By.name(passLocValue)).sendKeys("admin123");
		}
		// login button
		if(loginBtnLoc.equals("cssSelector")) {
			driver.findElement(By.cssSelector(loginBtnLocValue)).click();
		}
        

	}

}
