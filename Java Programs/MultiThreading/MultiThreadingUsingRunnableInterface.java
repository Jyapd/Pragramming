package MultiThreading;

/*
 * class My implements Runnable
{
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i+" Hello ");
			i++;
		}
	}
	
}
public class MultiThreadingUsingRunnableInterface implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My m=new MyT();
		Thread t=new Thread(m);
		t.start();
		int i=1;
		while(true)
		{
			System.out.println(i+" World ");
			i++;
		}

	}

}
 */

public class MultiThreadingUsingRunnableInterface implements Runnable {

	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i+" Hello ");
			i++;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadingUsingRunnableInterface m=new MultiThreadingUsingRunnableInterface();
		Thread t=new Thread(m);
		t.start();
		int i=1;
		while(true)
		{
			System.out.println(i+" World ");
			i++;
		}

	}

}


