package basicCodes;
import java.util.*;
public class LeapYear {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Year:");
		int year=sc.nextInt();
		
		if(year%4==0 && year%400==0 || year%100!=0)
			System.out.println("Entered Year is Leap year");
		else
			System.out.println("Entered Year is NOT Leap year");
		

	}

}
