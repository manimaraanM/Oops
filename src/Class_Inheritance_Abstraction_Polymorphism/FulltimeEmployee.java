package Class_Inheritance_Abstraction_Polymorphism;

public class FulltimeEmployee extends Employee{
	//constructor
	public FulltimeEmployee(String fistName,String lastName,double salary) {
		super(fistName,lastName,salary);
	}

	@Override
	public double CalculatePay() {
		// TODO Auto-generated method stub
		return getSalary();
	}

}
