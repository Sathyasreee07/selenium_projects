package WebElementInterrogationMethods;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class weeklyTask2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://icehrmpro.gamonoid.com/login.php");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

		if (driver.getCurrentUrl().contains("dashboard")) {
			System.out.println("Login successfully Dashboard Page Verified");
		} else {
			System.out.println("Dashboard Page Not Verified");
		}

		driver.findElement(By.xpath("//span[.='Employees']")).click();
		driver.findElement(By.cssSelector("[href='https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees']")).click();

		driver.findElement(By.xpath("//span[text()='Filter Employees']")).click();

		WebElement deptDropdown = driver.findElement(By.cssSelector("[aria-owns=\"rc_select_5_list\"]"));
		deptDropdown.click();

		deptDropdown.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,
				Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);

		driver.findElement(By.xpath("//span[text()='Save']")).click();

		List<WebElement> allDept = driver.findElements(By.cssSelector(".ant-list-item-meta-description"));

		if (!allDept.isEmpty()) {

			boolean flag = true;

			for (WebElement dept : allDept) {

				String departmentName = dept.getText();
				System.out.println(dept.getText());

				if (!departmentName.contains("Head Office")) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("department validation status: Pass");
			} else {
				System.out.println("Department validation status: Fail");
			}

		} else {
			System.out.println("No employees in this department");
		}

		driver.findElement(By.xpath("//span[text()='Filter Employees']")).click();

		WebElement s = driver.findElement(By.cssSelector("[aria-owns=\"rc_select_8_list\"]"));
		s.click();

		s.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN,Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER);

		driver.findElement(By.xpath("//span[text()='Save']")).click();

		List<WebElement> allDept2 = driver.findElements(By.cssSelector(".ant-list-item-meta-description"));

		if (!allDept2.isEmpty()) {

			boolean flag2 = true;

			for (WebElement dept : allDept2) {

				String jobName = dept.getText();

				if (!jobName.equals("Marketing Department")) {
					flag2 = false;
					break;
				}
			}

			if (flag2) {
				System.out.println("Job Validation Status: Pass");
			} else {
				System.out.println("Job Validation Status: Fail");
			}

		} else {
			System.out.println("No employees in this job");
		}

		driver.findElement(By.cssSelector(".glyphicon-user")).click();
		driver.findElement(By.linkText("Sign out")).click();

//		driver.quit();

	}

}
