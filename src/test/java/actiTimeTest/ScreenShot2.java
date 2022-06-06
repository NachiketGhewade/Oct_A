package actiTimeTest;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ScreenShot_Listeners.class)
public class ScreenShot2 extends ScreenShot1_Base {

	
	
	public ScreenShot2() throws IOException {
		super();

	}

	@BeforeMethod
	public void setUp() {
		
	initialization();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void SS() {
		Assert.assertEquals(false, true);
	}
	@Test
	public void SS1() {
		Assert.assertEquals(false, true);
		
	}
	@Test
	public void SS2() {
		Assert.assertEquals(false, true);
	}
	
}
