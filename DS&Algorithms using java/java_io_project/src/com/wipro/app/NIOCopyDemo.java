package com.wipro.app;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/*
* copy contents of existing file into a new file
*/
public class NIOCopyDemo {
	public static void main(String[] args) {
		Path sourcePath = Paths.get("/home/rps/Documents/shakespere.txt");
		Path destPath = Paths.get("/home/rps/Documents/shakespere-new.txt");
		
		try(
				OutputStream os = Files.newOutputStream(destPath);
				
				){
			Files.copy(sourcePath, os);
			System.out.println("File copied..");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
