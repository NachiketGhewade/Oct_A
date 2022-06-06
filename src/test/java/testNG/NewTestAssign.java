package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class NewTestAssign {
	WebDriver d ;
	WebDriver e ;
	
	@BeforeClass
	public void chrome() {
		System.setProperty("webdriver.chrome.driver", "F:\\Nachiket\\Setup\\chromezip\\chromedriver_win32\\chromedriver.exe");
		d= new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("http://localhost/login.do");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				
	}
	@Test(priority=2 , invocationCount = 1)
	public void title() {
		String actiTitle=d.getTitle();
		System.out.println(actiTitle);
	}

	@AfterClass
	public void chromeTerminate() {
		d.quit();
	}
	
	
	@BeforeMethod
	public void EdgeBrowserLaunch() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\Nachiket\\Setup\\microsoftedge\\edgedriver_win64\\msedgedriver.exe");
		e= new EdgeDriver();
		e.manage().window().maximize();
		e.manage().deleteAllCookies();
		e.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		
		
	}
	@Test(priority=1, invocationCount=1)
	public void url() {
		String fb = e.getCurrentUrl();
		System.out.println(fb);
	}

	@AfterMethod
	public void EdgeBrowserTerminate() {
		e.quit();
	}

}
