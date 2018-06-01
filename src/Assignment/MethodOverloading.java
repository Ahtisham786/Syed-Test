package Assignment;

public class MethodOverloading {
	public void sum(int x, int y)
	{
		int add = x+y;
		System.out.println("Integer sum is :"+add);
	}
	public void sum(float x , float y)
	{
		float add = x+y;
		System.out.println("Float sum is :"+add);
	}

	public static void main(String[] args) {
		MethodOverloading ml = new MethodOverloading();
		ml.sum(20,7);
		ml.sum(2.5f, 5.2f);
		

	}

}
