package Assign__;

import java.util.Scanner;

public class Factorial {

	
    public static void main(String[] args) {
    	Scanner scan =new Scanner(System.in);
    	System.out.println("Roll No: R/BCA-22-126");
    	System.out.println();
    	System.out.println("Enter number"); 
        int number=scan.nextInt();  // Change this to any number for which you want to find the factorial
        long factorial = findFactorial(number);
        System.out.println("Factorial of " + number + " = " + factorial);
    }

    public static long findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Factorial of 0 and 1 is 1
        } else {
            return n * findFactorial(n - 1); // Recursive call to find factorial
        }
    }
}

