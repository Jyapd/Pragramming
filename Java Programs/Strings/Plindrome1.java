package Strings;

import java.util.Scanner;

public class Plindrome1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int flag=0;
        System.out.print("Enter the String: ");
        	String string=sc.next();
        string = string.toLowerCase();    
            
          
        for(int i = 0; i < string.length()/2; i++)
        {    
            if(string.charAt(i) != string.charAt(string.length()-i-1))
            {    
                flag++;    
                break;    
            }    
        }    
        if(flag==0)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");    
	}

}
