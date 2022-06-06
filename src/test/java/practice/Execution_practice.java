package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution_practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("http://localhost/login.do");
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		ActiTimeLoginClass q = new ActiTimeLoginClass(d);
		q.setActiTimeusernamee();
		q.setActiTimepassword();
		q.verifyActiTimeLoginButton();
		
		ActiTime1  w = new ActiTime1(d);
		w.task();
		w.verifyfiltersEnable();
		w.verifyFilterButton();
		
		d.quit();
		

	}

}
