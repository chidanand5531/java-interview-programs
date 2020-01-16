package oopscocept2;

public class ConstructorWithThiskeyword {
	
	//class or global variables this keyword is used to refer current class variable
	// if there is ambiguity between global/class variables and paramaeters this keyword is used
	String name;
	int age;
	
	public ConstructorWithThiskeyword(String name, int age) {
	
		this.name=name;
		this.age=age;
		
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		
		ConstructorWithThiskeyword obj=new ConstructorWithThiskeyword("tom", 24);
	}

}
