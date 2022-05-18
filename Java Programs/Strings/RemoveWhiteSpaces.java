package Strings;

public class RemoveWhiteSpaces {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')             // Count No of White Spaces
				count++;
				
		}
		System.out.print(count);*/
		
		String str1="white spaces";    
        
        //Removes the white spaces using regex    
        str1 = str1.replaceAll("\\s+", "");    
            
        System.out.println("String Without Whitespaces : " + str1);    

	}

}
