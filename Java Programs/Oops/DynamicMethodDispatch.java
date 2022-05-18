package Oops;

// Method overriding means sub class having same method name as Super class

class Sup
{
	public void method1()
	{
		System.out.println("Super Class Method1 Displayed");
	}
	
	public void method2()
	{
		System.out.println("Super Class Method2 Displayed");
	}
}

class sub extends Sup
{	
	public void method2()
	{
		System.out.println("Sub Class Method2 Displayed");
	}
	
	public void method3()
	{
		System.out.println("Sub Class Method3 Displayed");
	}
	
}
public class DynamicMethodDispatch {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Sup obj=new sub(); 
		obj.method1();
		obj.method2();
		//obj.method3();  
	/* this will gives Error coz Sup class have only 2 methods Dynamic
	*  dispatch has a rule that no of methods in reference class will excuted not morethan those
	*/

	}

}
