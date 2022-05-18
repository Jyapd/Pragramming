package basicCodes;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number::");
		int num=sc.nextInt();
		int count=0;
		if(num==0 || num==1)
			System.out.println("Number is NOT Prime");
		else
		{
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.println("Number is  Prime");
			else
				System.out.println("Number is NOT Prime");
		}
		

	}

}
