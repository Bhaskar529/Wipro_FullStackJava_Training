package com.wipro.app;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class FileReaderWriterDemo {
	public static void main(String[] args) {
		File file = new File("/home/rps/Documents/story.txt");
		
		try(
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				PrintWriter pw = new PrintWriter(
								new BufferedWriter(
										new FileWriter(file,true)));
				
				){
			System.out.println("Enter text (cntrl-d to stop):  \n");
			int ch;
			while(( ch =br.read()) != -1) {
				pw.print((char)ch);
			}
			
			System.out.println("File created");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
		if(file.exists() && file.canRead()) {
			try(
					BufferedReader br = new BufferedReader(
											new FileReader(file)
							);
					
					){
				
				int ch;
				while( (ch = br.read()) != -1) {
					System.out.print((char)ch);
				}
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Unable to open the file");
		}
	}
}
