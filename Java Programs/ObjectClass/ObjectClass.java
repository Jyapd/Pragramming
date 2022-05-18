package ObjectClass;

public class ObjectClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Object a[]=new Object[5];
		a[0]=1;
		a[2]='c';
		a[1]="Daniel";
		a[3]=2.25;
		a[4]=2;
		
		for(Object i:a)
		{
			System.out.print(i+"-");
		}
		
	}

}
