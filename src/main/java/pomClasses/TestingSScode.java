package pomClasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingSScode {
	WebDriver driver;

	public void screenshot() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele = driver.findElement(By.xpath("//img[@id='hplogo']"));
		File source = ele.getScreenshotAs(OutputType.FILE);
		File dest = new File("F:\\Nachiket\\Setup\\Eclipse_2021_09\\EclipsWorkspace_2021_09\\Oct_A\\Screenshots\\sd.png");
		try {
			FileHandler.copy(source, dest);
		} catch (Exception e) {
			e.printStackTrace();
		}

		driver.quit();

	}

	public static void main(String[] args) {
		TestingSScode ts = new TestingSScode();
		ts.screenshot();
	}
}
