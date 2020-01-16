package oopscocept2;

public class BMW extends Car {  // has a reletionship
	
	// when same method is present in parent class as well as child class with the same name and same 
	//number of arguments is called method overriding
	
	public void start() { // overridden method
		System.out.println("BMW----start");
	}
	
	public void theftsafty() {
		System.out.println("BMW----theftsafty");
	}

}
