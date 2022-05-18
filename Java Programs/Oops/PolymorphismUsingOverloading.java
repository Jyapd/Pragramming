package Oops;
// This is also colled as compile Time Polymorphism
class Test
{
	public int max(int a,int b)
	{
		return a>b?a:b;
	}
	
	public int max(int a,int b,int c)
	{
		if(a>b && a>c)
			return a;
		else if (b>c)
			return b;
		else
			return c;
	}
}


public class PolymorphismUsingOverloading 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Test t=new Test();
		int result=t.max(52, 1,2);
		System.out.println("Max :: "+result);
	}

}
