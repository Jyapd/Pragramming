package Oops;

class parents
{
	public parents() 
	{
		System.out.println("Non param Parent Counstructor");
	}
	public parents(int x) 
	{
		System.out.println("Param Parent Counstructor");
	}
}

class children extends parents
{
	
	public children() 
	{
		System.out.println("Non param Children Counstructor");
	}
	public children(int x) 
	{
		super(x);
		System.out.println("Param Children Counstructor");
	}
}

class Grand extends children
{
	
	public Grand() 
	{
		System.out.println("Non param Grand Counstructor");
	}
	public Grand(int x) 
	{
		super(x);
		System.out.println("Param Grand Counstructor");
	}
}

public class ParameteriseConstructor
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//parent p=new parent();
		//child c=new child();
		
		Grand Gc=new Grand(5);
	}

}
