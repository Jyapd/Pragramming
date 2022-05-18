package Strings;
import java.util.*;

public class Anagram {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String1: ");
        	String str1=sc.next();
        System.out.print("Enter the String2: ");
        	String str2=sc.next();
       
  
        //Converting both the string to lower case.  
        str1 = str1.toLowerCase();  
        str2 = str2.toLowerCase();  
  
        //Checking for the length of strings  
        if (str1.length() != str2.length())  
            System.out.println("Both the strings are not anagram");  
          
        else 
        {  
            //Converting both the arrays to character array  
        	
            char[] string1 = str1.toCharArray();  
            char[] string2 = str2.toCharArray();  
  
            //Sorting the arrays using in-built function sort ()  
            
            Arrays.sort(string1);  
            Arrays.sort(string2);  
  
            //Comparing both the arrays using in-built function equals ()  
            
            if(Arrays.equals(string1, string2) == true) 
            {  
                System.out.println("Both the strings are anagram");  
            }  
            else 
            {  
                System.out.println("Both the strings are not anagram");  
            }  
        }  

	}

}