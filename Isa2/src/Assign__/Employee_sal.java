package Assign__;

import java.util.Scanner;
class employee{
  double salary,da,hra,totalsal;
   employee(double s){
   hra=5000;
   da=(s*10)/100;
   totalsal=s+da+hra;
   }
 }
public class Employee_sal {
     public static void main(String[] args) {
         String name,jobtitle;
         double bsal;
         Scanner scan=new Scanner(System.in);
         System.out.println("Roll No: R/BCA-22-126\n");
         System.out.println("Enter name :");
         name=scan.next();
         System.out.println("Enter Basic salary :");
         bsal=scan.nextDouble();
         System.out.println("Enter Job title:");
         jobtitle=scan.next();
         
         employee e=new employee(bsal);
         System.out.println("Basic salary is "+bsal);
         System.out.println("Name is "+name);
         System.out.println("Job title is "+jobtitle);
         System.out.println("Total salary is "+ e.totalsal);
      
    }

     public void calculateTotalSalary() {
 		// TODO Auto-generated method stub
 		
 	}

 	public double getSalary() {
 		// TODO Auto-generated method stub
 		return 0;
 	}

}
