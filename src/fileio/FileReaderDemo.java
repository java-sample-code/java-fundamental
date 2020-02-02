package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) {
		File file = new File("/Users/SoengSaravit/Desktop/FileIO/mytext_2.txt");
		FileReader reader = null;
		
		try {
			reader = new FileReader(file);
			int ascii = 0;
			while((ascii=reader.read()) != -1 ) {
				System.out.print((char)ascii);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
