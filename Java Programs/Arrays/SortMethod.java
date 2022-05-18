package Arrays;

import java.util.Arrays;

import java.util.Scanner;

public class SortMethod {

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
		System.out.println("Elements Before SORT:");
		for(int i:array)
		{
			System.out.print(i+" ");
		}

		Arrays.sort(array); 
		
		System.out.println();
		System.out.println("Elements After SORT");
		for(int i:array)
		{
			System.out.print(i+" ");
		}

	}

}
