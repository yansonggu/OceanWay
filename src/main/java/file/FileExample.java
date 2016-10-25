package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileExample {

	
	public static void main(String [] args) throws FileNotFoundException{
		
		//better way than using string inside FIS		
		File f = new File("student.ser");
		FileInputStream fis = new FileInputStream(f);
		
		//make a dir
		File dir = new File("FDIR");
		boolean flag = dir.mkdir();
		
		// true is dir not present initially else false
		System.out.println(flag); 
		
		//get path
		System.out.println(dir.getAbsolutePath());  //   path: /Users/sheetalsingh/Documents/workspace/OceanWay/FDIR
		
		//delete a dir
		System.out.println(dir.delete());
		
	}
}