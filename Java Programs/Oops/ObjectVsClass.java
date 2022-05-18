package Oops;

class Circle{  // Class
	
	public double radius;
	
	
	public double area(){
		return Math.PI * radius *radius;
	}
	public double perimeter(){
		return 2 * Math.PI * radius;
	}
	
	public double circumfence() {
		return perimeter();
	}
	
}
public class ObjectVsClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/*
		 * Class :: its nothing but plan of the object based on class object will Designed
		 * Object:: Object is nothing but anything in the that have properties and Behaviour
		 */
		
		Circle obj=new Circle();  // Object 
		
		obj.radius=7;
		
		System.out.println("Area-->"+obj.area());
		System.out.println("Perimeter-->"+obj.perimeter());
		System.out.println("Circumfence-->"+obj.circumfence());
		
		
		
		
	}

}
