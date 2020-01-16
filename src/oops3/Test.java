package oops3;

public class Test extends Shape {
	
	Test(){
		System.out.println("test class constructor");
	}

	public static void main(String[] args) {
		
//		Shape s=new Test();
//		s.drawing();
//		s.fill();
		
		Test test=new  Test(); // we can also write like this (new test();) for constructor
	}

	@Override
	void drawing() {

		System.out.println("test drawing");
		
	}

}
