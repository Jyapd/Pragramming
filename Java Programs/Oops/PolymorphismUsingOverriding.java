package Oops;

// This is also called as Runtime Polymorphism

class A
{
	public void display()
	{
		System.out.println("Ancestors class was Displayed");
	}
}

class D extends A
{
	public void display()
	{
		System.out.println("Desentors class was Displayed");
	}
}

public class PolymorphismUsingOverriding {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		A p=new D();
		p.display();
		

	}

}
