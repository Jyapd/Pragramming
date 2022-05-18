package basicCodes;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number::");
		int num=sc.nextInt();
		int result=0;
		int temp=num;
		int i=0,digit,count=0;
		while(num!=0)
		{
			digit=num%10;
			result=result*10+digit;
			num=num/10;
			
		}
		
			System.out.print("Reversed Number----> "+result);

	}

}
