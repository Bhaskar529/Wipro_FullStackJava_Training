package com.wipro.app;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
* To read/write primitive-type data values from/to files, use DataInputStream
* and DataOutputStream classes respectively
*/
public class DataInputOutputStreamDemo {
	public static void main(String[] args) {
		File file = new File("/home/rps/Documents/student-details.txt");
		try(
				/*
				 * reading data from KBD through BufferedReader object and then
				 * writing the data into file through DataOutputStream object
				 */
				DataOutputStream dos =
				new DataOutputStream(new BufferedOutputStream( new FileOutputStream(file)));
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				){
			System.out.println("Enter student name: ");
			String name=  br.readLine();
			System.out.println("Eneter age in years: ");
			int age = Integer.parseInt(br.readLine());
			System.out.println("Enter mobile number: ");
			long mobile = Long.parseLong(br.readLine());
			dos.writeUTF(name);
			dos.write(age);
			dos.writeLong(mobile);
			System.out.println("File created");
		}catch(IOException e) {
			e.printStackTrace();
		}
		if(file.exists() && file.canRead()) {
			try(
					DataInputStream dis = new DataInputStream
					(new BufferedInputStream
							(new FileInputStream(file)))
					){
				String name = dis.readUTF();
				int age = dis.read();
				long mobile = dis.readLong();
				System.out.println(name+","+age+","+mobile);
				System.out.println("End of file");
			}catch(IOException e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Unable to open the file");
		}
	}
}
