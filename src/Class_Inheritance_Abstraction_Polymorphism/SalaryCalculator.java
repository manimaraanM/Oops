package Class_Inheritance_Abstraction_Polymorphism;

public class SalaryCalculator {
	public static void main(String[] args) {
		Employee emp1f = new FulltimeEmployee("Rony","J",5000);
		Employee emp2h = new HourlyEmployee("Mike","w",30,40);
		Employee emp3t = new TempEmployee("Will","roy",15,40);
		
		System.out.println("Temp Employee salary : " +emp3t.CalculatePay());
		System.out.println("Hourly Employee salary : " +emp2h.CalculatePay());
		System.out.println("Fulltime Employee salary : " +emp1f.CalculatePay());
		
	//	System.out.println(emp1f.getFirstName());
	//	System.out.println(emp1f.getSalary());
		
	}

}
