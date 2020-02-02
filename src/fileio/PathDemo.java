package fileio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {
	public static void main(String[] args) {
		Path path1 = Paths.get("/Users/SoengSaravit/Desktop/FileIO/mytext.txt");
		printDetail(path1);
	}
	
	static void printDetail(Path path) {
		System.out.println("Detail for path:"+path);
		
		int count = path.getNameCount();
		System.out.println("Name count:"+count);
		
		for (int i = 0; i < count; i++) {
			Path name = path.getName(i);
			System.out.println("Name at index "+i+" is: "+name);			
		}
		
		System.out.println("Root:"+path.getRoot());
		System.out.println("Parent:"+path.getParent());
		System.out.println("File name:"+path.getFileName());
		System.out.println("is absolute:"+path.isAbsolute());
		System.out.println("---------------------------------");
	}
}
