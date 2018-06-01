package Assignment;

public class MethodOverloadingArgument {
	public void sum(int x,int y)
	{
		int add = x+y;
		System.out.println("Sum with 2 Arguments: "+add);
	}
	public void sum(int x,int y,int z)
	{
		int add = x+y+z;
		System.out.println("Sum with 3 Arguments: "+add);
	}
	public static void main(String[] args) {
		
		MethodOverloadingArgument mla = new MethodOverloadingArgument();
		mla.sum(10,20);
		mla.sum(10,20,10);

	}

}
