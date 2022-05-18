package Strings;

public class AaaBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		we can create string in 3 ways
		1. String (char[arr])
		2. String (byte[arr])
		3. String (String)
		*/
		
		String str="Daniel";
		String str1=new String("Daniel");
		char c[]= {'a','f'};
		String str2=new String(c);
		
		System.out.printf("%s %s %s",str,str1,str2);
		
	}

}
