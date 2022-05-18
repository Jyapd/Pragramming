package Oops;

/*
 * 		  1. we can not create  object for abstract class
		  2. if a method in class is object then that class become abstract class or must declare as abstract
		  3. if a class/Method is abstract we can't make it Final/Static
		  4. if a class extends abstract class then that class methods must overrides the abstract methods or this class become abtract too
		 
 */
 abstract class KFC{
	KFC()
	{
		System.out.println("Welcome to KFC");
	}
	public void MakeItem()
	{
		System.out.println("We are making Item");
	}
	
	abstract public void billing();
	abstract public void offer();
}
 
 class MyKFC extends KFC
 {
	 MyKFC()
	 {
		 System.out.println("");
	 }
	 
	 public void billing()
	 {
		 System.out.println("Welcome to Billing");
	 }
	 
	 public void offer()
	 {
		 System.out.println("Welcome to Offer");
	 }
	 
	 public void Festoffer()
	 {
		 System.out.println("Welcome to FestOffer");
	 }
 }
 
 
public class Abstractclass 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		KFC k=new MyKFC();
		k.MakeItem();
		k.billing();
		k.offer();
		//k.FestOffer();
		

	}

}
