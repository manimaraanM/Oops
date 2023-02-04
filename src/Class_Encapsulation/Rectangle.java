package Class_Encapsulation;

public class Rectangle {
	private double length;
	private double width;
	private double area;
	
	//constructor
	public Rectangle() {};
	
	//public Rectangle(double length,double width) {
	//	this.length=length;
	//	this.width=width;
	//}
	
	//method
	public double areaclacultor() {
		area=(length*width);
		return area;
	}
	
	
	//getters and setters
	public void setlength(double length) {
		this.length=length;
		area=length*width;
	}
	public void setwidth(double width) {
		this.width=width;
		area=length*width;
	}
	public double getArea() {
		return area;
	}

}
