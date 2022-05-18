package Arrays;

import java.util.*;

public class NoOfMaxAndMinELementsToGivenNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Base Line Number: ");
		System.out.println();
		int n=sc.nextInt();
		
		int a[]=new int [] {10,20,30,40,50,60};
		
		int max=0;
		int min=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>n)
				max++;
			else
				min++;
		}
		
		System.out.println("Above BaseLine: "+max);
		System.out.println("Below BaseLine: "+min);
		
		
		
		

	}

}
