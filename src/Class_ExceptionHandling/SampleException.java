package Class_ExceptionHandling;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SampleException {
	public static void main(String[] args)  {
		try {
		FileReader f = new FileReader("where.txt");
		
		}
		catch(FileNotFoundException fe) {
			System.out.println(fe);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("After error");
		
		Scanner s = new Scanner(System.in);
		
		try {
		info(s.nextInt());
		}
		catch(Exception e1) {
			
			System.out.println(e1);
		}
		
		System.out.println("After input error");
		s.close();
	}
	
	private static void info(int s) throws Exception {
		System.out.println(s);
	}

}
