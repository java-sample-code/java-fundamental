package fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo {
	public static void main(String[] args) {
		File file = new File("/Users/SoengSaravit/Desktop/FileIO/object.txt");
		FileInputStream inputStream = null;
		ObjectInputStream objectInputStream = null;
		
		try {
			inputStream = new FileInputStream(file);
			objectInputStream = new ObjectInputStream(inputStream);
			Employee employee = (Employee)objectInputStream.readObject();
			System.out.println(employee.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
