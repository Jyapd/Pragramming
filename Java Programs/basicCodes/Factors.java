package basicCodes;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number::");
		int num1=sc.nextInt();
		
		for(int i=1;i<=num1;i++)
		{
			if(num1%i==0)
				System.out.print(i+" ");
				
		}

	}

}
