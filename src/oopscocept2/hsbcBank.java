package oopscocept2;

public class hsbcBank extends Finance implements UsBank, BrazilBank { // we are achieving multiple inheritance " is a relationship"

	// combination single class and multiple interfaces are allowed  but multiple classes are not allowe
	// if a class is implementing any interface then it is mandatory to
	// define/overide all the
	// methods of parent Interface
	
	//overridding from UsBank
	public void credit() {
		System.out.println("HSBC credit ");
	}

	public void debit() {
		System.out.println("HSBC debit");
	}

	public void transferMoney() {
		System.out.println("HSBC transferMoney");
	}
	
	//seperate methods of hsbcBank
	public void educationLoan() {
		System.out.println("HSBC educationLoan");
	}

	public void CarLoan() {
		System.out.println("HSBC carLoan");

	}

	// overridding of BrazilBank:
	public void mutualFund() {
		System.out.println("BrazilBank mutual Fund");
	}

	public void invest() {
		System.out.println("BrazilBank investment");
	}
	
	//public void stock(){
	//	System.out.println();
	//}

}
