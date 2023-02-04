package Class_Inheritance_Abstraction_Polymorphism;

public class HourlyEmployee extends Employee{
	double hours;

	public HourlyEmployee(String firstName, String lastName, double salary, double hours) {
		super(firstName, lastName, salary);
		// TODO Auto-generated constructor stub
		this.hours=hours;
	}

	@Override
	public double CalculatePay() {
		// TODO Auto-generated method stub
		return getSalary() * hours;
	}

}
