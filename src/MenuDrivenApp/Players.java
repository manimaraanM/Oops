package MenuDrivenApp;

public class Players {
	private String firstName;
	private String lastName;
	private String position;
	
	public Players(String firstName,String lastName,String position) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.position=position;
	}
	
	public void playerDetails() {
		System.out.println("FirstName: " +firstName +" " 
	+"LastName : "+lastName 
	+" Position : " +position );
		
	}

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

	public String getposition() {
		return position;
	}
	
	public void setposition(String position) {
		this.position=position;
	}
}
