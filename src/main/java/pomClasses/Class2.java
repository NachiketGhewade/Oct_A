package pomClasses;

public class Class2 extends Class1 {

	void m3() {
		System.out.println("abstract method m3");
	}

	protected void m4() {
		System.out.println("abstract method m4");
	}

	public static void main(String[] args) {
      m2();
     
      Class2 c = new Class2();
      c.m1();
      c.m3();
      c.m4();
	}
}
