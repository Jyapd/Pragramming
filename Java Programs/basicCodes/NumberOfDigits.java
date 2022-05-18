package basicCodes;

import java.util.Scanner;

public class NumberOfDigits {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number::");
		int num=sc.nextInt();
		
		int i=0,digits,count=0;
		while(num!=0)
		{
			digits=num%10;
			num=num/10;
			count++;
		}
		
		System.out.printf("NUmber of Digits in %d is-----> %d",num,count);

	}

}
