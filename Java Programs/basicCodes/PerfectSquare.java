package basicCodes;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number::");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(i*i==num)
			{
				System.out.printf("%d is Perfect Square Number",num);
			break;
			
			}

		}

	}
}
