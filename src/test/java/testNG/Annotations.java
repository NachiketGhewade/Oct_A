package testNG;

import org.testng.annotations.Test;
import pomClasses.ActiTimeHomepage;
import pomClasses.ActiTimeLoginClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Annotations {
	WebDriver d;
	ActiTimeLoginClass m ;
	ActiTimeHomepage n;

	@BeforeClass
	public void openBrowser() throws InterruptedException {
		System.out.println("Browser opening");
		System.setProperty("webdriver.chrome.driver", "F:\\Nachiket\\Setup\\chromezip\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("http://localhost/login.do");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Thread.sleep(5000);
		m = new ActiTimeLoginClass(d);
		n = new ActiTimeHomepage(d);
		System.out.println("Browser opened successfully");
	}


	@BeforeMethod
	public void actilogin() {
		System.out.println("logging into actitime application");
		m.setActiTimeusernamee();
		m.setActiTimepassword();
		m.verifyActiTimeLoginButton();
		System.out.println("logged into application successfully");
	}

	@Test
	public void verifylogo() {
		System.out.println("Verifying logo is displayed or not");
		n.verifyActiTimeHomepagelogo();
		System.out.println("logo verified successfully");
	}


	@AfterMethod
	public void actilogout() {
		System.out.println("logging out of actitime application");
		n.verifyActiTimeHomepagelogoutButton();
		System.out.println("logout of application successfully");
	}


	@AfterClass
	public void closeBrowser() {
		System.out.println("closing browser");
		d.quit();
		System.out.println("Browser closed successfully");
	} 


}
