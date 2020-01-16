package oopscocept2;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(UsBank.min_balance);// interface variables static in nature , called by class name
		
		hsbcBank hb = new hsbcBank();
		hb.credit();
		hb.debit();
		hb.transferMoney();
		hb.educationLoan();
		hb.CarLoan();
		
		// dynamic ploymorphism:
		// child class object can be referred by parent intreface variable
		//only overridden method will be accesed
		UsBank hs = new hsbcBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();

	}

}