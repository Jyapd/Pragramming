package basicCodes;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number::");
		int num=sc.nextInt();
		int originalNumber,remainder,result=0;
		originalNumber = num;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += (remainder*remainder*remainder);
            originalNumber /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
	}

}
