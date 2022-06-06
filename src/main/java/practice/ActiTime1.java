package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTime1 {
	//declaration
	@FindBy(xpath="(//img[@height='93'])[4]")
	private WebElement tasks;
	
	@FindBy(xpath="//input[@name='visiableFilterString']")
	private WebElement filter;
	
	@FindBy(xpath="//input[@name='searchTasks']")
	private WebElement apply;
	WebDriver d;
	
	//initialization
	public ActiTime1(WebDriver d) {
		PageFactory.initElements(d, this);	
	}
	
	public void task() {
		System.out.println("click on tasks");
		tasks.click();
	}

	public void verifyfiltersEnable() {
		boolean val =filter.isEnabled();
		if(val==true) {
			System.out.println("filter input field is enable"+" test scenario pass");
		}
		else {
			System.out.println("filter input field is disabled"+ " test scenario failed");
		}
		filter.sendKeys("ToDoe's for today");
	}
	public void verifyFilterButton() {
		System.out.println("clicking on apply filter button");
		apply.click();
	}
}
