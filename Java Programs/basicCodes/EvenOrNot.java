package basicCodes;

import java.util.Scanner;

public class EvenOrNot {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number ::");
		int num1=sc.nextInt();
		
		if(num1%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");

	}

}
