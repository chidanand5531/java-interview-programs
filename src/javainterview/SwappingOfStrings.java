package javainterview;

public class SwappingOfStrings {

	public static void main(String[] args) {

		//1. with using third variable
		// we cant swap two string but we can swap there references

		String x = "selenium";
		String y = "Automation";
		String temp = "";

//		System.out.println("Before swaping x:- " + x);
//		System.out.println("Before swaping y:- " + y);
//
//		temp = x;
//		x = y;
//		y = temp;
//
//		System.out.println("After swaping x:- " + x);
//		System.out.println("After swaping y:- " + y);

		System.out.println("************");
		
		//2. withot using third variable
		
		System.out.println("Before swaping x:- " + x);
		System.out.println("Before swaping y:- " + y);

		x = x + y; // seleniumAutomation

		y = x.substring(0 ,    x.length() - y.length()); // to store initial string x in string b

		x = x.substring(y.length()); // to store initial string y in string x
		
		
		System.out.println("After swaping x:- " + x);
		System.out.println("After swaping y:- " + y);
	}

}
