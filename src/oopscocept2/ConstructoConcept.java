package oopscocept2;

public class ConstructoConcept {

	// constructor is a class entity which is used to define some class features
	// while creating the object
	// constructor name should be same as Classname
	// constructor will not return any value ( no static no void)
	// constuctor can be overloaded
	
	public ConstructoConcept() {
		System.out.println("default constuctor");
	}

	public ConstructoConcept(int i) {
		System.out.println("single parameter constuctor");
		System.out.println("the value of i is "+i);
	}

	public ConstructoConcept(int i, int j) {
		System.out.println("two parameter constuctor");
		System.out.println("the value of i is "+i);
		System.out.println("the value of j is "+j);
	}
	

	public static void main(String[] args) {

		ConstructoConcept obj=new ConstructoConcept();
		ConstructoConcept obj1=new ConstructoConcept(10);
		ConstructoConcept obj2=new ConstructoConcept(10,20);
		
	}

}
