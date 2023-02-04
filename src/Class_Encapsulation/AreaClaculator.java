package Class_Encapsulation;

public class AreaClaculator {
	public static void main(String[] args) {
		Rectangle rec=new Rectangle();
		rec.setlength(10.2);
		System.out.println(rec.getArea());
		System.out.println(rec.areaclacultor());
		rec.setwidth(15);
		System.out.println(rec.getArea());
		System.out.println(rec.areaclacultor());
		
		Square s1=new Square(10);
		System.out.println(s1.getArea());
		s1.setside(12);
		System.out.println(s1.getArea());
		
	}

}
