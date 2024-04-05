package Assign__;
import java.util.Scanner;

class Teachers {
	protected String type;
	public void Teaches() {
	System.out.println("The teacher is teaching.");
	}
	}
	class TeacherTeaches extends Teachers {
	private String name;
	public void Subjects(String subject) {
	System.out.println("The teacher " + name + " is teaching " + subject + ".");
	}
	// Setter for name
	public void setName(String name) {
	this.name = name;
	}
	// Getter for name
	public String getName() {
	return name;
	}
	}


public class Teacher_Quali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		TeacherTeaches teacher = new TeacherTeaches();
		System.out.println("Roll No: R/BCA-22-126\n");
		System.out.print("Enter the teacher's name: ");
		String name = scan.nextLine();
		teacher.setName(name);
		System.out.print("Enter the subject the teacher is teaching: ");
		String subject = scan.nextLine();
		teacher.Subjects(subject);
		scan.close();
	}


	}

