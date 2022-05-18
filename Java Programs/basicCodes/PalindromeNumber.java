package basicCodes;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number::");
		int num=sc.nextInt();
		int result=0;
		
		int i=0,digit,count=0;
		while(num!=0)
		{
			digit=num%10;
			result=result*10+digit;
			num=num/10;
			
		}
		System.out.println("Reversed Number----> "+result);
		if(result==num)
			System.out.printf("%d is Palindrome Number",num);
			
		else
			System.out.printf("%d is NOT Palindrome Number",num);
		
			
	}
}
