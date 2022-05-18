package basicCodes;

import java.util.Scanner;

public class FactOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number::");
		int num1=sc.nextInt();
		
		long factorial = 1;
        for(int i = 1; i <= num1; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num1, factorial);
	}

}
