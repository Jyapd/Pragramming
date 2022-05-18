package basicCodes;

import java.util.Scanner;

public class LongestAmongThree {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number 1::");
		int num1=sc.nextInt();
		System.out.print("Enter Value of Number 2::");
		int num2=sc.nextInt();
		System.out.print("Enter Value of Number 3::");
		int num3=sc.nextInt();
		
		if(num1>num2 && num1>num3)
			System.out.print("Number 1 is Largest");
		else if(num2>num3 && num2>num1)
			System.out.print("Number 2 is Largest");
		else
			System.out.print("Number 3 is Largest");
			

	}

}
