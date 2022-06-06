package pomTestClasses;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.ActiTimeHomepage;
import pomClasses.ActiTimeLoginClass;
import practice.ActiTime1;

public class ActiTimeTestingClass {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Nachiket\\Setup\\chromezip\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.get("http://localhost/login.do");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		Thread.sleep(5000);

		ActiTimeLoginClass s = new ActiTimeLoginClass(d);
		s.setActiTimeusernamee();
		s.setActiTimepassword();
		s.verifyActiTimeLoginButton();
		Thread.sleep(5000);


		ActiTimeHomepage a = new ActiTimeHomepage(d);
		a.verifyActiTimeHomepagelogo();
		Thread.sleep(5000);
		a.setActiTimeHomepageAddTask();
		Thread.sleep(5000);
		a.verifyActiTimeHomepageRecentTask();
		Thread.sleep(5000);
		a.verifyActiTimeHomepageAdd();
		Thread.sleep(5000);
		a.verifyActiTimeHomepagelogoutButton();
		
		ActiTime1 x = new ActiTime1(d);
		x.task();
		x.verifyFilterButton();
		x.verifyFilterButton();
		
		d.quit();
	}

}