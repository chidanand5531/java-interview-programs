package oops3;

public abstract class Shape {
	
	Shape(){
		System.out.println("shape class constuctor");
	}

	int colour;

	abstract void drawing();

	public void fill() {
		
		System.out.println("fill -- method");
		
	}
}

// can not create object of interface
