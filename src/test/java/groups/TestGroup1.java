package groups;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listener.testngListnerMethod.class)
public class TestGroup1 {
	
	@Test(groups = {"abcd"} )
	public void m() {
		System.out.println("m is running");
	}
	
	@Test(groups = {"xyz"} )
	public void n() {
		System.out.println("n is running");
	}
	
	@Test(groups = {"abcd"," xyz" } )
	public void o() {
		System.out.println("o is running");
	}
	
	@Test(groups = {"xyz"} )
	public void p() {
		System.out.println("p is running");
	}
	
	@Test(groups = {"xyz"} )
	public void q() {
		System.out.println("q is running");
	}

}
