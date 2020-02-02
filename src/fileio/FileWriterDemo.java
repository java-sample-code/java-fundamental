package fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) {
		File file = new File("/Users/SoengSaravit/Desktop/FileIO/mytext_2.txt");
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(file, true);
			String str = "FileIO with FileWriter. ";
			writer.write(str);
			System.out.println("write into file success!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
