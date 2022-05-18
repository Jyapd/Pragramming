package Methods;

import java.util.*;


public class FindingGreater {

	static int max(int x, int y)
	{
		if (x>y)
			return x;
		else
			return y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 2 Values :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.print("Max of Given is --> "+max(a,b));
	}
	
	/*
	 Calling Methods
	 1. by static keyword
	 2. by creating class object
	 */

}
