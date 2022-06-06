package dataDrivenapproach;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {

	public WebDriver driver;

	@BeforeTest
	public void login() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://stock.scriptinglogic.net/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		WebElement userName = driver.findElement(By.xpath("//input[@id='login-username']"));
		WebElement pass = driver.findElement(By.id("login-password"));
		WebElement btnLogin = driver.findElement(By.name("submit"));

		userName.sendKeys("admin");
		pass.sendKeys("admin");
		btnLogin.click();
	}

	@Test(dataProvider = "getData")
	public void addCustomer(String name, String address,String contact1,String contact2) {
		driver.findElement(By.xpath("//a[contains(text(),'Add Customer')]")).click();

		WebElement customerName = driver.findElement(By.xpath("//input[@id='name']"));
		customerName.sendKeys("name");
		WebElement custAddress = driver.findElement(By.name("address"));
		custAddress.sendKeys("xyss");
		WebElement custContact1 = driver.findElement(By.xpath("//input[@id='buyingrate']"));
		custContact1.sendKeys("anbs12345");
		WebElement custContact2 = driver.findElement(By.xpath("//input[@id='sellingrate']"));
		custContact2.sendKeys("bhsk123456");

		WebElement btnAdd = driver.findElement(By.name("Submit"));
		btnAdd.click();
	}

@org.testng.annotations.DataProvider
	public Object[][] getData() throws IOException {
		FileInputStream fp = new FileInputStream("./Data/ExcelSheet1.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fp);

		XSSFSheet sheet = workbook.getSheet("sheet1");

		int rowCount = sheet.getPhysicalNumberOfRows();

		Object[][] data = new Object[rowCount - 1][4];

		for (int i = 0; i < rowCount - 1; i++) {

			XSSFRow row = sheet.getRow(i + 1);

			for (int j = 0; j < 4; j++) {

				XSSFCell cell = row.getCell(j);
				data[i][j] = cell.toString().trim();

			}

		}
		return data;

	}

	@AfterTest
	public void tearDown() {

		driver.close();
	}
}
