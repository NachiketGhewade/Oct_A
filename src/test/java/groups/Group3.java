package groups;

import org.testng.annotations.Test;
@Test(groups = {"Automation"} )
public class Group3 {


	@Test(groups = {"nachi.abcd"} )
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
	
	@Test(groups = {"nachi.xyz"} )
	public void q() {
		System.out.println("q is running");
	}

}
