package fileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) {
		File file = new File("/Users/SoengSaravit/Desktop/FileIO/object.txt");
		FileOutputStream outputStream = null;
		ObjectOutputStream objectOutputStream = null;
		
		try {
			outputStream = new FileOutputStream(file);
			objectOutputStream = new ObjectOutputStream(outputStream);
			
			Employee employee = new Employee(1, "Dara", "Male");
			objectOutputStream.writeObject(employee);
			System.out.println("==> Success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				objectOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
