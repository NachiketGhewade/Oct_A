package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginClass {
	//declaration 
	@FindBy(xpath="//input[@id='username']")
	private WebElement un;
	
	@FindBy(xpath="//input[@class='textField pwdfield']")
	private WebElement pass;
	
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement login;
	WebDriver d;
	
	//initialization
	public ActiTimeLoginClass(WebDriver d) {
		
		PageFactory.initElements(d, this);
//		this.d = d;
//	un = d.findElement(By.xpath("(//input[@class='textField'])[1]"));
//    pass = d.findElement(By.xpath("//input[@class='textField pwdfield']"));
//	login = d.findElement(By.xpath("//a[@id='loginButton']"));
	}	
	
	//usage
	public void setActiTimeusernamee() {
		un.sendKeys("admin");
	}
	public void setActiTimepassword() {
		pass.sendKeys("manager");
	}
	public void verifyActiTimeLoginButton() {
		login.click();
	}

}
