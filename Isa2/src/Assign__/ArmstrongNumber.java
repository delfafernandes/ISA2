package Assign__;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in); 
		System.out.println("Roll No: R/BCA-22-126");
		System.out.println();
        System.out.println("Enter a number"); 
        int number =scan.nextInt();// Change this to the number you want to check
        if (isArmstrong(number)) 
        {
            System.out.println(number + " is an Armstrong number.");
        } 
        else
        {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNumber = num;
        int result = 0;
        int n = String.valueOf(num).length();

        while (num != 0)
        {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }

        return result == originalNumber;

	}

}
