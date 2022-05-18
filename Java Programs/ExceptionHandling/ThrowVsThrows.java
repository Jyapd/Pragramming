package ExceptionHandling;

import java.util.*;

class NegativeDimensionException extends Exception
{
    public String toString()
    {
        return "Dimensions of a Rectangle cannot be Negative";
    }
}

public class ThrowVsThrows 
{
    static int area(int l,int b) throws NegativeDimensionException
    {
        if(l<0 || b<0)
            throw new NegativeDimensionException();
        return l*b;
    }
    static void meth1() throws NegativeDimensionException
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter 2 Values :: ");
    	int l =sc.nextInt();
    	int b=sc.nextInt();
    	int result=area(l,b);
        System.out.println("Area is "+result);
    }
    
    public static void main(String[] args) 
    {
        try
        {
        meth1();
        }
        catch(NegativeDimensionException e)
        {
            System.out.println(e);
        }
        System.err.println("Error");
    } 
}
