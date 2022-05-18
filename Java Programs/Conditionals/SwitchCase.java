package Conditionals;

import java.util.*;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int Week=sc.nextInt();
		switch(Week)
		{
		case 1: System.out.print("Monday");
		break;
		case 2: System.out.print("Tuesday");
		break;
		case 3: System.out.print("Wednesday");
		break;
		case 4: System.out.print("Thursday");
		break;
		case 5: System.out.print("Friday");
		break;
		case 6: System.out.print("Satarday");
		break;
		default:System.out.print("Sunday");			
		}
			

	}

}
