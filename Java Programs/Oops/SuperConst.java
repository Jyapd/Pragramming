package Oops;

class Rect
{
	int length;
	int breadth;
	
	public Rect()
	{
		length=breadth=1;
	}
	
	public Rect(int l,int b)
	{
		length=l;
		breadth=b;
	}
	
	
}

class cuboid extends Rect
{
	int height;
	
	public cuboid()
	{
		height=1;
	}
	
	public cuboid(int h)
	{
		height=h;
	}
	
	public cuboid(int h,int b,int l)
	{
		super(l,b); // Super Keyword to access parent class clusture
		height=h;
	}
	
	int volume()
	{
		return length*breadth*height;
	}
	
	
}

public class SuperConst {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		cuboid c=new cuboid(5,3,10);
		System.out.println("Volume of Cuboid--> "+c.volume());

	}

}
