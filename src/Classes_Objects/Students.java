package Classes_Objects;

public class Students {
	String firstName;
	String lastName;
	String course;
	String grade;

	//Creating constructor
	public Students(String firstName,String lastName,String course,String grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.grade = grade;
	}
	
	//creating constructor 2
	public Students() {}
	
	//creating constructor 3
	public Students(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	//public methods
	public void details(){
		System.out.println("Student-" +firstName +" " +lastName +" is doing  " +course +" course and got grade : " +grade);
		
	}
	
	public boolean lengthCheck(String a, int i) {
		return (a.length()>i);
	}
	//getters and setters
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		if(lengthCheck(firstName,1))
		this.firstName=firstName;
	}
	
	public String getlasstName() {
		return lastName;
	}
	public void setlastName(String lastName) {
		if(lengthCheck(lastName,1))
		this.lastName=lastName;
	}
	
	public String getcourse() {
		return course;
	}
	public void setcourse(String course) {
		if(lengthCheck(course,5))
		this.course=course;
	}
	
	public String getgrade() {
		
		return grade;
	}
	public void setgrade(String grade) {
		if(lengthCheck(grade,0))
		this.grade=grade;
	}

}
