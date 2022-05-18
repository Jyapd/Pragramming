package Arrays;

import java.util.Scanner;

public class DuplicateElements 
{  
public static void main(String[] args) {  
        //Initialize array  
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Value of Number::");
	int num=sc.nextInt();
	
	int arr[]=new int[num];
	for(int i=0;i<num;i++)
	{
		System.out.printf("%d th Element of An Array:",i);
		arr[i]=sc.nextInt();
	}
	
        System.out.println("Duplicate elements in given array: ");  
        
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) 
        {  
            for(int j = i + 1; j < arr.length; j++) 
            {  
                if(arr[i] == arr[j])  
                    System.out.print(arr[j]+" ");  
                	
            }  
        }  
    }  
}  
