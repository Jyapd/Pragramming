package Oops;

// cylinder extends circle

class circle
{
	public double radius;
	
	public double area()
	{
		return Math.PI*radius*radius;
	}
	
	public double perimeter() 
	{
		return 2*Math.PI*radius;
	}
	
	public double circumfences()
	{
		return perimeter();
	}
}

class cylinder extends circle
{
	public double height;
	
	public double volume()
	{
		return area()*height;
	}
}

public class Inheritance {
	public static void main(String args[])
	{
		// A class aquiring the features of Existing class 
		
		cylinder r=new cylinder();
		
		r.radius=7;
		r.height=10;
		
		System.out.println("Volume-->"+r.volume());
		
	}

}
