class Employee{
	public int Id;
	public String Name;
	public int Salary;
	
	public void PrintEmployee() {
		System.out.println(Id + " : "+ Name +" : "+ Salary);
	}
	
}

public class democlass{
	public static void main(String args[]) {
		
		Employee emp1 = new Employee();
		emp1.Id=101;
		emp1.Name="Ganesha";
		emp1.Salary=1000;
		emp1.PrintEmployee();
		
		Employee emp2 = new Employee();
		emp2.Id = 102;
		emp2.Name="Shivaa";
		emp2.Salary=5000;
		emp2.PrintEmployee();
	}
}