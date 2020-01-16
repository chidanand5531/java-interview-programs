package oopsAbstraction;

public class Company {

	public static void main(String[] args) {

		Encapsulation_Employee emp = new Encapsulation_Employee();

		emp.setEmployeeId(100);
		System.out.println(emp.getEmployeeId());
		
		emp.setEmployeeName("aravind");
		System.out.println(emp.getEmployeeName());
	}

}
