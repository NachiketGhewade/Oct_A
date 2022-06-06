package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeHomepage {
	@FindBy(xpath="//img[@width='179']")
	private WebElement logo;
	
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logout;
	
	@FindBy(xpath="//input[@class='taskSearchField']")	
	private WebElement AddTask;
	
	@FindBy(xpath="//span[text()='Add Recent Task']")
	private WebElement RecentTask;
	
	@FindBy(xpath="//span[text()='Add Tasks from the List']")
	private WebElement Add;

	WebDriver d;


	public ActiTimeHomepage(WebDriver d) {
		PageFactory.initElements(d, this);
//		this.d = d;
//		logo = d.findElement(By.xpath("//img[@width='179']"));
//		AddTask=d.findElement(By.xpath("//input[@class='taskSearchField']"));
//		RecentTask= d.findElement(By.xpath("//span[text()='Add Recent Task']"));
//		Add=d.findElement(By.xpath("//span[text()='Add Tasks from the List']"));
//		logout = d.findElement(By.xpath("//a[@id='logoutLink']"));

	}

	public void verifyActiTimeHomepagelogo() {
		boolean result = logo.isDisplayed();
		if (result == true) {
			System.out.println("the given scenario pass and result="+ result);
		}
		else {
			System.out.println("the given scenario fails and check with dev"+ result);
		}	
	}
	public void setActiTimeHomepageAddTask() {
		boolean check = AddTask.isEnabled();
		if(check == true) {
			System.out.println("test case is pass");	
		}
		else {
			System.out.println("test case is fail");
		}
		AddTask.sendKeys("automation");
	}
	public void verifyActiTimeHomepageRecentTask() {
		RecentTask.click();
		
	}
	public void verifyActiTimeHomepageAdd() {
		Add.click();
		
	}
	public void verifyActiTimeHomepagelogoutButton() {
		logout.click();
	} 

}
