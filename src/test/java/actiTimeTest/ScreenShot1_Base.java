package actiTimeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot1_Base {

	public static WebDriver driver;
	Properties prop;
	public ScreenShot1_Base() throws IOException {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("F:\\Nachiket\\Setup\\Eclipse_2021_09\\"
				+ "EclipsWorkspace_2021_09\\Oct_A\\config.properties");
		prop.load(ip);
	}
	
	public void initialization() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void takeSS(String testMethodName) {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(srcFile,
					new File("F:\\Nachiket\\Setup\\Eclipse_2021_09\\EclipsWorkspace_2021_09\\"
							+ "Oct_A\\Screenshots\\"+ testMethodName +".png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
