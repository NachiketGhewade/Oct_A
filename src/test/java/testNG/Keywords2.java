package testNG;

import org.testng.annotations.Test;

public class Keywords2 {
	
	
@Test(invocationCount=5 , priority=3)
public void xyz () {
	System.out.println("xyz is running");
}

@Test(priority=2)
public void pqr() {
	System.out.println("pqr is running");	
}

@Test(priority=11 , dependsOnMethods= {"pqr"})
public void lmn() {
	System.out.println("lmn is running");	
}

@Test(priority=11)
public void stu() {
	System.out.println("stu is running");	
}

}
