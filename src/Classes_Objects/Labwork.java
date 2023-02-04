package Classes_Objects;

public class Labwork {
	public static void main(String[] args) {
	Students st1=new Students("John","Roy","Backend","A");
		Students st2=new Students("William","Jone","Backend","B");	
		
		Students st3=new Students();
		st3.firstName="Mike";
		st3.lastName="S";
		st3.grade="B";
		st3.course="Backend";
		
		Students st4=new Students("Jason","Roy");
		
		System.out.println(st3.firstName);
		
		Students st5=new Students();
		st5.setfirstName("Mike");
		st5.setlastName("lastname");
		st5.setcourse("Front");
		st5.setgrade("A");
		
		st5.details();	
		
		System.out.println(st5.getfirstName());
		System.out.println(st5.getlasstName());
		System.out.println(st5.getcourse());
		System.out.println(st5.getgrade());
		
		
		
		
	}

}
