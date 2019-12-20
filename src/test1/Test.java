package test1;

import accesSpecifiers.PackageDemo;
import accesSpecifiers.ProtectedDemo;

public class Test  extends PackageDemo{

	public Test(int a, int b) {
		super(a, b);
		
	}

	public static void main(String[] args) {
		
		PackageDemo obj=new PackageDemo(10,40);
		
		//Test  obj3=new Test(100,200);
		 System.out.println(obj.a+" "+ obj.b);
	}
}
 