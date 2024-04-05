package Assign__;

public class CountNo_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1235845; // Change this to the integer for which you want to count digits
        int count = countDigits(number);
        System.out.println("Roll No: R/BCA-22-126");
        System.out.println();
        System.out.println("Number of digits in " + number + " = " + count);
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;


	}

}
