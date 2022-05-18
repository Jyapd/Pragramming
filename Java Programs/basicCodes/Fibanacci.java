package basicCodes;

import java.util.Scanner;

public class Fibanacci {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number::");
		int num=sc.nextInt();
		
		int a[]=new int[100];
		

		int n1=0,n2=1,n3;
		System.out.println("Fibanacci Series:");
		for(int i=1;i<=num;i++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;               // N Fibanacci Nuumbers
			
			a[i]=n3;
			System.out.print(n3+" ");
			
		}
		System.out.println(" ");
		
		System.out.print("Enter the Number of Fibanacci number You want::");
		int n=sc.nextInt();
		for(int j=0;j<a.length;j++)
		{                                 // Nth Fibanacci Number
			if(j==n)
			{
				System.out.printf("%dth Fibanacci number is----> %d:",n,a[j]);
				break;
			}
				
		}
		
		
		

	}

}
