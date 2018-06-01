package Assignment;

public class SwapNumbers {
	int s;
	int t;
	public static void swap(int a, int b){
		int temp =a;
		a=b;
		b= temp;
		
	}
	public static void swap(SwapNumbers p)
	{
		int temp = p.s;
		p.s = p.t;
		p.t = temp;
		
	}

	public static void main(String[] args) {
		SwapNumbers sw = new SwapNumbers();
		sw.s = 50;
		sw.t = 100;
		swap(sw.s,sw.t);
		System.out.println("Pass by value of s: "+sw.s);
		System.out.println("Pass by value of t: "+sw.t);
		swap(sw);
		System.out.println("Pass by reference value of s: "+sw.s);
		System.out.println("Pass by reference value of t: "+sw.t);

	}

}
