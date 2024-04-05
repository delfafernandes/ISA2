package Assign__;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int n = 10; // Change this to the number of Fibonacci numbers you want to generate
		Scanner scan =new Scanner(System.in); 
		System.out.println("Roll No: R/BCA-22-126");
		System.out.println();
        System.out.println("Enter a number"); 
        int n =scan.nextInt();
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) 
        {
        if (n <= 1) {
            return n;
        } 
        else
        {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
	}

}

