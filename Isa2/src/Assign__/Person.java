package Assign__;

public class Person {
	
	private String name;
	private int age;
	//constructor
	public Person() {
	}
	//set methods
	public void setName(String name) {
	this.name=name;
	}
	public void setAge(int age) {
	this.age=age;
	}
	//Gather methods
	public String getName() {
	return name;
	}
	public int getAge() {
	return age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create two instances of the preson class
		Person P1=new Person();
		Person P2=new Person();
		//setting attributes
		P1.setName("Siya");
		P1.setAge(23);
		P2.setName("Saran");
		P2.setAge(24);
		System.out.println("Roll No: R/BCA-22-126");
		System.out.println();
		System.out.println(P1.getName()+ " is "+P1.getAge()+ "years old");
		System.out.println(P2.getName()+ " is "+P2.getAge()+ "years old");
		}
		
	}

