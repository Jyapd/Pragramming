package Packages;
class Demo1
{
    int a=10;
    //private.
    public int b=20;
    protected int c=30;
    public int d=40;
    
    public void display()
    {
        System.out.println(a+b+c+d);
    }
}
/*Public class Demo2()
{
    Demo1 d=new Demo1();
    public void show()
    {
        System.out.println(d.a+d.b+d.c+d.d);
    }
    
}*/
class Demo3 extends Demo1
{
    Demo1 d=new Demo1();
    public void show()
    {
        System.out.println(d.a+d.b+d.c+d.d);
    }
}

class Demo4 extends Demo1
{
    public void show()
    {
        System.out.println(a+b+c+d);
    }
}
    


public class AccessModifiers {


		public static void main(String[] args) 
	    {
	      Demo1 d1=new Demo1();
	      d1.display();
	      System.out.println(d1.a+d1.b+d1.c+d1.d);
	      
	    }

	}

/*
 * Note:
 * public : Accessble  from any where 
 * private : Accessble only within the class
 * default : Accessible within same package only
 * protected : Not accessible for diff package non sub class only
 */
