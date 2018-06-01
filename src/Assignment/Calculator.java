package Assignment;

public class Calculator {
	
	int add(int num1, int num2)
	{
		int num3 = num1+num2;
		
		
		return num3;
	}
	int sub(int num1, int num2)
	{
		int num3 = num1-num2;
		
		return num3;
	}
	int mul(int num1, int num2)
	{
		int num3 = num1*num2;
		
		return num3;
	}
	int div(int num1, int num2)
	{
		int num3 = num1/num2;
		
		return num3;
	}
	public static void main(String args[])
	{
		Calculator cal = new Calculator();
		int i =cal.add(10,5);
		System.out.println("The Addition of number: "+ i);
		int j =cal.sub(10,5);
		System.out.println("The Substraction of number: "+ j);
		int k = cal.mul(10,5);
		System.out.println("The Multiplication of number: "+ k);
		int l = cal.div(10,5);
		System.out.println("The Division of number: "+ l);
	}

}
