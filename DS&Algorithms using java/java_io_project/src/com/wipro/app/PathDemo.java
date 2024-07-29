
package com.wipro.app;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class PathDemo {
	public static void main(String[] args) {
		Path path = Paths.get("/home/rps/Documents/shakespere.txt");
		
		try(
				BufferedWriter writer =
				Files.newBufferedWriter(path, Charset.forName("UTF-8"))
				){
			System.out.println(path.getFileName());//shakespere.txt
			writer.write("To be, or not to be. That is the question.");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
