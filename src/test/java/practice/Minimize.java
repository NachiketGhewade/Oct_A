package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Minimize {
	//this program just for checking whether minimize method is working or not
	

	public static WebDriver driver;


	public static void main (String []args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();

		driver.get("https://mvnrepository.com/search?q=webdrivermanager");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().minimize();


	}

}
