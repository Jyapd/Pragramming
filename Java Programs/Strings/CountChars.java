package Strings;

import java.util.*;

public class CountChars {

	public static void main(String[] args) 
	{
		
		//String str = "Hello World";    //Gives Correct Output
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();           // Gives Only COUNT of Before Space Chars Only.
		
        int count = 0;    
        System.out.println("The entered string is: "+str);    
        //Count the characters in the string except space    
        for(int i = 0; i < str.length(); i++) 
        {    
            if(str.charAt(i) != ' ')    
                count++;    
        }                
        //Displays the total number of characters in the string    
        System.out.println("Total number of characters in the string: " + count);

	}

}
