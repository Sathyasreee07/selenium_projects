package SwagLabs;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic_utility.BaseClass;
import generic_utility.LoginPage;

public class LogInTest extends BaseClass {
	@Test
    public void loginTest() {

        LoginPage login = new LoginPage(driver);      
        login.enterCredentials("standard_user","secret_sauce" );
        login.clickLogin();
       
    }

}
