package basicCodes;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number::");
		int num1=sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d * %d= %d",num1,i,num1*i);
			System.out.println();
		}

	}

}
