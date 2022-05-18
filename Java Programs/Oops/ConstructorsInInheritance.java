package Oops;

class parent
{
	public parent() 
	{
		System.out.println("Parent Counstructor");
	}
}

class child extends parent
{
	public child() 
	{
		System.out.println("Child Counstructor");
	}
}

class Grandchild extends child
{
	public Grandchild() 
	{
		System.out.println("Grand Child Counstructor");
	}
}

public class ConstructorsInInheritance 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//parent p=new parent();
		//child c=new child();
		Grandchild Gc=new Grandchild();
	}

}
