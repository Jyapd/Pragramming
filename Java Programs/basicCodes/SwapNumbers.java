package basicCodes;

import java.util.Scanner;
public class SwapNumbers{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number 1::");
		int num1=sc.nextInt();
		
		System.out.print("Enter Value of Number 2::");
		int num2=sc.nextInt();
		
		System.out.println("2 Numbers Before Swap::"+num1+ " and "+num2);
		
		/*int temp=num1;
		num1=num2;                    					// Using 3rd variable
		num2=temp;*/
		
		num1=num1+num2; 
		num2=num1-num2;                                // Without Using 3rd Variable
		num1=num1-num2;
		
		
		System.out.print("2 Numbers After Swap::"+num1+ " and "+num2);
		

	}

}