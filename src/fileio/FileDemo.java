package fileio;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
//		File file = new File("/Users/SoengSaravit/Desktop/FileIO/myfile.txt");
		
//		if(file.exists()) {
//			System.out.println("File already existed");
//		}else {
//			try {
//				file.createNewFile();
//				System.out.println("created success");
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		File newFolder = new File("/Users/SoengSaravit/Desktop/FileIO/V1");
		
//		newFolder.mkdir();
//		newFolder.delete();
//		File renamedFile = new File("/Users/SoengSaravit/Desktop/FileIO/mytext.txt");
//		file.renameTo(renamedFile);
		
		File fileioFolder = new File("/Users/SoengSaravit/Desktop/FileIO");
		String[] files = fileioFolder.list();
		for(String file:files) {
			System.out.println(file);
		}
		
	}
}
