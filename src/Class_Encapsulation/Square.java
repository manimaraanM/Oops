package Class_Encapsulation;

public class Square {
	private double side;
	private double area;
	
	//create constructor
	public Square(double side) {
		this.side=side;
		area(side);
	}
	
	//methods
	private void area(double side) {
		area=side*side;
	}
	
	public double getside() {
		return side;
	}
	public void setside(double side) {
		this.side = side;
		area(side);
	}
	public double getArea() {
		return area;
	}
	
	

}
