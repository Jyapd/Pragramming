package MultiThreading;

/*
 * class MyThread extends Thread
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
public class MultiThreadingUsingThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
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

public class MultiThreadingUsingThreadClass extends Thread {

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
		MultiThreadingUsingThreadClass t=new MultiThreadingUsingThreadClass();
		t.start();
		int i=1;
		while(true)
		{
			System.out.println(i+" World ");
			i++;
		}

	}

}


