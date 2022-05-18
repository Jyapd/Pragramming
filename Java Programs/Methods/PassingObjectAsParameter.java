package Methods;

public class PassingObjectAsParameter {

	static void update(int arr[])
	{
		arr[0]=4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,23,1,5,13,3};
		update(arr);
		System.out.print(arr[0]);

	}

}