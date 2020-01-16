package oopsAbstraction;

public class Test {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.start();
		System.out.println("no of whhels:- " +c.wheel);
		
		Scooter sc=new Scooter();
		sc.start();
		System.out.println("no of whhels:- " +sc.wheel);
	}

}

//abstaction is detail internal hidding and showing the main/set up services
// By using interface we can achieve 100% abstraction 
// By using abstraction class we can achieve (0 - 100)% abstraction
// A method must be declared abstract in abstract class or it should have concrete method
//if a regular class extends abstract class then it must implement all the abstract methods which are in abstract class
// which means all abstarct methods should be overridden
// we can not create object of abstract class


