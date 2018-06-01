package Assignment;

public class Employee extends Salary{
	void Data()
	{
		String name="Syed";
		String Designation ="QA";
		System.out.println("Name "+ name +" Designation "+ Designation +" Salary "+ salary +" Äddrs " + add);
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.Data();
		//emp.Addr();
		

	}

}
