package Oops;

/*
 * Interface 
 */

interface ABC
{
	void meth1();
	void meth2();
}

class CDE implements ABC
{
	public void meth1()
	{
			System.out.println("Meth1 of class CDE");
	}
	
	public void meth2()
	{
		System.out.println("Meth2 of class CDE");
	}
	
	public void meth3()
	{
		System.out.println("Meth3 of class CDE");
	}
}

public class Interfaces 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ABC a= new CDE();
		a.meth1();
		a.meth2();
		

	}

}
