package Arrays;

import java.util.*;


public class EvenElements {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number::");
		int num=sc.nextInt();
		
		int array[]=new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.printf("%d th Element of An Array:",i);
			array[i]=sc.nextInt();
		}
		System.out.println("                     -------------                  ");
		System.out.println("Elements Present in Array is:");
		for(int i=0;i<array.length;i=i+2)
		{
			System.out.print(array[i]+" ");
		}

	}

}
