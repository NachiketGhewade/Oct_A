package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ann {
	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.out.println("launching browser");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.google.com");
		System.out.println("launching into browser successfull");
	}

	@BeforeMethod
	public void loginApplication() {
		System.out.println("login inti application is succesfull");
	}
	
	@Test
	public void actualTestCaseExecution() {
		System.out.println("testing of application");
	}

	
	@AfterMethod
	public void LogoutFromApplication() {
		System.out.println("logging out of application");
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.close();
		System.out.println("closing browser");
	}
	
//	@AfterSuite
//	public void mainTearDown() {
//		driver.quit();
//	}
	
	
	
}
