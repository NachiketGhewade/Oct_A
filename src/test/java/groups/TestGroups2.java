package groups;

import org.testng.annotations.Test;

public class TestGroups2 {
	@Test(groups = {"xyz"})
	public void a() {
		System.out.println("a is running");

	}
	
	@Test(groups = {"abcd","xyz"})
	public void b() {
		System.out.println("b is running");

	}
	
	@Test(groups = {"abcd"})
	public void c() {
		System.out.println("c is running");
	}

}
