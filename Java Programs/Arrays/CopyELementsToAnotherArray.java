package Arrays;

import java.util.Scanner;

public class CopyELementsToAnotherArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number::");
		int num=sc.nextInt();
		
		int array[]=new int[num];
		int array1[]=new int [num];
		for(int i=0;i<num;i++)
		{
			System.out.printf("%d th Element of An Array:",i);
			array[i]=sc.nextInt();
			array1[i]=array[i];
		}
		System.out.println("                     -------------                  ");
		System.out.println("Elements Present in Array is:");
		for(int i:array)
		{
			System.out.print(i+" ");
			
		}
		System.out.println("");
		System.out.println("Elements Present in Array1 is:");
		for(int i:array)
		{
			System.out.print(i+" ");
			
		}

	}

}
