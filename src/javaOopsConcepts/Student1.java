package javaOopsConcepts;

public class Student1 {
	int id;
	String name;
	AggreAddres address;

	Student1(int id, String name, AggreAddres address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	void disp() {
		System.out.println(id + " " + name);
		System.out.println(address.area + " " + address.street + " " + address.zipcode);
	}

	public static void main(String[] args) {
		AggreAddres obj = new AggreAddres("whitefield", "street1", 560065);
		Student1 st = new Student1(100, "arun", obj);
		st.disp();
		
		AggreAddres obj2=new AggreAddres("marathhalli","munekolal",560037);
		Student1 st1 = new Student1(101, "raj", obj2);
		st1.disp();

	}

}
