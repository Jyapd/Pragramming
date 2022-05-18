package Oops;

class Free
{
    static int x=10;
    int y=20;
    
    void show()
    {
        System.out.println(x+" "+y);
    }
    
    static void display()
    {
        System.out.println(x);
    }
}

public class StaticVariable {

    public static void main(String[] args) {
        
        Free t1=new Free();
        t1.show();
        t1.x=30;
        t1.y=50;
        t1.show();
        
        Free t2=new Free();
        t2.display();
        t2.show();
        
    }
    
}

