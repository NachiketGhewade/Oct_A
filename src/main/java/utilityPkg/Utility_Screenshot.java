package utilityPkg;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility_Screenshot {
	
	// change name of screenshot every time whenever you want to use this utility class 
	
	WebDriver d ;
	String store = "F:\\notes\\AUTOMATION TESTING\\New folder\\screenshot.png";
		
	public void ss() throws IOException {
		File dest = new File(store);
		File src = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(dest, src);
		
	}
	
	public void ss_webelement() throws IOException {
		WebElement insta = d.findElement(By.xpath("//h1"));
		File source =insta.getScreenshotAs(OutputType.FILE);//((takesscreenshot)d).getscreenshotas(outputtype.FILE)
		File destination = new File(store);
		FileHandler.copy(source, destination);
	}
	
	public static void main(String[] args) {
		
		System.out.println();
	}

}
