package Oops;

import java.util.*;


class Final
{
	public final void display()
	{
		System.out.print("Hello\t");
	}
}

//final class Start extends Final  5
class Start extends Final

{
	/*
	 * public  void display()
	 * {
		System.out.println("Hi");
	   }
	 */                                   // 4
	
	
	public void show()
	{
		System.out.print("Daniel");
	}
}

class end extends Start
{
	public void show()
	{
		System.out.println("Hello Daniel");
	}
}

public class FinalVariable 
{
	/*
	 * final int a=10; // 2
	 * FinalVariable()
	{
		final int b=20; // 3
	}
	 */
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final double PI;       // 1
		PI=Math.PI;
		//System.out.println(PI);
		Start s=new Start();
		s.display();s.show();

	}

}

/*
 * NOTE :
 * 	1. Ways to initialize final Keyword 1,2,3
 *  2. We can not override Final method with any subclass methods
 *  3. A final Class can not be Inherited by sub class
 */
