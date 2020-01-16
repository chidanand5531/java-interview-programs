package oopscocept2;

public interface UsBank  {
	
	int min_balance=100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
}


//only method declaration
//no method body -- only method prototype
//in Interface we can declare the variable , by dafault variables are static and final in nature
// value of variables can not be changed
// no static method in Interface
//No main method in Interface
//we can not create the object of Interface
//Interface is abstract in nature