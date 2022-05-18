package Oops;

// This keyword is nothing but the reference to the current Object 

class recta
{
	int length;
	int breadth;
	
	recta(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	void display()
	{
		System.out.println("Length--> "+this.length);
		System.out.println("Breadth--> "+this.breadth);
	}
}
public class thisConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recta r1=new recta(10,15);
		r1.display();
		recta r2=new recta(0,5);
		r2.display();
		
		
		
		

	}

}
