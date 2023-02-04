package Sample_Interface;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		
		//private static BufferedReader read;
		try {
		File f = new File("test.txt");
		if(f.createNewFile())
		{
			System.out.println("File created");
		}else
		{
			System.out.println("File already exists");
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		try
		{
		FileWriter frw= new FileWriter("test.txt");
		BufferedWriter bw = new BufferedWriter(frw);
		bw.write("how are you doing");
		bw.close();	
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		
		try {
			FileReader fr= new FileReader("test.txt");
			//BufferedReader br = new BufferedReader(fr);
			try {
				//System.out.println(fr.read());	
			/**	
				String s;
				while((s=br.readLine()) !=null) {
					System.out.println(s);
				}
				
				//br.close();
				**/
				int c;
				while ((c=fr.read())!= -1){
				System.out.print((char)c);
					
				}
				
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			}
			catch(FileNotFoundException f) {
				System.out.println(f.toString());
			}
	
	
	}
}
