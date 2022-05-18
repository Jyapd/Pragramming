package Strings;

import java.util.Scanner;

public class CaseChange {

	public static void main(String arg[])	
	{
	
		
        Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the string: ");
	    String s1=sc.nextLine(); 
	    
	    char[] ch = s1.toCharArray();
	System.out.print("String After changing Cases: ");
	    for(int i=0;i<s1.length();i++)
	    {
		
	       if(ch[i]>=97 && ch[i]<=122 )  // Lower case Range
               { 
	    	   		ch[i]-=32;           // Converting  Upper
               }
	       else
	    	   	ch[i]+=32;               // Converting lower
		
           }    
              
	         System.out.println(ch);
       	  
	}

}
