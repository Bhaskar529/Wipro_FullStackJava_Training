package com.wipro.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileCopy {
	public static void main(String[] args) {
		File sourcefile=new File("/home/rps/Documents/story.txt");
		File destinationfile=null;
		if(sourcefile.exists() && sourcefile.canRead()) {
			destinationfile=new File("/home/rps/Documents/javanotes.txt");
		try(
				BufferedReader br = new BufferedReader(new FileReader(sourcefile));
				BufferedWriter bw = new BufferedWriter(new FileWriter(destinationfile));
				
				){
			int ch;
			while(( ch =br.read()) != -1) {
				bw.write((char)ch);
			}
			System.out.println("File copied successfully");
		}//try
		catch(IOException e){
			e.printStackTrace();
		}
		
		}
		else {
			System.out.println("Unable to open the file ");
		}
		System.out.println("Contentes of destination file...");
		try(BufferedReader br= new BufferedReader
				(new FileReader(destinationfile))){
			int ch;
			while((ch=br.read())!=-1) {
				System.out.print((char)ch);
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
