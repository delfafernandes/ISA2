package Assign__;

public class Students_dtl {

	private String name;
	private int age;
	private String address;
	public Students_dtl() {
	this.name = "unknown";
	this.age = 0;
	this.address = "not available";
	}
	// First setInfo method
	public void setInfo(String name, int age) {
	this.name = name;
	this.age = age;
	}
	// Second setInfo method
	public void setInfo(String name, int age, String address) {
	this.name = name;
	this.age = age;
	this.address = address;
	}
	@Override
	public String toString() {
	return "Name: " + name + " Age: " + age + ", Address: " + address;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Using array of objects
		Students_dtl[] students = new Students_dtl[3];
		// Create instances and set their values
		System.out.println("Roll No: R/BCA-22-126\n");
		students[0] = new Students_dtl();
		students[0].setInfo("Mika",28);
		students[1] = new Students_dtl();
		students[1].setInfo("Lea",17, "Raia");
		students[2] = new Students_dtl();
		students[2].setInfo("Rajdhir",26,"Margoa");
		

		// Print the name, age, and address of the 3 students
		for (int i = 0; i < 3; i++) {
		System.out.println(students[i]);
		}
	}

}

