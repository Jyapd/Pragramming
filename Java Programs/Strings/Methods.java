package Strings;

public class Methods {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//   length();
		//	 concat()
		//	 equals()
		//	 equalignoreCase()
		//	 contains()
		//	 substring()
		//	 replace()
		
			// Equals
		System.out.println("-----------Length-----------");
		String str="Welcome";
		System.out.println("Length of the String is : "+str.length());
		System.out.println();
		
		// concatanation
		System.out.println("-----------Concat-----------");
		String s1="Welcome to";
		String s2="TechBuzz 2.0";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println("Welcome to".concat("TechBuzz 2.0"));
		System.out.println("Welcome to"+"TechBuzz 2.0");
		System.out.println();
		
		//Equals 
		String s3="Daniel";
		String s4="DaNIeL";
		System.out.println("-----------Equals-----------");
		System.out.println(s1.equals(s2));
		System.out.println(s3.equalsIgnoreCase(s4));
		System.out.println();
		
		//Contains
		System.out.println("-----------Contains-----------");
		System.out.println(s3.contains("ani"));
		System.out.println();
		
		// Substring
		/* 0 1 2 3 4 5 6  --> Starting index
		 * W E L C O M E							substring(1,3)  Gives EL
		 * 1 2 3 4 5 6 7  --> Ending index
		 */
		
		System.out.println("-----------Substring-----------");
		System.out.println(s3.substring(3));
		System.out.println();
		
		//Replace
		System.out.println("-----------Replace-----------");
		System.out.println(s3.replace('D','P'));
		System.out.println(s3.replace("Dani","inad"));
		
		System.out.println();
		
	
	}

}
