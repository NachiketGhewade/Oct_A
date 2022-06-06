package groups;

import org.testng.annotations.Test;
@Test (groups = {"Automation"} )
public class Group5 {
	@Test(groups = {"xyz"} )
	public void l() {
		System.out.println("l is running");
	}
	
	@Test(groups = {"nachi.xyz"} )
	public void m() {
		System.out.println("m is running");
	}
	
	@Test(groups = {"nachi.abcd"} )
	public void n() {
		System.out.println("n is running");
	}

}
