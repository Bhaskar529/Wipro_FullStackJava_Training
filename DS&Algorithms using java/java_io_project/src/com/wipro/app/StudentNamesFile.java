package com.wipro.app;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/**
* System.in  is  the KBD which is connected to  InputStreamObject which in turn is
* connected to BufferedReader
*
* KBD -> InputStreamReader->BufferedReader -> program
*/
public class StudentNamesFile {
	public static void main(String[] args) {
		File file = new File("/home/rps/Documents/names.txt");
		try(
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				/*If FileOutputStream has no second argument then it is opened in write mode.
				 * If second argument is set to true, then file is opened in append mode
				 *
				 */
				BufferedOutputStream bos  = new BufferedOutputStream(
						new FileOutputStream(file,true));
				){
			System.out.println("Enter names of the students(cntrl-d to stop): ");
			int ch;
			while(  (ch = br.read()) != -1) {
				bos.write(ch);
			}
			br.close();
			System.out.println("File created..");
		}catch(IOException e) {
			e.printStackTrace();
		}
		if(file.exists() && file.canRead()) {
			try(
//					BufferedInputStream bif =
//					new BufferedInputStream(new FileInputStream(file))
					
					FileInputStream fis = new FileInputStream(file)
					){
				int ch;
//				while( (ch = bif.read()) != -1) {
//					System.out.print((char)ch);
//				}
//				bif.close();
				
				while( (ch = fis.read()) != -1) {
					System.out.print((char)ch);
				}
				fis.close();
				System.out.println("End of file");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Unable to open the file");
		}
	}
}
