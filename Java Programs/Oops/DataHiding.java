package Oops;

class RRectangle{
	private double lenght;
	private double bredth;
	
	public double  getLength()
	{
		return lenght;
	}
	
	public double  getBreadth()
	{
		return bredth;
	}
	
	public void setLength(double l)
	{
		
			lenght=l;
	}
	
	public void setBreadth(double b)
	{
		
			lenght=b;		
	}
	
	public double area()
	{
		return lenght*bredth;
	}
	public double perimeter()
	{
		return 2*(lenght+bredth);
	}
	
	public boolean isSquare() {
		if(lenght==bredth)
			return true;
		else
			return false;
	}
}
public class DataHiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RRectangle r=new RRectangle();  // Object 
		
		r.setLength(100.5);
		r.setBreadth(5.5);	
		
		System.out.println("Area-->"+r.area());
		System.out.println("Perimeter-->"+r.perimeter());
		System.out.println("Is it a Square-->"+r.isSquare());
		

	}

}
