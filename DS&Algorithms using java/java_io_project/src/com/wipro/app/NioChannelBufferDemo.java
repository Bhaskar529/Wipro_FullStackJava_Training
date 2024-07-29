package com.wipro.app;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
public class NioChannelBufferDemo {
	public static void main(String[] args) {
		try {
			RandomAccessFile aFile =  new RandomAccessFile("/home/rps/Documents/javanotes.txt", "rw");
			FileChannel inChannel = aFile.getChannel();
			ByteBuffer buffer = ByteBuffer.allocate(48);
			//channel writing data into buffer
			// channel -> buffer
			int bytesRead = inChannel.read(buffer);
			System.out.println(bytesRead);
			while (bytesRead != -1) {
//				System.out.println("Read " + bytesRead);
				/*
				 * Channel has written 48 bytes of data into buffer using read() method,
				 * now the buffer has to be flipped from write mode to read so that
				 * we can read data from the buffer buffer.get() method.
				 *
				 * flip() only to flip the buffer from write mode to read mode
				 */
				buffer.flip();
				while( buffer.hasRemaining() ){
					System.out.print((char) buffer.get());
				}
				//buffer  -> channel
//				int bytesWritten = inChannel.write(buffer);
				buffer.clear();
				//channel writing data into buffer, channel -> buffer
				bytesRead = inChannel.read(buffer);
			}
			aFile.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}


