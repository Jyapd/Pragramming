package basicCodes;

import java.util.Scanner;

public class NPrimeNumbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		int count=0;
		System.out.println("Enter Range Value::");
		int n=sc.nextInt();
		for(int j=2;j<n;j++)
		{
			  int i,m=0,flag=0;      
			  m=j/2;      
			  if(j==0||j==1)
			  {  
			   System.out.println(n+" is not prime number");      
			  }
			  else
			  	{  
				  for(i=2;i<=m;i++)
				   {      
					   if(j%i==0)
					   {      
					          
					     flag=1;      
					     break;      
					   }      
				   }      
					   if(flag==0)  
					   { 
						   
						   System.out.print(j+" " ); 
						   count++;
						   
					   } 
					   
					   
					   
			  	}
			 
		
		}
		System.out.println();
		System.out.println("Total Number of PRIME NUMBERS from 1 to N is ::"+count);
		   
	}

}
