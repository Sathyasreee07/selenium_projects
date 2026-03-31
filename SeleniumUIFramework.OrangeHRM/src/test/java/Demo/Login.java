package Demo;

import org.testng.annotations.Test;

import com.orangehrm.sleniumuiframework.generic_utility.BaseClass;
import com.orangehrm.sleniumuiframework.object_repository.LoginPage;

public class Login extends BaseClass {
	LoginPage lp=new LoginPage(driver);
	@Test
	public void addVacancy() {
		
		lp.login("Admin","admin123");

		
	}


	
}
