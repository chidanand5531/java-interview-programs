package oops3;

public class DefaultInterfaceTestc implements DefaultInterfaceTestA,DefaultInterfaceTestB{
	
	
	// use super keyword to call the testing 
    // method of TestA interface
	public void testing() {
		DefaultInterfaceTestA.super.testing();
	}
	
	// use super keyword to call the testing1 
    // method of TestB interface
	public void testing1() {
		DefaultInterfaceTestB.super.testing1();
	}
	

	public static void main(String[] args) {
		
		DefaultInterfaceTestc c=new DefaultInterfaceTestc();
		
		c.testing();
		c.testing1();
	}

}
