package Assignment;

public class CheckMethod {
	public void go()
	{
		System.out.println("Go Method");
	}
	public static void go1()
	{
		System.out.println("Go1 Method");
		//go2();
	}
	public void go2()
	{
		System.out.println("Go2 Method");
		go1();
		go();
	}

	public static void main(String[] args) {
		go1();
		CheckMethod cm = new CheckMethod();
		cm.go2();
		

	}

}
