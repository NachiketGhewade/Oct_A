package testNG;

import org.testng.annotations.Test;

public class Keywords1 {

	//if priority is given it will execute in that order but suppose if priority is not
	//given to some methods those methods will execute first according to alphabetical order then it will follow priority
	
@Test
public void xyz () {
	System.out.println("xyz is running");
}

@Test(priority=2)
public void pqr() {
	System.out.println("pqr is running");	
}

@Test(priority=11)
public void lmn() {
	System.out.println("lmn is running");	
}

@Test(priority=11)
public void stu() {
	System.out.println("stu is running");	
}


}
