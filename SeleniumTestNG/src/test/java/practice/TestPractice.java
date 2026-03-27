package practice;

import org.testng.annotations.Test;

public class TestPractice {
	@Test
	public void loginTest() {
		System.out.println("Executing TestMethod1");
		
	}
	@Test(dependsOnMethods="loginTest")
	public void logoutTest() {
		System.out.println("Executing TestMethod2");
	}
}
