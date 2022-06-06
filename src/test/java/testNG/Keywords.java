package testNG;

import org.testng.annotations.Test;

public class Keywords {

	// testNG will execte methods according to alphabetic order if priority is not assigned
	@Test
	public void mno() {
		System.out.println("mno is running");
	}
	@Test
	public void abc() {
		System.out.println("abc is running");
	}
	@Test
	public void pqr() {
		System.out.println("pqr is running");
	}
	@Test
	public void xyz() {
		System.out.println("xyz is running");
	}
	@Test
	public void def() {
		System.out.println("def is running");
	}
	
}
