package actiTimeLOGIN;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class ACTItimeConcrete extends ACTItimeLOGINPage{
		private WebElement un;
		private WebElement pass;
		private WebElement loginbutton;
		WebDriver d ;
		String p = "F:\\notes\\AUTOMATION TESTING\\ExcelSheet1.xlsx";

		public ACTItimeConcrete(WebDriver d) {
			this.d = d ;
			un = d.findElement(By.xpath("(//input[@type='text'])[1]"));
			pass =d.findElement(By.xpath("//input[@name='pwd']"));
			loginbutton =d.findElement(By.xpath("//a[@class='initial']"));
		}

		public void Actiusername() throws EncryptedDocumentException, IOException {


			FileInputStream f = new FileInputStream(p);
			String user = WorkbookFactory.create(f).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
			un.sendKeys(user);

		}

		public void Actipassword() throws EncryptedDocumentException, IOException  {

			FileInputStream f = new FileInputStream(p);
			String pwd = WorkbookFactory.create(f).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
			pass.sendKeys(pwd);

		}

		public void ActiLogin() {

			loginbutton.click();

		}
}
