package Sample_Interface;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class FileLogger implements Logger{
	private static Date d =new Date();
	private FileWriter fw;
	  private BufferedWriter bw;
	
	  public FileLogger() {
		  try {
				File f = new File("log.txt");
				if(f.createNewFile()) {
					System.out.println("New file created");
				}
				else
				{
					System.out.println("File already exists");
				}
			}
			catch(Exception e){
				System.out.println(e.toString());
			}
			
			
			try {
				 fw=new FileWriter("log.txt");
			 bw= new BufferedWriter(fw);
			}
			catch(Exception ex){
				System.out.println(ex.toString());
			}
			 
		  
	  }

	

	@Override
	public void infoLog(String msg) {
		try {
		bw.write(d +":" +msg +"  Logging level");	
		bw.newLine();
		}
		catch(Exception info){
			System.out.println(info.toString());
		}
		
	}
	
	@Override
	public void debugLog(String msg) {
		try {
			bw.write(d +":" +msg +"  Logging level");	
			bw.newLine();
			}
			catch(Exception info){
				System.out.println(info.toString());
			}
		
	}

	@Override
	public void warningLog(String msg) {
		try {
			bw.write(d +":" +msg +"  Logging level");	
			bw.newLine();
			}
			catch(Exception info){
				System.out.println(info.toString());
			}
		
	}

	@Override
	public void errorLog(String msg) {
		try {
			
			bw.write(d +":" +msg +"  Logging level");	
			bw.newLine();
			}
			catch(Exception info){
				System.out.println(info.toString());
			}	
		
	}



	@Override
	public void close() {
		try {
			bw.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		
	}
	
	public void printStates() {
        System.out.println("testend");
    }

	
	  

}
