package oopscocept2;

public class B extends A {
	
	public B() {
		
		//super keyword is used to call parent class constructor just super(); it will call default 
		// super keyword should be written in child class
		//if u wnat to call  one parameterized constructor pass value ie - super(10);
		////if u wnat to call two parameterized constructor pass value ie - super(10,20);
		super(10);
		System.out.println("child class constuctor");
	}
	
	public static void main(String[] args) {
		B obj=new B();
	}

}
