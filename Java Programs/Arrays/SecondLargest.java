package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest 
{

	
	public static void main(String[] args)
	 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Value of Number::");
		int num=sc.nextInt();
		
		int a[]=new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.printf("%dth Element:",i);
			a[i]=sc.nextInt();
		}
		int total=a.length;
		int temp; 
		Arrays.sort(a);
		/*for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        } */
			   System.out.println();
			   System.out.println("Second Largest "+a[total-2]); 
		         
	}  

	/* public static void main(String[] args) 
	    {
		 Scanner sc=new Scanner(System.in);
			System.out.print("Enter Value of Number::");
			int num=sc.nextInt();
			
			int A[]=new int[num];
			for(int i=0;i<num;i++)
			{
				System.out.printf("%dth Element:",i);
				A[i]=sc.nextInt();
			}
	        int max1,max2;
	        
	        max1=max2=A[0];
	        
	        for(int i=0;i<A.length;i++)
	        {
	            if(A[i]>max1)
	            {
	                max2=max1;
	                max1=A[i];
	                
	            }
	            else if(A[i]>max2)
	            {
	                max2=A[i];
	            }
	        }
	        
	        System.out.println("Second Largest is "+max2);
	        
	        
	        
	    }
	*/
}


