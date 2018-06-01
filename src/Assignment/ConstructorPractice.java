package Assignment;

public class ConstructorPractice {
	String name;
	String team;
	int age;
	ConstructorPractice()
	{
		 name="";
		 team="";
		 age =0;
		
	}
	ConstructorPractice(String n, String t, int a)
	{
		name = n;
		team = t;
		age = a; 
		
	}
public String toString()
{
	return  "this is" +name +  "of" +team + "age is" +age;
}
	public static void main(String[] args) {
		ConstructorPractice CP= new ConstructorPractice("Syed","India",28);
		System.out.println(CP);
		
		
		

	}

}
