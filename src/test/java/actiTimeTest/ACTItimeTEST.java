package actiTimeTest;

import java.io.IOException;
import java.time.Duration;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import actiTimeLOGIN.ACTItimeConcrete;
public class ACTItimeTEST {

	public static void main(String[]args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        d.manage().deleteAllCookies();
        d.get("http://localhost/login.do");
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        ACTItimeConcrete a = new ACTItimeConcrete(d);
        a.Actiusername();
        a.Actipassword();
        Thread.sleep(3000);
        a.ActiLogin();
        d.quit();       
	}
}