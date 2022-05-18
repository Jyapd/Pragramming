package Oops;

class rectangle{
	private int length;
	private int breadth;
	
	public rectangle()  // cunstructor
	{
		length=1;
		breadth=5;
	}
	
	public rectangle(int l, int b) //cunstructor
	{
		length=l;
		breadth=b;
	}
	
	public double area()
	{
		return length*breadth;
	}
}
public class Cunstructors {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * Constructors :: Nothing but a method with same as class name without any return type
		 */
		//rectangle r=new rectangle();
		rectangle r=new rectangle(10,4);
		
		System.out.println("Area-->"+r.area());
	}

}
