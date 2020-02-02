package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		File file = new File("/Users/SoengSaravit/Desktop/FileIO/mytext.txt");
		
		FileOutputStream outputStream = null;
		
		try {
			outputStream = new FileOutputStream(file, true);
			String str = "\nHello World. ";
			outputStream.write(str.getBytes());
			System.out.println("write data successed.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
