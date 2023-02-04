package Sample_Interface;

import java.util.Date;

public class ConsoleLog implements Logger{
private static Date d = new Date();
	@Override
	public void infoLog(String msg) {
		System.out.println(d +":"  +msg + " Logging level");
		
	}
	
	@Override
	public void debugLog(String msg) {
		System.out.println(d +":" +msg +"  Logging level");	
	}

	@Override
	public void warningLog(String msg) {
		System.out.println(d+ ":" +msg +" Warning msg");
	
	}

	@Override
	public void errorLog(String msg) {
		System.err.println(d+ ":" +msg +" Please validate");
		
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		
	}

	
	

}
