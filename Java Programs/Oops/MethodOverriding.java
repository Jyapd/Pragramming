package Oops;

// Method overriding means sub class having same method name as Super class

class Super
{
	public void display()
	{
		System.out.println("Super Class Displayed");
	}
}

class Subb extends Super
{
	public void display()
	{
		System.out.println("Sub Class Displayed");
	}
}
public class MethodOverriding {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Super obj=new Super();
		obj.display();
		
		Subb obj1=new Subb();
		obj1.display();
		
		Super obj2=new Subb(); // this called Dynamic Method Dispatch 
		obj2.display();
		
		/*
		 * reference var=new object()  Syntax of object creation
		 * Note: Method will call based on object not Reference
		 */
		
		
		

	}

}
