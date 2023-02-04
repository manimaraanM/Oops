package Sample_Interface;


//import Logger.java;

public class Loggerapplication {
	public static void main(String[] args) {
		
		//Interfacce = new Class
		Logger log = new ConsoleLog();
		
		
		log.infoLog("info");
		log.debugLog("Debug");
		log.warningLog("Ignore");
		log.errorLog("Critical Error");
		
		Logger filelog=new FileLogger();
		filelog.debugLog("Debug");
		filelog.errorLog("Critical Error");
		filelog.warningLog("Ignore");
		filelog.infoLog("Info");
		filelog.close();
		
		FileLogger filelog2=new FileLogger();
		filelog2.printStates();
	}
	
	
	
	

	
}
