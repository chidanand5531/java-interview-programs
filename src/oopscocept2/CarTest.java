package oopscocept2;

public class CarTest {

	public static void main(String[] args) {
		
		BMW b =new BMW();
		b.start();// static polymorphism---compile time polymorphism
					//(preference will be given to child class) one to many
		b.stop();
		b.refuel();
		b.theftsafty();
		b.engine();
		System.out.println("*********");
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		System.out.println("*********");
		
		//top casting
		Car c1=new BMW();//child class object can be referred by parent class reference 
						//variable is called dynamic polymorphism or run time polymorphism
		c1.start(); //-----> preference will be given overridden method
		c1.stop();
		c1.refuel();
		//c1.theftsafty(); -----> 
		
		//downncasting
		BMW b1=(BMW)new Car(); //java.lang.ClassCastException: oopscocept2.Car cannot be cast to oopscocept2.BMW
	}

}
