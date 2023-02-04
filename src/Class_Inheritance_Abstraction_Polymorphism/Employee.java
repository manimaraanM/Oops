package Class_Inheritance_Abstraction_Polymorphism;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	
	//constructor
	public Employee(String firstName,String lastName,double salary) {
		this.firstName=firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	//Methods
	public abstract double CalculatePay();
	
	//Getters & Setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

}
