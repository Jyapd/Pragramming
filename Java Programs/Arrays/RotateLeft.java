package Arrays;

import java.util.Scanner;

class RotateLeft {  
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
		
        //n determine the number of times an array should be rotated  
		System.out.print("Enter Number Times You want to Rotate::");
		int n=sc.nextInt();
		
        //Displays original array  
        System.out.println("Original array: ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        
        //Rotate the given array by n times toward left  
        for(int i = 0; i < n; i++){  
            int j, first;  
            //Stores the first element of the array  
            first = arr[0];  
            for(j = 0; j < arr.length-1; j++){  
                //Shift element of array by one  
                arr[j] = arr[j+1];  
            }  
            //First element of array will be added to the end  
            arr[j] = first;  
        }  
        
        System.out.println();  
        //Displays resulting array after rotation  
        System.out.println("Array after left rotation: ");  
        for(int i = 0; i< arr.length; i++)
        {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  
