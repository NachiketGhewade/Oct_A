package groups;

import org.testng.annotations.Test;

public class Group4 {
	@Test(groups = {"xyz"} )
	public void x() {
		System.out.println("x is running");
	}
	
	@Test(groups = {"nachi.xyz"} )
	public void y() {
		System.out.println("y is running");
	}
	
	@Test(groups = {"nachi.abcd"} )
	public void z() {
		System.out.println("z is running");
	}
}
