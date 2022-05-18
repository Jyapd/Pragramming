package Arrays;

import java.util.Scanner;

public class ReverseArray {

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
		System.out.println("Elements Present in Reverse Array is:");
		for (int i = array.length-1; i >= 0; i--)
		{
			System.out.print(array[i]+" ");
		}

	}

}	
