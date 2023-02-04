package Class_Inheritance_Abstraction_Polymorphism;

public class TempEmployee extends Employee{
	double hoursWorked;
	
	public TempEmployee(String firstName, String lastName, double salary,double hoursWorked) {
		super(firstName, lastName, salary);
		// TODO Auto-generated constructor stub
		this.hoursWorked=hoursWorked;
	}

	@Override
	public double CalculatePay() {
		
		return getSalary()*hoursWorked;
	}

}
